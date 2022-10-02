package cycles;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Плсдеовательность,кратная 5(меньше 0):");
        for (int i = 0; i > -50; i--) {
            if (i % 5 == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
