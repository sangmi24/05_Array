package com.kh.array;

import java.util.Scanner;

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
//	    	//출력하려고 했더니 일일이 출력문을 5개 작성한 꼴이 됨
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
	    	//0, 1, 2, 3, 4 기록해야함
	    	
	    	/*1. 배열 선언 
	    	*
	    	* [ 표현법 ] => 두가지 방법이 있다.
	    	* 
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
	         *  배열명 [인덱스] = 값;
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
	    
	     public void method2() {
	    	
	    	 //변수의 선언과 동시에 대입
	    	 int i = 10;
	    	 
	    	 //배열의 선언과 동시에 할당
	    	 int[] iArr = new int[5];  // [0] [1] [2] [3] [4]
	    	 
	    	 System.out.println("i : "+i );  //10
	    	 System.out.println("iArr : "+iArr);  //[I@6d06d69c
	    	 System.out.println("iArr의 해시코드값 : "+ iArr.hashCode() );  //1829164700
	    	 //해시코드 : 주소값을 십진수의 형태로 보여준다.
	    	  
	    	 double[] dArr = new double[3]; //[0] [1] [2]빈 방임
	    	 System.out.println("dArr : "+dArr);  //[D@7852e922
	    	 System.out.println("dArr의 해시코드값 : "+dArr.hashCode());  //2018699554
	    	 
	    	 /*
	    	  * *기본자료형 : 실제 값을 바로 담을 수 있는 변수(메모리의 스택영역)
	    	  *  boolean, char, byte, short, int, long, float, double
	    	  *  => 변수 이름을 댔을 때 실제 들은 값을 바로 받아볼수 있는 특징이 있음!
	    	  *  => 일반 변수
	    	  *  
	    	  *  *참조자료형 : 주소값을 담고 있는 변수 (실제값이 메모리의 힙영역)
	    	  *             한번 주소지를 타고 들어가서 값을 찾겠다. 
	    	  *  String, int[], double[], short[], ..., Scanner , A_Array(new붙은것들 다 주소값을 담는 변수)
	    	  *  => 변수 이름을 댔을 때 실제 들은 값이 아니라 그 실제 값이 존재하는 곳의 주소값을 받아볼 수 있다.
	    	  *     (String 의 경우는 예외라는것!)
	    	  *  => 참조 변수 (레퍼런스 변수)
	    	  */

	     }
	     public void method3() {
	    	 
	    	 int[] iArr =new int[3]; //[0] [1] [2]
	    	 double[] dArr = new double[3]; //[0] [1] [2]
	    	 
	    	 System.out.println("iArr :" + iArr);  //주소값 [I@6d06d69c
	    	 System.out.println("iArr[0] : " + iArr[0]);  //  0
	    	 System.out.println("iArr[1] : " + iArr[1] );  // 1
	    	 
	    	 //배열을 출력할떄 반복문이랑 같이 쓰는 연습
	    	 
	    	 /*
	    	  * 배열을 출력할 때 반복문을 쓰면 더 좋다.
	    	  * 0번 인덱스부터 마지막 인덱스까지 순차적으로 출력할 수 있다.
	    	  * 마지막 인덱스 값 == 배열의 크기-1
	    	  * 
	    	  * 배열의 크기를 아는 방법
	    	  * [ 표현법 ]
	    	  * 배열명.length 
	    	  * =>  배열의 길이를 알려주는 변수
	    	  */
	    	 System.out.println("iArr 배열의 크기: "+iArr.length);  //3
	    	 System.out.println("dArr 배열의 크기 : "+dArr.length);  //3
	    	 
	    	 /*
	    	  * for문에서 반복의 횟수를 지정하는 가장 편한 방법
	    	  * int i = 0; i <내가 반복하고자하는횟수; i++
	    	  * 5번 반복하고 싶다 : int i=0; i<5; i++
	    	  * 7번 반복하고 싶다 : int i=0; i<7; i++
	    	  * 배열의 크기만큼 반복하고 싶다 : int i= 0; i<배열의크기; i++
	    	  * 배열명.length 만큼 반복하고 싶다 : int i= 0; i<배열명.length; i++
	    	  */
	    	 
	    	 for(int i=0; i<iArr.length; i++) {  // i=0 1 2
	    		 System.out.println(iArr[i]); 
	    	 }
	    	 //iArr[0] == 0 
	    	 //iArr[1] == 0
	    	 //iArr[2] == 0
	    	 for(int i=0; i<dArr.length;i++) {  // i=0 1 2
	    		 System.out.println(dArr[i]);
	    	 }
	    	 //dArr[0]==0.0
	    	 //dArr[1]==0.0
	    	 //dArr[2]==0.0
	    	 
	    	 /*
	    	  * 배열의 특징
	    	  * 각각의 인덱스에 값을 대입하지 않아도 뭔가 담겨있음!
	    	  * int형 배열의 경우에는 0.double형 배열일 경우에는 0.0
	    	  * => 배열의 구조상 실제 들어있는 값들이 메모리의 heap영역에 존재하는데
	    	  *    heap 영역의 특징상 절대 빈 공간으로 존재할 수 없음
	    	  * => 이러한 특징 때문에 JVM 이 기본값으로 초기화를 해준다.(자동으로 만들어줌)
	    	  * 기본값: 정수형배열일 경우0, 실수형배열일 경우 0.0, 문자형(char)일경우 ' '로 채워진다. 
	    	  *       
	    	  * 
	    	  * 참고)
	    	  * 기본자료형 변수: 내가 직접 초기화(값을 처음에 대입해주는 행위)를 해줘야 한다. 
	    	  * 참고자료형 변수: JVM이 알아서 초기화를 해준다. (힙 영역 기준으로)
	    	  */
	    
	     }
	    
	     
	     public void method4() {
	    	 
	    	 int[]arr = new int[5];  // [0] [1] [2] [3] [4]
	    	 
//	    	 arr[0] = 1;
//	    	 arr[1] = 2;
//	    	 arr[2] = 3;
//	    	 arr[3] = 4;
//	    	 arr[4] = 5;
	    	 
//	    	 arr[5] = 6;
//	    	 arr[6] = 7;
	    	 
//	    	 System.out.println(arr[5]);
//	    	 System.out.println(arr[6]);
	    	 
	    	 /*
	    	  * ArrayIndexOutOfBoundsException: 5
	    	  * => 배열의 인덱스 범위를 벗어나서 발생하는 오류
	    	  *    (배열의 크기가 5라서 마지막인덱스가 4인데 지금 5번인덱스에 접근하고자 한다.)
	    	  *    
	    	  */
	    	 //값 대입을 위한 반복문
	    	 for(int i=0; i<arr.length; i++) {  //배열명.length
	    		 arr[i]= i+1;
	    	 }
	    	 //값 출력과 누적 덧셈을 위한 반복문
	    	 int sum = 0;
	    
	    	 for(int i=0; i<arr.length; i++) {
	    		 
	    		 System.out.println(arr[i]);
	    		 sum = sum+ arr[i]; // 단순히 i를 누적하는게 아니라 i번째 방에 들어있는 값을 더하겠다.
	    	  }
	    	 System.out.println("sum : "+ sum);
	    
	     }
	    public void method5() {
	    	
	    	//10칸짜리 배열을 만든 후
	    	//배열 각 방에 랜덤한 수  값을 대입
	    	
	    	//1. 배열의 선언 및 할당
	    	int[] arr =new int[10];
	    	
	    	//2. 0번째 방(인덱스)~ 마지막까지 반복을 돌리면서 랜덤값을 대입
	    	//단, 랜덤값의 범위는 51~100로 지정 (총50개, 시작값 51)
	    	
	    	for (int i=0; i<arr.length;i++) {
	    		arr[i]=(int)((Math.random()*50)+51);
	    	}
	    	for(int i=0; i<arr.length;i++) {
	    		System.out.println("arr[" + i +"] : "+ arr[i]);  //arr[x] : xx
	    	}
	    	//이것을 응용하면 로또 프로그램도 만들 수 있음!
	    	
	    }
	 
	    
	    public void method6() {
	    	
	    	int[] arr = new int[5];
	    	
	    	System.out.println( arr ); // 주소값 [I@6d06d69c
	    	System.out.println("arr의 해시코드 값: "+arr.hashCode()); //1829164700
	    	
	    	//대입용 반복문
	    	int value=2;
	    	for(int i=0; i<arr.length; i++) {
	    		arr[i] = value;
	    		value += 2;
	    	}
	    	//2 4 6 8 10
	    	for(int i=0; i<arr.length;i++) {
	    		System.out.print(arr[i]+ " ");  //2 4 6 8 10 
	    	}
	    	System.out.println();
//	    	arr[5] = 12;
//	    	arr[6] = 14; 
	    	
	    	/*
	    	 * 배열의 가장 큰 단점
	    	 * 내가 할당했던 시점에서 한번 지정한 배열의 크기는 변경이 불가하다.
	    	 * => 배열의 크기를 굳이 변경하고자 한다면,
	    	 *    어쩔 수 없이 새로운 배열을 다시 만들어야 한다.
	    	 *    (==선언 및 할당을 다시 해야만 한다.??)
	    	 */
	    	//할당만 다시해보자
	    	arr = new int[7];
	    	
	    	System.out.println(arr);  //[I@7852e922
	    	System.out.println("arr의 해시코드 값: "+arr.hashCode());  //2018699554
	    	
	    	/*
	    	 * 메모리 영역에는 공간을 확보(할당)할 때 항상 고유한 주소값이 부여된다.
	    	 * 기존에 생성 되었던 주소와 절대 겹치지 (중복되지) 않는다.
	    	 * => 그렇다면 새롭게 할당만 할 경우에는
	    	 *    기존에 참조하고 있던 기존 주소값이 새로운 주소값으로 변경 되면서
	    	 *    기존의 연결이 끊기고 새로운 연결로 바뀌는 것을 알 수 있다!
	    	 *    
	    	 *  그러면 연길이 끊어진 더이상 필요가 없는 배열 부분은 어떻게 되나?
	    	 *  일단 메모리의 heap영역에 동동 떠다니다가
	    	 *  일정 시간이 지나면 정리된다.
	    	 *  (메모리 청소== 가비지 컬렉션 Garbage Collection)
	    	 *  (메모리 청소부==가비지 컬렉터 Garbage Collector,GC)
	    	 *  => 자동 메모리 관리
	    	 */
	    	
	    	//연결을 바꾸는게 아니라 그냥 끊고 싶다면?
	    	arr = null;   //null: 아무것도 존재하지 않음을 의미하는 값
            
	    	System.out.println(arr); // null 이 출력
	    	
	    	//arr[0] =10 ;  //유효하지 않는 코드 
	        /*
	         * NullPointerException 오류 발생 
	         * 찾아갈 주소지가 없는데 어떻게 0번째 방에 접근해서 값을 넣을래?
	         * null 이 들어있는 곳 기준으로 어떠한 행위를 하면 발생하는 오류
	         */
	    	
	    	System.out.println("arr의 해시코드 값: "+arr.hashCode());
	    	// 마찬가지로 hashCode()메소드 호출시에도 NullPointerException 오류가 발생함!!
	    	
	    	/*기본자료형의 기본값
	    	 * 정수형: 0
	    	 * 실수형: 0.0
	    	 * 문자형: ' ' (공백)
	    	 * 
	    	 * 참조자료형의 기본값
	    	 * null => "주소값이 없다"라는 뜻(==값이 없다)
	    	 */
	    	
	    	  	
	    }
	      public void method7() {
	    	  
	    	  //3명의 사용자에게 매번 키의 정보를 입력받아서 배열에 담아두고
	    	  //3명의 키를 각각 출력, 총합계, 평균 계산해서 또 출력
	    	  
	    	  Scanner sc= new Scanner(System.in);
	    	  
	    	  // 3명의 키를 담을 double 형 배열을 하나 만들기
	    	  double [] heights = new double[3];
	    	  
	    	  //3명의 키를 각각 스캐너로 입력받아 각 방에 담아두기
	    	  for(int i=0; i<heights.length; i++) {   //heights.length==3
	    		  System.out.print("키 입력(cm) : " );
	    		  heights[i]= sc.nextDouble();
	    	  }
	    	   //3명의 키 정보를 출력 +총합
	    	  double sum=0.0;  //총 키의 합
	    	  
	    	  for(int i=0;i<heights.length; i++ ) {
	    		  System.out.println((i+1)+"번째 사람의 키: "+heights[i]+"cm" );
	    		  sum = sum + heights[i];  //키 방인 i번째 값을 더한것
	    		  
	    	  }
	    	  
	    	  //총합계, 평균
	    	  // 평균 = 총 합 / 갯수
	    	  System.out.println("총합 : "+ sum );
	    	 // System.out.println("평균 : " + (sum/ 3) );  
	    	 // System.out.println ("평균 : " + (sum/ heights.length) );  // heights.length=> 배열의 길이임
	    	  System.out.printf ("평균치 : %.2f ",(sum/ heights.length) );
	    	  // %f 여기 사이에 .2를 넣으면 소숫점 길이 조절 가능 
	    
	      }
	      public void method8() {
	    	  
	    	  //사용자에게 문자열 하나를 입력 받고
	    	  //각각의 문자들을 char 배열로 옮겨담기
	    	  
	    	  //1. 사용자로부터 문자열을 입력
	    	  Scanner sc = new Scanner(System.in);
	    	  
	    	  System.out.print("문자열 하나 입력 : ");
	    	  String str= sc.nextLine();
	    	  
	    	  //2. char 배열 만들기 (배열크기 == 입력받은 문자열의 길이만큼)
	    	  char[] arr = new char[str.length()];   //입력받은 문자열의 길이==str.length()
	    	  
	    	  //3. 문자열로부터 각 문자를 뽑아서(charAt) char 배열에 담기
//	    	  arr[0]= str.charAt(0);
//	    	  arr[1]= str.charAt(1);
	    	  for(int i =0; i<arr.length;i++) {
	    		  arr[i]= str.charAt(i);
	    		  //문자열의 i 번째 인덱스의 문자를 추출하여 arr배열의 i번쨰 방에 넣겠다.
	    	  }
	    	  //4. char 배열에 문자들이 잘 담겨있는지 출력
	    	  for(int i= 0; i<arr.length;i++) {
	    		  System.out.println((i+1)+" 번째 문자 : "+ arr[i] ); 
	    	  }
	    	  
	    	  // 참고: arr.length를 str.length로 대체 가능
	    	  //=> 애초에 배열 사이즈를 문자열의 사이즈와 맞춰 주었기 때문!
	      }
	      public void method9() {
	    	  
	    	  // 변수의 경우
	    	  int num; //변수 선언
	    	  int num1 = 1; //변수 선언과 동시에 대입(초기화)
	    	  
	    	  //배열의 경우
	    	  int[] arr = new int[4];  //배열의 선언과 동시에 할당(크기 지정)
	    	  arr[0]=1;
	    	  arr[1]=2;
	    	  arr[2]=3;
	    	  arr[3]=4;
	    	  
	    	  //위 아래 방법이 같다는 
	    	  //배열의 선언과 동시에 할당과 동시에 초기화(즉, 내가 원하는 값으로 넣겠다)
	    	  // 방법1.
	    	  int[] arr1 = new int[] {1,2,3,4};
	    	  
	    	  //방법2. 이 코드가 더 많이 쓰임
	    	  int[] arr2 = {1,2,3,4};
	    	  
	    	  //배열의 동등비교
	    	  System.out.println(arr.hashCode() ==arr1.hashCode());  //false
	    	  System.out.println(arr1 == arr2); //false
	    	  System.out.println(arr2 == arr);  //false
	    	  //주소값 간의 동등비교이기 때문에 false가 나옴
	    	  
	      }
	
	     public void method10(){
	    	 
	     //좋아하는 과일의 갯수를 입력 받은 후에 과일명을 입력받아서 문자열 배열에 대입
	    	 
	    Scanner sc = new Scanner(System.in);
	    
	    //1.좋아하는 과일의 갯수 먼저 입력받기
	    System.out.print("좋아하는 과일 갯수 : ");
	    int size = sc.nextInt();
	    sc.nextLine();
	    
	    //2. 그 갯수 만큼의 방을 가지고 있는 과일명을 담을 문자열형 배열을 생성
	    String[] fruits = new String[size];
	    
	    //3. 좋아하는 과일명을 입력받아서 각 방에 넣기
//	    fruits[0] = sc.nextLine();
//	    fruits[1] = sc.nextLine();
	    for (int i = 0; i<fruits.length; i++) {
	    	System.out.print("좋아하는 과일명 입력 : ");
	    	fruits[i] = sc.nextLine();
	      }
	    	
	    //4. 잘 담겼는지 테스트
	    for(int i= 0; i<fruits.length; i++) {
	    	System.out.println(fruits[i]);
	     }   
	}
	  
	
	
	
	
	
	
}
