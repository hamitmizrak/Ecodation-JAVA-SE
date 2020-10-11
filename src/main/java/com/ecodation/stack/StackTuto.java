package com.ecodation.stack;

import java.util.Stack;

public class StackTuto {

	public static void main(String[] args) {
		Stack<Integer> lifo = new Stack<Integer>();
		lifo.push(4);
		lifo.push(5);
		lifo.push(14);
		System.out.println("en tepedeki: " + lifo.peek());

		lifo.pop();
		System.out.println("en tepedeki: " + lifo.peek());
		/*
		 * for (int temp : lifo) { System.out.println(temp); }
		 */

	}
}
