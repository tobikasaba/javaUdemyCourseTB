public class ComplexNumber {

    private double real;

    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        System.out.println((this.real + real) + " + " + (this.imaginary + imaginary) + "i");
    }

    public void add(ComplexNumber anotherComplexNumber) {
        add(anotherComplexNumber.getImaginary(), anotherComplexNumber.getReal());
    }


    public void subtract(double real, double imaginary) {
        System.out.println((this.real - real) + " + " + (this.imaginary - imaginary) + "i");
    }

    public void subtract(ComplexNumber anotherComplexNumber) {
        subtract(anotherComplexNumber.getImaginary(), anotherComplexNumber.getReal());
    }
}

/*
public class ComplexNumber {

    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(ComplexNumber number) {
        this.real += number.getReal();
        this.imaginary += number.getImaginary();
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(ComplexNumber number) {
        this.real -= number.getReal();
        this.imaginary -= number.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
 */