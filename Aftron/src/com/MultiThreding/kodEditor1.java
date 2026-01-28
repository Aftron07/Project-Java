package com.MultiThreding;


class Typing implements Runnable{
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

class SpellCheck implements Runnable{
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

class Saving implements Runnable{
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

public class kodEditor1 {

	public static void main(String[] args) {
		Typing type = new Typing();
		SpellCheck spell = new SpellCheck();
		Saving save = new Saving();
		Thread t1 =new Thread (type);
		Thread t2 =new Thread (spell);
		Thread t3 =new Thread (save);
		t1.start();
		t2.start();
		t3.start();

	}

	
//	Achivieng Multithreading by using Implementing Runnable class 
}
