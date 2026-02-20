public class AnimalPicker {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("Which animal would you like to see, a dog or a cat? ");
            String choice = input.nextLine().trim().toLowerCase();

            if (choice.equals("cat")) {
                System.out.println("CAT ASCII ART HERE");
                break;
            } else if (choice.equals("dog")) {
                System.out.println("DOG ASCII ART HERE");
                break;
            } else {
                System.out.println("Error: Invalid option. Please choose either \"dog\" or \"cat\".");
            }
        }

        input.close();
    }
}
