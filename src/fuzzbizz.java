
import java.util.ArrayList;


public class fuzzbizz<E> {

	    /**
	     * This program displays output of famously know as fuzzbizz test.
	     * fuzzbizz test output: It displays numbers from 1 to 100 and
	     * when the number is divisible by 3 it displays Fizz,
	     * when the number is divisible by 5 it displays Buzz, and
	     * when the number is divisible by 3 and 5 both it displays FizzBuzz.
	     * @return
	     */
     ArrayList<Object> testoutput = new ArrayList<Object>(); 
		   /**
		    * testoutput array list contains two types of datatype,
		    * Integers and Strings.
		    */
		   
			public fuzzbizz(){
			     
			        for (int i=1;i < 101; i++ ){
			            if( ((i%3)==0) && ((i%5)==0)){
			               // System.out.println("FuzzBizz");
			                testoutput.add("FuzzBizz");
			            }
			            else if (((i%3)==0)){
			                //System.out.println("Fuzz");
			                testoutput.add("Fuzz");
			            }
			            else if (((i%5)==0)){
			                //System.out.println("Bizz");
			                testoutput.add("Bizz");
			            }
			            else {
			                //System.out.println(i);
			                testoutput.add(i);
			            }
			               
			        }
			   
			}

			public ArrayList<Object> getFuzzBizzOutput(){
			    return testoutput;
			}
		/*
		 * returns object at specified index
		 */
			public Object getObject(int i){
				return testoutput.get(i);
				
			} 

}
