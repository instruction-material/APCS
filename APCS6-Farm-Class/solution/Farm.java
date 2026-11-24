public class Farm {
    private int numCows;
    private int numGoats;
    private boolean cowsFed;
    private boolean goatsFed;
    private boolean milked;

    public Farm(int cows, int goats) {
        if (cows < 0 || goats < 0) {
            throw new IllegalArgumentException("Animal counts must be nonnegative");
        }
        numCows = cows;
        numGoats = goats;
        cowsFed = false;
        goatsFed = false;
        milked = false;
    }

    public int getNumCows() {
        return numCows;
    }

    public int getNumGoats() {
        return numGoats;
    }

    public boolean getCowsFed() {
        return cowsFed;
    }

    public boolean getGoatsFed() {
        return goatsFed;
    }

    public boolean getMilked() {
        return milked;
    }

    public boolean feedGoats() {
        if (goatsFed || numGoats == 0) {
            return false;
        }
        goatsFed = true;
        for (int i = 0; i < numGoats; i++) {
            System.out.println("Goat munch");
        }
        return goatsFed;
    }

    public boolean feedCows() {
        if (cowsFed || numCows == 0) {
            return false;
        }
        cowsFed = true;
        for (int i = 0; i < numCows; i++) {
            System.out.println("MOOOOOOOO munch");
        }
        return cowsFed;
    }

    public boolean milk() {
        if (milked || numCows == 0) {
            return false;
        }
        milked = true;
        sound();
        return milked;
    }

    public void sound() {
        for (int i = 0; i < numCows; i++) {
            System.out.println("mooooooooo");
        }
        for (int i = 0; i < numGoats; i++) {
            System.out.println("Baaaaa");
        }
    }

    public boolean sellCow() {
        if (numCows < 1) {
            return false;
        }
        numCows--;
        return true;
    }

    public boolean sellGoat() {
        if (numGoats < 1) {
            return false;
        }
        numGoats--;
        return true;
    }
}
