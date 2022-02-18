package com.kh.array;

public class C_DimensionalArray {

	//이차원 배열: 일차원 배열 여러개를 하나로 묶은 것이 이차원 배열
	 public void method1() {
		 
		 //일차원 배열 선언
		 //int[]arr1;
		 //int arr2[];
		 
		 /*
		  * 1. 이차원 배열의 선언
		  * [ 표현법 ]=> 세가지
		  * 자료형 배열명 [][];
		  * 자료형[] 배열명[];
		  * 자료형[][] 배열명;
		  */
		 int arr1[][];
		 int[]arr2[];
		 int[][] arr3;
		 
		 /*
		  * 2. 이차원 배열의 할당(메모리 공간을 확보해 두겠다==배열의 크기를 지정하겠다)
		  * [ 표현법 ]
		  * 배열명 = new 자료형[행크기][열크기];
		  * 
		  */
		 arr3= new int[2][3];
		 
		 //일차원 배열에서는 선언 및 할당 가능, 이차원 배열에서도 마찬가지
		 //이차원 배열 선언과 동시에 할당
		 int[][]arr = new int[3][5];
		 
		 //이 시점에서부터 우리는 비로소 이차원 배열을 사용할 수 있게 된다.
		 
		 System.out.println(arr); //주소값   [[I@6d06d69c
		 System.out.println(arr[0]); //주소값  [I@7852e922
		 System.out.println(arr[0][0]); //0
         
		 
		 
		 
		 
		 
		 
	 }
	
	
	
}
