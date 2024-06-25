class mythread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public void start() {
        run();
    }

    public static void main(String args[]) {
        mythread t1 = new mythread();
        t1.start();
    }
}