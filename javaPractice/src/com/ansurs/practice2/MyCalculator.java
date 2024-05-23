package com.ansurs.practice2;

public class MyCalculator implements  Calculator{
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        double addResult = calculator.add(12,3);
        calculator.printResult(addResult);

        double subtractResult = calculator.subtract(14,2);
        calculator.printResult(subtractResult);

        double multiplyResult = calculator.multiply(12,2);
        calculator.printResult(multiplyResult);

        double divideResult = calculator.divide(8,2);
        calculator.printResult(divideResult);
    }

    @Override
    public void printResult(double result) {
        System.out.println("結果は:" + result);
    }

    //足し算
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    //引き算
    @Override
    public double subtract(double x, double y) {
        return x-y;
    }

    //掛け算
    @Override
    public double multiply(double x, double y) {
        return x*y;
    }

    //割り算
    @Override
    public double divide(double x, double y) {
        return x/y;
    }

}
