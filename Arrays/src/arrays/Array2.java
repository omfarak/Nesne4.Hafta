package arrays;

public class Array2 {

	public static void main(String[] args) {
		int [] array = {32,27,65,123,122,56,88,9};
		System.out.printf("%s%8s%n","Index","Value");
		int temp = 0;
		for (int counter = 0; counter < array.length / 2  ;counter ++)
		{
			temp = array[counter];
			array[counter] = array[array.length - 1 - counter];
			array[array.length - 1 - counter] = temp;
		}
		for (int counter = 0; counter < array.length;counter ++)
				System.out.printf("%5d%8d%n",counter, array[counter]);

	}

}
