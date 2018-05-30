package lamdaExpression;

public class LamdaExpression {

	
	    public static void main(String[] args) {  
	      
	        // Lambda expression with single parameter.  
	        Sayable s1=(name)->{  
	            return "Hello, "+name;  
	        };  
	       
	        	System.out.println(s1.say("Kumar"));  
	          
	   
	    
	        	// Add parameters in lambda expression  
	            TwoNumbers ad1=(a,b)->(a+b);  
	            System.out.println("Add "+ad1.twoNumbers(10,20)); 
	            
	         // Multiple parameters in lambda expression  
	            TwoNumbers multi=(a,b)->(a*b);  
	            System.out.println("multiple : "+multi.twoNumbers(10,20)); 
	            
	    }

	    
}