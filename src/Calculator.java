public class Calculator implements ICalculator{
		private  final  int max=Integer.MAX_VALUE;
		private  final  int min=Integer.MIN_VALUE;
	    public int add(int x, int y){
	    	long sumIfInteger=(long)x+y;
	    	if(sumIfInteger<max&&sumIfInteger>min) {
	    		return x+y;
	    		
	    	}
	    	else {		
	    		throw new RuntimeException("not Valid");
	    	}
	    }
	    
	    public float divide(int x, int y)throws RuntimeException {
	    	
                if (y == 0) {
                	throw new RuntimeException("you can't divide by Zero");
                
            }
            else if(x==0&&y<0){
                 
                return 0f;
            }
            else{
                return(float)x/y;
                
            }
            
	            
	        
	            
	        }

}
