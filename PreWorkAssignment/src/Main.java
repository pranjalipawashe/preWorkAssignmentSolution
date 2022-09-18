import java.util.Scanner;
public class Main {
Scanner sc = new Scanner(System.in);
 //function to checkPalindrome
public void checkPalindrome()  {
	int num, a=0, palindrome=0;
	System.out.println("Enter any Number: ");
	num = sc.nextInt();
	
	while(num>=1) {
		a=num%10;
	    palindrome=(palindrome*10)+a;
		num=num/10;
	}
	System.out.println("Palindrome of given number is : " + palindrome);
	

}
//function to printPattern
public void printPattern() {
	int num;
	System.out.println("Enter any Number: ");
	num = sc.nextInt();
	for(int i=num; i>=1;i--) {
		for(int j=0;j<i;j++) {
			System.out.print("*");	
		}
		System.out.println();
	}

}
//function to check no is prime or not
public void checkPrimeNumber() {
	int num, count=0;
	System.out.println("Enter any Number: ");
	num = sc.nextInt();
	if(num==1) {
		System.out.println(num + " is not prime nor consonent. ");
		return;
	}
	for(int i=1; i<=num; i++) {
		if(num%i == 0) {
			count++;
		}
	}
	if(count>2) {
		System.out.println(num + " is not prime number. ");
	}
	else {
		System.out.println(num + " is a prime number. ");
	}

}
// function to print Fibonacci Series
public void printFibonacciSeries() {
//initialize the first and second value as 0,1 respectively.
   int first = 0, second = 1;
   System.out.println("Enter length of the Fibonacci Series ");
   int len = sc.nextInt();
   
   int arr[] = new int[len]; 
   int nextEle=0;
   arr[0]=first;
   arr[1]=second;
    
   for(int i=2;i<len;i++) {
	       if(i==2)
	       {
	    	   arr[i]=1;
	       }
	       else {
	    	   arr[i]=arr[i-1] + arr[i-2];
	       }
   }
   for(int i=0;i<len;i++) {
	   System.out.print(arr[i] + " " );
   }
   System.out.println();
}

//main method which contains switch and do while loop
public static void main(String[] args) {
Main obj = new Main();
int choice;
Scanner sc = new Scanner(System.in);

do {
System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();
choice = sc.nextInt();
switch (choice) {
case 0:
choice = 0;
break;
case 1: {
obj.checkPalindrome();
}
break;
case 2: {
obj.printPattern();
}
break;
case 3: {
obj.checkPrimeNumber();
}
break;
case 4: {
obj.printFibonacciSeries();
}
break;
default:
System.out.println("Invalid choice. Enter a valid no.\n");
}
} while (choice != 0);
System.out.println("Exited Successfully!!!");
sc.close();
}

}
