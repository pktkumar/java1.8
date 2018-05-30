package lamdaExpression;

import java.util.ArrayList;

public class LamdaList {

	
	    public static void main(String[] args) {  
	      
	            ArrayList<String> newList=new ArrayList<String>();
	            
	            newList.add("Kumar");
	            newList.add("Vadu");
	            
	   
	    
	        	// List parameters in lambda expression  
	            ListExample ad1=(newadd)->(newadd);  
	            System.out.println("Add "+ad1.newList(newList)); 
	            
	        
	            
	    }

	    
}