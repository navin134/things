package otherthings.fynngallup.oop;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    public double getReal() {
        return this.real;

    }

    public double getImaginary() {
        return this.imaginary;

    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;

    }

    public void add(ComplexNumber compNum) {
        double real = compNum.getReal();
        double imaginary = compNum.getImaginary();

        this.real += real;
        this.imaginary += imaginary;

    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;

    }

    public void subtract(ComplexNumber compNum) {
        double real = compNum.getReal();
        double imaginary = compNum.getImaginary();

        this.real -= real;
        this.imaginary -= imaginary;

    }



    

}