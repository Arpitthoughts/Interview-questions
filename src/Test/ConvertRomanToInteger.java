package Test;

public class ConvertRomanToInteger {
	
	
	public static void main(String[] args) {
		System.out.println(romanToInt("LVIII"));
	}
		public static int romanToInt(String s) {
			int result = 0;
			int p = 0;
			int c = 0;
			char[] arr = s.toCharArray();
			for (int i = arr.length - 1; i >= 0; i--) {

				char curr = arr[i];

				c = getInteger(curr);

				if (c < p) {
					result = result - c;
				} else {
					result = result + c;
				}

				p = c;
			}
			return result;

		}

		public static int getInteger(char ch) {

			switch (ch) {
			case 'I':
				return 1;

			case 'V':
				return 5;

			case 'X':
				return 10;

			case 'L':
				return 50;

			case 'C':
				return 100;

			case 'D':
				return 500;

			case 'M':
				return 1000;

			default:
				return 0;
			}

		}
	}

