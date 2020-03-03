package epam.com.CollectionList;

import java.util.Arrays;
import java.util.Scanner;

import epam.com.customList.ListOperations;

/**
 * Hello world!
 *
 */
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello CustomList!" );
        @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
        ListOperations<Integer> list=new ListOperations<Integer>();
   	 
   	 //Add elements
   	 list.add(1);
   	 list.add(2);
   	 list.add(3);
   	list.add(4);
  	 list.add(5);
  	 list.add(6);
  	list.add(7);
  	 list.add(8);
  	 list.add(9);
  	 list.add(0);
   	 
   	 //printing initial list
   	 //System.out.println(list);
   	 
   	 //remove element
   	 //list.remove(1); //passing index
   	 //System.out.println(list);
   	 
   	 //fetching element 
   	 //System.out.println(list.get(1)); //passing index
  	 
  	
  	    	System.out.println("$$$ Initial List $$$");
  	        System.out.println(list);
  	        int count=1;
  	        while(count == 1) {
  	        	System.out.println("\n*** List Operations ***");
  	            System.out.println("\n1.Add\n2.Remove\n3.fetch\n4.Print List");
  	            System.out.println("Enter your choice");
  	        	int ch = s.nextInt();
  		        switch(ch) {
  		        case 1:
  		        	System.out.println("Enter a number to add");
  		        	int n=s.nextInt();
  		        	list.add(n);
  		        	
  		        	System.out.println(list);
  		        	break;
  		        case 2:
  		        	System.out.println("Enter a index to remove");
  		        	int index=s.nextInt();
  		        	System.out.println("The removed element is "+list.remove(index));
  		        	System.out.println("the list after removing element"+list);
  		        	break;
  		        case 3:
  		        	System.out.println("Enter a index to get a value");
  		        	int ind=s.nextInt();
  		        	System.out.println("The element is "+list.get(ind));
  		        	break;
  		        case 4:
  		        	System.out.println(list);
  		        	break;
  		        default:
  		        	System.out.println("Select a valid operation...!\n");
  		        	break;
  		        }
  		        System.out.println("\nDo you want to continue(1/2):");
  		        System.out.println("1.Yes\n2.No");
  		        int cn1 = s.nextInt();
  		        count =cn1;
  	        }
  	    }
  	}

   	 
        
    

