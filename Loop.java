package Looping;

class Loop {
	
	int count = 0;
	public static void main(String[] args) {
		 
		Loop obj = new Loop();
		obj.Print_1_1_1_1_1();
//		obj.Print_1_2_3_4_5();
//		obj.Print_1_3_5_7_9();
//		obj.Print_3_6_9_12_15(); 
//		obj.Multiples_3_and_5(); 
//		obj.Multiples_3_or_5(); 
//		obj.Divisors_of_given_number(100);
//		obj.Count_of_Divisors_of_given_number(100);
//		obj.Prime_Number(11);
//		obj.Reverse_Printing_a_number();
//		obj.Count_of_Digits(12345);
//		obj.Sum_of_Digits(9263);
//		obj.Reverse_the_Number(12345);
//		obj.Palindrome(1221);
//		obj.Armstrong_Number(153);
//		obj.Neon_Number(9);
//		obj.Strong_Number(145);
//		System.out.println(obj.Factorial(5));
//		obj.Addition_of_first_n_numbers(10);
//		obj.Greatest_Common_Divisor(300,150);
//		obj.Least_Common_Multiples(3, 9);
//		System.out.println(obj.Find_power(3,5));
//		obj.Decimal_To_Binary(9);
//		obj.Binary_to_Decimal(1010);
//		obj.Fibonacci_Series();
//		obj.Swapping_two_numbers(32,42);
//		obj.Swapping_without_third_variable(8,4);
//		obj.Fibonacci_without_using_third_variable();
//		obj.First_n_Prime_Numbers(10);
//		obj.Sum_of_Digits_until_it_becomes_single_digit(2376);
//		obj.Printing_5fact_4fact_3fact_2fact_1fact_();
//		obj.Printing1();
//		obj.Printing_1_11_121();
//		obj.Printing_1_8_27_64();
//		obj.Printing_1_4_9_16_25_36_49_64_81_100();
//		obj.Printing_1_4_27_256();
//		obj.Square_Root_of_a_Number(4);
//		obj.Prime_no_in_a_fibonacci_series();
	}

	private void Prime_no_in_a_fibonacci_series() {
		// TODO Auto-generated method stub
		int first = 0 , second = 1;
		int i = 2;
		while(first<=200) {
			if(first%i==1)
				System.out.print(first+" ");
				second = first + second;
				first = second - first;
		}
		i++;
	}

	private void Square_Root_of_a_Number(int m) {
		// TODO Auto-generated method stub
		int n = 2;
		while(n<=m/2) {
			if(m/n ==n) {
				System.out.println(n);
				break;
			}
			n++;
		}
	}

