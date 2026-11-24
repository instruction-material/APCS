public class Main {
    public static void main(String[] args) {
        Image image = new Image("##..#", ".#..#", ".##..");
        System.out.println("Before:");
        System.out.println(image.render());
        image.eraseBlob(0, 0);
        System.out.println("After:");
        System.out.println(image.render());
    }
}
