public class Main {
    public static void main(String[] args) {
        System.out.println("Integer division: " + (7 / 2));
        System.out.println("Decimal division: " + (7 / 2.0));
        String label = "crate";
        System.out.println("String slice: " + label.substring(1, 4));
        int groups = completeGroups(7, 3);
        if (groups == 0) {
            System.out.println("No complete groups");
        }
        for (int group = 1; group <= groups; group++) {
            System.out.println("Group " + group);
        }
    }

    public static int completeGroups(int items, int groupSize) {
        return items / groupSize;
    }
}
