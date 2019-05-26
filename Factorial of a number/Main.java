import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner (System.in);
      int n=in.nextInt();
      int pro=1;
      for (int n1=1;n1<=n;n1=n1+1)
     pro=pro*n1;
        System.out.println(pro);
	}
}