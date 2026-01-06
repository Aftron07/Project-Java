package com.ExceptionHandling;

import java.sql.SQLException;

public class ParentApps {

	public static void main(String args[]) {

	}

}

class Parent {
	void disp() throws SQLException {
	}
}

class Child extends Parent {
	void disp() {

	}
}