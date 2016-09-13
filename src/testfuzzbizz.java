import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class testfuzzbizz {
	
    fuzzbizz<Object> fb = new fuzzbizz<Object>();
   
        /*
         * test size of array generated
         */
	    @Test  
	    public void test1() {
	        assertNotNull(fb.getFuzzBizzOutput().size());
	        assertTrue(fb.getFuzzBizzOutput().size()== 100);
	    }
	    
	    /*
	     * test output at random positions
	     */
	    @Test 
	    public void test2() {
	        assertTrue(fb.getFuzzBizzOutput().get(15-1)=="FuzzBizz" );
	        assertTrue(fb.getFuzzBizzOutput().get(3-1)=="Fuzz" );
	        assertTrue(fb.getFuzzBizzOutput().get(5-1)=="Bizz" );
	        //assertTrue((parseInt(fb.getFuzzBizzOutput().get(i)) == i+1 );
	        
	    }
	    
	    /*
	     * Test entire array generated as output of FuzzBizz test
	     */
      @Test 
	    public void test3() {
	    	ArrayList<Object> fboutput=fb.getFuzzBizzOutput();
	        for (int i =0; i< fboutput.size(); i++){
	        	Object o = fboutput.get(i);
	        	if (o instanceof Integer){
	        		//System.out.println(o);//object in array
	        		//System.out.println(i);// index of array
	        		assertTrue(((Integer) o) ==i+1 );	
	        	}
	        	else if((o instanceof String) &&(((i+1)%3)==0) && (((i+1)%5)==0) ){
	        		//System.out.println(o);//object in array
	        		//System.out.println(i);// index of array
	        		assertTrue(((String) o) =="FuzzBizz" );
	        	}
	        	
	            else if ((o instanceof String) && (((i+1)%3)==0) ){
	                //System.out.println(o);//object in array
	                //System.out.println(i);// index of array
	            	assertTrue(((String) o) =="Fuzz");
	            }
	            else if ((o instanceof String) && (((i+1)%5)==0)  ){
	                
	            	//System.out.println(o);//object in array
	        		//System.out.println(i);// index of array
	            	assertTrue(((String) o) =="Bizz");
	            }
	            else {
	                System.out.println("Output of FuzzBizz test is incorrect");
	                
	            }
	               
	        }
       
       
   
   
   
    }
}