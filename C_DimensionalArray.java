package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {

	//������ �迭: ������ �迭 �������� �ϳ��� ���� ���� ������ �迭
	 public void method1() {
		 
		 //������ �迭 ����
		 //int[]arr1;
		 //int arr2[];
		 
		 /*
		  * 1. ������ �迭�� ����
		  * [ ǥ���� ]=> ������
		  * �ڷ��� �迭�� [][];
		  * �ڷ���[] �迭��[];
		  * �ڷ���[][] �迭��;  //�� ���� ����
		  */
		 int arr1[][];
		 int[]arr2[];
		 int[][] arr3;
		 
		 /*
		  * 2. ������ �迭�� �Ҵ�(�޸� ������ Ȯ���� �ΰڴ�==�迭�� ũ�⸦ �����ϰڴ�)
		  * [ ǥ���� ]
		  * �迭�� = new �ڷ���[��ũ��][��ũ��];
		  */
		 arr3= new int[2][3];
		 
		 //������ �迭������ ���� �� �Ҵ� ����, ������ �迭������ ��������
		 //������ �迭 ����� ���ÿ� �Ҵ�
		 int[][]arr = new int[3][5];
		 
		 //�� ������������ �츮�� ��μ� ������ �迭�� ����� �� �ְ� �ȴ�.
		 
		 System.out.println(arr); //�ּҰ�   [[I@6d06d69c
		 System.out.println(arr[0]); //�ּҰ�  [I@7852e922
		 System.out.println(arr[0][0]); //0
         
		 /*
		  * ������ �迭�� ����
		  * �켱������ �ּҰ��� ���[��ũ��] ��ŭ�� �迭�� ���������
		  * �� ���� ��� �ּҰ��� �������� [��ũ��] ��ŭ�� �迭�� ����Ǿ ���� ã�ư��� ����
		  * 
		  * �ش� �������迭�� ��ũ�⸦ �ƴ¹� (�ּҰ��� ��� �迭�� ũ�� ) 
		  * [ǥ����]
		  * �������迭��.length
		  * 
		  * �ش� �������迭�� ��ũ�⸦ �ƴ¹�
		  * [ǥ����]
		  * �������迭��[�ش���].length
		  */
		 System.out.println("���� ���� : "+arr.length);  //3
		 
		 //�� �ະ �迭�� ��ũ�⸦ �˰��� �Ѵٸ�
		 System.out.println("0��° ���� ���� ���� : "+arr[0].length);  //5
		 System.out.println("1��° ���� ���� ���� : "+arr[1].length);  //5
		 System.out.println("2��° ���� ���� ���� : "+arr[2].length);  //5
		 
		 /*
		  *  ���
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
          * ��Ģ: �� ���� ������ ���¿��� �� ���� 0�������� �迭�� ũ�� ������ 1�� �����ϴ� ��Ģ�� ���̰� ����! 
          * 
          * �ٱ��� for�� => ����� �����̴� for��
          * for(int i =0; i< arr.length; i++) {//(�迭�� ũ��==arr.length)
          *    
          *  }
          * 
          * ���� for��=> �� ���� �����̴� for��
          * for(int j=0; j <arr[���].length; j++){  //(�迭�� ũ��==���° ���� ��ũ��==arr[���].length)
          * 
          * }
          */
		  
		 for(int i=0; i<arr.length; i++) {  //����� arr.length =3
			 
			 for(int j=0; j<arr[i].length; j++) {//������ arr[i].length=5

                 System.out.print(arr[i][j]+ " "); 
			 }
			 System.out.println(); //5�� ��� ���� ��
		 }

	 }
	 public void method2() {
		 
		 //������ �迭 (��ũ��: 3 , ��ũ��:5)
		 int[][] arr = new int[3][5];
		 
		 //���������� �ݺ��� �����鼭 ���� �ϴ� ����
		 /*
		  * �������迭�� ��ø for��
		  * [ǥ����]
		  * for (int i=0; i< �迭��.length; i++ {
		  *     for(int j=0; j< �迭��[i].legnth; j++) {
		  *     
		  *          ���� �����ϴ� ����/ ���� ����ϴ� ����/ ���� ���ϴ� ����.... =>�ʿ��� ����
		  *     }
		  *  }
		  */
		 int value=1;
		 for(int i=0; i<arr.length; i++) {  //0��~ ��������=> 3�� �ݺ�
			 for(int j=0; j<arr[i].length;j++) {  //0��~���ະ �������� => 5�� �ݺ�
				 
				arr[i][j] = value++;  //����������  ��ó�� ��  �����ϴ°� 1������

			 }
		 } //�� 15�� �ݺ�
		 
		 //���� ���
		 for(int i=0; i<arr.length;i++) {
			 for(int j=0; j<arr[i].length; j++) {
				 //System.out.print(arr[i][j]+ " ");
				 System.out.printf("%-2d ",arr[i][j]);  //�������� 2ĭ ���� : %-2d  (������������ �ؾ���)
			 }
			 System.out.println();
		 }
		 
//		 1  2  3  4  5  
//		 6  7  8  9  10 
//		 11 12 13 14 15 

	 }
	
	 public void method3() {
		 
		 // �迭�� ����� ���ÿ� �ʱ�ȭ
		 // ������ �迭�� ���
		 int[] iArr = {1,2,3,4,5}; // 1 2 3 4 5
		 
		 // ������ �迭�� ���
		 int[][] arr = { {1,2,3,4,5},
				         {6,7,8,9,10},
				         {11,12,13,14,15} };
		 
		 // ������ �迭 ��ü�� �迭 �ȿ� �Ǵٸ� �迭�� ���ִ� �����̱� ������
		 //ǥ������ ���������� �迭 �ȿ� �Ǵٸ� �迭�� ���ְԲ� ���ָ� �ȴ�.
		 
		 //���
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
		 
		 //2�� , 3��¥�� ������ �迭
		 //0��°�࿡�� ����������
		 //1��°�࿡�� ������������ �Է��غ��� 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int[][] scores = new int[2][3];
		 
		 for(int i=0; i< scores.length;i++) {  //�ݺ��� �ι� �����ڴ�.
			 for(int j=0; j<scores[i].length;j++) { //�ݺ��� ���� �����ڴ�. 
				 
				 if(i==0) {  //���������鸸
					 System.out.print(" ���������� �Է��ϼ���: ");
					 
				 }
				 else {
					 System.out.print(" ���������� �Է��ϼ���: ");
					 
				 }
				    scores[i][j] =sc.nextInt();
				    sc.nextLine();
			 }

		 }
		   //���
		 for(int i=0; i<scores.length;i++) {
			 
			 if(i==0) {
			 System.out.print("����������: ");
			 }else {
		     System.out.print("����������: "); 
			 }
			 
			 for(int j=0; j<scores[i].length;j++) {
				 
				  
				 System.out.print(scores[i][j]+ " ");
			 }
			 System.out.println();
			 
		 }

	 }
       public void method5() {
    	   //method4�� ������ �迭 �������� �ٲ㺸��
   
    	   Scanner sc = new Scanner(System.in);

    	   int[] scores1 = new int[3];  //����
    	   int[] scores2 = new int[3];  //����
           
    	   //����
    	   for(int i=0; i<scores1.length;i++) {
    		   System.out.print("���������� �Է��ϼ���: ");
    		   scores1[i]=sc.nextInt();
       	       sc.nextLine();
    	   }
           //����
    	   for (int j=0; j<scores2.length;j++) {
    		   System.out.print("���������� �Է��ϼ���: ");
    		   scores2[j]=sc.nextInt();
       	       sc.nextLine();
    	   }
    	   //���
    	   System.out.print("����������: ");
    	   for(int i=0; i<scores1.length;i++) {
    		   System.out.print(scores1[i]+" ");
    	   }
    	   System.out.println();
    	   
    	   System.out.print("����������: ");
    	   for(int j=0; j<scores2.length;j++) {
    		   System.out.print(scores2[j]+ " ");
    	   }
    	   
       }
	 
	 
	 
	
}
