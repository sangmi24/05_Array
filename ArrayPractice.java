package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice2() {
		//길이가 10인 정수형 배열을 만들고 반복문 이용
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int[] arr = new int[10];	
	    int num=10;		
		//배열 만들기
		for(int i=0; i<10; i++) {
			arr[i]=num;
			num--;		}
		//출력
		for(int i=0; i<10; i++ ) {
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
        public  void practice1() {
        	
        	int[] num = new int[10];
        	for (int i=1; i<11; i++) {
        		System.out.print(i+" ");
        	}  	
        }
      
        public void practice3() {
        	//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
        	//1부터 입력 받은 값까지 배열에 초기화한후 출력하세요.
        	Scanner sc = new Scanner(System.in);
        	System.out.print("양의 정수 : ");
        	int num = sc.nextInt();
        	
        	int[] arr = new int[num];  
        	for(int i=1; i<= (arr.length); i++) {
        		System.out.print(i+" "); 	
        	}
        }
	   
        public void practice4() {
        	//길이가 5인 String배열을 선언, 과일이름으로 초기화한후
        	//배열 인덱스를 활용해서 귤을 출력하세요.
        	String[] fruits ={"사과","귤","포도","복숭아","참외"};
        	
        	System.out.println( fruits[1]);

        }
	     
        public void practice5() {
        	//문자열을 입력 받아 문자 하나하나를 배열에 넣고 
        	//검색할 문자가 문자열에 몇개 들어가 있는지 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력하세요.
        	Scanner sc = new Scanner(System.in);
        	
        	System.out.print("문자열: ");
            String str1 =sc.nextLine();
            
            System.out.print("문자: ");
            char ch =sc.next().charAt(0);
            
            char[] arr = new char[str1.length()];
            String index="";  //인덱스초기화
            int count =0;     //정수 초기화
            
            for(int i=0; i<arr.length; i++) {
            	arr[i] = str1.charAt(i);  //문자열중에 문자뽑는거
            	if(ch == arr[i]) {
            		index = index + i +" ";  //index += i
            		count++;
            	}
            }
        	System.out.println(str1+"에 "+ch+"가 존재하는 위치(인덱스) : "+ index );
        	System.out.println(ch+" 개수 : "+count );
        }
       
           public void practice6() {
        	   //"월"~ "일"(요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
        	   //입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
        	   //범위에 없는 숫자를 입력시 "잘못 입력하셨습니다"를 출력하세요.
        	   
        	   Scanner sc = new Scanner(System.in);
        	   System.out.print("0~부터 6 사이 숫자 입력 : ");
        	   int num = sc.nextInt();
        	   
        	   
        	   String[] day = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"} ;
        	   //하다 맘
              
                }
           
           public void practice13() {
        	//주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 
        	// 각 인덱스 별 문자를 char[] 에 옮겨 담기(단, 성별 자리 이후부터는 *로 담기)
        	
        	   //123456-1234567 => 123456-1******
        	   Scanner sc = new Scanner(System.in);
        	   System.out.print("주민등록번호(-포함) : ");
        	   String Idnum = sc.nextLine();
        	   
        	   char[] arr  = new char[14];  //배열 생성. 숫자 - 합쳐서 14개

        	   for(int i=0; i<=13 ;i++) {  //정수는13개, 반복해서 숫자 나열
        		  arr[i]=Idnum.charAt(i);   // 입력한넘버에서 뽑기.
        		   
        	   if(i<=7) {                      //*전에는 숫자
              	   System.out.print(arr[i]);
              	   }
        	   else {
        		   System.out.print("*");
        	     }      		  
        	   }       	  
            }
           public void practice7() {
        	   
        	Scanner sc = new Scanner(System.in);
        	System.out.print("정수 : ");
        	int num = sc.nextInt();
        	int[] arr = new int[num]; //배열 미리 밖에  빼놔야함
    		int sum = 0;   //합 0으로 초기화

        	for(int i=0; i<arr.length; i++) {  //배열의 길이만큼이요
        		
        		System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
        		arr[i] = sc.nextInt();  
      		
        		sum += arr[i];    
        		
        	}
        	for(int i=0; i< arr.length ; i++) {
               System.out.print ( arr[i] + " ") ;    //배열을 이용하기! 	
        	}
        	System.out.println("\n총 합 : "+sum);

        	   
           }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
          }
        	   
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        
        
        
        
        
        
        
        
        
        
        
        
        

	
	

