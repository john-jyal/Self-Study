package com.ssafy;




public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book("21242","Java Pro","김하나","Jaen.kr",15000,"Java 기본문법");
		Book book2 = new Book("35355","분석 설계    ","소나무","Jaen.kr",30000,"SW 모델링");
		Magazine mag1 = new Magazine("35535","Java World","편집부","Java.com",7000,"첫걸음",2018,2);
		
		System.out.println("***************************** 도서목록 *****************************");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(mag1.toString());
	
	}
}

