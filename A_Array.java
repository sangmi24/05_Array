package com.kh.array;

import java.util.Scanner;

public class A_Array {

  /* 
   * * ���� : "�ش� �ڷ����� �� �ϳ��� "�� ���� �� �ִ� ����  (�ܵ�����)
   *         ��) int a = 10;
   *               a = 20;
   *                 
   * * �迭 : "�ش� �ڷ����� �� ������ "�� ���� �� �ִ� ���� (����)
   *         ��) int[] arr = new int[3]; 
   *           => int���� ����  �� ����  3ĭ �����.
   *           => �� [0]ȣ [1]ȣ [2]ȣ �� ����� 
   *           => [index] : �ε����� 0���� �����Ѵ�. (�߿�)
   *           => �迭�� ũ��: 3/ ������ �ε��� :2
   *           => �迭�� ũ��: 5/ ������ �ε��� :4
   *           => "Array"���ڿ��� ũ�� : 5 / ������ �ε��� : 4
   *           => �׻� ũ�� : n / ������ �ε��� : n-1
   *           
   *            arr[0] = 10; 
   *            arr[1] = 20;
   *            arr[2] = 30;                                  
   *                          
   */
	
	    public void method1() {
	    	// �迭�� �� ��� �ұ�?
	    	// �������� ������ ���α׷����� �غ���
	    	// 0, 1, 2, 3, 4�� ����ؾ���
	    	
//	    	int num1 = 0;
//	    	int num2 = 1;
//	    	int num3 = 2;
//	    	int num4 = 3;
//	    	int num5 = 4;
//	    	
//	    	//����Ϸ��� �ߴ��� ������ ��¹��� 5�� �ۼ��� ���� ��
//	    	System.out.println(num1);
//	    	System.out.println(num2);
//	    	System.out.println(num3);
//	    	System.out.println(num4);
//	    	System.out.println(num5);
//	    	
//	    	//������ �ִ� ���� �ݺ������� ����� �����Ѱ�?=> ����x
//	    	for(int i =1; i<=5; i++) {
//	    		
//	    		System.out.println(numi);
//	    	}
//	    	//������ �ִ� ���� �ݺ������� ���� ���Ҽ� �ִ°�?
//	    	int sum= 0;
//	    	for(int i=1; i<=5; i++) {
//	    		
//	    		sum = sum+numi;
//	    	}
//	    	//���հ�=> �ݺ��� �̿��� �Ұ��ϱ� ������ ������ ������� �Ѵ�.
//	    	sum= num1+num2+num3+num4+num5;
//	    	
	    	//�ݺ��� ��� �Ұ�!=> ������ �þ���� �������
	    	
	    	//�迭�� ������ ���α׷��� �ϱ�
	    	//0, 1, 2, 3, 4 ����ؾ���
	    	
	    	/*1. �迭 ���� 
	    	*
	    	* [ ǥ���� ] => �ΰ��� ����� �ִ�.
	    	* 
	    	* �ڷ��� [] �迭��;  //�� ����� �� ���� ����
	    	* �ڷ��� �迭��[];
	    	*/
	    	//int a;      // ���� ����	    	  
	    	//int arr[]; //�迭 ����
	    	//int []arr;  //�迭 ����
	    	/*
	    	 * 2. �迭 �Ҵ�
	    	 * �� �迭�� ��� ������ �����Ұ��� �迭�� ũ�⸦ �������ִ� ����(�޸𸮿� ������ Ȯ���صΰڴ�.)
	    	 * ������ ��ŭ ���� �� ���� �������
	    	 * 
	    	 * [ ǥ���� ]
	    	 * �迭�� = new �ڷ���[�迭ũ�� ];
	    	 */
	    	
	    	//arr = new int[5]; //�迭 �Ҵ�
	    	
	    	//�迭 ����� ���ÿ� �Ҵ�
	    	int[]arr = new int[5];  //�� �������� ������ �Ǿ����� ��μ� �迭�� ����� �� �ִ�.
	    	
	        /*
	         * 3. �迭�� �� �ε���(ȣ��) �� ���� ����
	         * 
	         * [ ǥ���� ]
	         *  �迭�� [�ε���] = ��;
	         */
	    	
//	    	arr[0]=0;   => ������ �迭 ħ
//	    	arr[1]=1;
//	    	arr[2]=2;
//	    	arr[3]=3;
//	    	arr[4]=4;
	    	
	    	//�迭�� ���� ū ���� : �ݺ����� Ȱ���� �� �ִ�. 
	    	for(int i=0; i<5; i++) {
	    		arr[i] = i;
	    	}
	    	// =>���� �ݺ����� �̿��ؼ� ���� ����
	    	
	    	//�ݺ����� �̿��ؼ� ���� ���?=> ��½ÿ��� Ȱ�� ����
	    	for(int i =0; i<5; i++) {
	    		
	    		System.out.println(arr[i]);
	    	}
//	    	System.out.println(arr[0]);
//	    	System.out.println(arr[1]);
//	    	System.out.println(arr[2]);
//	    	System.out.println(arr[3]);
//	    	System.out.println(arr[4]);
	 	
	    	System.out.println(arr); //[I@6d06d69c : �� �� ���� ��=> �ּҰ�
	    	
	    }
	    
