package com.MultiThreding;


class Typing extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("Typing.........");
			try {
				Thread.sleep(1000);
				
			}catch(Exception e){
				System.out.println("handled succefully");
			}
		}
	}
}

class SpellCheck extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("SpellCheck.........");
			try {
				Thread.sleep(1000);
				
			}catch(Exception e){
				System.out.println("handled succefully");
			}
		}
	}
}

class Saving extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("Saving.........");
			try {
				Thread.sleep(1000);
				
			}catch(Exception e){
				System.out.println("handled succefully");
			}
		}
	}
}

public class kodeditor {

	public static void main(String[] args) {
		Typing t1 = new Typing();
		SpellCheck t2 = new SpellCheck();
		Saving t3 = new Saving();
		t1.start();
		t2.start();
		t3.start();

	}

}
