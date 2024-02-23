package org.stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        Stack stack = new Stack(scanner.nextInt());
        while (true){
            System.out.print("Choose operation: push or pop? Enter 'exit' for leave. ");
            switch (scanner.next()){
                case "push":
                    if (stack.isFull()){
                        System.out.println("Stack is full");
                        break;
                    }
                    System.out.print("Enter number: ");
                    int response = stack.push(scanner.nextInt());
                    if (response == 0){
                        System.out.println("Data has been pushed");
                    }
                    break;
                case "pop":
                    if (stack.isEmpty()){
                        System.out.println("Stack is empty");
                        break;
                    }
                    System.out.println(stack.pop());
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}