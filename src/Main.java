import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Чсло строк в массиве = ");
        int a = sc.nextInt();
        System.out.println("Чсло столбцов в массиве = ");
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int c = (int) (Math.random() * 10);
                arr[i][j] = c;
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
