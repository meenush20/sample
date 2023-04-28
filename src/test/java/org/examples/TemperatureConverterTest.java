package org.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

  private final TemperatureConverter temperatureConverter = new TemperatureConverter();

  @Test
  void shouldConvertTemperatureFromCelsiusToFahrenheit() {
    double temperatureInFahrenheit = temperatureConverter.convert(new String[] {"20","C"});
    assertEquals(68, temperatureInFahrenheit);

    temperatureInFahrenheit = temperatureConverter.convert(new String[] {"33","c"});
    assertEquals(91.4, temperatureInFahrenheit);
  }

  @Test
  void shouldConvertTemperatureFromFahrenheitToCelsius() {
    double temperatureInFahrenheit = temperatureConverter.convert(new String[] {"32","F"});
    assertEquals(0, temperatureInFahrenheit);

    temperatureInFahrenheit = temperatureConverter.convert(new String[] {"101.3","f"});
    assertEquals(38.5, temperatureInFahrenheit);
  }
}
