package io.codelex.oop.imperialToMetric;

import static io.codelex.oop.imperialToMetric.ConversionType.*;

public class Test {
    public static void main(String[] args) {
        double val = METERS_TO_YARDS.convert(1);
        System.out.println(val);
        System.out.println(CENTIMETERS_TO_INCHES.convert(100));
        System.out.println(CENTIMETERS_TO_INCHES);

        System.out.println("====================");
        MeasurementConverter converter = new MeasurementConverter();
        System.out.println(converter.convert(100, MILES_TO_KILOMETERS));
        System.out.println(converter.convert(100, KILOMETERS_TO_MILES));
        System.out.println(converter.convert(10, INCHES_TO_CENTIMETERS));
        System.out.println(converter.convert(10.57, METERS_TO_YARDS));

    }
}
