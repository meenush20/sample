package org.examples;

public class FibonacciSeries {

  public static void main(String[] args) {
    String fibonacciLength = args.length > 0 ? args[0] : "10";
    int fibonacciSeriesLength = Integer.parseInt(fibonacciLength);
    FibonacciSeries fibonacciSeries = new FibonacciSeries();
    fibonacciSeries.printFibonacciSeries(fibonacciSeriesLength);
  }


  protected void printFibonacciSeries(int length) {
    int startNumber = 0;
    int nextNumber = 1;
    int temp;
    System.out.print(startNumber + " ");
    for (int i = 0; i < length; i++) {
      System.out.print(nextNumber + " ");
      temp=startNumber;
      startNumber = nextNumber;
      nextNumber += temp;

    }
  }
}