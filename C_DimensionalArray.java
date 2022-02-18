package com.kh.array;

import java.util.Scanner;

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
		  * 자료형[][] 배열명;  //더 많이 쓰임
		  */
		 int arr1[][];
		 int[]arr2[];
		 int[][] arr3;
		 
		 /*
		  * 2. 이차원 배열의 할당(메모리 공간을 확보해 두겠다==배열의 크기를 지정하겠다)
		  * [ 표현법 ]
		  * 배열명 = new 자료형[행크기][열크기];
		  */
		 arr3= new int[2][3];
		 
		 //일차원 배열에서는 선언 및 할당 가능, 이차원 배열에서도 마찬가지
		 //이차원 배열 선언과 동시에 할당
		 int[][]arr = new int[3][5];
		 
		 //이 시점에서부터 우리는 비로소 이차원 배열을 사용할 수 있게 된다.
		 
		 System.out.println(arr); //주소값   [[I@6d06d69c
		 System.out.println(arr[0]); //주소값  [I@7852e922
		 System.out.println(arr[0][0]); //0
         
		 /*
		  * 이차원 배열의 구조
		  * 우선적으로 주소값이 담긴[행크기] 만큼의 배열이 만들어지고
		  * 그 각각 담긴 주소값을 기준으로 [열크기] 만큼의 배열로 연결되어서 값을 찾아가는 구조
		  * 
		  * 해당 이차원배열의 행크기를 아는법 (주소값이 담긴 배열의 크기 ) 
		  * [표현법]
		  * 이차원배열명.length
		  * 
		  * 해당 이차원배열의 열크기를 아는법
		  * [표현법]
		  * 이차원배열명[해당행].length
		  */
		 System.out.println("행의 길이 : "+arr.length);  //3
		 
		 //각 행별 배열의 열크기를 알고자 한다면
		 System.out.println("0번째 행의 열의 길이 : "+arr[0].length);  //5
		 System.out.println("1번째 행의 열의 길이 : "+arr[1].length);  //5
		 System.out.println("2번째 행의 열의 길이 : "+arr[2].length);  //5
		 
		 /*
		  *  출력
		  *  arr[0][0]
		  *  arr[0][1]
		  *  arr[0][2]
		  *  arr[0][3]
		  *  arr[0][4]
		  *  ===========
		  *  arr[1][0]
		  *  arr[1][1]
		  *  arr[1][2]
		  *  arr[1][3]
		  *  arr[1][4]
		  *  ==========
		  *  arr[2][0]
		  *  arr[2][1]
		  *  arr[2][2]
		  *  arr[2][3]
		  *  arr[2][4]
		  */ 
		 
         /*
          * 규칙: 행 수는 고정된 상태에서 열 수만 0에서부터 배열의 크기 전까지 1씩 증가하는 규칙을 보이고 있음! 
          * 
          * 바깥쪽 for문 => 행수를 움직이는 for문
          * for(int i =0; i< arr.length; i++) {//(배열의 크기==arr.length)
          *    
          *  }
          * 
          * 안쪽 for문=> 열 수를 움직이는 for문
          * for(int j=0; j <arr[행수].length; j++){  //(배열의 크기==몇번째 행의 열크기==arr[행수].length)
          * 
          * }
          */
		  
		 for(int i=0; i<arr.length; i++) {  //행길이 arr.length =3
			 
			 for(int j=0; j<arr[i].length; j++) {//열길이 arr[i].length=5

                 System.out.print(arr[i][j]+ " "); 
			 }
			 System.out.println(); //5번 찍고 한줄 뜀
		 }

	 }
	 public void method2() {
		 
		 //이차원 배열 (행크기: 3 , 열크기:5)
		 int[][] arr = new int[3][5];
		 
		 //순차적으로 반복을 돌리면서 값을 일단 대입
		 /*
		  * 이차원배열의 중첩 for문
		  * [표현법]
		  * for (int i=0; i< 배열명.length; i++ {
		  *     for(int j=0; j< 배열명[i].legnth; j++) {
		  *     
		  *          값을 대입하는 구문/ 값을 출력하는 구문/ 값을 더하는 구문.... =>필요한 구문
		  *     }
		  *  }
		  */
		 int value=1;
		 for(int i=0; i<arr.length; i++) {  //0행~ 마지막행=> 3번 반복
			 for(int j=0; j<arr[i].length;j++) {  //0열~각행별 마지막열 => 5번 반복
				 
				arr[i][j] = value++;  //후위연산자  선처리 후  증가하는거 1증가함

			 }
		 } //총 15번 반복
		 
		 //값을 출력
		 for(int i=0; i<arr.length;i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 //System.out.print(arr[i][j]+ " ");
				 System.out.printf("%-2d ",arr[i][j]);  //왼쪽으로 2칸 정렬 : %-2d  (숫자형식으로 해야함)
			 }
			 System.out.println();
		 }
		 
