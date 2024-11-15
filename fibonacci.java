public class fibonacci {

	public static void main(String[] args) {
		int a = 0 ;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0 ; i<18 ;i++) {
			int febo = a + b;
			System.out.println(febo);
			a = b ;
			b = febo;
		}
	}

}