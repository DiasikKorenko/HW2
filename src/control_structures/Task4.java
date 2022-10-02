package control_structures;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру(число): ");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("На улице ТЕПЛО, при температруре = " + t);
        } else if (t <= -5 & t > -20) {
            System.out.println("На улице НОРМАЛЬНО, при температруре = " + t);
        } else if (t <= -20) {
            System.out.println("На улице ХОЛОДНО, при температруре = " + t);
        }

    }
}