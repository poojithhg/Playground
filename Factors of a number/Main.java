import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner (System.in);
      int n=in.nextInt();
      for (int n1=1;n1<=n;n1=n1+1)
        if (n%n1==0)
        System.out.println(n1);
	}
}