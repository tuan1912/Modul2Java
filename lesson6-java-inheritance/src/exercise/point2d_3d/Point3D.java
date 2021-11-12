package exercise.point2d_3d;

public class Point3D extends Point2D {
    private float z ;
    public Point3D(){
    }
    public Point3D(float x, float y, float z){
        setX(x);
        setY(y);
        this.z= z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[] {getX(),getY(),getZ()};
    }

    public void show (){
        System.out.println("hellocon");

    }
//    @Override
//    public String toString() {
//        return "Point3D{" +
//                "z=" + z +
//                '}';
//    }
}
