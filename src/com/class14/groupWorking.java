package com.class14;

public class groupWorking {

	public static void main(String[] args) {
		// 

		// Find out how many alpha characters present in a string?
		/*
		String str="Taking the classes from Syntax is great";
		String newStr=str.replaceAll(" ", "");
		System.out.println(newStr.length());
		*/
		
		
		//Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable?
		/*
		int num1 = 5;
        int num2= 10;
        System.out.println("before " + num1 + " and " + num2);
        num1 = num1 + num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("after " + num1 + " and " + num2);
		*/
		//Hocanin yaptigi
		/*
		 int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("The value of a="+a+" value of b="+b);

		String str1="Hello";//5
		String str2="World";//5
		
		str1=str1+str2;//HelloWorld-->10
		str2=str1.substring(0, str1.length()-str2.length());//Hello
		str1=str1.substring(str2.length());
		
		System.out.println("The value of str1="+str1+" value of str2="+str2);
		 */
		
		
		
		
		
		
		
        //Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
        /*
        int [] array = {1,2,3,4,5};
        int max = array[0];
        int min = array[0];
        int secondMax = array[0];
        
        for (int i=0; i<array.length; i++) {
        	if(array[i]>max) {
        		secondMax=max;
    			max=array[i];
    			
    			
    		}	if(array[i]<min) {
    			min=array[i];
    		}
        }
    	System.out.println(max);
    	System.out.println(min);
    	System.out.println(secondMax);
    	*/
    	//Sinifta yapilan
		/*
		int arr[] = { 1000, 46, 1, 86, 292, 2 };
        
        int min = arr[0];//0
        int secondLargest = 0;//0
        int largest = 0;//0
        
        for(int a: arr) {
            if(a>largest) {
                largest =a;
            }
            if(a < min) {
                min = a;
            }
        }
        for(int a : arr) {
            
            if(a> secondLargest && a <largest) {
                
                secondLargest = a;
            }
        }
        System.out.println(“min = ” + min);
        System.out.println(“Second Largest = ” + secondLargest);

        System.out.println(“Largest = ” + largest);
		*/
		
		
		
		
    	//find the second largest
    	/*
    	int [] values = {45,78,12,67,55};
        int largest=0;
        int second=0;
        for(int i =0;i<values.length;i++) {
            if(values[i] > largest){
                largest = values[i];}
                else if(values[i]>second) {
                   second=values[i];
               }
            }          
        System.out.println(second);
    	*/
    	
    	
    	//Write a java program to reverse String? Reverse a string word by word?
		/*
		 String str="Today is my Birthday";
		    String[] array=str.split(" ");
		    System.out.println(str);
		    

		    for(int i=array.length-1;i>=0; i--) {
		        System.out.print(array[i]+" ");
		}
    	*/
    	
		
		
    	
		//Write a java program to check whether a given number is prime or not
		/*
		int num=77;
		
		for (int i=0; i<1; i++) {
			
			if(num==2 || num==3) {
				System.out.println(num+" is a prime number");
				
			}else if(num==1) {
				System.out.println(num+" is not a prime number");
				
			}else if(num%5==0 || num%7==0) {
				System.out.println(num+" is not a prime number");
			}
			
			else if(num%2==1 & num%3!=0) {
				System.out.println(num+" is a prime number");
				
			}else {
				System.out.println(num+" is not a prime number");
				
			}
		}
    	*/
		/*
		 int num = 58;
        boolean isPrime = num > 1 ? true : false;
        for (int i = 2; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is a not a prime number");
        }
		 */
	}

}
