/**
* 2.	Similarly, write a method reverseArray (also same type) which returns an array of that length with the numbers from 1 to n in reverse order. So, reverseArray(5} should return an array containing {5,4,3,2,1}. 
*/

//import the ArrayList
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
  	
    //assign 5 to nums
    int nums = 5;
    
    //make a call to the 'reverseArray' function with 'nums' as parameter
  	reverseArray(nums);
    
  }
  
  //reverse array method 
    public static ArrayList<Integer> reverseArray(Integer nums){
        
        //create arraylist, list
        ArrayList<Integer> list = new ArrayList<Integer>();
      
        //loop for length of nums times, but backwards
        for(int i = nums; i > 0; i--){
          
          //add each item to the list
        	list.add(i);
        }
    	  
        //print and return the list which contains the numbers in reverse order
        System.out.println(list); 
        return list;  
    }
}

