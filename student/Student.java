
/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*

Demonstrates static variable & method as well as the 
for loop with an array

*/

import java.io.*;

public class Student {
	int sid;
	String sname;
	static String school = "Metro";
	int error;
	
	Student() {
		error = 0;
	}
	
	static void change (String newname) {
		school = newname;
	}
	
	
	public static void main (String [] args) {
		
		long[] x = new long[100000];
		
		String s = "";
		for (int n = 40; n < 63; n++) {
			s = s + "\\" + n;
			System.out.println(n + " " + s);
		}
		
		Student a1 = new Student();
		Student a2 = new Student();
		a1.sname = "fred";
		
		//Student.change("Stanford");
		a1.school = "MSCD";
		a1.sid = 42;
		
		System.out.println("a " + a1.sname + " " + a1.school + " " + a1.sid);
		System.out.println("f " + a2.sname + " " + a2.school + " " + a2.sid);
		
		a2.sname = "wilma";
		a2.sid = 50;
		a2.school = "Yale";
		
		System.out.println("b " + a1.sname + " " + a1.school + " " + a1.sid);
		System.out.println("c " + a2.sname + " " + a2.school + " " + a2.sid);
		
		a1.change("UNC");
		System.out.println("d " + a1.sname + " " + a1.school + " " + a1.sid);
		System.out.println("e " + a2.sname + " " + a2.school + " " + a2.sid);
	
	}
	
}




