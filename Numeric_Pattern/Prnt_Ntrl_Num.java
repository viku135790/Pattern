package Numeric_Pattern;

public class Prnt_Ntrl_Num {
	public static void main(String[] args) {
		int count=1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}

}
