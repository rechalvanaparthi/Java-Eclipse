
public class number {
public static void main(String[] args) {
	int num = 5;
	for(int i=1 ; i<=num; i++) {
		for(int j=i; j<=num; j++) {
			System.out.print("*");
			}
		System.out.println();
	}
	
	
	
	for(int i=1 ; i<=num; i++) {
		for(int k=num-i; k>0; k--) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
		
		System.out.print("* ");
		}
		System.out.println();	
		}

	
	
	
	for(int i=1 ; i<=num; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("* ");
			}
		System.out.println();
		}
	
	

	
	for(int i=1 ; i<=num; i++) {
		for(int k=1; k<i; k++) {
			System.out.print("  ");
			}
		for(int j=i;j<=num;j++)
		{
		System.out.print("* ");
		}
		System.out.println();	
		}
}
}
