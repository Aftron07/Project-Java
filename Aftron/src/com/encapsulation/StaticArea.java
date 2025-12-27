package com.encapsulation;
class  Area1 {
    int r;
	static float pi=3.14f;
	
public Area1(int r) {
	this.r=r;
	
	
}


 float disp() {
	float area =pi*r*r;
	return area;
}
}
class StaticArea{
	public static void main (String args[]) {
		Area1 c = new Area1(20);
		System.out.print(c.disp());
		
	}

}