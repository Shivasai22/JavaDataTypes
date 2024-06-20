// Annotation
class transport {
    void display() {
        System.out.println("Inside display method.");
    }
}

class annotdemo extends transport {
    @Override
    void display() {
        System.out.println("Inside child class method.");
    }

    public static void main(String args[]) {
        annotdemo c1 = new annotdemo();
        c1.display();
    }
}
