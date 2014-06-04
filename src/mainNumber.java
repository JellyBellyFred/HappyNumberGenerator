import java.util.HashSet;
public class mainNumber{
	
	// This checks if the number is Happy or not.
	public static boolean happy(long number){
		long m = 0;
		int digit = 0;
		HashSet<Long> cycle = new HashSet<Long>();
		while(number != 1 && cycle.add(number)){
			m = 0;
			while(number > 0){
				digit = (int)(number % 10);
				m += digit*digit;
				number /= 10;
			}
			System.out.println(m + " = m");
			number = m;
			
		}
		System.out.println("booted");
		return number == 1;
	}
	
	// This is the "guts" of the program. It tells the above what number to check.
	public static void main(String[] args){
		boolean test;
		for(long num = 1;num<10;num++){
			System.out.println("num = " + num);
			test = happy(num);
			System.out.println("test = " + test);
			if(test){
				System.out.println("happy = " + num);
				
			}
		}
	}
}