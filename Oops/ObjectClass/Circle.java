package Oops.ObjectClass;

public class Circle {
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }

    @Override
    public boolean equals(Object arg){
        if(!(arg instanceof Circle)) return false;
        return radius == ((Circle)arg).radius;
    }
}
