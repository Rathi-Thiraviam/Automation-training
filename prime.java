import java.util.Scanner;
class Newcode
{
  public static void main(String args[])
  {
    int u1;
    boolean isPrime=true;
    Scanner num=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=num.nextInt();
    for(int i=2; i<=n/2;i++)
    {
      u1=n%i;
      if(u1==0)
      {
        isPrime=false;
        break;
       }
     }
     if(isPrime)
        System.out.println(n + "\n The given number is prime");
     else 
        System.out.println(n + "\n The given number is not a prime");
  }
}
