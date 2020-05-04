/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

/**
 *
 * @author abdo
 */
public final class Fan {

    final static int SLOW = 1;
    final static int MID = 2;
    final static int FAST = 3;
    final static boolean FAN_ON = true;
    final static boolean FAN_off = false;

    private int speed;
    private boolean on;
    private double redius;
    private String color;

    public Fan() {
        this.setOn(Fan.FAN_off);
        this.setSpeed(Fan.SLOW);
        this.setRedius(5);
        this.setColor("blue");
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the on
     */
    public boolean isOn() {
        return on;
    }

    /**
     * @param on the on to set
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        if (this.on == false) {
            return "Fan{" + "speed=" + speed + ", redius=" + redius + ", color=" + color + '}'+"\nFan is off";
        }

        return "Fan{" + "speed=" + speed + "redius=" + redius + ", color=" + color + '}';
    }

}
