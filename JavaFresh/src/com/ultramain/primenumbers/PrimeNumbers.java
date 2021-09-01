package com.ultramain.primenumbers;

public class PrimeNumbers {
	static int i;
	public static void PrimeNumberPrinting() {
		for(i=3; i<=100; i++) {
			if(i%2==0) {
				if(i%3==0) {
					System.out.println(i);
				}else
			   System.out.println("burgows");
			}
		}
		
	}

public static void main(String[]args) {
	PrimeNumbers.PrimeNumberPrinting();
	
       }

       }
 }

	