package Object;

public class UseTv {
	public static void main(String[] args) {
		Tv tv1=new Tv();
		tv1.brand="sony";
		tv1.price=55000;
		tv1.model="oled";
		tv1.color="silver";
		tv1.netprice=(tv1.price+(tv1.price*10/100)-(tv1.price*7/100));
		//
		Tv tv2=new Tv();
		tv2.brand="lg";
		tv2.price=40000;
		tv2.model="led";
		tv2.color="black";
		tv2.netprice=(tv2.price+(tv2.price*10/100)-(tv2.price*7/100));
		//
		Tv tv3=new Tv();
		tv3.brand="samsung";
		tv3.price=35000;
		tv3.model="led";
		tv3.color="black";
		tv3.netprice=(tv3.price+(tv3.price*10/100)-(tv3.price*7/100));
		//
		Tv[] tvs= {tv1,tv2,tv3};
		for(int i=0;i<tvs.length;i++) {
			System.out.println("brand:"+tvs[i].brand.toUpperCase()+" "+"Model:"+tvs[i].model+" "+"Color:"+tvs[i].color+" "+"Net Price:"+tvs[i].netprice);		
		}
		
	}


}
