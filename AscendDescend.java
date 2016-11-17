import java.util.Arrays;


public class AscendDescend {

	public static void main(String[] args) {
		String ss[]= {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra","Herman"};
		Arrays.sort(ss);
		System.out.println("Ascend:");
		for (int j=0; j<10; j++){
			System.out.println(ss[j]);
			
			
			}
		System.out.println();
		System.out.println();
		
		System.out.println("Descend:");
		for (int j=9; j>0; j--){
			System.out.println(ss[j]);
		}
		}

	}


