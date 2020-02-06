package hwjava05_서울_12반_안형석;

public class ProductTest {
	public static void main(String[] args) {
		TV tv = new TV("215","OLED",3000,48,90,"TT");
		Refrigerator rf = new Refrigerator("7777","대용량",20000,70,8000);
		
		
		System.out.println("제품번호 " + "\t|" + "제품명" + "\t|" + "가격" 
							+ "\t|" + "재고수량"+ "\t|" +"크기" + "\t|"+ "종류");
		System.out.println(tv.toString());
		System.out.println(rf.toString());
	}
}
