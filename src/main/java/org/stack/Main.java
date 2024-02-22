package org.stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        Stack stack = new Stack(scanner.nextInt());
        while (true){
            System.out.println("Choose operation: push or pop? Enter exit for leave");
            switch (scanner.next()){
                case "push":
                    System.out.print("Enter number: ");
                    int response = stack.push(scanner.nextInt());
                    if (response == 0){
                        System.out.println("Data has been push");
                    } else if (response == -1){
                        System.out.println("Stack is full");
                    }
                    break;
                case "pop":
                    try {
                        System.out.println(stack.pop());
                    } catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Stack is empty");
                    }
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Wrong type!");
                    break;
            }
        }
    }
}