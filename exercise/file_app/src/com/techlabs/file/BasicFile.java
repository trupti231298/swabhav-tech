package com.techlabs.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicFile {
	public static void main(String args[]) {
		File file = new File("test.txt");

		try {
			PrintWriter output = new PrintWriter(file);
			output.println("Trupti Raut");
			output.println(19);
			output.close();
		} catch (IOException ex) {
			System.out.println("Error:%s\n" + ex);
		}
		try {
			FileWriter filewriter = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(filewriter);
			PrintWriter printwriter = new PrintWriter(br);
			Scanner input = new Scanner(file);
			String name = input.nextLine();
			int age = input.nextInt();
			
			Scanner userinput = new Scanner(System.in);
			System.out.println("Address:\n");
			String address = userinput.nextLine();
			printwriter.print("Address:\n");
			printwriter.print("\n");
			printwriter.print(address);
			System.out.println("Gender:\n");
			String gender = userinput.nextLine();
			printwriter.print("Gender:\n");
			printwriter.print(gender);
			printwriter.close();

		} catch (IOException ex) {
			System.out.println("Error:%s\n" + ex);
		}

	}

}
