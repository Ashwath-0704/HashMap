package DataStructur;

import java.util.Map;
import java.util.Scanner;

public class HashMapRunner {
	static MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
	static Scanner sc = new Scanner(System.in);

	/*
	 * UC1..Ability to find frequency of words in a sentence like (�To be or not to
	 * be�)
	 */
	public void findFrequency() {
//		(eg : To be or not to be)
		System.out.print("Enter a string: ");
		String message = sc.nextLine();
		String[] messagearray = message.toLowerCase().split(" ");
		for (String word : messagearray) {
			Integer value = myHashMap.get(word);
//			System.out.println(value);
			if (value == null) {
				value = 1;
			} else {
				value++;
			}
			myHashMap.add(word, value);
		}
		System.out.println(myHashMap);
	}

	public static void main(String[] args) {
		// creating Object
		HashMapRunner hash = new HashMapRunner();
		
		hash.findFrequency(); // UC1
	}
}
