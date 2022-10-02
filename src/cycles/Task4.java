package cycles;

public class Task4 {
    public static void main(String[] args) {
        int i = 1;
        System.out.print("Последовательность чисел,кратных семи: ");
        while (i < 100) {
            if (i % 7 == 0) {
                System.out.print(" " + i);
            }
            i++;
        }


    }
}
