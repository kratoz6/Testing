package Object;

public class UseBike {
	public static void main(String[]args) {
		Bike b1=new Bike();
		b1.brand="honda";
		b1.color="red";
		b1.cc=100;
		b1.mileage=63;
		b1.price=65000;
		//
		Bike b2=new Bike();
		b2.brand="hero";
		b2.color="yellow";
		b2.cc=150;
		b2.mileage=52;
		b2.price=75200;
		//
		Bike b3=new Bike();
		b3.brand="tvs";
		b3.color="white";
		b3.cc=180;
		b3.mileage=48;
		b3.price=81000;
		//
		Bike b4=new Bike();
		b4.brand="bajaj";
		b4.color="black";
		b4.cc=200;
		b4.mileage=40;
		b4.price=98000;
		//
		Bike b5=new Bike();
		b5.brand="suzuki";
		b5.color="grey";
		b5.cc=250;
		b5.mileage=35;
		b5.price=119500;
		//
		Bike b6=new Bike();
		b6.brand="kawasaki";
		b6.color="green";
		b6.cc=300;
		b6.mileage=25;
		b6.price=375000;
		//
		Bike[] bikes= {b1,b2,b3,b4,b5,b6};
		for(int i=0;i<bikes.length;i++) {
			System.out.println(bikes[i].brand+" "+bikes[i].color+" "+bikes[i].cc+" "+bikes[i].mileage+" "+bikes[i].price);
			
		}
		System.out.println();
		for(int i=bikes.length-1;i>=0;i--) {
			System.out.println(bikes[i].brand+" "+bikes[i].color+" "+bikes[i].cc+" "+bikes[i].mileage+" "+bikes[i].price);
		}
		System.out.println();
		for(int i=0;i<bikes.length/2;i++) {
			System.out.println(bikes[i].brand+" "+bikes[i].color+" "+bikes[i].cc+" "+bikes[i].mileage+" "+bikes[i].price);
		}
		System.out.println();
		for(int i=bikes.length-1;i>=bikes.length/2;i--) {
			System.out.println(bikes[i].brand+" "+bikes[i].color+" "+bikes[i].cc+" "+bikes[i].mileage+" "+bikes[i].price);
		}
		System.out.println();
	}

}
