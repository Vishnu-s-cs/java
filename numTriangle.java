
public class numTriangle {
    public static void main(String args[]) {
        int rows, i, j, count = 1;
 
        
        
        rows = 4;
 
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.print("\n");
        }
    }
}