	private void Printing_1_4_27_256() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=4) {
			int pow = Find_power(i,i);
			System.out.println(pow);
			i++;
		}
	}

	private void Printing_1_4_9_16_25_36_49_64_81_100() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=10) {
			System.out.print(i*i+" ");
			i++;
		}
	}

	private void Printing_1_8_27_64() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=4) {
			int pow = Find_power(i,3);
			System.out.println(pow);
			i++;
		}
	}

	private void Printing_1_11_121() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=121) {
			System.out.println(i);
			i*=11;
		}
	}

	private void Printing1() {
		// TODO Auto-generated method stub
		//Printing 1*10 2*9 3*8 4*7 
		int i = 1, j = 10;
		while(i<=4) {
			System.out.println(i*j);
			i++;j--;
		}
	}

	private void Printing_5fact_4fact_3fact_2fact_1fact_() {
		// TODO Auto-generated method stub
		int i = 5;
		while(i>=1) {
			int fact = Factorial(i);
			System.out.println("Factorial of "+i+" is "+fact);
			i--;
		}
	}

	private void Sum_of_Digits_until_it_becomes_single_digit(int num) {
		// TODO Auto-generated method stub
		int total = Sum_of_Digits(num);
		if(total>0) {
			total = Sum_of_Digits(total);
		}
		System.out.println("Sum of Digits until it becomes single digit is "+total);
	}

	private void First_n_Prime_Numbers(int i) {
		// TODO Auto-generated method stub
		int no = 2;
		int Prime_no_count = Prime_Number(no); 
		while(Prime_no_count<i){			   
			no++;
			Prime_no_count = Prime_Number(no);
		}
		System.out.println("\nPrime Numbers Count is "+count);
	}

	private void Fibonacci_Odd_Positions() {
		// TODO Auto-generated method stub
		int first = 0 , second = 1;
		while(first<=20) {
			if(first<=13)
			System.out.print(first+" ");
			second = first + second;
			first = second - first;
		}
	}

	private void Fibonacci_without_using_third_variable() {
		// TODO Auto-generated method stub
		int first = 0 , second = 1;
		while(first<=20) {
			System.out.print(first+" ");
			second = first + second;
			first = second - first;
		}
	}

	private void Swapping_without_third_variable(int no1, int no2) {
		// TODO Auto-generated method stub
		no2 = no1+no2;
		no1 = no2-no1; 
		no2 = no2-no1;
		System.out.print(no1+" "+no2);
	}

	private void Swapping_two_numbers(int no1, int no2) {
		// TODO Auto-generated method stub
		int no3 = no1;
		no1 = no2;
		no2 = no3;
		System.out.print(no1+" "+no2);
	}


	private void Fibonacci_Series() {
		// TODO Auto-generated method stub
		int first = 0 , second = 1;
		int third = 0;
		while(third<=20) {
			System.out.print(first+" ");
			third = first + second;
			first = second;
			second = third;
		}
	}

	private void Binary_to_Decimal(int num) {
		// TODO Auto-generated method stub
		int decimal = 0;
		int i = 0;
		int no = num;
		while(num>0) {
			int n = num%10;
			int pow = n * Find_power(2,i);
			decimal = decimal + pow;
			i++;
			num/=10;
		}
		System.out.println("Decimal Value of "+no+" is "+decimal);
	}

	private void Decimal_To_Binary(int num) {
		// TODO Auto-generated method stub
		String binary = "";
		int n = num;
		while(num>0) {
			int rem = num%2;
			binary = rem + binary;
			num/=2;
		}
		System.out.println("Binary Value of "+n+" is "+binary);
	 
	}

	private int Find_power(int no, int pow) {
		// TODO Auto-generated method stub
		int power = 1;
		int i = 1;
		while(i<=pow) {
			power = power * no;
			i++;
		}
		return power;
	}

	private void Least_Common_Multiples(int no1, int no2) {
		// TODO Auto-generated method stub
		int big = no1>no2? no1:no2;
		while(true) {
			if(big%no1==0 && big%no2==0) {
				System.out.println("Least Common Multiples is "+big);
				break;
			}
			big++;
		}
			
	}

	private void Greatest_Common_Divisor(int no1, int no2) {
		// TODO Auto-generated method stub
		int div = 2;
		int gcd = 0;
		int small = no1<no2? no1:no2;
		while(div<=small) {
			if(no1%div==0 && no2%div==0) {
				gcd = div;
			}
			div++;
		}
		System.out.println("Greatest Common Divisor is "+gcd);
	}
 

	private void Addition_of_first_n_numbers(int num) {
		// TODO Auto-generated method stub
		int i = 1;
		int total = 0;
		while(i<=num) {
			total = total + i;
			i++;
		}
		System.out.println("Addition of first n numbers is "+total);
	}

	private int Factorial(int num) {
		// TODO Auto-generated method stub
		int i = 1;
		int total = 1;
		while(i<=num) {
			total = total * i;
			i++;
		}
		return total;
	}

	private void Strong_Number(int num) {
		// TODO Auto-generated method stub
		int a = 0;
		int match = num;
		while(num>0) {
			int n = num%10;
			int r = Factorial(n);
			a = a + r;
			num/=10;
		}
		if(a == match) {
			System.out.println("Strong Number");
			}
		else {
			System.out.println("Not Strong Number");
		}
	}

	private void Neon_Number(int num) {
		// TODO Auto-generated method stub
		int a = 0;
		int pow = num*num;
		while(pow>0) {
			int n = pow%10;
			a = a + n;
			pow/=10;
		}
		if(a == num) {
			System.out.println("Neon Number");
			}
		else {
			System.out.println("Not Neon Number");
		}
	}

	private void Armstrong_Number(int num) {
		// TODO Auto-generated method stub
		int a = 0;
		int match = num;
		while(num>0) {
			int n = num%10;
			int pow = n*n*n;
			a = a + pow;
			num/=10;
		}
		if(a==match) {
			System.out.println("Armstrong Number");
			}
		else {
			System.out.println("Not Armstrong Number");
		}
	}

	private void Palindrome(int num) {
		// TODO Auto-generated method stub
		int rev = 0;
		int Match = num;
		while(num>0) {
			int n = num%10;
			rev = rev*10 + n;
			num/=10;
		}
		if(Match==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Plaindrome");
		}
	}

	private void Reverse_the_Number(int num) {
		// TODO Auto-generated method stub
		int rev = 0;
		while(num>0) {
			int n = num%10;
			rev = rev*10 + n;
			num/=10;
		}
		System.out.println("Reverse Printing a number is "+rev);
	}

	private int Sum_of_Digits(int num) {
		// TODO Auto-generated method stub
		int total = 0;
		while(num>0) {
			int n = num%10;
			total = total + n;
			num/=10;
		}
		return total; 
	}

	private void Count_of_Digits(int num) {
		// TODO Auto-generated method stub
		int rev = 0;
		int count = 0;
		while(num>0) {
			int n = num%10;
			rev = rev*10 + n;
			num/=10;
			count++;
		}
		System.out.println("Count of Digits is "+count);
	}

	private void Reverse_Printing_a_number() {
		// TODO Auto-generated method stub
		int num = 10;
		while(num>=1) {
			System.out.print(num+" ");
			num--;
		}
		
			
	}

	private int Prime_Number(int num) {
		// TODO Auto-generated method stub
		int i = 2;
		boolean Check = false;
		while(i<=num/2){
			if(num%i==0) {
//				System.out.println("Not a Prime Number");
				Check = true;
				break;
			}
			i++;
		}
		if(Check==false) {
			System.out.print(num+" ");
//			System.out.println("Prime Number");
			count++;
		}	
		return count;
	}

	private void Count_of_Divisors_of_given_number(int div) {
		// TODO Auto-generated method stub
		int i = 1;
		int count = 0; 
		while(i<=div) {
			if(div%i==0)
				count++;
			i+=1;
		}
		System.out.println("Count of Divisors of given number is "+count);
	}

	private void Divisors_of_given_number(int div) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=div) {
			if(div%i==0)
				System.out.print(i+" ");
			i+=1;
		}
	}

	private void Multiples_3_or_5() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=50) {
			if(i%3==0 || i%5==0)
				System.out.print(i+" ");
			i+=1;
		}
	}

	private void Multiples_3_and_5() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=50) {
			if(i%3==0 && i%5==0)
				System.out.print(i+" ");
			i+=1;
		}
	}

	private void Print_3_6_9_12_15() {
		// TODO Auto-generated method stub
		int i = 3;
		while(i<=15) {
			System.out.print(i+" ");
			i+=3;
		}
	}

	private void Print_1_3_5_7_9() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=10) {
			System.out.print(i+" ");
			i+=2;
		}
	}

	private void Print_1_2_3_4_5() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
	}

	private void Print_1_1_1_1_1() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i<=5) {
			System.out.print('1'+" ");
			i++;
		}
	}
}
