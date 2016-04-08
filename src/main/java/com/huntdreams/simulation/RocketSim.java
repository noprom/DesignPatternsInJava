package com.huntdreams.simulation;

/**
 * RocketSim
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 4/8/16 11:17 AM.
 */
public interface RocketSim {
    abstract double getMass();

    public double getThrust();

    void setSimTime(double t);
}
