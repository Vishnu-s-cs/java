import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {
        
        try (Scanner hi = new Scanner(System.in)) {
            float tax=0;
            System.out.println("Enter your salary in lakhs: ");
            float salary= hi.nextFloat(); 
            if(2.5<salary && salary<5){
              tax= 5;
            }else if(salary>5&&salary<10){
                tax=20;
            }else if(salary>10&&salary<50){
                tax=30;
            }
            System.out.println("Hmm Your tax amount will be "+(tax/100)*salary+"lakhs and tax rate will be "+tax);
      
            
          }
    }
}
