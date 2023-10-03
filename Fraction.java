public class Fraction {
    private int p;
    private int q;

    public Fraction(int p, int q) {
        this.p = p;
        this.q = q;
    }
    public int getNumerator() {
        return p;
    }
    public int getDenominator() {
        return q;
    }

    @Override
    public String toString() {
        return "Je suis une fraction.";
    }
}
