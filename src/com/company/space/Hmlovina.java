package com.company.space;

public class Hmlovina {
    private long size ;
    private long livingTime;
    private int x, y, z;
    public Hmlovina() {
        size = 0;
        livingTime = 0;
        x = 0;
        y = 0;
        z = 0;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public long getSize() {
        return size;
    }
    public void setSize(long size) {
        this.size = size;
    }
    public long getLivingTime() {
        return livingTime;
    }
    public void setLivingTime(long livingTime) {
        this.livingTime = livingTime;
    }
}
