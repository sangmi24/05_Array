package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice2() {
		//���̰� 10�� ������ �迭�� ����� �ݺ��� �̿�
		//�������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		int[] arr = new int[10];	
	    int num=10;		
		//�迭 �����
		for(int i=0; i<10; i++) {
			arr[i]=num;
			num--;		}
		//���
		for(int i=0; i<10; i++ ) {
			System.out.print(arr[i]+ " ");
		}
		

        
	}
	public void practice9() {
		//����ڰ� �Է��� ���� �迭�� �ִ��� �˻�
		//������ "xxxġŲ��ް���", ������ "xxxġŲ�����¸޴��Դϴ�."���
		//ġŲ�޴� �� �ִ� �迭�� ������ ���ϱ�
		
		Scanner sc = new Scanner(System.in); 
		String[] menu = {"���ġŲ","�Ķ��̵�ġŲ","����ġŲ"}; //�迭
		
		
		while(true) {  // ���޴� ������ ��
			
		 System.out.print("ġŲ �̸��� �Է��ϼ���:");	
		 String food = sc.nextLine();
		 if(menu[0].equals(food)) {
			 System.out.println("���ġŲ ��� ����");
		 }else if(menu[1].equals(food)) {
				System.out.println("�Ķ��̵�ġŲ ��� ����");
		 }else if(menu[2].equals(food)) {
			    System.out.println("����ġŲ ��� ����");    
			 }else {
				System.out.println("���� �޴��Դϴ�."); 	
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
        	//����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
        	//1���� �Է� ���� ������ �迭�� �ʱ�ȭ���� ����ϼ���.
        	Scanner sc = new Scanner(System.in);
        	System.out.print("���� ���� : ");
        	int num = sc.nextInt();
        	
        	int[] arr = new int[num];  
        	for(int i=1; i<= (arr.length); i++) {
        		System.out.print(i+" "); 	
        	}
        }
	   
        public void practice4() {
        	//���̰� 5�� String�迭�� ����, �����̸����� �ʱ�ȭ����
        	//�迭 �ε����� Ȱ���ؼ� ���� ����ϼ���.
        	String[] fruits ={"���","��","����","������","����"};
        	
        	System.out.println( fruits[1]);

        }
	     
        public void practice5() {
        	//���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� 
        	//�˻��� ���ڰ� ���ڿ��� � �� �ִ��� ������ ���° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.
        	Scanner sc = new Scanner(System.in);
        	
        	System.out.print("���ڿ�: ");
            String str1 =sc.nextLine();
            
            System.out.print("����: ");
            char ch =sc.next().charAt(0);
            
            char[] arr = new char[str1.length()];
            String index="";  //�ε����ʱ�ȭ
            int count =0;     //���� �ʱ�ȭ
            
            for(int i=0; i<arr.length; i++) {
            	arr[i] = str1.charAt(i);  //���ڿ��߿� ���ڻ̴°�
            	if(ch == arr[i]) {
            		index = index + i +" ";  //index += i
            		count++;
            	}
            }
        	System.out.println(str1+"�� "+ch+"�� �����ϴ� ��ġ(�ε���) : "+ index );
        	System.out.println(ch+" ���� : "+count );
        }
       
           public void practice6() {
        	   //"��"~ "��"(����)���� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
        	   //�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
        	   //������ ���� ���ڸ� �Է½� "�߸� �Է��ϼ̽��ϴ�"�� ����ϼ���.
        	   
        	   Scanner sc = new Scanner(System.in);
        	   System.out.print("0~���� 6 ���� ���� �Է� : ");
        	   int num = sc.nextInt();
        	   
        	   
        	   String[] day = {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"} ;
        	   //�ϴ� ��
              
                }
           
           public void practice13() {
        	//�ֹε�Ϲ�ȣ�� String ���ڿ��� �Է� �ް� �Է� ���� �� ���ڿ��� 
        	// �� �ε��� �� ���ڸ� char[] �� �Ű� ���(��, ���� �ڸ� ���ĺ��ʹ� *�� ���)
        	
        	   //123456-1234567 => 123456-1******
        	   Scanner sc = new Scanner(System.in);
        	   System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
        	   String Idnum = sc.nextLine();
        	   
        	   char[] arr  = new char[14];  //�迭 ����. ���� - ���ļ� 14��

        	   for(int i=0; i<=13 ;i++) {  //������13��, �ݺ��ؼ� ���� ����
        		  arr[i]=Idnum.charAt(i);   // �Է��ѳѹ����� �̱�.
        		   
        	   if(i<=7) {                      //*������ ����
              	   System.out.print(arr[i]);
              	   }
        	   else {
        		   System.out.print("*");
        	     }      		  
        	   }       	  
            }
           public void practice7() {
        	   
        	Scanner sc = new Scanner(System.in);
        	System.out.print("���� : ");
        	int num = sc.nextInt();
        	int[] arr = new int[num]; //�迭 �̸� �ۿ�  ��������
    		int sum = 0;   //�� 0���� �ʱ�ȭ

        	for(int i=0; i<arr.length; i++) {  //�迭�� ���̸�ŭ�̿�
        		
        		System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
        		arr[i] = sc.nextInt();  
      		
        		sum += arr[i];    
        		
        	}
        	for(int i=0; i< arr.length ; i++) {
               System.out.print ( arr[i] + " ") ;    //�迭�� �̿��ϱ�! 	
        	}
        	System.out.println("\n�� �� : "+sum);

        	   
           }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
          }
        	   
           
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        
        
        
        
        
        
        
        
        
        
        
        
        

	
	

