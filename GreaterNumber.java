import java.util.Scanner;

public class GreaterNumber {

    public static void main(String args[]) {

        int number1, number2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        number1 = scan.nextInt();

        System.out.println("Enter 2st Number");
        number2 = scan.nextInt();

        if(number1>number2){
            System.out.println("1st Number: " + number1 + " is greater than the 2nd Number: " + number2);
        } else if(number2>number1) {
            System.out.println("2nd Number: " + number2 + " is greater than the 1st Number: " + number1);
        } else {
            System.out.println("Both numbers are equal");
        }

        //MODIFICATIONS MADE TO FILE **AFTER** PUSHING FILE ON GIT.

        System.out.println("This is a new line added after moving git project file on github");


        scan.close();

    }

}