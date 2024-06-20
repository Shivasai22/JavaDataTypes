import java.util.ArrayList;
import java.util.Iterator;

class arlist1 {
    public static void main(String args[]) {
        ArrayList animals = new ArrayList();
        // add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        // Get the iterater
        Iterator it = animals.iterator();
        System.out.println(it.next());

        // System.out.println("ArrayList " + animals);
    }
}