public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harbor Notes", "Asha Lee", 12);
        PictureBook first = new PictureBook("Bright Boats", "Asha Lee", 5, "Sam Ortiz");
        PictureBook second = new PictureBook("Paper Kites", "Jin Reed", 0, "Sam Ortiz");
        PictureBook third = new PictureBook("Rain Maps", "Jin Reed", 2, "Pat Green");

        System.out.println(book);
        System.out.println(first);
        System.out.println("Same author: " + first.hasSameAuthor(book));
        System.out.println("Same illustrator: " + first.hasSameIllustrator(second));
        System.out.println("Same illustrator: " + first.hasSameIllustrator(third));
    }
}
