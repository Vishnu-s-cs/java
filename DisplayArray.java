public class DisplayArray {
    void displayArray(int arr[][],int row,int col){
        System.out.println("The array is :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println("\n");
        }
        
    }
    
}
