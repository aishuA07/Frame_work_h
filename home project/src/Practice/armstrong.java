package Practice;

public class armstrong {

	public static void main(String[] args) {

     int no=153;
     int copy=no;
     int sum=0;
     while(no!=0)
     {
    	 int rem=no%10;
    	 sum=sum+(rem*rem*rem);
    	 no=no/10;
     }
     if(copy==sum)
     {
    	 System.out.println(copy+ " is an armstrong no");
     }
     else
     {
    	 System.out.println(copy+ " is not an armstrong no");
     }

	}
}
