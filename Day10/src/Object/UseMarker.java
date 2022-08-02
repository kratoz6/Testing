package Object;

public class UseMarker {
	public static void main(String[]args) {
		Marker m1=new Marker();
		m1.price=25;
		m1.color="black";
		m1.brand="camlin";
		m1.isRefillable=true;
		m1.size="medium";
		//
		Marker m2=new Marker();
		m2.price=15;
		m2.color="blue";
		m2.brand="reynold";
		m2.isRefillable=true;
		m2.size="large";
		//
		Marker[] markers= {m1,m2};
		int add=0;
		for(Marker x:markers) {
			System.out.println(x.price+" "+x.brand+" "+x.color+" "+x.isRefillable+" "+x.size);
			add=add+x.price;
		}
		System.out.println(add);
	}

}
