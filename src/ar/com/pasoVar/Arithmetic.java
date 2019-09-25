package ar.com.pasoVar;

public class Arithmetic {


    public Arithmetic() {

    }

    public void sum(Result result, int a, int b) {
        result.setResultSum(a + b);
    }

    public void sum(Result result, Integer n1, Integer n2) {
        result.setResultSum(n1 + n2);
    }

    public void subtraction(Result result, int a, int b) {
        result.setResultSubtraction(a - b);
    }

    public void subtraction(Result result, Integer n1, Integer n2) {
        result.setResultSubtraction(n1 - n2);
    }

    public void division(Result result, int a, int b) {
        result.setDivision(a / b);
    }

    public void division(Result result, Integer n1, int b) {

        result.setDivision(n1 / b);
    }

    public void multiplication(Result result, int a, int b) {
        result.setMultiplication(a * b);
    }

    public void multiplication(Result result, int a, Integer n2) {

        result.setMultiplication(a * n2);
    }
}

