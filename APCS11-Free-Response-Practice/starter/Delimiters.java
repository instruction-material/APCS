import java.util.ArrayList;

public class Delimiters {
    private final String open;
    private final String close;

    public Delimiters(String open, String close) {
        this.open = open;
        this.close = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> selected = new ArrayList<>();
        // TODO: Copy only exact delimiter tokens into the new list.
        return selected;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        // TODO: Check the unmatched-opening count during and after the loop.
        return delimiters.isEmpty();
    }
}
