package ru.job4j.calculate;
/**
 * Calculate.
 *
 *@author Probochkin.Semen.
 */
public class Calculator {
    private double result;
    /**
     * Method add.
     * @param first First number.
     * @param second Second number.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    public void div(double first, double second) {
        this.result = first / second;
    }
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    public double getResult() {
        return this.result;
    }
}

