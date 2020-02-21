package com.company;

//A complex number is a number that can be expressed
//        in the form a + bi, where a and b are real numbers,
//        and i is a solution of the equation x2 = −1.
//        Because no real number satisfies this equation,
//        i is called an imaginary number. For the complex number a + bi,
//        a is called the real part, and b is called the imaginary part.
//        To add or subtract two complex numbers,
//        just add or subtract the corresponding real and imaginary parts. For instance,
//        the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another,
//        the sum of 3 + i and –1 + 2i is 2 + 3i.


public class ComplexNumber {
    private double real;
    private double imaginary;

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber){
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }

    public ComplexNumber(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    public double getImaginary(){
        return imaginary;
    }

    public double getReal(){
        return real;
    }

}
