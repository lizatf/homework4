import java.util.Arrays;
import java.util.Random;

public class QA_27_4_4_Tuflina {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(15);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(Arrays.toString(array[i]));
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                for (int k = 0; k < array[j].length - 1; k++) {
                    if (array[j][k] > array[j][k + 1]) {
                        int temp = array[j][k + 1];
                        array[j][k + 1] = array[j][k];
                        array[j][k] = temp;
                    }

                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(Arrays.toString(array[i]));
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                for (int k = 0; k < array[j].length - 1; k++) {
                    if (array[j][k] < array[j][k + 1]) {
                        int temp = array[j][k + 1];
                        array[j][k + 1] = array[j][k];
                        array[j][k] = temp;
                    }

                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(Arrays.toString(array[i]));

            }
        }
    }
}
