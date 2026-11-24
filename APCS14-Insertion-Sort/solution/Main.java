public class Main {
    public static void main(String[] args) {
        show(new int[] {1, 3, 2, 4});
        show(new int[] {4, 3, 2, 1});
        show(new int[] {3, -1, 3, 0});
        show(new int[0]);
    }

    public static int insertionSort(int[] values) {
        int shifts = 0;
        for (int i = 1; i < values.length; i++) {
            int saved = values[i];
            int spot = i;
            while (spot > 0 && values[spot - 1] > saved) {
                values[spot] = values[spot - 1];
                spot--;
                shifts++;
            }
            values[spot] = saved;
        }
        return shifts;
    }

    private static void show(int[] values) {
        int shifts = insertionSort(values);
        String line = "[";
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                line += ", ";
            }
            line += values[i];
        }
        System.out.println(line + "] shifts: " + shifts);
    }
}
