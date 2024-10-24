import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* 1- Write a Java program to print the sum (addition), multiply, subtract
       , divide and remainder of two numbers , takes two numbers as input */
//
//        System.out.println("please enter first number: ");
//        int first =input.nextInt();
//        System.out.println("please enter second number: ");
//        int second= input.nextInt();
//
//        int sum=first+second;
//        int multiply=first*second;
//        int subtract=first-second;
//        int divide=first/second;
//        int remainder=first %second;
//
//        System.out.println("the addition is "+first+" + "+second+" = "+sum);
//        System.out.println("the multiply is "+first+" x "+second+" = "+multiply);
//        System.out.println("the subtract is "+first+" - "+second+" = "+subtract);
//        System.out.println("the divide is "+first+" / "+second+" = "+divide);
//        System.out.println("the remainder is "+first+" % "+second+" = "+remainder);

        // 2. Write a Java program that takes a number as input and prints its multiplication table up to 10.


//        System.out.print("Enter The a Number : ");
//        int number = input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " x " + number + " = " + (number * i));
//            if (i < 10) {
//                System.out.println(" ");
//            } else {
//                System.out.println();
//            }
//            }


        //3.Write a Java program to print the area and perimeter of a circle.


//        System.out.print("please Enter the radius of the circle: ");
//        double rad = input.nextDouble();
//
//        double area = 3.14 * rad * rad;
//        double per = 2 * 3.14 * rad;
//
//        System.out.println("the perimeter is: " + per);
//        System.out.println("the area is: " + area);


        //4.Java program to find out the average of a set of integers


//        System.out.print("please enter the count of numbers: ");
//        int count = input.nextInt();
//        int sum=0;
//        for (int i = 0; i < count ; i++) {
//            System.out.print("please enter a integer: ");
//            int integer= input.nextInt();
//            sum=sum+integer;
//        }
//        double average = (double) sum / count;
//        System.out.println("The average of the integers is: " + average);


        /*
        5. Write a Java program that accepts three integers as input,
        adds the first two integers together, and then determines
        whether the sum is equal to the third integer.
         */

//        System.out.println("Input the first number : ");
//        int first = input.nextInt();
//        System.out.println("input the second number: ");
//        int second = input.nextInt();
//        System.out.println("input the third number:  ");
//        int third = input.nextInt();
//
//        int add = first+second;
//
//        boolean result = (add == third);
//        System.out.println("The result is: " + result);


        //6.Write a Java program to reverse a word.
//
//        System.out.print("please enter your word: ");
//        String word = input.nextLine();
//
//        StringBuilder reversed = new StringBuilder();
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversed.append(word.charAt(i)); }
//        System.out.println("the Reverse word is: " + reversed);

        //7. Java program to check whether the given number is even or odd

//        System.out.println("please Enter a number: ");
//        int number= input.nextInt();
//
//        if (number % 2 == 0){
//            System.out.println("its even number");
//
//        }else System.out.println("its odd number");


        //  8. Java program to convert the temperature in Centigrade to Fahrenheit

//        System.out.println("please Enter temperature in Centigrade: ");
//        double temp = input.nextInt();
//
//        double fahrenheit= (temp * 9 /5) +32;
//        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

        /* 9. Write a Java program that takes a string and a number from the user,then
        prints the character in the given index.
         */
//
//        System.out.println("please Input a string: ");
//        String word= input.nextLine();
//        System.out.println("please input a index: ");
//        int number = input.nextInt();
//
//        if (number >= 0 && number < word.length()) {
//            char character = word.charAt(number);
//            System.out.println("Character at index " + number + " is: " + character);
//        }else System.out.println();


        // 10.Write a Java program to print the area and perimeter of a rectangle.

//        System.out.print("please Enter the width of the rectangle: ");
//        double width = input.nextDouble();
//
//        System.out.print("please Enter the  Height  of the rectangle: ");
//        double Height = input.nextDouble();
//
//        double area = width * Height;
//        double perimeter = 2 * (width + Height);
//
//        System.out.println("the area of the rectangle: " + area);
//        System.out.println("the Perimeter of the rectangle: " + perimeter);


        // 11.Write a Java program to compare two numbers.

