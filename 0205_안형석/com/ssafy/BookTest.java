package com.ssafy;




public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book("21242","Java Pro","���ϳ�","Jaen.kr",15000,"Java �⺻����");
		Book book2 = new Book("35355","�м� ����    ","�ҳ���","Jaen.kr",30000,"SW �𵨸�");
		Magazine mag1 = new Magazine("35535","Java World","������","Java.com",7000,"ù����",2018,2);
		
		System.out.println("***************************** ������� *****************************");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(mag1.toString());
	
	}
}

