//U10416003
import java.util.*;

public class BinarySort {
	//main method
		public static void main(String args[])
		{	
			//data field
			int first, last, middle;
			int num;
			int element[];
			int search;
			
			//create new scanner
			Scanner input = new Scanner(System.in);
			System.out.println("How many elements you need:");
			num = input.nextInt();
			
			element = new int[num];
		
			System.out.println("Please enter " + num + " integers:");

			//let number in element array
			for (int i = 0; i < num; i++){
				element[i] = input.nextInt();
			}
			
			//let user scanner search number
			System.out.println("Enter value to find:");
			search = input.nextInt();
			
			first = 0;
			last = num - 1;
			middle = (first + last)/2;
			
			//create binary search
			while( first <= last ){
				if ( element[middle] < search ){
					first = middle + 1;    
				}
				else if (element[middle] == search){
					System.out.println("The number " + search + " at position " + (middle + 1) + ".");
					break;
				}
				else{
					last = middle - 1;
					middle = (first + last)/2;
				}
			}
			if ( first > last ){
				System.out.println("The number " + search + " is not in this list.\n");
			}
		}
}
