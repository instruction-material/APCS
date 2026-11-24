import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjective:");
        String adjective = scanner.nextLine();
        System.out.println("Place:");
        String place = scanner.nextLine();
        System.out.println("Plural noun:");
        String objects = scanner.nextLine();
        System.out.println("Game:");
        String game = scanner.nextLine();
        System.out.println("We reached " + adjective + " " + place + ".");
        System.out.println("We raced " + objects + " and played " + game + ".");
    }
}
