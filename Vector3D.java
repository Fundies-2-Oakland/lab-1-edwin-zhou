public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void getX() {
        System.out.println(x);
    }

    public void getY() {
        System.out.println(y);
    }

    public void getZ() {
        System.out.println(z);
    }

    public String toString() {
        String myStr = "(%.2f, %.2f, %.2f)";
        String result = String.format(myStr, x, y, z);
        System.out.println(result);
        return result;
    }
    
    public static void main(String[] args) {
        var x = new Vector3D(12.9817, 17.139084, 6.190827);

        x.getX();
        x.getY();
        x.getZ();
        x.toString();
    }
}
