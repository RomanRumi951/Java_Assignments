// JAVA PROGRAM TO INITIALIZE THE MATRIX OF SIZE 3 X 3 AMD DISPLAY IT..
package java_Assignment_1;

class P1 {
    public static void main(String r[]) {
        int arr[][] = new int[3][3], k = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = k;
                System.out.print(arr[i][j] + " ");
                k++;
            }
            System.out.println();
        }
    }
}