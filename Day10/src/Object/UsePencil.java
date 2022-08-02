package Object;

public class UsePencil {
	public static void main(String[]args) {
	Pencil p1=new Pencil();
	p1.brand="camlin";
	p1.price=10;
	p1.color="black";
	p1.tipWidth=1.22f;
	p1.size="small";
	//
	Pencil p2=new Pencil();
	p2.brand="renoyld";
	p2.price=20;
	p2.color="red";
	p2.tipWidth=1.08f;
	p2.size="small";
	//
	Pencil p3=new Pencil();
	p3.brand="cello";
	p3.price=15;
	p3.color="blue";
	p3.tipWidth=1.04f;
	p3.size="large";
	
	Pencil[] pencils={p1,p2,p3};
	for(int i=0;i<p1.color.length()-4;i++) {
		System.out.println(p1.color.charAt(i));
	}
	System.out.println();
	for(int i=1;i<p2.color.length()-1;i++) {
		System.out.println(p2.color.charAt(i));
	}
	System.out.println();
	for(int i=2;i<p3.color.length()-1;i++) {
		System.out.println(p3.color.charAt(i));
	}
	System.out.println();
	for(int i=0;i<pencils.length;i++) {
		System.out.println(pencils[i].color.charAt(i));
	}
	System.out.println(); 
	}

}
