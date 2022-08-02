package Object;

public class Usemarker1 {
	public static void main(String[] args) {
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
		Marker[] markerss=new Marker[2];
		markerss[0]=m1;
		markerss[1]=m2;
		for(Marker y:markerss) {
			System.out.println(y.price+" "+y.brand+" "+y.color+" "+y.isRefillable+" "+y.size);
		}
	}

}
