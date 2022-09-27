/**
*1.	Write an additional method orderedArray (with the same type as randomArray) which returns an array containing the numbers from 1 to n, in that order. So, orderedArray(5) should basically return an array containing {1,2,3,4,5}. 
*/

//import the ArrayList
import java.util.ArrayList;

/ordered array method 
public int[] orderedArray(int nums){

    //create arraylist data structure to store each item in the array
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    //loop through for nums+1 times
    for(int i = 1; i < nums + 1; i++){
      
      //add each item to the array, list
      list.add(i);
    }
    
    //print the arrayList, list
    System.out.println(list);
}

/** 
* Full Version
*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
  	
    int nums = 5;
    orderedArray(nums);
    
  }
  
  //ordered array method 
    public static ArrayList<Integer> orderedArray(Integer nums){
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < nums + 1; i++){
        	list.add(i);
        }
    	
        System.out.println(list); 
        return list;  
    }
}
