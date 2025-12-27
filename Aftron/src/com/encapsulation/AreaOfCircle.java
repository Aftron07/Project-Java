package com.encapsulation;
import java.util.Scanner;

class  Area {
    int r;
	float pi;
	
public Area(int r, float pi) {
	this.r=r;
	this.pi=pi;
	
}


 float disp() {
	float area =pi*r*r;
	return area;
}
}
class AreaOfCircle{
	public static void main (String args[]) {
		Area c = new Area(10,3.14f);
		System.out.print(c.disp());
		
	}

}