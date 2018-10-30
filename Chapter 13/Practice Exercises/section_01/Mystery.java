package section_01;

public class Mystery {

	public static void main(String[] args){
		System.out.println("Mystery(5): " + mystery(5));
		System.out.println("Expected: 55");
	}
	
	public static int mystery(int n){
		if(n <= 0){
			return 0;
		}
		else{
			int smaller = n - 1;
			return mystery(smaller) + n * n;
		}
	}
}
