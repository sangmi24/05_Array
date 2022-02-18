package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 * * 배열 복사
	 * 말 그대로 배열의 크기, 모양, 내용물을 똑같이 복사 뜨겠다.
	 * 
	 * 방법
	 * 1. 얕은 복사 : 배열의 주소값만 복사하는 개념
	 * 2. 깊은 복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부값들을 복사하는 개념
	 */
	
	//얕은 복사
	public void method1() {
		
		//복사를 뜨기전에 전제조건: 원본이 있어야 함
		
		//원본 배열
		int[] origin = {1,2,3,4,5};  //배열 선언과 동시에 초기화
		
		//int[] origin = new int[5];
		//origin[0]=1;
		//origin[1]=2;
		//origin[2]=3;
	    //..5까지 값을 대입한 격
		
		System.out.println("== 원본 배열 출력==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");  //1 2 3 4 5 
		}
		//복사본 배열
		int[] copy = origin;  //(=은 대입연산자임) 복사를 뜬것!
		
		System.out.println("\n==복사본 배열 출력==");
		for(int i =0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");   //1 2 3 4 5 
		}
		//여기 시점으로 봤을 때에는 복사가 아주 잘 된것을 알 수 있다.
		
		//copy배열을 가지고 수정하기 
		copy[2]=100;
		
		System.out.println("\n==복사본 배열 수정후== ");
		for (int i=0; i<copy.length; i++) {  //1 2 100 4 5
		System.out.print(copy[i]+" ");	
		}
		//원본이 잘 있나??
		System.out.println("\n== 복사본 배열 수정후의 원본==");
		for(int i=0; i<origin.length; i++) {   //1 2 100 4 5
			System.out.print(origin[i]+ " ");
		}
		//원본이 훼손됨! => 주소값만 복사를 해서 그럼
		
		//복사본 배열만을 가지고 수정을 했는데 원본 배열도 같이 수정이 된 것 같다.
		//=> 원본 배열도 같이 변경이 되었음을 알수 있다. 
		//=> 얕은 복사 : 배열의 주소값이 복사되어 원본과 복사본이 같은 상황(시늉만 낸것)
		
		System.out.println("\n원본 배열의 해시코드 : "+ origin.hashCode()); //1829164700
		System.out.println("복사본 배열의 해시코드 : "+ copy.hashCode());   //1829164700
		//해시코드도 동일, 같은곳을 가리키고 있다. 즉, 그냥 같다. 

	}
      //깊은 복사에 해당됨(총 4가지 방법)
	  //1번째 방법
	  public void method2() {
		  
		  //복사의 전제조건: 원본이 있어야 함
		  
		  //1. for문을 이용하는 방법
		  //새로운 배열을 생성한 후에 각 인덱스별로 내부 값을 일일이 대입시켜주는 방법
		  
		  //원본 배열
		  int[]origin= {1,2,3,4,5};
		  
		  //복사본 배열
		  int[]copy = new int[origin.length]; //origin.length=크기
                                              //{0,0,0,0,0}	상태임	  
		  //이 시점까지는 틀까지는 똑같지만 내용물은 다른 상태 
		  
		  /*
		   * copy[0] = origin[0];
		   * copy[1] = origin[1];
		   * ...
		   */
		  for (int i=0; i<copy.length;i++) {
			  copy[i]=origin[i];
		  }
		  
		  //이 시점 기준으로 복사가 잘 되었을 거임!
		  
		  System.out.println("==복사본 배열==");
		  for(int i=0; i<copy.length; i++) {
			  System.out.print(copy[i]+ " ");  //1 2 3 4 5 
		  }
		  
		  //복사본 배열 수정
		  copy[2]=100;
		  System.out.println("\n==복사본 배열 수정 후== ");
		  for(int i=0; i<copy.length; i++) {
			  System.out.print(copy[i]+ " "); //1 2 100 4 5 
		  }
		  
		  System.out.println("\n==복사본 배열 수정 후의 원본 배열==");
		  for(int i = 0; i<copy.length;i++) {
			  System.out.print(origin[i]+ " "); //1 2 3 4 5 
		  }
		  System.out.println("\n 원본 배열의 해시코드 : "+origin.hashCode()); //1829164700
		  System.out.println("복사본 배열의 해시코드 : "+copy.hashCode()); //2018699554
		  // 해시코드와 주소값이 각각 다르다. => 원본이 훼손되지 않고 새로이 잘 복사가 되었다. 
	  }
	  //깊은 배열 복사 2번째 방법
	  public void method3() {
		//2. 새로운 배열을 생성한 후에    System이라는 클래스에서 arraycopy라는 메소드를 호출하여 복사
		
		//원본 배열
		  int[] origin = {1,2,3,4,5};
		
		//복사본 배열 - 새로운 배열을 생성함
		  int[] copy =new int[ 10 ];  //이번에는 좀 넉넉하게
		  //0 0 0 0 0 0 0 0 0 0 (jvm에 의해)
		  
		  
		//arraycopy메소드 호출함
		  System.arraycopy(origin, 0, copy, 0, 5);  //1 2 3 4 5 0 0 0 0 0 
		  //src 원본 근원지, srcPos 원본 처음 위치(인덱스),
		  //dest 목적지, destPos 목적지 배열 처음 위치, length 몇개가져올래?
		  //origin 배열의 0번째 인덱스에서부터 총 5개의 값을 copy 배열의 0번째 인덱스에서부터 차곡차곡 복사해서 넣겠다.
		  //[표현법]
          //System.arraycopy(원본배열명, 원본배열의복사를시작할인덱스, 복사본배열명,복사본배열의복사값이들어갈시작인덱스,복사의 갯수);		  
		  
	//	  System.arraycopy(origin, 0, copy, 2, 5); //0 0 1 2 3 4 5 0 0 0 
		  //origin배열의 0번째 인덱스에서부터 총 5개의 값을 copy 배열의 2번째 인덱스에서부터 차곡차곡 복사해서 넣겠다.
		  
	//	  System.arraycopy(origin, 0, copy, 1, 3 ); //0 1 2 3 0 0 0 0 0 0 
		
		  //System.arraycopy(origin, 2, copy, 9, 2 ); // 0 0 0 0 0 0 0 0 0 3/4 <=10번 인덱스
		  //ArrayIndexOutOfBoundsException 오류 발생
		  
		  //System.arraycopy 메소드 사용시 특징
		  //1. 인덱스 범위를 벗어났기 때문에 오류 발생=> 메소드 호출시 숫자부분 주의해서 쓸것
		  //2. 복사를 하고 남은 부분은 jvm에 의해서 초기화가 되었던 0이라는 값이 계속 유지됨
		  //3. 자유자재로 내가 원하는 자리에 원하는 만큼만 부분복사가 가능
		  
		  for(int i=0; i<copy.length; i++) {
			  System.out.print(copy[i]+ " "); 
		  }
		System.out.println("\n원본 해시코드 : "+origin.hashCode()); //1829164700
		System.out.println("복사본 해시코드 : "+copy.hashCode());  //2018699554
		//다른 주소값을 갖고있다 == 다른곳을 참조하고 있다. 
		//배열 수정시 서로 영향을 끼치지 않는다는 것을 유추 가능
   
	  }
	//깊은 배열 복사 3번째 방법
	  public void method4() {
		  
		  //3. Arrays 클래스에서 제공하는  copyOf 라는 메소드를 이용한 복사
		  
		  //원본 배열
		  int[] origin = {1,2,3,4,5};
		  
		  //복사본 배열
		  int[] copy = Arrays.copyOf(origin, 7);  
		  //original은 원본배열명, newLength은 새로운 길이..
		  
		  for(int i=0 ; i<copy.length; i++) {
			  System.out.print(copy[i]+ " ");  //1 2 3 4 5 0 0 
		  }
		  // 유추할 수 있는거
		  //1. 반복 몇번? 7번 => copy 배열의 크기 ==7
		  //2. 1 2 3 4 5 가 잘 들어가 있고 0 0 이 붙음 => 5,6번째 인덱스도 존재 => jvm이 채워졌음
		  
		  //[표현법]
		  //자료형[] 복사본 배열명 =  Arrays.copyOf(원본배열명,복사본배열의 크기);

		  
		 System.out.println("\n원본 해시코드 : "+origin.hashCode()); //1829164700
		 System.out.println("복사본 해시코드 : "+copy.hashCode());  //2018699554
		 
		 /*
		  * 
		  * 2. System.arraycopy 메소드 호출
		  * 몇번 인덱스에서부터 몇개를 어느 위치의 인덱스부터 복사해서 붙여넣을건지 세세하게 지정 가능
		  * 
		  * 3. Arrays.copyOf 메소드 호출
		  *  무조건 원본 배열의 0번 인덱스에서부터 복사가 진행됨(내가 제시한 갯수만큼)
		  *  또한 내가 제시한 갯수만큼 곧 복사본배열의 크기로 지정된다.
		  *  
		  *  => 이것들은 이미 static에 있어서 따로 생성 안만들어줘도 됨 그냥 호출하면 됨(제공된것들..)
		  */		 
	  }
	//깊은 배열 복사 4번째 방법
	   public void method5() {
		   //4. clone 메소드를 호출하여 복사
		   
		   //원본 배열
		   int []origin = {1,2,3,4,5};
		   
		   //[표현법]
		   //자료형[] 복사본배열명= 원본배열명.clone();
		   
		   int[] copy = origin.clone();
		   //인덱스 직접지정x, 복사할갯수 지정x =>따로 옵션이 존재하지 않음=> 즉, 원본배열과 완전 똑같이 복사
		   
		   //복사가 잘 되었나?
		   //for문을 이용해서 출력=> [1, 2, 3, 4, 5] 형태로 
//		   System.out.print("[");
//		   for(int i = 0; i<copy.length;i++) {
//			   //copy[i]를 연달아 출력(단, 쉼표 추가)
//			   if(i < (copy.length -1) ) {  //i가 마지막 인덱스에 도달하기 전까지
//			   
//			   System.out.print(copy[i]+ ", ");
//			   //마지막에 , 제거하기 
//			   }else {  //i 가 마지막 인덱스에 도달했을 경우 => ,을 안찍겠다. 
//				   System.out.print(copy[i]);
//			   }
//		   }
//		   System.out.print("]");
//		   
		   //Arrays 클래스에서 제공하는 배열을 한개의 문자열로 연이어 줘서 내보내주는 메소드 
		   //[ 표현법 ]
		   //Arrays.toString(내가출력하고자하는배열명);
		   System.out.println(Arrays.toString(copy)); //[1, 2, 3, 4, 5]
           //=> 앞과 뒤에 [], 값들 사이에는, 를 찍어서 각 인덱스에 담긴 값들을
		   //   하나의문자열로 연이어서 만들어주는 메소드 
		   
		   System.out.println("원본 해시코드 : "+ origin.hashCode()); //1829164700
		   System.out.println("복사본 해시코드 : "+ copy.hashCode());  //2018699554

	   }
	  
	
	
}









