package skillTest_V2.skillTest32;

public class Main1 {
    public static void main(String[] args) {
	double x = 1;
	double y = 2;
	double z = 3;
	Box box = new Box(x, y, z);
	System.out.println("体积：" + box.TiJi());
	System.out.println("表面积：" + box.BiaoMianJi());
    }
}

class Box {
    private double x;
    private double y;
    private double z;

    double TiJi() {
	return x * y * z;
    }

    double BiaoMianJi() {
	return (x * y + x * z + y * z) * 2;
    }

    public Box(double x, double y, double z) {
	super();
	this.x = x;
	this.y = y;
	this.z = z;
    }

    public double getX() {
	return x;
    }

    public void setX(double x) {
	this.x = x;
    }

    public double getY() {
	return y;
    }

    public void setY(double y) {
	this.y = y;
    }

    public double getZ() {
	return z;
    }

    public void setZ(double z) {
	this.z = z;
    }

}
