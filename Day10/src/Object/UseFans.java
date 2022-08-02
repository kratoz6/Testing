package Object;

public class UseFans {
	public static void main(String[]args) {
		Fan f1=new Fan();
		f1.brand="usha";
		f1.price=1500;
		f1.isQuality=true;
		
		Fan f2=new Fan();
		f2.brand="orient";
		f2.price=1800;
		f2.isQuality=false;
		
		Fan[] f=new Fan[2];
		f[0]=f1;
		f[1]=f2;
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i].brand+" "+f[i].price+" "+f[i].isQuality);
			
		}
	}

}
