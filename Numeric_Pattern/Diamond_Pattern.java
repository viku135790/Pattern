package Numeric_Pattern;

public class Diamond_Pattern {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=4-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
