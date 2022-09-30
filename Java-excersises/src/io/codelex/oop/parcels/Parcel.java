package io.codelex.oop.parcels;

public class Parcel implements Validatable{
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
    final int MAX_DIMENSION_SIZE = 30;
    final int EXPRESS_WEIGHT = 15;
    final int STANDARD_WEIGHT = 30;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        return areTotalDimensionsValid() && doEachLengthFits() && isWeightSmallEnough();
    }

    private boolean areTotalDimensionsValid() {
        if (xLength + yLength + zLength <= 300) {
            return true;
        } else {
            System.out.println("Total size exceeds the limitation");
            return false;
        }
    }

    private boolean doEachLengthFits() {
        if (xLength <= MAX_DIMENSION_SIZE && yLength <= MAX_DIMENSION_SIZE && zLength <= MAX_DIMENSION_SIZE) {
            return true;
        } else {
            System.out.println("Each dimension should be less that " + MAX_DIMENSION_SIZE);
            return false;
        }
    }

    private boolean isWeightSmallEnough() {
        boolean isLightEnough = false;
        if (isExpress) {
            if (weight <= EXPRESS_WEIGHT) {
                isLightEnough = true;
            } else {
                System.out.println("Weight is too much for express parcel");
            }
        } else if (weight <= STANDARD_WEIGHT) {
            isLightEnough = true;
        } else {
            System.out.println("Weight is too much for standard parcel");
        }
        return isLightEnough;
    }
}
