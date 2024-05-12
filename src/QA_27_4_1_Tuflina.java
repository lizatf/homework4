import java.util.Arrays;

public class QA_27_4_1_Tuflina {
    public static void main(String[] args) {
        char[][] chess = new char[8][8];
        for (int i = 0; i < chess.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < chess[i].length; j++) {
                    if (j % 2 == 0){
                        chess[i][j] = 'W';
                    } else
                        chess[i][j] = 'B';
                }
            } else
                for (int j = 0; j < chess[i].length; j++){
                    if (j % 2 == 0){
                        chess[i][j] = 'B';
                    } else
                        chess[i][j] = 'W';
                }
        }
        for (int i = 0; i < chess.length; i++){
            System.out.println(Arrays.toString(chess[i]));
        }
    }
}
