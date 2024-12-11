import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {
    private ArrayList<String> students = new ArrayList<String>();

    public void addStudents() {
        students.add("Xenophon");
        students.add("Andronike");
        students.add("Nephele");
        students.add("Nicodemos");
        students.add("Noa");
        System.out.println("\nStudents added to the list.");
    }
    public void printStudents() {
        System.out.println("\nCurrents list of students:");
        System.out.println(students);
    }
    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println("\nRemoved >" + name + "< from list.");
        } else {
            System.out.println("No such student found.");
        }
    }
    public void sortStudents() {
        Collections.sort(students);
        System.out.println("\nSorted list of students");
    }
}