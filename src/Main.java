public class Main {
    public static void main(String[] args) {

        HandsOnArrayList handsOnArrayList = new HandsOnArrayList();

        handsOnArrayList.addStudents();

        handsOnArrayList.printStudents();

        handsOnArrayList.removeStudent("Noa");

        handsOnArrayList.printStudents();

        handsOnArrayList.sortStudents();

        handsOnArrayList.printStudents();
    }
}