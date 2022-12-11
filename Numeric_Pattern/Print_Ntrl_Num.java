package Numeric_Pattern;
//Print Natural number
public class Print_Ntrl_Num {
	public static void main(String[] args) {
		int count=1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
