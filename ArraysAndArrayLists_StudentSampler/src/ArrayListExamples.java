import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Array List Sampler code
 * @author Suzy Atfield-Cutts
 * @since November 2020
 *
 */
public class ArrayListExamples {

	/**
	 * readFromFileToArrayList()
	 * 
	 * Generic untyped arrayList 
	 * Notice two warnings regarding lack of data type
	 * 
	 * @throws FileNotFoundException
	 */
	public void readFromFileToArrayList() throws FileNotFoundException {

		ArrayList names = new ArrayList(); //generic/raw data type
		Scanner namesFileScan = new Scanner(new File("moreNamesInAFile.txt"));

		//read from file
		while (namesFileScan.hasNext()){
			names.add(namesFileScan.nextLine());
		}
		
		//display names - untyped ArrayList therefore cannot use For-each loop
		System.out.println("readFromFileToArrayList() method");
		for(int i = 0; i < names.size(); i++){ 
			System.out.println(names.get(i));
		}

		namesFileScan.close();
	}
	
	/**
	 * arrayListWithDataType()
	 * 
	 * Typed ArrayList - read from file
	 * 
	 * @throws FileNotFoundException
	 */
	public void arrayListWithDataType() throws FileNotFoundException {

		ArrayList<String> names = new ArrayList<String>(); //String data type
		Scanner namesFileScan = new Scanner(new File("moreNamesInAFile.txt"));

		//read from file
		while (namesFileScan.hasNext()){
			names.add(namesFileScan.nextLine());
		}

		//display names - can use a for each loop if ArrayList has a data type
		System.out.println("\n\narrayListWithDataType() method");
		for(String name: names){ 
			System.out.println(name);
		}

		namesFileScan.close();
	}
	
	/**
	 * usingArrayListMethods()
	 * 
	 * Sampler demonstrating the methods available in the ArrayList Class
	 * 
	 * @throws FileNotFoundException
	 */
	public void usingArrayListMethods() throws FileNotFoundException
	{
		ArrayList<String> names = new ArrayList<String>(); //generic/raw data type
		Scanner namesFileScan = new Scanner(new File("readNamesFromFile.txt"));
		System.out.println("\n\nUsingArrayListMethods() method");
		//read from file
		while (namesFileScan.hasNext()){
			names.add(namesFileScan.nextLine());
		}
		System.out.println(names.toString()+"\n");
		
		//1.Add name to end
		System.out.println("1. Add name to end");
		names.add("Bob");
		System.out.println(names.toString()+"\n");
		
		//2.Add name to start
		System.out.println("2. Add name to start");
		names.add(0, "Ray");
		System.out.println(names.toString()+"\n");

		//3.Change value
		System.out.println("3. Change value -4th element");
		names.set(3, "Fred");
		System.out.println(names.toString()+"\n");
		
		//4.Remove name by index
		System.out.println("4.Remove name by index");
		names.remove(4);
		System.out.println(names.toString()+"\n");
		
		//5.Remove name by value
		System.out.println("5.Remove name by value");
		names.remove("Guy");
		System.out.println(names.toString()+"\n");
		
		//6.Clear list
		System.out.println("6.Clear list");
		names.clear();
		System.out.println(names.toString()+"\n");
		
		namesFileScan.close();
	}
	
	/**
	 * collectionsMethodsExamples()
	 * 
	 * Sampler demonstrating the sort method available in the Collections Class
	 * 
	 * @throws FileNotFoundException
	 */
	public void collectionsMethodsExamples() throws FileNotFoundException {
		
		ArrayList<String> names = new ArrayList<String>(); //generic/raw data type
		Scanner namesFileScan = new Scanner(new File("unsortedNames.txt"));
		System.out.println("\n\ncollectionsMethodsExamples() method");
		//read from file
		while (namesFileScan.hasNext()){
			names.add(namesFileScan.nextLine());
		}
		System.out.println("Original list");
		System.out.println(names.toString()+"\n");
		
		Collections.sort(names);
		
		System.out.println("Sorted list");
		System.out.println(names.toString()+"\n");
		
		namesFileScan.close();
	}
	
	/**
	 * Main method ie: where execution begins...
	 * @param args
	 */
	public static void main(String[] args)  {

		ArrayListExamples readFromFile = new ArrayListExamples();
		try {
			readFromFile.readFromFileToArrayList();
			readFromFile.arrayListWithDataType();
			readFromFile.usingArrayListMethods();
			readFromFile.collectionsMethodsExamples();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found exception");
		}
		catch(Exception e){
			System.out.println("Some other exception occured");
		}
	}
}
