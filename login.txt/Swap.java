import java.util.Scanner;
class Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.print("enter value of A: ");
         int a=sc.nextInt();
         System.out.print("enter value of B: ");
         int b=sc.nextInt();
         int c=a;
         a = b;
         b = c;
         System.out.print("value of A is:" +a);
         System.out.print("value of B is:" +b);
    }
}