	     public void method2() {
	    	
	    	 //������ ����� ���ÿ� ����
	    	 int i = 10;
	    	 
	    	 //�迭�� ����� ���ÿ� �Ҵ�
	    	 int[] iArr = new int[5];  // [0] [1] [2] [3] [4]
	    	 
	    	 System.out.println("i : "+i );  //10
	    	 System.out.println("iArr : "+iArr);  //[I@6d06d69c
	    	 System.out.println("iArr�� �ؽ��ڵ尪 : "+ iArr.hashCode() );  //1829164700
	    	 //�ؽ��ڵ� : �ּҰ��� �������� ���·� �����ش�.
	    	  
	    	 double[] dArr = new double[3]; //[0] [1] [2]�� ����
	    	 System.out.println("dArr : "+dArr);  //[D@7852e922
	    	 System.out.println("dArr�� �ؽ��ڵ尪 : "+dArr.hashCode());  //2018699554
	    	 
	    	 /*
	    	  * *�⺻�ڷ��� : ���� ���� �ٷ� ���� �� �ִ� ����(�޸��� ���ÿ���)
	    	  *  boolean, char, byte, short, int, long, float, double
	    	  *  => ���� �̸��� ���� �� ���� ���� ���� �ٷ� �޾ƺ��� �ִ� Ư¡�� ����!
	    	  *  => �Ϲ� ����
	    	  *  
	    	  *  *�����ڷ��� : �ּҰ��� ��� �ִ� ���� (�������� �޸��� ������)
	    	  *             �ѹ� �ּ����� Ÿ�� ���� ���� ã�ڴ�. 
	    	  *  String, int[], double[], short[], ..., Scanner , A_Array(new�����͵� �� �ּҰ��� ��� ����)
	    	  *  => ���� �̸��� ���� �� ���� ���� ���� �ƴ϶� �� ���� ���� �����ϴ� ���� �ּҰ��� �޾ƺ� �� �ִ�.
	    	  *     (String �� ���� ���ܶ�°�!)
	    	  *  => ���� ���� (���۷��� ����)
	    	  */

	     }
	     public void method3() {
	    	 
	    	 int[] iArr =new int[3]; //[0] [1] [2]
	    	 double[] dArr = new double[3]; //[0] [1] [2]
	    	 
	    	 System.out.println("iArr :" + iArr);  //�ּҰ� [I@6d06d69c
	    	 System.out.println("iArr[0] : " + iArr[0]);  //  0
	    	 System.out.println("iArr[1] : " + iArr[1] );  // 1
	    	 
	    	 //�迭�� ����ҋ� �ݺ����̶� ���� ���� ����
	    	 
	    	 /*
	    	  * �迭�� ����� �� �ݺ����� ���� �� ����.
	    	  * 0�� �ε������� ������ �ε������� ���������� ����� �� �ִ�.
	    	  * ������ �ε��� �� == �迭�� ũ��-1
	    	  * 
	    	  * �迭�� ũ�⸦ �ƴ� ���
	    	  * [ ǥ���� ]
	    	  * �迭��.length 
	    	  * =>  �迭�� ���̸� �˷��ִ� ����
	    	  */
	    	 System.out.println("iArr �迭�� ũ��: "+iArr.length);  //3
	    	 System.out.println("dArr �迭�� ũ�� : "+dArr.length);  //3
	    	 
	    	 /*
	    	  * for������ �ݺ��� Ƚ���� �����ϴ� ���� ���� ���
	    	  * int i = 0; i <���� �ݺ��ϰ����ϴ�Ƚ��; i++
	    	  * 5�� �ݺ��ϰ� �ʹ� : int i=0; i<5; i++
	    	  * 7�� �ݺ��ϰ� �ʹ� : int i=0; i<7; i++
	    	  * �迭�� ũ�⸸ŭ �ݺ��ϰ� �ʹ� : int i= 0; i<�迭��ũ��; i++
	    	  * �迭��.length ��ŭ �ݺ��ϰ� �ʹ� : int i= 0; i<�迭��.length; i++
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
	    	  * �迭�� Ư¡
	    	  * ������ �ε����� ���� �������� �ʾƵ� ���� �������!
	    	  * int�� �迭�� ��쿡�� 0.double�� �迭�� ��쿡�� 0.0
	    	  * => �迭�� ������ ���� ����ִ� ������ �޸��� heap������ �����ϴµ�
	    	  *    heap ������ Ư¡�� ���� �� �������� ������ �� ����
	    	  * => �̷��� Ư¡ ������ JVM �� �⺻������ �ʱ�ȭ�� ���ش�.(�ڵ����� �������)
	    	  * �⺻��: �������迭�� ���0, �Ǽ����迭�� ��� 0.0, ������(char)�ϰ�� ' '�� ä������. 
	    	  *       
	    	  * 
	    	  * ����)
	    	  * �⺻�ڷ��� ����: ���� ���� �ʱ�ȭ(���� ó���� �������ִ� ����)�� ����� �Ѵ�. 
	    	  * �����ڷ��� ����: JVM�� �˾Ƽ� �ʱ�ȭ�� ���ش�. (�� ���� ��������)
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
	    	  * => �迭�� �ε��� ������ ����� �߻��ϴ� ����
	    	  *    (�迭�� ũ�Ⱑ 5�� �������ε����� 4�ε� ���� 5���ε����� �����ϰ��� �Ѵ�.)
	    	  *    
	    	  */
	    	 //�� ������ ���� �ݺ���
	    	 for(int i=0; i<arr.length; i++) {  //�迭��.length
	    		 arr[i]= i+1;
	    	 }
	    	 //�� ��°� ���� ������ ���� �ݺ���
	    	 int sum = 0;
	    
	    	 for(int i=0; i<arr.length; i++) {
	    		 
	    		 System.out.println(arr[i]);
	    		 sum = sum+ arr[i]; // �ܼ��� i�� �����ϴ°� �ƴ϶� i��° �濡 ����ִ� ���� ���ϰڴ�.
	    	  }
	    	 System.out.println("sum : "+ sum);
	    
	     }
	    public void method5() {
	    	
	    	//10ĭ¥�� �迭�� ���� ��
	    	//�迭 �� �濡 ������ ��  ���� ����
	    	
	    	//1. �迭�� ���� �� �Ҵ�
	    	int[] arr =new int[10];
	    	
	    	//2. 0��° ��(�ε���)~ ���������� �ݺ��� �����鼭 �������� ����
	    	//��, �������� ������ 51~100�� ���� (��50��, ���۰� 51)
	    	
	    	for (int i=0; i<arr.length;i++) {
	    		arr[i]=(int)((Math.random()*50)+51);
	    	}
	    	for(int i=0; i<arr.length;i++) {
	    		System.out.println("arr[" + i +"] : "+ arr[i]);  //arr[x] : xx
	    	}
	    	//�̰��� �����ϸ� �ζ� ���α׷��� ���� �� ����!
	    	
	    }
	 
	    
	    public void method6() {
	    	
	    	int[] arr = new int[5];
	    	
	    	System.out.println( arr ); // �ּҰ� [I@6d06d69c
	    	System.out.println("arr�� �ؽ��ڵ� ��: "+arr.hashCode()); //1829164700
	    	
	    	//���Կ� �ݺ���
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
	    	 * �迭�� ���� ū ����
	    	 * ���� �Ҵ��ߴ� �������� �ѹ� ������ �迭�� ũ��� ������ �Ұ��ϴ�.
	    	 * => �迭�� ũ�⸦ ���� �����ϰ��� �Ѵٸ�,
	    	 *    ��¿ �� ���� ���ο� �迭�� �ٽ� ������ �Ѵ�.
	    	 *    (==���� �� �Ҵ��� �ٽ� �ؾ߸� �Ѵ�.??)
	    	 */
	    	//�Ҵ縸 �ٽ��غ���
	    	arr = new int[7];
	    	
	    	System.out.println(arr);  //[I@7852e922
	    	System.out.println("arr�� �ؽ��ڵ� ��: "+arr.hashCode());  //2018699554
	    	
	    	/*
	    	 * �޸� �������� ������ Ȯ��(�Ҵ�)�� �� �׻� ������ �ּҰ��� �ο��ȴ�.
	    	 * ������ ���� �Ǿ��� �ּҿ� ���� ��ġ�� (�ߺ�����) �ʴ´�.
	    	 * => �׷��ٸ� ���Ӱ� �Ҵ縸 �� ��쿡��
	    	 *    ������ �����ϰ� �ִ� ���� �ּҰ��� ���ο� �ּҰ����� ���� �Ǹ鼭
	    	 *    ������ ������ ����� ���ο� ����� �ٲ�� ���� �� �� �ִ�!
	    	 *    
	    	 *  �׷��� ������ ������ ���̻� �ʿ䰡 ���� �迭 �κ��� ��� �ǳ�?
	    	 *  �ϴ� �޸��� heap������ ���� ���ٴϴٰ�
	    	 *  ���� �ð��� ������ �����ȴ�.
	    	 *  (�޸� û��== ������ �÷��� Garbage Collection)
	    	 *  (�޸� û�Һ�==������ �÷��� Garbage Collector,GC)
	    	 *  => �ڵ� �޸� ����
	    	 */
	    	
	    	//������ �ٲٴ°� �ƴ϶� �׳� ���� �ʹٸ�?
	    	arr = null;   //null: �ƹ��͵� �������� ������ �ǹ��ϴ� ��
            
	    	System.out.println(arr); // null �� ���
	    	
	    	//arr[0] =10 ;  //��ȿ���� �ʴ� �ڵ� 
	        /*
	         * NullPointerException ���� �߻� 
	         * ã�ư� �ּ����� ���µ� ��� 0��° �濡 �����ؼ� ���� ������?
	         * null �� ����ִ� �� �������� ��� ������ �ϸ� �߻��ϴ� ����
	         */
	    	
	    	System.out.println("arr�� �ؽ��ڵ� ��: "+arr.hashCode());
	    	// ���������� hashCode()�޼ҵ� ȣ��ÿ��� NullPointerException ������ �߻���!!
	    	
	    	/*�⺻�ڷ����� �⺻��
	    	 * ������: 0
	    	 * �Ǽ���: 0.0
	    	 * ������: ' ' (����)
	    	 * 
	    	 * �����ڷ����� �⺻��
	    	 * null => "�ּҰ��� ����"��� ��(==���� ����)
	    	 */
	    	
	    	  	
	    }
	      public void method7() {
	    	  
	    	  //3���� ����ڿ��� �Ź� Ű�� ������ �Է¹޾Ƽ� �迭�� ��Ƶΰ�
	    	  //3���� Ű�� ���� ���, ���հ�, ��� ����ؼ� �� ���
	    	  
	    	  Scanner sc= new Scanner(System.in);
	    	  
	    	  // 3���� Ű�� ���� double �� �迭�� �ϳ� �����
	    	  double [] heights = new double[3];
	    	  
	    	  //3���� Ű�� ���� ��ĳ�ʷ� �Է¹޾� �� �濡 ��Ƶα�
	    	  for(int i=0; i<heights.length; i++) {   //heights.length==3
	    		  System.out.print("Ű �Է�(cm) : " );
	    		  heights[i]= sc.nextDouble();
	    	  }
	    	   //3���� Ű ������ ��� +����
	    	  double sum=0.0;  //�� Ű�� ��
	    	  
	    	  for(int i=0;i<heights.length; i++ ) {
	    		  System.out.println((i+1)+"��° ����� Ű: "+heights[i]+"cm" );
	    		  sum = sum + heights[i];  //Ű ���� i��° ���� ���Ѱ�
	    		  
	    	  }
	    	  
	    	  //���հ�, ���
	    	  // ��� = �� �� / ����
	    	  System.out.println("���� : "+ sum );
	    	 // System.out.println("��� : " + (sum/ 3) );  
	    	 // System.out.println ("��� : " + (sum/ heights.length) );  // heights.length=> �迭�� ������
	    	  System.out.printf ("���ġ : %.2f ",(sum/ heights.length) );
	    	  // %f ���� ���̿� .2�� ������ �Ҽ��� ���� ���� ���� 
	    
	      }
	      public void method8() {
	    	  
	    	  //����ڿ��� ���ڿ� �ϳ��� �Է� �ް�
	    	  //������ ���ڵ��� char �迭�� �Űܴ��
	    	  
	    	  //1. ����ڷκ��� ���ڿ��� �Է�
	    	  Scanner sc = new Scanner(System.in);
	    	  
	    	  System.out.print("���ڿ� �ϳ� �Է� : ");
	    	  String str= sc.nextLine();
	    	  
	    	  //2. char �迭 ����� (�迭ũ�� == �Է¹��� ���ڿ��� ���̸�ŭ)
	    	  char[] arr = new char[str.length()];   //�Է¹��� ���ڿ��� ����==str.length()
	    	  
	    	  //3. ���ڿ��κ��� �� ���ڸ� �̾Ƽ�(charAt) char �迭�� ���
//	    	  arr[0]= str.charAt(0);
//	    	  arr[1]= str.charAt(1);
	    	  for(int i =0; i<arr.length;i++) {
	    		  arr[i]= str.charAt(i);
	    		  //���ڿ��� i ��° �ε����� ���ڸ� �����Ͽ� arr�迭�� i���� �濡 �ְڴ�.
	    	  }
	    	  //4. char �迭�� ���ڵ��� �� ����ִ��� ���
	    	  for(int i= 0; i<arr.length;i++) {
	    		  System.out.println((i+1)+" ��° ���� : "+ arr[i] ); 
	    	  }
	    	  
	    	  // ����: arr.length�� str.length�� ��ü ����
	    	  //=> ���ʿ� �迭 ����� ���ڿ��� ������� ���� �־��� ����!
	      }
	      public void method9() {
	    	  
	    	  // ������ ���
	    	  int num; //���� ����
	    	  int num1 = 1; //���� ����� ���ÿ� ����(�ʱ�ȭ)
	    	  
	    	  //�迭�� ���
	    	  int[] arr = new int[4];  //�迭�� ����� ���ÿ� �Ҵ�(ũ�� ����)
	    	  arr[0]=1;
	    	  arr[1]=2;
	    	  arr[2]=3;
	    	  arr[3]=4;
	    	  
	    	  //�� �Ʒ� ����� ���ٴ� 
	    	  //�迭�� ����� ���ÿ� �Ҵ�� ���ÿ� �ʱ�ȭ(��, ���� ���ϴ� ������ �ְڴ�)
	    	  // ���1.
	    	  int[] arr1 = new int[] {1,2,3,4};
	    	  
	    	  //���2. �� �ڵ尡 �� ���� ����
	    	  int[] arr2 = {1,2,3,4};
	    	  
	    	  //�迭�� �����
	    	  System.out.println(arr.hashCode() ==arr1.hashCode());  //false
	    	  System.out.println(arr1 == arr2); //false
	    	  System.out.println(arr2 == arr);  //false
	    	  //�ּҰ� ���� ������̱� ������ false�� ����
	    	  
	      }
	
