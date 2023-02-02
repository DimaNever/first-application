package homework;

public class Task3 {
    public static void main(String[] args) {

        double areaFirstTriangle = areaTriangle(4,60);
        double areaSecondTriangle = areaTriangle(10, 4);
        comparison(areaFirstTriangle, areaSecondTriangle);
    }
    public static double areaTriangle(int a, int b){
        return (double) a * b / 2;
    }
    public static void comparison(double areaFirstTriangle, double areaSecondTriangle){
        if (areaFirstTriangle > areaSecondTriangle){
            System.out.println("The first triangle is larger than the second");
        } else if (areaFirstTriangle < areaSecondTriangle) {
            System.out.println("The first triangle is smaller than the second");
        } else {
            System.out.println("Triangles are equal");
        }
    }
}
