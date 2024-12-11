public class Main {
    public static void main(String[] args) {

        HandsOnArrayList handsOnArrayList = new HandsOnArrayList();

        handsOnArrayList.addStudents();

        handsOnArrayList.printStudents();

        handsOnArrayList.removeStudent("Charlie");

        handsOnArrayList.printStudents();

        handsOnArrayList.sortStudents();

        handsOnArrayList.printStudents();
    }
}