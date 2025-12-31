package com.Package1;
public class AccessModifier{
	public int a;
	protected int b;
	int c;
	private int d;
	public static void main (String args[]) {
	AccessModifier a =new AccessModifier();
	System.out.println(a.a);
	System.out.println(a.b);
	System.out.println(a.c);
	System.out.println(a.d);
	}
	
}
class Demo {
	void disp() {
		AccessModifier a =new AccessModifier();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		//System.out.println(a.d);
		
	}
}

class Demo1 extends Demo{
	void disp1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	//	System.out.println(d);
	}
}

package com.package2;

import com.package1.AccessModiier;
	void disp2() {
		AccessModifier a =new AccessModifier();
		System.out.println(a.a);
		//System.out.println(a.b);
		//System.out.println(a.c);
		//System.out.println(a.d);
		
	}
}

class Demo3 extends AccessModifeir{
	void disp3(){
		System.out.println(a);
		System.out.println(b);
	//	System.out.println(c);
	//	System.out.println(d);
		
	}
}