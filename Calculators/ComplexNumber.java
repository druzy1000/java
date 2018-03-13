/**
 *Andrew Reyes
 *CSCI 1583 (Spring)
 *Homework 6
 *03/25/15
 **/

public class ComplexNumber{

    private float real;
    private float imaginary;
    
    public ComplexNumber(float a, float b){
        this.real = a;
        this.imaginary = b;
        

    }
    
    public float getReal(){
        return real;
    }

    public float getImaginary(){
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newReal = real + otherNumber.getReal();
        float newImaginary = imaginary + otherNumber.getImaginary();
        newComplex = new ComplexNumber(newReal, newImaginary);
        return newComplex;
    }

    public ComplexNumber subtract(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float newReal2 = real - otherNumber.getReal();
        float newImaginary2 = imaginary - otherNumber.getImaginary();
        newComplex = new ComplexNumber(newReal2, newImaginary2);
        return newComplex;
    }

    public ComplexNumber multiply(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float mult1 = real * otherNumber.getReal() - imaginary * otherNumber.getImaginary();
        float mult2 = real * otherNumber.getReal() + imaginary * otherNumber.getImaginary();
        newComplex = new ComplexNumber(mult1, mult2);
        return newComplex;
    }
    public ComplexNumber divide(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        float div1 = real * otherNumber.getReal() + imaginary * otherNumber.getImaginary(); 
        float div2 = real * otherNumber.getReal() - imaginary * otherNumber.getImaginary();
        float div3 = otherNumber.getReal() * otherNumber.getReal() + otherNumber.getImaginary() * otherNumber.getImaginary();
        float div4 = (div1) / (div3);
        float div5 = (div2) / (div3);
        newComplex = new ComplexNumber(div4, div5);
        return newComplex;
    }
    
    public String toString(){
        return this.real +" + "+ this.imaginary + "i";
    }
}