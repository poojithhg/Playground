import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner (System.in);
    int starcount;
    int n=in.nextInt();
    for(starcount=1;starcount<=n;starcount++)
      System.out.println("*");
  }
}