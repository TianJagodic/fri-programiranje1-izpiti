
public class Test41 {

    public static void main(String[] args) {
        int[][] t = {
            { 905,  81, 906,  53, 160,  38, 130, 431, 120,  68, 548, 343, 455, 499, 296, 184, 795, 607, 480 },
            { 311, 992, 288, 920, 915, 547, 822, 357, 286, 854, 324, 756,  78, 499,  70, 369, 138, 603,  97 },
            { 895, 334,  24, 680, 824, 748,  64, 444, 936, 387, 446,  83, 845, 679, 204, 683, 834, 973, 379 },
            { 517, 903,  43, 563, 840, 729, 106, 285, 530, 179, 593, 110, 380,  80, 299, 102, 358, 242, 265 },
        };

        int[][] kumulativa = Druga.kumulativa(t);
        for (int i = 0;  i < 4;  i++) {
            for (int j = 0;  j < 19;  j++) {
                System.out.printf("%5d ", kumulativa[i][j]);
            }
            System.out.println();
        }

    }
}
