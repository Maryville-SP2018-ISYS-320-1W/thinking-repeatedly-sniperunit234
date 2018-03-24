/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class P13_NumbersRight {

	public static void main(String[] args) {
		int i, j;
		int size = 5;
		for (i = 1; i <= size; i++) {
			if (i < size) System.out.printf("%"+(size-i)+"s", " ");
			for (j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}

