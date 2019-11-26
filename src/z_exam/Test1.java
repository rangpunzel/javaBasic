package z_exam;

public class Test1 {

	public static void main(String[] args) {

		
		for (int j = 1; j <= 3; j++) {
			for (int i = 2; i <= 9; i++) {

				if (i >= 2 && i <= 4) {
					System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				}	
			}System.out.println();
		}
		System.out.println();
		
		for (int j = 1; j <= 3; j++) {
			for (int i = 2; i <= 9; i++) {

				if (i >= 5 && i <= 7) {
					System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				}	
			}System.out.println();
		}
		System.out.println();
		
		for (int j = 1; j <= 3; j++) {
			for (int i = 2; i <= 9; i++) {

				if (i >= 8 && i <= 9) {
					System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				}	
			}System.out.println();
		}
		System.out.println();

	}
}