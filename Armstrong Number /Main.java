import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner (System.in);
      int n1=in.nextInt();
      int rem,result=0;
      int n2=n1;
      while (n1!=0)
      {
        rem=n1%10;
        result=result+rem*rem*rem;
        n1 /=10;
      }
        if(result==n2)
        {
        System.out.println("Armstrong Number");
        }
        else
        {
        System.out.println("Not a Armstrong Number");
        }
	}
}
