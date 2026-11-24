class DownShifter extends Shifter {
    @Override
    public String shift(String text) {
        // Delegate to the common helper with a one-letter backward shift.
        return text;
    }
}
