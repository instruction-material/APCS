import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjective:");
        String adjective = scanner.nextLine();
        String place = "[place]"; // TODO: prompt and read a line.
        String objects = "[plural noun]"; // TODO: prompt and read a line.
        String game = "[game]"; // TODO: prompt and read a line.
        System.out.println("We reached " + adjective + " " + place + ".");
        System.out.println("We raced " + objects + " and played " + game + ".");
    }
}
