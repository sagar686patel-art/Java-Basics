import java.util.*;
public class Average {

		public static void main(String[] args) {
  Scanner in=new Scanner(System.in);		
  double n,a,b,c,d,e;
  System.out.println("Enter 5 numbers:");
  a = in.nextInt();
  b = in.nextInt();
  c = in.nextInt();
  d = in.nextInt();
  e = in.nextInt();
  n=(a+b+c+d+e)/5;
  System.out.println("Average of given 5 numbers: "+n);
	}
}