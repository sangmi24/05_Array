package com.kh.array;

public class A_Array {

  /* 
   * * 변수 : "해당 자료형의 값 하나만 "을 담을 수 있는 개념  (단독주택)
   *         예) int a = 10;
   *               a = 20;
   *                 
   * * 배열 : "해당 자료형의 값 여러개 "를 담을 수 있는 개념 (빌라)
   *         예) int[] arr = new int[3]; 
   *           => int형의 값이  들어갈 방을  3칸 만든다.
   *           => 방 [0]호 [1]호 [2]호 를 만든것 
   *           => [index] : 인덱스는 0에서 시작한다. (중요)
   *           => 배열의 크기: 3/ 마지막 인덱스 :2
   *           => 배열의 크기: 5/ 마지막 인덱스 :4
   *           => "Array"문자열의 크기 : 5 / 마지막 인덱스 : 4
   *           => 항상 크기 : n / 마지막 인덱스 : n-1
   *           
   *            arr[0] = 10; 
   *            arr[1] = 20;
   *            arr[2] = 30;                                  
   *                          
   */
	
	    public void method1() {
	    	// 배열을 왜 써야 할까?
	    	// 변수만을 가지고 프로그래밍을 해보자
	    	// 0, 1, 2, 3, 4를 기록해야함
	    	
//	    	int num1 = 0;
//	    	int num2 = 1;
//	    	int num3 = 2;
//	    	int num4 = 3;
//	    	int num5 = 4;
//	    	
//	    	//출력하려고 했떠니 일일이 출력문을 5개 작성한 꼴이 됨
//	    	System.out.println(num1);
//	    	System.out.println(num2);
//	    	System.out.println(num3);
//	    	System.out.println(num4);
//	    	System.out.println(num5);
//	    	
//	    	//변수에 있는 값을 반복문으로 출력이 가능한가?=> 가능x
//	    	for(int i =1; i<=5; i++) {
//	    		
//	    		System.out.println(numi);
//	    	}
//	    	//변수에 있는 값을 반복문으로 합을 구할수 있는가?
//	    	int sum= 0;
//	    	for(int i=1; i<=5; i++) {
//	    		
//	    		sum = sum+numi;
//	    	}
//	    	//총합계=> 반복문 이용이 불가하기 때문에 일일이 더해줘야 한다.
//	    	sum= num1+num2+num3+num4+num5;
//	    	
	    	//반복문 사용 불가!=> 갯수가 늘어날수록 힘들어짐
	    	
	    	//배열을 가지고 프로그래밍 하기
	    	//0 , 1, 2, 3, 4 기록해야함
	    	
	    	/*1. 배열 선언 
	    	*
	    	* [ 표현법 ] => 두가지 방법이 있다.
	    	* 자료형 [] 배열명;  //이 방법이 더 많이 쓰임
	    	* 자료형 배열명[];
	    	*/
	    	//int a;      // 변수 선언	    	  
	    	//int arr[]; //배열 선언
	    	//int []arr;  //배열 선언
	    	/*
	    	 * 2. 배열 할당
	    	 * 이 배열에 몇개의 값들을 보관할건지 배열의 크기를 지정해주는 과정(메모리에 공간을 확보해두겠다.)
	    	 * 지정한 만큼 값이 들어갈 방이 만들어짐
	    	 * 
	    	 * [ 표현법 ]
	    	 * 배열명 = new 자료형[배열크기 ];
	    	 */
	    	
	    	//arr = new int[5]; //배열 할당
	    	
	    	//배열 선언과 동시에 할당
	    	int[]arr = new int[5];  //이 시점까지 진행이 되었을때 비로소 배열을 사용할 수 있다.
	    	
	        /*
	         * 3. 배열의 각 인덱스(호수) 에 값을 대입
	         * 
	         * [ 표현법 ]
	         *  배열명 [인덱스]= 값;
	         */
	    	
//	    	arr[0]=0;   => 일일이 배열 침
//	    	arr[1]=1;
//	    	arr[2]=2;
//	    	arr[3]=3;
//	    	arr[4]=4;
	    	
	    	//배열의 가장 큰 장점 : 반복문을 활용할 수 있다. 
	    	for(int i=0; i<5; i++) {
	    		arr[i] = i;
	    	}
	    	// =>여태 반복문을 이용해서 값을 대입
	    	
	    	//반복문을 이용해서 값을 출력?=> 출력시에도 활용 가능
	    	for(int i =0; i<5; i++) {
	    		
	    		System.out.println(arr[i]);
	    	}
//	    	System.out.println(arr[0]);
//	    	System.out.println(arr[1]);
//	    	System.out.println(arr[2]);
//	    	System.out.println(arr[3]);
//	    	System.out.println(arr[4]);
	    	
	    	
	    	System.out.println(arr); //[I@6d06d69c : 알 수 없는 값=> 주소값
	    	
	    }
	
	
	
	
	
	
	
	
	
	
	
}
