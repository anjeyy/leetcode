package org.perisic.leetcode.easy;

public class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    /**
     * https://leetcode.com/problems/design-parking-system/
     */

    public static void main(String[] args) {

        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println("## " + parkingSystem.addCar(1));
        System.out.println("## " + parkingSystem.addCar(2));
        System.out.println("## " + parkingSystem.addCar(3));
        System.out.println("## " + parkingSystem.addCar(1));
    }


    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    protected boolean addCar(int carType) {

        switch (carType) {
            case 1:
                if (big > 0) {
                    big--;
                    return true;
                }
                break;
            case 2:
                if (medium > 0) {
                    medium--;
                    return true;
                }
                break;
            case 3:
                if (small > 0) {
                    small--;
                    return true;
                }
                break;
            default:
                // return type needed anyway
        }
        return false;
    }
}
