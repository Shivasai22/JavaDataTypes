//Multithreading
class thireddemo extends Thread {
    public static void main(String args[]) {
        thireddemo th1 = new thireddemo();
        thireddemo th2 = new thireddemo();
        th1.start();
        th2.start();
        System.out.println("Code running Outside thread.");
    }

    public void run() {
        System.out.println("Code running in a thread.");
    }
}