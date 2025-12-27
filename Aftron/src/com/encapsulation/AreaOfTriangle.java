package com.encapsulation;

class  TriangleArea {
    int b;
	int h;
	static float a=0.5f;
 
public TriangleArea(int b, int h) {
	this.h=h;
	this.b=b;
	
}
 float disp() {
	float area =a*b*h;
	return area;
}
}
class AreaOfTriangle{
	public static void main (String args[]) {
		Area c = new Area(10,20);
		System.out.print(c.disp());
		
	}

}

