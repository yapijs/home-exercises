package io.codelex.oop.cars;

public enum Operator {
    LESS_THAN {
        public boolean compareYear(Manufacturer manufacturer, int year) {
            return manufacturer.getYearOfEstablishment() < year;
        }
    },
    GREATER_THAN {
        public boolean compareYear(Manufacturer manufacturer, int year) {
            return manufacturer.getYearOfEstablishment() > year;
        }
    },

    GREATER_THAN_EQUALS {
        public boolean compareYear(Manufacturer manufacturer, int year) {
            return manufacturer.getYearOfEstablishment() >= year;
        }
    },

    LESS_THAN_EQUALS {
        public boolean compareYear(Manufacturer manufacturer, int year) {
            return manufacturer.getYearOfEstablishment() <= year;
        }
    },

    EQUALS {
        public boolean compareYear(Manufacturer manufacturer, int year) {
            return manufacturer.getYearOfEstablishment() == year;
        }
    },

    NOT_EQUALS {
        public boolean compareYear(Manufacturer manufacturer, int year) {
            return manufacturer.getYearOfEstablishment() != year;
        }
    };

    public abstract boolean compareYear(Manufacturer manufacturer, int year);
}