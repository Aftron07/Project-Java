package com.Inheritance;
public class ParentApps{
	public static void main(String args[]) {
		ChildA c= new ChildA();
		c.disp();
		
	}
}





//---------------------------------------same  VISIBILITY
//class ParentA{
//	public void disp() {
//		System.out.println("This is the parent Method");
//		
//	}
//}
//class ChildA extends ParentA{
//	public void disp() {
//		System.out.println("This is the child Method");
//	}
//}




//------------------------------MOre Visibility
class ParentA{
	protected void disp() {
		System.out.println("This is the parent Method");
		
	}
}
class ChildA extends ParentA{
	public void disp() {
		System.out.println("This is the child Method");
	}
}





//---------------------Less visibility

//
//class ParentA{
//	public void disp() {
//		System.out.println("This is the parent Method");
//		
//	}
//}
//class ChildA extends ParentA{
//	protected void disp() {
//		System.out.println("This is the child Method");
//	}
//}



//protected void disp() {
//	System.out.println("This is the parent Method");
//	
//}
//}
//class ChildA extends ParentA{
//public void disp() {
//	System.out.println("This is the child Method");
//	return 0;
//}
//}
//the return type is incompatible in parent class

