package exercise.point2d_3d;

public class Point2D {
    private float x ;
    private float y;
    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arr = {getX(),getY()};
        return arr;
    }
    public void show (){
        System.out.println("hellocha");

    }
    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
