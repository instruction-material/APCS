public class PictureBook extends Book {
    private final String illustrator;

    public PictureBook(String title, String author, int page, String illustrator) {
        super(title, author, page);
        this.illustrator = illustrator;
    }

    public boolean hasSameIllustrator(PictureBook other) {
        // TODO: Compare the text of the two illustrator names.
        return false;
    }

    @Override
    public String toString() {
        // TODO: Reuse the book description and add the illustrator.
        return super.toString();
    }
}
