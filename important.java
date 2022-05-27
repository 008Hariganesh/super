package t;
import java.util.*;
public class important {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.print("your Name: ");
         String str=sc.nextLine();
         str.toLowerCase();
         System.out.print("crush Name: ");
         String str2=sc.nextLine();
         str2.toLowerCase();
         int count =0;
         char arr[]=str.toCharArray();
         char arr1[]=str2.toCharArray();
         for(int i=0;i<arr.length;i++) {
        	 for(int j=0;j<arr1.length;j++) {
        		 if(arr[i]==arr1[j]) {
        			 arr[i]='0';
        			 arr1[j]='0';
        		 }	
        	 }
         }
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]!='0') { 
        		 count++;
        	 }
         }
         for(int j=0;j<arr1.length;j++) {
        	 if(arr1[j]!='0') {
        		 count++;
        	 }
         }
         String f="FLAMES";
  	   while(f.length()!=1) {
  		   int cut=0;
  		   for(int i=1;i<=count;i++) {
  			   if(cut>=f.length()) {
  				   cut=0;
  				  
  			   }
  			   ++cut;
  		   }
  		   f=f.substring(0, cut-1)+f.substring(cut);
  		   f=f.trim();
  	   }
  	   switch(f) {
  	   case "F":
  		   System.out.println("friend");
  		   break;
  	   case "L":
  		   System.out.println("love");
  		   break;
  	   case "A":
  		   System.out.println("Affection");
  		 break;
  	   case "M":
  		   System.out.println("Marriage");
  		 break;
  	   case "E":
  		   System.out.println("Enemy");
  		 break;
  	   case "s":
  		   System.out.println("Sister");
  		 break;
  	   }
	}

}
