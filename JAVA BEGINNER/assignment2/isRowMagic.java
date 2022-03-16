package assignment2;

public class isRowMagic {

    public static boolean isRowMagic(int[][] a){
        int sum = 0;
        int prevsum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum+=a[i][j];
            }
            // System.out.println(sum);
            if(i == 0){
                prevsum  = sum;
                sum=0;
            }
            else{
                if(prevsum != sum){
                    return false;
                }
                sum=0;
        }
        }
        return true;

    }
    public static void main(String[] args) {

        int[][] matrix1 = { { 1, 2, 3, 4 },{ 1, 2, 3, 4 },{ 1, 2, 3, 4 },{ 1, 2, 3, 5 } };
        System.out.println(isRowMagic(matrix1));
        
    }
}
