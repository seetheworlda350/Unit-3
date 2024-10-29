package practice; //don't change this
import java.util.Scanner;

public class Unit3Practice {
    public static void main(String[] args) {
        //remove the // to run the methods

        //problemOne();
        problemTwo();
    }

    public static void problemOne(){
        // code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter a whole number");
        int num1 = input.nextInt();
        System.out.println("Please enter another whole number");
        int num2 = input.nextInt();
        System.out.println("Please enter a third whole number");
        int num3 = input.nextInt();
        System.out.println("Here are your numbers printed in ascending order");
        if(num1 < num2 && num1 < num3){
            System.out.print(num1 + " ");
            if(num2 < num3){
                System.out.print(num2 + " " + num3);
            } else {
                System.out.print(num3 + " " + num2);
            }
        } else if(num2 < num1 && num2 < num3){
            System.out.print(num2 + " ");
            if(num1 < num3){
                System.out.print(num1 + " " + num3);
            } else {
                System.out.print(num3 + " " + num1);
            }
        } else {
            System.out.print(num3 + " ");
            if(num1 < num2){
                System.out.print(num1 + " " + num2);
            } else {
                System.out.print(num2 + " " + num1);
            }
        }
        System.out.println(" " );
        System.out.println("Here are your numbers printed in descending order");
        if(num1 > num2 && num1 > num3){
            System.out.print(num1 + " ");
            if(num2 > num3){
                System.out.print(num2 + " " + num3);
            } else {
                System.out.print(num3 + " " + num2);
            }
        } else if(num2 > num1 && num2 > num3){
            System.out.print(num2 + " ");
            if(num1 > num3){
                System.out.print(num1 + " " + num3);
            } else {
                System.out.print(num3 + " " + num1);
            }
        } else {
            System.out.print(num3 + " ");
            if(num1 > num2){
                System.out.print(num1 + " " + num2);
            } else {
                System.out.print(num2 + " " + num1);
            }
        }

    }

    public static void problemTwo(){
        //code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter how many hours you worked this week");
        double hours = input.nextDouble();
        System.out.println("Please enter your hourly wage");
        double wage = input.nextDouble();
        double pay = 0;
        double overPay = 0;
        double totalPay = 0;
        if(hours <= 40){
            pay = hours * wage;
            System.out.println("You earned $" + pay + " this week");
        } else {
            overPay = (hours - 40) * (wage * 1.5);
            pay = hours * wage;
            totalPay = pay + overPay;
            System.out.println("Wow, you worked overtime this week!");
            System.out.println("You earned $" + pay + " this week in regular pay, and $" + overPay + " in overtime pay. Here is your total pay: $" + totalPay);
        }
    }
}
