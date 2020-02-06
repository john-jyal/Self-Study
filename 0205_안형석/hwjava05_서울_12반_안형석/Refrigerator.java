package hwjava05_서울_12반_안형석;

public class Refrigerator {
	private String pn;
	private String name;
	private int price;
	private int ea;
	
	private int cap;
	
	public Refrigerator() {	}

	public Refrigerator(String pn, String name, int price, int ea, int cap) {
		super();
		this.pn = pn;
		this.name = name;
		this.price = price;
		this.ea = ea;
		this.cap = cap;
	}
	
	public String toString() {
		return (pn + "\t|" + name + "\t|" + price + "\t|" + ea
				+ "\t|" + cap);
	}
}
