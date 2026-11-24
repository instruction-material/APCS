public class Book {
    private final String title;
    private final String author;
    private final int page;

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public boolean hasSameAuthor(Book other) {
        return author.equals(other.author);
    }

    @Override
    public String toString() {
        return title + " by " + author + " (page " + page + ")";
    }
}
