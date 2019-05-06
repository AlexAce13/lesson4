public class Triangle {

    public static void main(String[] args){
        Triangle triangle1 = new Triangle(6,4);
        Triangle triangle2 = new Triangle();

        System.out.println("Периметр прямокутного трикутника = " + triangle1.trianglePerimeter(triangle1));
        System.out.println("Площа прямокутного трикутника = " + triangle1.triangleSquare(triangle1));

        triangle2.side1 = 6;
        triangle2.side2 = 6;

        System.out.println("Периметр прямокутного трикутника = " + triangle2.trianglePerimeterDefault(triangle2.side1, triangle2.side2));
        System.out.println("Площа прямокутного трикутника = " + triangle2.triangleSquareDefault(triangle2.side1, triangle2.side2));

    }

    int side1;
    int side2;

    public Triangle() {

    }

    public Triangle(int x, int y) {
        side1 = x;
        side2 = y;
    }

    public double triangleSquare(Triangle triangle){
//        Triangle triangle = new Triangle(x,y);
        double square;
        square = (triangle.side1 * triangle.side2) / 2;
        return square;
    }
    public double trianglePerimeter(Triangle triangle){
//        Triangle triangle = new Triangle(10,20);
        double hypotenuse;
        double perimeter;
        hypotenuse = Math.sqrt(Math.pow(triangle.side1, 2) + Math.pow(triangle.side2, 2));
        perimeter = triangle.side1 + triangle.side2 + hypotenuse;
        return perimeter;
    }

    public double trianglePerimeterDefault(int x, int y){
        Triangle triangle = new Triangle();
        triangle.side1 = x;
        triangle.side2 = y;
        double hypotenuse;
        double perimeter;
        hypotenuse = Math.sqrt(Math.pow(triangle.side1, 2) + Math.pow(triangle.side2, 2));
        perimeter = triangle.side1 + triangle.side2 + hypotenuse;
        return perimeter;
    }

    public double triangleSquareDefault(int x, int y){
        Triangle triangle = new Triangle();
        double square;
        triangle.side1 = x;
        triangle.side2 = y;
        square = (triangle.side1 * triangle.side2) / 2;
        return  square;
    }

}