//		 1  2  3  4  5  
//		 6  7  8  9  10 
//		 11 12 13 14 15 

	 }
	
	 public void method3() {
		 
		 // 배열의 선언과 동시에 초기화
		 // 일차원 배열일 경우
		 int[] iArr = {1,2,3,4,5}; // 1 2 3 4 5
		 
		 // 이차원 배열일 경우
		 int[][] arr = { {1,2,3,4,5},
				         {6,7,8,9,10},
				         {11,12,13,14,15} };
		 
		 // 이차원 배열 자체가 배열 안에 또다른 배열이 들어가있는 상태이기 떄문에
		 //표현법도 마찬가지로 배열 안에 또다른 배열이 들어가있게끔 해주면 된다.
		 
		 //출력
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 
				 System.out.printf("%-2d ",arr[i][j]); 
			 }
			 System.out.println();
		 }
		/*
		 * 1  2  3  4  5  
           6  7  8  9  10 
           11 12 13 14 15 
	 
		 */

	 }
	 public void method4() {
		 
		 //2행 , 3열짜리 이차원 배열
		 //0번째행에는 국어점수들
		 //1번째행에는 수학점수들을 입력해보자 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int[][] scores = new int[2][3];
		 
		 for(int i=0; i< scores.length;i++) {  //반복을 두번 돌리겠다.
			 for(int j=0; j<scores[i].length;j++) { //반복을 세번 돌리겠다. 
				 
				 if(i==0) {  //국어점수들만
					 System.out.print(" 국어점수를 입력하세요: ");
					 
				 }
				 else {
					 System.out.print(" 수학점수를 입력하세요: ");
					 
				 }
				    scores[i][j] =sc.nextInt();
				    sc.nextLine();
			 }

		 }
		   //출력
		 for(int i=0; i<scores.length;i++) {
			 
			 if(i==0) {
			 System.out.print("국어점수들: ");
			 }else {
		     System.out.print("수학점수들: "); 
			 }
			 
			 for(int j=0; j<scores[i].length;j++) {
				 
				  
				 System.out.print(scores[i][j]+ " ");
			 }
			 System.out.println();
			 
		 }

	 }
       public void method5() {
    	   //method4를 일차원 배열 버전으로 바꿔보기
   
    	   Scanner sc = new Scanner(System.in);

    	   int[] scores1 = new int[3];  //국어
    	   int[] scores2 = new int[3];  //수학
           
    	   //국어
    	   for(int i=0; i<scores1.length;i++) {
    		   System.out.print("국어점수를 입력하세요: ");
    		   scores1[i]=sc.nextInt();
       	       sc.nextLine();
    	   }
           //수학
    	   for (int j=0; j<scores2.length;j++) {
    		   System.out.print("수학점수를 입력하세요: ");
    		   scores2[j]=sc.nextInt();
       	       sc.nextLine();
    	   }
    	   //출력
    	   System.out.print("국어점수들: ");
    	   for(int i=0; i<scores1.length;i++) {
    		   System.out.print(scores1[i]+" ");
    	   }
    	   System.out.println();
    	   
    	   System.out.print("수학점수들: ");
    	   for(int j=0; j<scores2.length;j++) {
    		   System.out.print(scores2[j]+ " ");
    	   }
    	   
       }
	 
	 
	 
	
}
