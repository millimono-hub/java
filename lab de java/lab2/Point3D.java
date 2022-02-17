//package com.company;

public class Point3D extends Point2D{

    private double zCoord;

    public Point3D(double x , double y ,double z) {
        this.setX(x);
        this.setY(y);
        this.zCoord = z;
    }
    public Point3D() { this(0, 0, 0); }

    public double getZ () {return zCoord; }

    public void setZ (double val) { zCoord = val ;}

    public double distanceTo (Point3D otherPoint){
        return Math.floor(100 * Math.sqrt(
                        (getX() - otherPoint.getX()) * (getX() - otherPoint.getX()) +
                        (getY() - otherPoint.getX()) * (getX() - otherPoint.getX()) +
                        (zCoord - otherPoint.getZ()) * (getX() - otherPoint.getZ()) )) / 100 ;
    }

    public boolean equalsTo (Point3D otherPoint){
        return (getX() == otherPoint.getX() &&
                getY() == otherPoint.getY() &&
                zCoord == otherPoint.getZ());
    }
}
