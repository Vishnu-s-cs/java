import java.util.Scanner;
public class GetArray {
    void getArray(int arr[][],int rows,int cols){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements row by row:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
}
