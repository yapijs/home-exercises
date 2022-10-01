package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {

    static double areaOfCircle(BigDecimal radius) {
        BigDecimal area = radius.pow(2).multiply(BigDecimal.valueOf(Math.PI));
        return area.doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {
        BigDecimal area = length.multiply(width);
        return area.doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        BigDecimal area = base.multiply(h).multiply(BigDecimal.valueOf(0.5));
        return area.doubleValue();
    }
}
