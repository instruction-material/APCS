public class VendingMachine {
    private int peanuts;
    private int pretzels;
    private int mAndMs;

    public int getPeanuts() {
        return peanuts;
    }

    public void setPeanuts(int count) {
        if (count >= 0 && count <= 100) {
            peanuts = count;
        }
    }

    public void vendPeanuts() {
        setPeanuts(peanuts - 1);
    }

    public int getPretzels() {
        return pretzels;
    }

    public void setPretzels(int count) {
        if (count >= 0 && count <= 100) {
            pretzels = count;
        }
    }

    public void vendPretzels() {
        setPretzels(pretzels - 1);
    }

    public int getMAndMs() {
        return mAndMs;
    }

    public void setMAndMs(int count) {
        if (count >= 0 && count <= 100) {
            mAndMs = count;
        }
    }

    public void vendMAndMs() {
        setMAndMs(mAndMs - 1);
    }
}
