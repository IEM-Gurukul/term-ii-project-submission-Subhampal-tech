package ui;

import java.util.Scanner;

public class ConsoleUI {

    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    // Safe row input
    public int getRowInput() {
        while (true) {
            try {
                System.out.print("Enter row (0-2): ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // clear buffer
            }
        }
    }

    // Safe column input
    public int getColInput() {
        while (true) {
            try {
                System.out.print("Enter col (0-2): ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // clear buffer
            }
        }
    }

    // General message
    public void showMessage(String message) {
        System.out.println(message);
    }

    // Show player turn
    public void showTurn(String playerName, char symbol) {
        System.out.println("\n" + playerName + "'s turn (" + symbol + ")");
    }

    // Optional (can still keep for flexibility)
    public void showInvalidInput() {
        System.out.println("Invalid input! Please enter numbers only.");
    }
}