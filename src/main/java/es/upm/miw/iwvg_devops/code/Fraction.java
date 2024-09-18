package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return Math.abs(numerator) < Math.abs(denominator);
    }

    public boolean isImproper() {
        return Math.abs(numerator) > Math.abs(denominator);
    }

    public boolean isEquivalent(Fraction fraction) {
        return this.numerator * fraction.getDenominator() == this.denominator * fraction.getNumerator();
    }

    public Fraction add(Fraction fraction) {
        int commonDenominator = this.denominator * fraction.getDenominator();
        int newNumerator = this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator;
        return new Fraction(newNumerator, commonDenominator);
    }

    public Fraction multiply(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getNumerator();
        int newDenominator = this.denominator * fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction fraction) {
        int newNumerator = this.numerator * fraction.getDenominator();
        int newDenominator = this.denominator * fraction.getNumerator();
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
