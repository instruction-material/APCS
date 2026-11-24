public class Main {
    public static void main(String[] args) {
        System.out.println("Up for: " + upFor());
        System.out.println("Up while: " + upWhile());
        System.out.println("Down for: " + downFor());
        System.out.println("Down while: " + downWhile());
        System.out.println("Double for: " + doublingFor());
        System.out.println("Double while: " + doublingWhile());
        System.out.println("Break for: " + untilMultipleFor(1));
        System.out.println("Break while: " + untilMultipleWhile(1));
        System.out.println("Break from zero for: " + untilMultipleFor(0));
        System.out.println("Break from zero while: " + untilMultipleWhile(0));
    }

    static String upFor() {
        String values = "";
        for (int value = 0; value < 10; value++) {
            values += value + " ";
        }
        return values.trim();
    }

    static String upWhile() {
        String values = "";
        int value = 0;
        while (value < 10) {
            values += value + " ";
            value++;
        }
        return values.trim();
    }

    static String downFor() {
        String values = "";
        for (int value = 0; value > -10; value--) {
            values += value + " ";
        }
        return values.trim();
    }

    static String downWhile() {
        String values = "";
        int value = 0;
        while (value > -10) {
            values += value + " ";
            value--;
        }
        return values.trim();
    }

    static String doublingFor() {
        String values = "";
        for (int value = 1; value < 10; value *= 2) {
            values += value + " ";
        }
        return values.trim();
    }

    static String doublingWhile() {
        String values = "";
        int value = 1;
        while (value < 10) {
            values += value + " ";
            value *= 2;
        }
        return values.trim();
    }

    static String untilMultipleFor(int start) {
        String values = "";
        for (int value = start; value < 10; value++) {
            values += value + " ";
            if (value % 3 == 0) {
                break;
            }
        }
        return values.trim();
    }

    static String untilMultipleWhile(int start) {
        String values = "";
        int value = start;
        while (value < 10) {
            values += value + " ";
            if (value % 3 == 0) {
                break;
            }
            value++;
        }
        return values.trim();
    }
}
