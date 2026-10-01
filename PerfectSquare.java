public class PerfectSquare {
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(1));
		System.out.println(isPerfectSquare(4));
		System.out.println(isPerfectSquare(Integer.MAX_VALUE/100));
		System.out.println(isPerfectSquare(255));
		
	}
	
	public static boolean isPerfectSquare(int num) {
        for(int i = 1; i < num; i++) {
        	if(i*i == num) 
        		return true;
        	else  return false;
        }
		// added this line to ensure that this boolean method returns a boolean value
		//The code did not run because a scenario existed where this method may not have returned any value
		return false;
    }

}
