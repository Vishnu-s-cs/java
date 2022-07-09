import java.util.Scanner;
public class Array {
    static int arr[][]={
        {1, 2, 3}, 
        {4, 5, 6, 9}, 
        {7}, 
  };;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter no. of cols: ");
        int cols=sc.nextInt();
        GetArray o=new GetArray();
        o.getArray(arr,rows,cols);
        DisplayArray d=new DisplayArray();
        d.displayArray(arr,rows,cols);
    }
}
