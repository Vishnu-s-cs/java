
    import java.util.Scanner;
public class Calculate 

{
    void add(int m,int n){
        int add;
        add = m + n;
        System.out.println("Result:"+add);
    }
    void sub(int m,int n){
        int sub;
        sub = m - n;
                    System.out.println("Result:"+sub);
    }
    void div(int m,int n){
        int div;
        div = m / n;
        System.out.println("Result:"+div);
    }
    void mul(int m,int n){
        int mul;
        mul = m * n;
        System.out.println("Result:"+mul);
    }
    public static void main(String[] args) 
    {
        Calculate C=new Calculate();
        int m, n, opt, add, sub, mul;
        double div;
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter first number:");
            m = s.nextInt();
            System.out.print("Enter second number:");
            n = s.nextInt();
            while(true)
            {
                System.out.println("Enter 1 for addition");
                System.out.println("Enter 2 for subtraction");
                System.out.println("Enter 3 for multiplication");
                System.out.println("Enter 4 for division");
                System.out.println("Enter 5 to Exit");
                opt = s.nextInt();
                switch(opt)
                {
                    case 1:
                        C.add(m,n);
                    break;
 
                    case 2:
                        C.sub(m,n);
                    break;
                    case 3:
                    C.mul(m,n);
                    break;
                    
                    case 4:
                    C.div(m,n);
                    break;    
 
                    case 5:
                    System.exit(0);
                }
            }
        }
    }
}

