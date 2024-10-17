package math_class;

/**
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.math.MathContext;
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

        // abs
        int num1 = -2;
        int absValue = Math.abs(num1);
        System.out.println(absValue);

        // pow
        double num2 = Math.pow(3,5);
        System.out.println(num2); //cast to int if you want that

        // sqrt
        double num3 = Math.sqrt(80);
        System.out.println(num3);
        System.out.println(Math.pow(num3,2)); //round off error

        //create a random number in the range [0,1)
        double random1 = Math.random();
        System.out.println(random1);

        //create a random integer in the range [0, n)
        // example: [0,6)
        double random2 = (int)(Math.random()*6);
        // in general, multiply by n

        // create a random  in the range [0,n]
        // example [0,6]
        double random3 = (int)(Math.random()*7);


        //For Homework (you can make up m and n values)

        // 1) create a random integer in the range [m,n]
        // (int)(Math.random()*(n-m+1)+m)

        // 2) create a random negative integer in the range [-m,0]
        // (int)(Math.random()*(-m-1))

        // 3) create a random negative integer in the range [-m,-n]

        // 4) create a random negative integer in the range [-m,n]





        // Save for Thursday

        //using the Random Class
        //This is not static so we have to create a Random object

        //create a Random object
        Random randObj = new Random();

        //get int with and without bound
        int randInt = randObj.nextInt();
        System.out.println(randInt);

        //with bound
        int randIntSmaller = randObj.nextInt(100);
        System.out.println(randIntSmaller);

        // get double
        double randDouble = randObj.nextDouble(); //between 0 and 1
        System.out.println(randDouble);

        double randDoubleTwo = randObj.nextDouble(50,100);
        System.out.println(randDoubleTwo); //between 50 and 100, uses RandomGenerator Interface





    }
}
