package hwjava05_����_12��_������;

public class ProductTest {
	public static void main(String[] args) {
		TV tv = new TV("215","OLED",3000,48,90,"TT");
		Refrigerator rf = new Refrigerator("7777","��뷮",20000,70,8000);
		
		
		System.out.println("��ǰ��ȣ " + "\t|" + "��ǰ��" + "\t|" + "����" 
							+ "\t|" + "������"+ "\t|" +"ũ��" + "\t|"+ "����");
		System.out.println(tv.toString());
		System.out.println(rf.toString());
	}
}
