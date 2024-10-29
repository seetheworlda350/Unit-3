package practice; //don't change this
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Unit3Practice {
    public static void main(String[] args) {
        //remove the // to run the methods

        //problemOne();
        //problemTwo();
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
        ArrayList numbers = new ArrayList<>();
        ArrayList revNumbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.sort(null);
        System.out.println("Here are your numbers printed in ascending order: ");
        System.out.println(numbers);
        revNumbers.add(num1);
        revNumbers.add(num2);
        revNumbers.add(num3);
        revNumbers.sort(null);
        Collections.reverse(revNumbers);
        System.out.println("Here are your numbers printed in descending order: ");
        System.out.println(revNumbers);

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
