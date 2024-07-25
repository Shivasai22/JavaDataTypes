class Student{
    int id;
    String name;
    char gender;
    double marks;
}


public class arrayOfObject {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=1;
        s1.name="John";
        s1.gender='M';
        s1.marks=85.9;
        
        Student s2=new Student();
        s2.id=2;
        s2.name="Alice";
        s2.gender='F';
        s2.marks=92.5;

        Student s3=new Student();
        s3.id=3;
        s3.name="Bob";
        s3.gender='M';
        s3.marks=78.6;

        Student s4=new Student();
        s4.id=4;
        s4.name="Emily";
        s4.gender='F';
        s4.marks=90.2;

        Student students[]=new Student[4];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[3]=s4;

        for(int i = 0;i<students.length;i++){
            System.out.println("ID : "+students[i].id + ", Name : "+students[i].name+", Gender : "+students[i].gender+", Marks : "+students[i].marks);
        }

    }
}
