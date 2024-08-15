package Test;

public class FindLengthOfLastWordInString {

	public static void main(String[] args) {

		String s = "             Hello         World         ";
		int count=0;
		s.trim();
		for (int i = s.length()-1; i >=0; i--) {
				
				if(s.charAt(i)!=' ') {
					count++;
				}
				else {
					if(count >0) {
						System.out.println(count);
						break;
					}
				}
		}

	}

}
