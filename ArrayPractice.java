package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice2() {
		//길이가 10인 정수형 배열을 만들고 반복문 이용
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int[] arr = new int[10];	
		int num=10;		
		//배열 만들기
		for(int i=0; i<arr.length; i++) {
			arr[i]=num;
			num--;
		}
		//출력
		for(int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i]+ " ");
		}
        
	}
	public void practice9() {
		//사용자가 입력한 값이 배열에 있는지 검색
		//있으면 "xxx치킨배달가능", 없으면 "xxx치킨은없는메뉴입니다."출력
		//치킨메뉴 들어가 있는 배열은 스스로 정하기
		
		Scanner sc = new Scanner(System.in); 
		String[] menu = {"양념치킨","후라이드치킨","간장치킨"}; //배열
		
		
		while(true) {  // 윗메뉴 없으면 끝
			
		 System.out.print("치킨 이름을 입력하세요:");	
		 String food = sc.nextLine();
		 if(menu[0].equals(food)) {
			 System.out.println("양념치킨 배달 가능");
		 }else if(menu[1].equals(food)) {
				System.out.println("후라이드치킨 배달 가능");
		 }else if(menu[2].equals(food)) {
			    System.out.println("간장치킨 배달 가능");    
			 }else {
				System.out.println("없는 메뉴입니다."); 	
				break;
       }
	}
  }

}
