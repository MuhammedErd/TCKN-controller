
package homework3;
import java.util.Scanner;
public class Homework3 {

  
    public static void main(String[] args) {
     long[] digit=new long[11];
     System.out.print("Input a TCKN(Citizen Number):");
     Scanner input1 = new Scanner (System.in);
     String n = input1.nextLine();
     long x = Long.parseLong(n);
     int len = n.length();
      if(len==11){
         for(int i=10;0<=i;i--){
            digit[i]=x%10;
            x=x/10;
            }
         if(digit[0]!=0){
           long sum1=0;
           long sum2=0;
           sum1 = ((digit[0]+digit[2]+digit[4]+digit[6]+digit[8])*7-
                   (digit[1]+digit[3]+digit[5]+digit[7]))%10;
           for(int i=0;i<10;i++){
               sum2 = sum2 + digit[i];
           }
            
           sum2=sum2%10;
           if(sum1==digit[9] && sum2==digit[10]){
               System.out.println("valid TCKN");            
           }
           else{
                 System.out.println("invalid TCKN");
         }
         }
         else{
                 System.out.println("invalid TCKN");
         }         
      }
      else{
                 System.out.println("invalid TCKN");
      }     
    }
    
}
