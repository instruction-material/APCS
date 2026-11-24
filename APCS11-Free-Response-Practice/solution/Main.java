import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Delimiters d = new Delimiters("(", ")");
        ArrayList<String> nested = d.getDelimitersList(new String[] {"(", "text", "(", ")", ")"});
        ArrayList<String> reversed = d.getDelimitersList(new String[] {")", "("});
        ArrayList<String> unclosed = d.getDelimitersList(new String[] {"("});
        System.out.println("Extracted: " + nested);
        System.out.println("Nested: " + d.isBalanced(nested));
        System.out.println("Closes first: " + d.isBalanced(reversed));
        System.out.println("Unclosed: " + d.isBalanced(unclosed));
        System.out.println("Empty: " + d.isBalanced(d.getDelimitersList(new String[] {"text("})));
    }
}
