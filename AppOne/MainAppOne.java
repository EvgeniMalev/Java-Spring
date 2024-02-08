
package com.appone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class MainAppOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter message:");
        String message = scanner.nextLine();
        System.out.println("Enter first number:");
        int numberOne = scanner.nextInt();
        System.out.println("Enter second number:");
        int numberTwo = scanner.nextInt();

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        AppOne obj = (AppOne) context.getBean("messages");
        obj.setMessage(message);
        obj.setNumberOne(numberOne);
        obj.setNumberTwo(numberTwo);
        obj.getMessage();
        System.out.println("The sum of the two numbers is: " + obj.calculateSum());
    }
}
