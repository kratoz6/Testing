package Object;

public class UseFan {
	public static void main(String[]args) {
		Fan f1=new Fan();
		f1.brand="usha";
		f1.price=1500;
		f1.isQuality=true;
		
		Fan f2=new Fan();
		f2.brand="orient";
		f2.price=1800;
		f2.isQuality=false;
		Fan[] fans= {f1,f2};
		for(int i=0;i<fans.length;i++) {
			System.out.println(fans[i].brand+" "+fans[i].price+" "+fans[i].isQuality);
		}
	}

}
