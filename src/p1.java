//1. String should not be null
//2. 

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalWords = p1.findLength("I love my country");
		System.out.println(totalWords);

	}

	public static int findLength(String s1) {

		String[] arr1 = s1.split(" ");
		System.out.println(arr1.toString());

		int len = arr1.length;
		return len;

	}

}

//WebDriver driver= new ChromeDriver();
// ((ChromeDriver)driver).c();
/*
 * WD{ a(); b();
 * 
 * }
 * 
 * CD{ a(){
 * 
 * } b();
 * 
 * c()
 * 
 * }
 * 
 * 
 * 
 */
