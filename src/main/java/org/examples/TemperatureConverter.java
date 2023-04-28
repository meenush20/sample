package org.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureConverter {

  public static void main(String[] args) throws IOException {
    // Enter data using BufferReader
    String[] input = readUserInput();
    while (input.length < 2) {
      readUserInput();
    }
    TemperatureConverter converter = new TemperatureConverter();
    converter.convert(input);
  }

  protected double convert(String[] input) {
    if ("C".equalsIgnoreCase(input[1])) {
      return convertToFahrenheit(Double.parseDouble(input[0]));

    }
    return convertToCelsius(Double.parseDouble(input[0]));
  }

  private static String[] readUserInput() throws IOException {
    System.out.println("Please provide temperature as:");
    System.out.println("Example1: 41 C");
    System.out.println("Example2: 20 F");
    System.out.print("Enter:");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input[] = reader.readLine().trim().split(" ");
    return input;
  }


  private static double convertToCelsius(double temperatureInFahrenheit) {
    double temperatureInCelsius = ((temperatureInFahrenheit - 32) * (5.0 / 9.0));
    System.out.println("Temperature in Celsius is:" + temperatureInCelsius);
    return temperatureInCelsius;
  }

  private static double convertToFahrenheit(double temperatureInCelsius) {
    double temperatureInFahrenheit = ((9.0 / 5.0) * temperatureInCelsius + 32);
    System.out.println("Temperature in Fahrenheit is:" + temperatureInFahrenheit);
    return temperatureInFahrenheit;
  }
}
