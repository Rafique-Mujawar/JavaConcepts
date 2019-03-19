package com.samples.extra;

/**
 * @author Rafique Mujawar
 *         Date 26-06-2018
 */

public class SampleProgramms {

  public static void main(int a){
    System.out.println("main method overloaded.");
  }
  public static void main(String[] args){

main(3);

    //selectionSort(new int[]{5 ,1 ,4, 2, 8, 7});
    insertionSort(new int[]{96,15,64,71,56,31});
    /*
    System.out.println(factorial(8));
    System.out.println(factorial(3));
    fibonacciSeries(10);
    fibonacciSeries(12);
    System.out.println(isPrimeNumber(1));
    System.out.println(isPrimeNumber(2));
    System.out.println(isPrimeNumber(3));
    System.out.println(isPrimeNumber(4));
    System.out.println(isPrimeNumber(5));
    System.out.println(isPrimeNumber(6));
    System.out.println(isPrimeNumber(7));
    System.out.println(isPrimeNumber(8));
    System.out.println(isPrimeNumber(9));
    System.out.println(isPrimeNumber(10));

    System.out.println(verifyPalindrome(100));
    System.out.println(verifyPalindrome(27672));
    System.out.println(verifyPalindrome(672349));
    System.out.println(verifyPalindrome(12344321));

    System.out.println(verifyArmstrongNumber(8));
    System.out.println(verifyArmstrongNumber(153));
    System.out.println(verifyArmstrongNumber(1634));
    System.out.println(verifyArmstrongNumber(54748));

    System.out.println(factorial(8));
    System.out.println(factorial(4));
    System.out.println(factorial(1));
    System.out.println(factorial(0));*/
  }

  private static void fibonacciSeries(int input){
    if(0 == input){
      System.out.println(" Please enter valid number" );
    }
    System.out.println();
    int n1 = 0, n2 = 1, n3 ;
    System.out.print(n1+" "+ n2+" ");
    for(int i=2; i<input ; i++){
      n3 = n1 + n2;
      System.out.print(n3+" ");
      n1 = n2;
      n2 = n3 ;
    }
  }

  private static String isPrimeNumber(int number){

    if(number<2){
      return "Please enter valid prim number";
    }
    for(int i = 2; i<number; i++){
      if(0 == number%i){
        return number + " is not a prime number";
      }
    }
    return number+" is a Prime Number.";
  }

  private static String verifyPalindrome(long number){
    long reversNumber = 0;
    long holder = number;
    while(0 != holder){
      reversNumber = reversNumber*10+holder%10;
      holder = holder/10;
    }
    if(reversNumber == number){
       return number + " is a Palindrome number";
    }
    return number + " is not Palindrome number";
  }

  private static String verifyArmstrongNumber(int number){
    int value = 0;
    int holder = number;
    int power = String.valueOf(number).length();
    while(0 != holder){
      value = value + (int)Math.pow((holder%10),power);
      holder = holder/10;
    }
    if(number == value){
      return number+" is a armstrong number.";
    }
    return number+" is not a armstrong number.";
  }

  private static String factorial(int number){
    int sum = 1;
    if(number ==0){
      return "Not a valid number.";
    }
    for(int i=number; i!= 0;i--){
      sum = sum*i;
    }
    return "Factorial of "+number +" is " +sum;
  }

  private static void bubbleSort(int array[]){
    System.out.println("\narray as received:");
    for(int i =0; i<array.length; i++) {
      System.out.print(" " + array[i]);
    }

    for(int i= 0; i<array.length; i++){
      for(int j= 0; j<array.length-i-1; j++){
        if(array[j]>array[j+1]){
          array[j] = array[j]+array[j+1];
          array[j+1] = array[j]-array[j+1];
          array[j] = array[j]-array[j+1];
        }
      }
    }
    System.out.println("\narray after bubble sorting:");
    for(int i =0; i<array.length; i++) {
      System.out.print(" " + array[i]);
    }
  }


  private static void selectionSort(int array[]){
    System.out.println("\narray as received:");
    for(int i =0; i<array.length; i++) {
      System.out.print(" " + array[i]);
    }

    for(int i=0; i<array.length;i++){
      int position = i;
      for(int j= i; j<array.length;j++){
        if(array[position]>array[j]){
           position = j;
        }
      }

      if(position!=i) {
        array[position] = array[i] + array[position];
        array[i] = array[position] - array[i];
        array[position] = array[position] - array[i];
      }
    }

    System.out.println("\narray after bubble sorting:");
    for(int i =0; i<array.length; i++) {
      System.out.print(" " + array[i]);
    }
  }

  private static void insertionSort(int array[]){
    System.out.println("\narray as received:");
    for(int i =0; i<array.length; i++) {
      System.out.print(" " + array[i]);
    }
    for(int i=0; i<array.length-1;i++){
      if(array[i]>array[i+1]){
        int index = i+1;
        for(int j=index; j>0; j--){
          if(array[index] < array[j]){
            int temp = array[index];
            array[index] = array[j];
            array[j] = temp;
            index = j;
          }
        }
      }
    }

    System.out.println("\narray after bubble sorting:");
    for(int i =0; i<array.length; i++) {
      System.out.print(" " + array[i]);
    }
  }
}

