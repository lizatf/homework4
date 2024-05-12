import java.util.Arrays;
import java.util.Random;

public class QA_27_4_3_Tuflina {
    public static void main(String[] args) {
        int[][] arrayValue = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < arrayValue.length; i++) {
            for (int j = 0; j < arrayValue[i].length; j++) {
                arrayValue[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < arrayValue.length; i++) {
            for (int j = 0; j < arrayValue[i].length; j++) {
                System.out.println(Arrays.toString(arrayValue[i]));
            }
        }
        for (int i = 0; i < arrayValue.length ; i++) {
            System.out.print(arrayValue[i][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayValue.length ; i++){
            System.out.print(arrayValue[i][arrayValue.length- 1 - i] +  " ");
        }
    }
}
