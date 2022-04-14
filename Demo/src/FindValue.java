public class FindValue {
    public static void main(String[] args) {
        System.out.println(" The application searcher for values in an array ");

        String[] students = {"Say", "Dat", "Song", "Duc", "Hong", "Tuyen"};

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a name's a student:  ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println(" Position of the studen in the list" + input_name + "is :" + (i + 1));
                isExist = true;
                break;
            }
        }
        if (isExist == false)
            System.out.println(" Not found " + input_name + " in the list.");
    }
}
