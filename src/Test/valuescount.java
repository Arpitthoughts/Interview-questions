package Test;

public class valuescount {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 2, 3, 3, 4, 5, 4, 5 };
		int count = 0;
		int[] visited = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			count = 1;

			if (visited[i] != -1) {
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {

						count = count + 1;
						visited[j] = -1;
					}
				}
				System.out.println(arr[i] + "--------" + count);

			}
		}
	}

}