//        System.out.println("please enter your first number: ");
//        int number1 = input.nextInt();
//        System.out.println("please enter your second number");
//        int number2=input.nextInt();
//
//        if(number1==number2){
//            System.out.println(number1+"="+number2);
//        }
//        if(number1 >number2){
//            System.out.println(number1+">"+number2);}
//        if (number1>=number2){
//            System.out.println(number1+">="+number2);
//        }
//        if (number1 < number2){
//            System.out.println(number1+"<"+number2);
//        }
//        if (number1 <= number2){
//            System.out.println(number1+"<="+number2);}
//
//        if (number1 != number2){
//            System.out.println(number1 +"!="+ number2);
//        }


        // 12.Write a Java program to convert seconds to hours, minutes and seconds.

//
//        System.out.println("enter seconds: ");
//        int totalSeconds = input.nextInt();
//
//        int hours = totalSeconds / 3600;
//        int minutes = (totalSeconds % 3600) / 60;
//        int seconds = totalSeconds % 60;
//
//        System.out.println("the total seconds for hours= "+hours);
//        System.out.println("the total seconds for minutes= "+minutes);
//        System.out.println("the total seconds for seconds= "+seconds);


        /* 13.Write a Java program that accepts four integers from the user and prints
        equal if all four are equal, and not equal otherwise.
         */

//        System.out.println("Input first number: ");
//        int first = input.nextInt();
//        System.out.println("Input second number: ");
//        int second= input.nextInt();
//        System.out.println("Input third number: ");
//        int third= input.nextInt();
//        System.out.println("Input fourth number: ");
//        int fourth= input.nextInt();
//
//        if (first == second && second == third && third == fourth){
//            System.out.println("the four numbers are equal!");
//        }else System.out.println("the four numbers are not equal!");

        // 14.Write a Java program that reads an integer and check whether it is negative, zero, or positive.

//        System.out.print("please enter your number: ");
//        int number = input.nextInt();
//
//        if (number<0){
//            System.out.println("the number is negative: "+number);
//        }else if (number>0){
//            System.out.println("the number is positive: "+number);
//        }else if (number==0){
//            System.out.println("the number is zero: "+number);
//              } else System.out.println();


        /* 15.Write a program to enter the numbers till the user wants and at the end it should display
        the count of positive, negative and zeros entered (End loop use -1 , Don’t count -1).
         */

//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//        int number;
//
//        System.out.println("Enter numbers or  -1 to stop: ");
//
//        while (true) {
//            number = input.nextInt();
//
//            if (number == -1) {
//                break;
//            }
//
//            if (number > 0) {
//                positive++;
//            } else if (number < 0) {
//                negative++;
//            } else {
//                zero++;
//            }
//        }
//        System.out.println("the Count of positive numbers: " + positive);
//        System.out.println("the Count of negative numbers: " + negative);
//        System.out.println("theCount of zeros: " + zero);


        // 16.Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.

//        System.out.print("please enter an integer:");
//        int number = input.nextInt();
//        int reversedNumber = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            reversedNumber = reversedNumber * 10 + digit;
//            number /= 10; }
//        System.out.println("the reversed number is: "+reversedNumber);


        /* 17.Write a program to enter the numbers till the user wants and at the end the program should display
        the largest and smallest numbers entered.
         */

//        int largest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//        String choice;
//
//        do{
//            System.out.println("enter your number: ");
//            int number = input.nextInt();
//            if (number > largest) {
//                largest = number;
//            }
//            if (number < smallest) {
//                smallest = number;
//            }
//            System.out.print("Do you want to enter another number? (y/n): ");
//            choice = input.next();
//        }while (choice.equalsIgnoreCase("y"));
//
//        System.out.println("Largest number is: " + largest);
//        System.out.println("Smallest number is: " + smallest);


       //18. Determine and print the number of times the character ‘a’ appears in the input entered by the user.

//        System.out.print("Enter String: ");
//        String word= input.nextLine();
//
//        int count = 0;
//        word = word.toLowerCase();
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        System.out.println("Number of a's: "+count);
















































    }
}