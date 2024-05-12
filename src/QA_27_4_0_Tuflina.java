import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QA_27_4_0_Tuflina {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][] treemultidimensionalArray = new int[2][1][3];
        for (int i = 0; i < treemultidimensionalArray.length; i++) {
            for (int j = 0; j < treemultidimensionalArray[i].length; j++) {
                for (int k = 0; k < treemultidimensionalArray[i][j].length; k++) {
                    treemultidimensionalArray[i][j][k] = random.nextInt(20);
                }
            }
        }
        for (int i = 0; i < treemultidimensionalArray.length; i++) {
            for (int j = 0; j < treemultidimensionalArray[i].length; j++) {
                for (int k = 0; k < treemultidimensionalArray[i][j].length; k++) {
                    System.out.print(Arrays.toString(treemultidimensionalArray[i][j]));
                }

            }
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число на которое надо увеличить: ");
        int numberToIncrease = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < treemultidimensionalArray.length; i++) {
            for (int j = 0; j < treemultidimensionalArray[i].length; j++) {
                for (int k = 0; k < treemultidimensionalArray[i][j].length; k++) {
                    treemultidimensionalArray[i][j][k] += numberToIncrease;
                }
            }
        }
        for (int i = 0; i < treemultidimensionalArray.length; i++) {
            for (int j = 0; j < treemultidimensionalArray[i].length; j++) {
                for (int k = 0; k < treemultidimensionalArray[i][j].length; k++) {
                    System.out.print(Arrays.toString(treemultidimensionalArray[i][j]) + " ");
                }
            }
        }
    }
}
