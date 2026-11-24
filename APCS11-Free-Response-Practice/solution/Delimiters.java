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
        for (String token : tokens) {
            if (open.equals(token) || close.equals(token)) {
                selected.add(token);
            }
        }
        return selected;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int depth = 0;
        for (String delimiter : delimiters) {
            if (open.equals(delimiter)) {
                depth++;
            } else {
                depth--;
            }
            if (depth < 0) {
                return false;
            }
        }
        return depth == 0;
    }
}
