public class Fraction {
    private int p;
    private int q;

    public Fraction(int p, int q) {
        this.p = p;
        this.q = q;
    }
    public Fraction(int p) {
        this.q = 1;
        this.p = p;
    }
    public Fraction() {
        this.p = 0;
        this.q = 1;
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

    public static final Fraction Zero=new fraction();
    public static final Fraction un=new fraction(1);

     public boolean equals(Object obj) {
        if (this == obj) {
        return true;
    }
        if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Fraction other = (Fraction) obj;
        assert this.q != 0 && other.q != 0 : "Le dénominateur ne peut pas être zéro.";
        return this.p == other.p && this.q == other.q;
}
}
