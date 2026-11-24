class DownShifter extends Shifter {
    @Override
    public String shift(String text) {
        return shift(text, -1);
    }
}
