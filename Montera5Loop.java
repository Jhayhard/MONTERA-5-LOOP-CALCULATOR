/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.montera.loop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Montera5Loop {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                displayMenu();
                int choice = scanner.nextInt();
                
                boolean isCorrect;
                
                switch (choice) {
                    case 1 -> isCorrect = solveTrigonometryProblem();
                    case 2 -> isCorrect = solveSolidMensurationProblem();
                    case 3 -> isCorrect = solveGeometryProblem();
                    case 4 -> isCorrect = solveEquationOneUnknownProblem();
                    case 5 -> isCorrect = solveSimplySquareRootsProblem();
                    case 0 -> {
                        System.out.println("Goodbye! Thank you for using the Math Problem Solver.");
                        return;  
                    }
                    default -> {
                        System.out.println("Invalid choice. Please enter a valid option.");
                        continue;
                    }
                }
                
                
                if (isCorrect) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect. Please try again.");
                }
                
                
                System.out.print("Do you want to continue? (yes/no): ");
                String continueOption = scanner.next().toLowerCase();
                
                if (!continueOption.equals("yes")) {
                    System.out.println("Goodbye! Thank you for using the Math Problem Solver.");
                    break;  
                }
                
            } while (true);
        }
    }

    public static void displayMenu() {
        System.out.println("Math Problem Solver");
        System.out.println("1. Trigonometry");
        System.out.println("2. Solid Mensuration");
        System.out.println("3. Geometry");
        System.out.println("4. Solving Equation One Unknown");
        System.out.println("5. Simply Square Roots");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static boolean solveTrigonometryProblem() {
        // Trigonometry question
        System.out.println("Solving a trigonometry problem: What is the sine of 30 degrees?");
        // Correct answer
        double correctAnswer = Math.sin(Math.toRadians(30));

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean solveSolidMensurationProblem() {
        // Solid mensuration question
        System.out.println("Solving a solid mensuration problem: What is the volume of a cube with side length 3?");
        // Correct answer
        double correctAnswer = Math.pow(3, 3);

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean solveGeometryProblem() {
        // Geometry question
        System.out.println("Solving a geometry problem: What is the area of a rectangle with length 5 and width 8?");
        // Correct answer
        double correctAnswer = 5 * 8;

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean solveEquationOneUnknownProblem() {
        // Equation one unknown question
        System.out.println("Solving an equation with one unknown problem: Solve for x in the equation 2x + 5 = 13.");
        // Correct answer
        double correctAnswer = (13 - 5) / 2.0;

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean solveSimplySquareRootsProblem() {
        // Simply square roots question
        System.out.println("Solving a simply square roots problem: What is the square root of 25?");
        // Correct answer
        double correctAnswer = Math.sqrt(25);

        return getUserAnswerAndCheck(correctAnswer);
    }

    public static boolean getUserAnswerAndCheck(double correctAnswer) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your answer: ");
        double userAnswer = scanner.nextDouble();

        return Math.abs(userAnswer - correctAnswer) < 0.0001;
    }
}



    
    

