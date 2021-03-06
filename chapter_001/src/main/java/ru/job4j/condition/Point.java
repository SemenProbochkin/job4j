package ru.job4j.condition;
/**
 * Point.
 *
 *@author Probochkin.Semen.
 */
public class Point {
    private int x;
    private int y;

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
    public static void main(String[] args) {
        Point a = new Point(0, 2);
        Point b = new Point(2, 0);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}