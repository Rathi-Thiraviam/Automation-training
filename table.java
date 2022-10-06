import java.util.Scanner;

public class table {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
   	    System.out.println("================================");
            System.out.println("\n");
            for(int i=0;i<3;i++)
 	    {
                String s1=sc.next();
                int x=sc.nextInt();
		System.out.printf("\n %-14s %3d", s1,x);
            } 
            System.out.println("\n");
	    System.out.println("================================");
    }
}
