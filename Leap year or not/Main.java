import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      if((n1%4==0)&&(n1%100!=0)||(n1%100==0)&&(n1%400==0))
        System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
		// Type your code here
    }
}