package control_structures;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца(от 1 до 12):");
        int num = scanner.nextInt();

        if (num <= 2 || num == 12) {
            System.out.println("Пора года - зима");
        } else if (num >= 3 & num <= 5) {
            System.out.println("Пора года - весна");
        } else if (num >= 6 & num <= 8) {
            System.out.println("Пора года - лето");
        } else if (num >= 9 & num <= 11) {
            System.out.println("Пора года - осень");
        }
    }
}

