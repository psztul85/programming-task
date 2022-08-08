public class MultiplicationDivisionAndRemainder {
    private double multiplication;
    private double division;
    private double divRemainder;

    public MultiplicationDivisionAndRemainder(double multiplication, double division, double divRemainder) {
        this.multiplication = multiplication;
        this.division = division;
        this.divRemainder = divRemainder;
    }

    public double getMultiplication() {
        return multiplication;
    }

    public double getDivision() {
        return division;
    }

    public double getDivRemainder() {
        return divRemainder;
    }

    public void setMultiplication(double multiplication) {
        this.multiplication = multiplication;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public void setDivRemainder(double divRemainder) {
        this.divRemainder = divRemainder;
    }

}
