import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);{
		try{
	      int[] array= {1,2,3,4,5,6,7,8,9 };
	        System.out.println ("Enter ArrayIndex No");
	        int index=input.nextInt();
	        System.out.println ("No is "+array[index]);
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	       }
		}  
	}
}
	


