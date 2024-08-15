package Test;

import java.io.EOFException;
import java.io.IOException;

public class ExceptionHandling1SPGlobal {

	public static void main(String[] args) throws ArithmeticException {
		try {
			System.out.printf("1");
			int x=10/0;
			throw new IOException();
		}
		catch (EOFException e) {
			System.out.printf("2");
		}
	
		catch (NullPointerException e) {
			System.out.printf("4");
		}
		catch (IOException e) {
			System.out.printf("5");
		}

		catch (ArithmeticException e) {
			System.out.printf("3");

		}
		catch (Exception e) {

			System.out.printf("6");
		}
		
	}

}
