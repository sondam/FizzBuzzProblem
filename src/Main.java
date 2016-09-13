public class Main {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		/*
		 * Creating object of class fuzzbizz as fb. 
		 * Applying method getFuzzBizzOutput on fb to check the output.
		 */
		fuzzbizz<Object> fb = new fuzzbizz<Object>();
        /*
         * generating output as single line
         */
		System.out.println(fb.getFuzzBizzOutput());
		//System.out.println(fb.getFuzzBizzOutput().get(15 - 1));
		//System.out.println(fb.getObject(14));
		
	}

}
