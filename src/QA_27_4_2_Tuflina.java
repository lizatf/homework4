import java.util.Arrays;
import java.util.Random;

public class QA_27_4_2_Tuflina {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(Arrays.toString(array[i]));
            }
        }
        System.out.println();

        int sumOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumOfElements = sumOfElements + array[i][j];
            }
        }
        System.out.println("Сумма элементов массива: " + sumOfElements);
    }
}
