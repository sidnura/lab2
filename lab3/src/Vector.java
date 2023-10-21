import java.io.IOException;

/**
 * <b> Класс Вектор </b>
 * Класс Vector реализует методы для нахождения
 * скалярного произведения, длины вектора, суммы
 * векторов, разности векторов, а так метод для
 * умножения вектора на число.
 *
 * @author Sidorova Anna
 */

public class Vector {

    double x1 = 0;
    double y1 = 0;

    double x2 = 0;
    double y2 = 0;

    public Vector(){}
    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public  double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

//    public double VectorProduct (double x11, double x21, x12, x22){
//         return (x21-x11) * (y22 - y12 ) - (x22-x12)*(y21 -y11);
//    }

    /**
     * Метод, для нахождения скалярного
     * произведения двух векторов.
     * @param vector1 - первый параметр метода ScalarProduct.
     * @param vector2 - второй параметр метода ScalarProduct.
     * @return double - тип возвращаемого значения
     * скарярного произведения двух векторов.
     */
    public static double ScalarProduct (Vector vector1, Vector vector2){
       return (vector1.getX2() - vector1.getX1()) * (vector2.getX2() - vector2.getX1()) + (vector1.getY2() - vector1.getY1()) * (vector2.getY2() - vector2.getY1());
    }

    /**
     * Метод для нахождения длины вектора.
     * @param vector - параметр метода vectorLength
     * @return double - тип возвращаемого значения
     * длины вектора.
     */

    public static double VectorLength (Vector vector) {
        return  (Math.sqrt(Math.pow((vector.getX2() - vector.getX1()),2)+(Math.pow((vector.getY2() - vector.getY1()),2))));
    }

    /**
     * Метод для умножения вектора на число.
     * @param vector - первый параметр метода multiplication.
     * @param number - второй параметр метода multiplication
     * @return Vector - тип возвращаемого значения
     * умножения вектора на число.
     */

    public static Vector multiplication (Vector vector, double number){
        return new Vector(vector.getX1() * number,vector.getY1() * number, vector.getX2() * number, vector.getY2() * number);
    }

    /**
     * Метод для нахождения суммы векторов.
     * @param vector1 - первый параметр метода summa
     * @param vector2 - второй параметр метода summa
     * @return Vector - тип возвращаемого значения
     * суммы двух векторов.
     */

    public static Vector summa (Vector vector1, Vector vector2) {
        return new Vector(vector1.getX1()+vector2.getX1(),vector1.getY1()+vector2.getY1(),vector1.getX2()+vector2.getX2(), vector1.getY2()+vector2.getY2());
    }

    /**
     * Метод для нахождения разности двух векторов.
     * @param vector1 - первый параметр метода difference
     * @param vector2 - второй параметр метода difference
     * @return Vector - тип возвращаемого значения
     * разности двух векторов.
     */

    public static Vector difference (Vector vector1, Vector vector2) {
        return new Vector(vector1.getX1()-vector2.getX1(),vector1.getY1()-vector2.getY1(),vector1.getX2()-vector2.getX2(), vector1.getY2()-vector2.getY2());
    }

    /**
     * Метод для вывода координат вектора
     * @param vector - параметр метода print
     */

    public static void print (Vector vector) {
        System.out.println("координаты вектора: x1 = " + vector.getX1() + ", y1 = " + vector.getY1() + ", x2 = " + vector.getX2() + ", y2 = " + vector.getY2());
    }
}