	     public void method10(){
	    	 
	     //�����ϴ� ������ ������ �Է� ���� �Ŀ� ���ϸ��� �Է¹޾Ƽ� ���ڿ� �迭�� ����
	    	 
	    Scanner sc = new Scanner(System.in);
	    
	    //1.�����ϴ� ������ ���� ���� �Է¹ޱ�
	    System.out.print("�����ϴ� ���� ���� : ");
	    int size = sc.nextInt();
	    sc.nextLine();
	    
	    //2. �� ���� ��ŭ�� ���� ������ �ִ� ���ϸ��� ���� ���ڿ��� �迭�� ����
	    String[] fruits = new String[size];
	    
	    //3. �����ϴ� ���ϸ��� �Է¹޾Ƽ� �� �濡 �ֱ�
//	    fruits[0] = sc.nextLine();
//	    fruits[1] = sc.nextLine();
	    for (int i = 0; i<fruits.length; i++) {
	    	System.out.print("�����ϴ� ���ϸ� �Է� : ");
	    	fruits[i] = sc.nextLine();
	      }
	    	
	    //4. �� ������ �׽�Ʈ
	    for(int i= 0; i<fruits.length; i++) {
	    	System.out.println(fruits[i]);
	     }   
	}
	  
	
	
	
	
	
	
}
