package AULAS_1_A_38;

public class TreinandoArrays {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 11;
        dias[0][1] = 21;
        dias[0][2] = 31;

        dias[1][0] = 12;
        dias[1][1] = 22;
        dias[1][2] = 32;

        dias[2][0] = 13;
        dias[2][1] = 23;
        dias[2][2] = 33;

        for (int i = 0; i < dias.length; i++) {
            System.out.println("------------");
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------");
        for (int[] arrBase : dias) {
            System.out.println("-------------");
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
