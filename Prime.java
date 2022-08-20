package bg;
import java.util.*;
public class Prime {

		  public static void main(String[] args) {
             int n;
             System.out.println("Enter a no");
 		    Scanner s=new Scanner(System.in);
            n=s.nextInt();
            boolean flag=false;
            for(int i=2;i<=n/2;i++) {
            if(n%2==0) {
            	flag=true;
            	break;
            }
            }
            if(!flag) {
                if (!flag) {
      		      System.out.println(n + " is a prime number.");
                }
      		    else {
      		      System.out.println(n + " is not a prime number.");
      		    }
		  }
		}
}
