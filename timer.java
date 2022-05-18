package t;
import java.util.*;
public class timer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int arr[]=new int[10];
     for(int i=0;i<arr.length;i++) {
    	 arr[i]=sc.nextInt();
     }
     for(int i=0;i<arr.length;i++) {
    	 Thread.sleep(3000);
    	 System.out.println(arr[i]);
     }
	}

}
