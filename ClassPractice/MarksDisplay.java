class Student {

  public int rollno;
  private int marks;
  public char grade;

  public int DiplayMarks(int x, int p) {

    marks = p;

    System.out.println("The marks sent is : " + marks);
    int num;
    num = x + marks;
    return num;
  }
}

class MarksDisplay {

  public static void main(String args[]) {
    Student st = new Student();
    int n;
    st.rollno = 12;
    // st.marks = 75;
    st.grade = 'A';
    n = st.DiplayMarks(11, 75);
    System.out.println("Total marks is : " + n);
  }

}