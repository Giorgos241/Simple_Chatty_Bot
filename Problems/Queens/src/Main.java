//You are given coordinates of two queens on a chess board. Find out, whether they hit each other or not.
//
//        INPUT
//        Four integer numbers x1,y1,x2,y2 are being typed.
//
//        OUTPUT
//        Type "YES" (uppercase) if they hit each other or "NO" if the don't.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] i = new int[4];
        for (int j = 0; j < 4; j++) {
            i[j] = sc.nextInt();
        }
        boolean b = hit(i);
        if (b) System.out.println("YES");
        else System.out.println("NO");

    }

    public static boolean hit(int[] i) {

        int[][] matrix = new int[8][8];
        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 8; k++) {
                matrix[j][k] = 0;
            }
        }
        matrix[i[0]][i[1]] = 1;                 //set qeen1
        matrix[i[2]][i[3]] = 1;                 //set qeen2
        matrix = line(i[0], i[1], matrix);      //calqulate line attack
        matrix = diagonal(i[0], i[1], matrix);  //calculate diagonal attack
        PrintMatrix(matrix);                    //print martix
        return resultF(matrix);
    }

    private static void PrintMatrix(int[][] matrix) {
        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 8; k++) {
                //System.out.print(matrix[j][k] + " ");
            }
            System.out.println();
        }
    }

    private static boolean resultF(int[][] matrix) {
        boolean res = false;
        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 8; k++) {
                if (matrix[k][j] > 1) res = true;
            }
        }
        return res;

    }

    private static int[][] line(int x, int y, int[][] matrix) {
        for (int j = 0; j < 8; j++) {
            matrix[x][j]++;
        }
        for (int j = 0; j < 8; j++) {
            matrix[j][y]++;
        }
        matrix[x][y] = matrix[x][y] - 2;
        return matrix;
    }

    private static int[][] diagonal(int x, int y, int[][] matrix) {
        int[] coordinates = {x, y};
        while ((coordinates[0] < 7) & (coordinates[1] < 7)) {
            coordinates[0]++;
            coordinates[1]++;
            matrix[coordinates[0]][coordinates[1]]++;
        }
        coordinates[0] = x;
        coordinates[1] = y;
        while ((coordinates[0] > 0) & (coordinates[1] > 0)) {
            coordinates[0]--;
            coordinates[1]--;
            matrix[coordinates[0]][coordinates[1]]++;
        }
        coordinates[0] = x;
        coordinates[1] = y;
        while ((coordinates[0] < 7) & (coordinates[1] > 0)) {
            coordinates[0]++;
            coordinates[1]--;
            matrix[coordinates[0]][coordinates[1]]++;
        }
        coordinates[0] = x;
        coordinates[1] = y;
        while ((coordinates[0] > 0) & (coordinates[1] < 7)) {
            coordinates[0]--;
            coordinates[1]++;
            matrix[coordinates[0]][coordinates[1]]++;
        }

        return matrix;
    }
}