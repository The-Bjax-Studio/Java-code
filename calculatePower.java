/*write the code of power multiplication method...
if you pass the value of 5 of power 3 the the value is=
The number is: 125
*/
import java.util.Scanner;
public class printsqrn{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        //taking input of a number 
        System.out.print("Enter the number of your choice: ");
        int a =sc.nextInt();
        //taking the number of power..... 
        System.out.print("Enter the power of your choice: ");
        int b=sc.nextInt();
        //function calling....
        int power=printSqrn(a,b);
        System.out.println("The number is: "+power);
    }
    public static int printSqrn(int a,int b){
        if(a==0){
            return 0;
        }
        if(b==0){
            return 1;
        }
       if(b%2==0){
        return printSqrn(a,b/2)*printSqrn(a,b/2);
       }
       else{
        return printSqrn(a,b/2)*printSqrn(a,b/2)*a;
       }
    }
}