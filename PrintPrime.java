public class PrintPrime {
    int a[] = { 1, 2, 3, 4, 5 };

    public static void main(String[] args) {
        PrintPrime p = new PrintPrime();
        // System.out.print(p.a.length);
        int arr[]=p.a;
        int n=arr.length;
        int count;
        for (int i = 0; i < n; i++) {
            count=0;
            if (arr[i]>=2) {
                for (int j = 2; j <= arr[i]/2; j++) {
                    if (arr[i]%j==0) {
                        count=1;
                        break;
                    }
                }
            }else{
                continue;
            }
            
            if (count==0) {
                System.out.print(" "+arr[i]);
            }
        }
    }
}
