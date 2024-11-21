package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {

		Exercise18 ex18 = new Exercise18();
		int[] array = ex18.createAndInitializeArray(5);
		int[] intArray = {0,1,2,3,4};
		ex18.showInlineArray(array);


	}

	public static int[] createAndInitializeArray(int num) {
		int[] arrayNum = new int[num];
		for (int i = 0; i < num; i++){
			arrayNum[i] = (i+1);
		}
		return arrayNum;
	}

	public static void showInlineArray(int[] intArray) {
        for (int i = 0; i < (intArray.length-1); i++ ){
            System.out.print(intArray[i] + " ");
        }
		System.out.print(intArray[intArray.length-1]);
	}
}
