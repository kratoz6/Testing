package Object;

public class UseBag {
	public static void main(String[]args) {
		Bag b1=new Bag();
		b1.price=1599;
		b1.brand="dell";
		b1.color="black";
		b1.isWarranty=true;
		b1.weight=8.54f;
		
		Bag b2=new Bag();
		b2.price=1399;
		b2.brand="hp";
		b2.color="black";
		b2.isWarranty=true;
		b2.weight=8.12f;
		
		
		Bag[] bags={b1,b2};
		int a=0;
		String rev=" ";
		String rev1=" ";
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].price+" "+bags[i].brand+" "+bags[i].color);
		}
		for(int i=bags.length-1;i>=0;i--) {
			System.out.println(bags[i].price+" "+bags[i].brand+" "+bags[i].color);
		}
		for(int i=0;i<bags.length/2;i++) {
			System.out.println(bags[i].price+" "+bags[i].brand+" "+bags[i].color);
		}
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].brand.toUpperCase());
		}
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].brand+" "+bags[i].color+" "+bags[i].price+" "+(bags[i].price+200));
		}
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].brand+" "+bags[i].color+" "+bags[i].price+" "+(bags[i].price+200)+" "+((bags[i].price)+bags[i].price*8/100));
		}
		for(int i=0;i<bags.length;i++) {
			System.out.println(bags[i].brand+" "+bags[i].color+" "+bags[i].price+" "+(bags[i].price+200)+" "+((bags[i].price)-bags[i].price*9/100));
		}
		for(int i=bags[0].color.length()-1;i>=0;i--) {
			rev=rev+bags[0].color.charAt(i);
		}
		System.out.println(rev);
		for(int i=bags[0].brand.length()-1;i>=0;i--) {
			rev1=rev1+bags[0].brand.charAt(i);
			System.out.println(rev1);
		}
		for(int i=0;i<bags.length;i++) {
		a=a+bags[i].price;
		}
		System.out.println("Total price:"+a);
	}

}
