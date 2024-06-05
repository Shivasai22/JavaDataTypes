class student {
    int rollno;
    int marks;
    char grade;

    void rolldisplay() {
        System.out.println("Roll No = " + rollno);
    }

    void marksdisplay() {
        System.out.println("Marks = " + marks);
    }

    void gradedisplay() {
        System.out.println("Grade = " + grade);
    }

}

class Object {
    public static void main(String[] args) {
        // <className> = new <className>();
        student s1 = new student();
        s1.rollno = 25;
        s1.marks = 92;
        s1.grade = 'E';
        s1.rolldisplay();
        s1.marksdisplay();
        s1.gradedisplay();
    }
}