package control_structures;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца(от 1 до 12):");
        int num = scanner.nextInt();
        switch (num) {

            case 1, 2, 12:
                System.out.println("Пора года - зима");
                break;
            case 3, 4, 5:
                System.out.println("Пора года - весна");
                break;
            case 6, 7, 8:
                System.out.println("Пора года - лето");
                break;
            case 9, 10, 11:
                System.out.println("Пора года - осень");
                break;

        }


    }
}

