package com.Lesthy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, I am your chat bot Hannah, I am here to help you answer questions about intro in programming. What would you like to know?");
        String chat = scan.nextLine().toLowerCase();

        while (true) {
            if (chat.contains("java")) {
                System.out.println("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
            } else if (chat.contains("html")) {
                System.out.println("The HyperText Markup Language or HTML is the standard markup language for documents designed to be displayed in a web browser.");
            } else if (chat.contains("css")) {
                System.out.println("Cascading Style Sheets or CSS is a style sheet language used for describing the presentation of a document written in a markup language such as HTML.");
            } else {
                System.out.println("Sorry, I am not programmed to answer that question yet.");
            }

            System.out.println("Do you have another question? Write + if yes write - if no");
            chat = scan.nextLine().toLowerCase();

            if (chat.contains("-")) {
                System.out.println("Goodbye, hope I answered all your questions, have a great day!");
                break;
            } else if (chat.contains("+")){
                System.out.println("What is your question?");
                chat = scan.nextLine().toLowerCase();
            }
        }
    }
}
