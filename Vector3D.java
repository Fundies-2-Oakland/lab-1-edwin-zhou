public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString() {
        String myStr = "(%.2f, %.2f, %.2f)";
        return String.format(myStr, x, y, z);
    }

    public static void main(String[] args) {
        var x = new Vector3D(12.9817, 17.139084, 6.190827);

        System.out.println("this is the x component: " + x.getX());
        System.out.println("this is the y component: " + x.getY());
        System.out.println("this is the z component: " + x.getZ());
        System.out.println("this is the 3D vector rounded to two decimal places: " + x);
    }
}
