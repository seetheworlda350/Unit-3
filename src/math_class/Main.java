package math_class;

/**
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //using math class which is a static class
        //static things (methods and variables) belong to the class rather than
        //objects (instance of the class)
        //we don't need to create an object since Math class is static
        // ClassName.methodName(); e.g. Math.random()
        // ClassName.staticVariableName(); e.g. Math.PI

        double myPI = Math.PI;
        System.out.println(myPI);

        // abs
        int num1 = -2;
        int absValue = Math.abs(num1);
        System.out.println(absValue);

        // pow
        double num2 = Math.pow(3,5);
        System.out.println(num2);

        // sqrt

        double num3 = Math.sqrt(80);
        System.out.println(num3);
        System.out.println(Math.pow(num3,2));

        //create a random number in the range [0,1)
        double random1 = Math.random();
        System.out.println(random1);

        //create a random number in the range [0, n)
        //example: [0,6)
        int n = 6;
        double random2 = Math.random() * n;
        System.out.println(random2);
        // create a random number in the range [0, p]
        int p = 6;
        double random3 = (Math.random() * p+1);

        System.out.println(random3);

        // FOR HOMEWORK

        // 1) create a random number in the range [m,n]
        int m = 3;
        int n1 = 10;
        int random4 = (int)(Math.random() * (n1-m+1)+m);
        System.out.println(random4);

        // 2) create a random negative integer in the range [-m,0]
        int negM = -7;
        int random5 = (int)(Math.random() * negM-1);
        System.out.println(random5);

        // 3) create a random negative integer in the range [-m,-n]
        int negN = -5;
        int negM1 = -10;
        int random6 = (int)(Math.random() * (negM1-negN+1)+negN);
        System.out.println(random6);

        // 4) create a random negative integer in the range [-m,n]
        int negM2 = -5;
        int n2 = 10;
        int random7 = (int)(Math.random() * (n2-negM2+1)+negM2);
        System.out.println(random7);

        //using the Random Class
        //This is not static so we have to create a Random object

        //create a Random object

        //get int with and without bound

        // get double





    }
}
