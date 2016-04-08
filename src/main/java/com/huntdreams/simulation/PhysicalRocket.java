package com.huntdreams.simulation;

/**
 * PhysicalRocket
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/8/16 12:38 PM.
 */
public class PhysicalRocket {
    private double burnArea;
    private double burnRate;
    private double fuelMass;
    private double totalMass;

    public PhysicalRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        this.burnArea = burnArea;
        this.burnRate = burnRate;
        this.fuelMass = fuelMass;
        this.totalMass = totalMass;
    }

    public double getBurnArea() {
        return burnArea;
    }

    public double getBurnTime() {
        return burnRate;
    }

    public double getFuelMass() {
        return fuelMass;
    }

    public double getTotalMass() {
        return totalMass;
    }
}
