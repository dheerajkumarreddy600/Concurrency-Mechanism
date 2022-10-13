package blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
	  public static void main( String[ ] args )  
		        throws IllegalStateException  
		    {  
		        
		        BlockingQueue< String > queue1 
		            = new LinkedBlockingDeque< String >( ) ;  
		         
		        queue1.add( " A " ) ;  
		        queue1.add( " B " ) ;  
		        queue1.add( " C " ) ;  
		        queue1.add( " D " ) ;  
		        queue1.add( " E " ) ;      
		        
		        BlockingQueue< String > queue2  
		            = new LinkedBlockingDeque< String >( ) ;  
		        // adding collection of elements using addAll( ) method  
		        queue2.addAll( queue1 ) ;  
		        // before removing print BlockingQueue  
		        System.out.println( " Contents of Blocking Queue : " + queue1 ) ;  
		        System.out.println( " Contents of another Blocking Queue : " + queue2 ) ;  
	            System.out.println( queue1 ) ;  
		           
		        if ( queue1.contains( " C " ) )  
                System.out.println(  
                    " Element C founded in the queue " ) ;  
		        String top = queue1.element( ) ;  
		        System.out.println( " The top element of the queue is : " + top ) ;  
		            
		    }   
}
