package com.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice2() {
		//���̰� 10�� ������ �迭�� ����� �ݺ��� �̿�
		//�������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		int[] arr = new int[10];	
		int num=10;		
		//�迭 �����
		for(int i=0; i<arr.length; i++) {
			arr[i]=num;
			num--;
		}
		//���
		for(int i=0; i<arr.length; i++ ) {
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

}
