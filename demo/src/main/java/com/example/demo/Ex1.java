package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {
		int matrix[][] = { { 3, 2, 9, 15 }, { 5, 10, 7, 14 }, { 11, 6, 8, 1 }, { 12, 4, 17, 13 } };
		mod3(matrix);
		System.out.println();
		max3(matrix);
	}
	
	public static void max3(int matrix[][]) {
		int matix1D[] = convert(matrix);
		Arrays.sort(matix1D);
		LinkedHashSet<Integer> matixLinked = removeDuplicates(matix1D);
		List<Integer> numList = new ArrayList<Integer>(matixLinked);
		System.out.println("The result is: ");
		int len = numList.size();
		System.out.println("[" + numList.get(len - 1) + "," + numList.get(len - 2) + "," + numList.get(len - 3) + "]");
	}
	
	public static void mod3(int matrix[][]) {
		int matix1D[] = convert(matrix);
		System.out.println("The original array is: ");
		for (int num : matix1D) {
			System.out.print(num + " ");
		}
		System.out.println();
		LinkedHashSet<Integer> matixLinked = removeDuplicates(matix1D);
		LinkedHashSet<Integer> mod3Zeros = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> mod3NotZeros = new LinkedHashSet<Integer>();
		for (Integer o : matixLinked) {
			if (o % 3 == 0) {
				mod3Zeros.add(o);
			} else {
				mod3NotZeros.add(o);
			}
		}

		System.out.println("The result is: ");

		List<Integer> mod3ZerosArr = new ArrayList<Integer>(mod3Zeros);
		for (int k = 0; k < mod3ZerosArr.size(); k++) {
			k = 0;
			for (int v = 0; v < mod3ZerosArr.size(); v++) {
				if (mod3ZerosArr.get(k) != mod3ZerosArr.get(v)) {
					print(mod3ZerosArr.get(k), mod3ZerosArr.get(v));
				}
			}
			mod3ZerosArr.remove(k);
		}

		List<Integer> mod3notZerosArr = new ArrayList<Integer>(mod3NotZeros);
		for (int k = 0; k < mod3notZerosArr.size(); k++) {
			k = 0;
			for (int v = 0; v < mod3notZerosArr.size(); v++) {
				if (mod3notZerosArr.get(k) != mod3notZerosArr.get(v)) {
					Integer sum = mod3notZerosArr.get(k) + mod3notZerosArr.get(v);
					if (sum % 3 == 0) {
						print(mod3notZerosArr.get(k), mod3notZerosArr.get(v));
					}
				}
			}
			mod3notZerosArr.remove(k);
		}
	}
	public static void print(Integer k, Integer v) {
		System.out.print("[" + k + "," + v + "]");
		System.out.print(";");
	}

	public static int[] convert(int[][] input) {
		int matix1D[] = Stream.of(input).flatMapToInt(x -> Arrays.stream(x)).toArray();
		return matix1D;
	}

	public static LinkedHashSet<Integer> removeDuplicates(int[] a) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
			
		return set;
	}
}