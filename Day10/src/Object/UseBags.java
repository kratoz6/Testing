package Object;

public class UseBags {
	public static void main(String[]args) {
		Bag b1=new Bag();
		b1.price=1599;
		b1.brand="DELL";
		b1.color="black";
		b1.isWarranty=true;
		b1.weight=8.54f;
		
		Bag b2=new Bag();
		b2.price=1399;
		b2.brand="HP";
		b2.color="black";
		b2.isWarranty=true;
		b2.weight=8.12f;
		
		Bag[] bags=new Bag[2];
		bags[0]=b1;
		bags[1]=b2;
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].price+" "+bags[i].brand+" "+bags[i].color+" "+bags[i].isWarranty);
		}
	}

}
