package Logic;

import java.util.Scanner;

public class DataEntry {

    private Scanner scanner;
    private int userChoice;
    private double firstValue;
    private double secondValue;

    public DataEntry(){
        scanner = new Scanner(System.in);
        userChoice = scanner.nextInt();
        System.out.println("Введите первое число: ");
        firstValue = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        secondValue = scanner.nextDouble();
        scanner.close();
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public int getUserChoice() {
        return userChoice;
    }
}
