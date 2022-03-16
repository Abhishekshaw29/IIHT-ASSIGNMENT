package assignment2;

public class Ismagicnumber {

    public static int checkrow(int a[][]) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    sum+=a[i][j];
                }
            }
                return sum;
    
        }
        public static int checkcol(int a[][]) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    sum+=a[j][i];
                }
            }
                return sum;
        }
        public static int rightdiagonal(int a[][]) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if(i+j == a.length-1)
                    sum+=a[i][j];
                }
            }
                return sum;
        }
        public static int leftdiagonal(int a[][]) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if(i == j)
                    sum+=a[i][j];
                }
            }
                return sum;
        }


    public static boolean ismagicnumber(int a[][]) {
        if (checksquare(a)) {
        if( leftdiagonal(a) == rightdiagonal(a)){
            if ( checkcol(a) == checkrow(a)) {
                return true;
            }            
        }
    }
        return false;

    }
    private static boolean checksquare(int a[][]){
        int count= 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                count++;
            }
        }
        if(count == a.length){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3, 4 },{ 1, 2, 3, 4 },{ 1, 2, 3, 4 },{ 1, 2, 3, 5 } };
        System.out.println(ismagicnumber(matrix1));
    }
}
