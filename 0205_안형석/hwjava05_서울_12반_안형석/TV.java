package hwjava05_����_12��_������;

public class TV {
	private String pn;
	private String name;
	private int price;
	private int ea;
	
	private int inch;
	private String dptype;
	
	
	public TV() {}
	
	public TV(String pn, String name, int price, int ea, int inch, String dptype) {
		super();
		this.pn = pn;
		this.name = name;
		this.price = price;
		this.ea = ea;
		this.inch = inch;
		this.dptype = dptype;
	}
	
	public String toString() {
		return (pn + "\t|" + name + "\t|" + price + "\t|" + ea
				+ "\t|" + inch + "\t|" + dptype);
	}
	
	
}
