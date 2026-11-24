public class PictureBook extends Book {
    private final String illustrator;

    public PictureBook(String title, String author, int page, String illustrator) {
        super(title, author, page);
        this.illustrator = illustrator;
    }

    public boolean hasSameIllustrator(PictureBook other) {
        return illustrator.equals(other.illustrator);
    }

    @Override
    public String toString() {
        return super.toString() + ", illustrated by " + illustrator;
    }
}
