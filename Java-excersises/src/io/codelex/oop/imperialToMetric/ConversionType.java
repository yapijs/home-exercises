package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;
import java.math.MathContext;


public enum ConversionType {
    METERS_TO_YARDS {
        @Override
        public double convert(double value) {
            return BigDecimal.valueOf(value)
                    .multiply(BigDecimal.valueOf(1.094), new MathContext(precision))
                    .doubleValue();
        }
    },

    YARDS_TO_METERS {
        @Override
        public double convert(double value) {
            return BigDecimal.valueOf(value)
                    .divide(BigDecimal.valueOf(1.094), new MathContext(precision))
                    .doubleValue();
        }
    },

    CENTIMETERS_TO_INCHES {
        @Override
        public double convert(double value) {
            return BigDecimal.valueOf(value)
                    .divide(BigDecimal.valueOf(2.54), new MathContext(precision))
                    .doubleValue();
        }
    },

    INCHES_TO_CENTIMETERS {
        @Override
        public double convert(double value) {
            return BigDecimal.valueOf(value)
                    .multiply(BigDecimal.valueOf(2.54), new MathContext(precision))
                    .doubleValue();
        }
    },
    KILOMETERS_TO_MILES {
        @Override
        public double convert(double value) {
            return BigDecimal.valueOf(value)
                    .divide(BigDecimal.valueOf(1.609), new MathContext(precision))
                    .doubleValue();
        }
    },
    MILES_TO_KILOMETERS {
        @Override
        public double convert(double value) {
            return BigDecimal.valueOf(value)
                    .multiply(BigDecimal.valueOf(1.609), new MathContext(precision))
                    .doubleValue();
        }
    };

    public abstract double convert(double value);

    static final int precision = 4;
}
