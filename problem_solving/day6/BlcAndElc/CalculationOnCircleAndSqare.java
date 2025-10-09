public class CalculationOnCircleAndSqare {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Square s1=new Square();
        c1.setRadius(7);
        System.out.println("radius of circle:"+c1.getRadius());
        System.out.println("Diameter of circle:"+c1.DiameterOfCircle());
        System.out.println("perimeter Of Circle:"+c1.perimeterOfCircle());
        System.out.println("Area of circle:"+c1.areaOfCircle());

        System.out.println();
        s1.setSide(7);
        System.out.println("side of square:"+s1.getSide());
        System.out.println("Perimeter of square:"+s1.PerimeterOfSquare());
        System.out.println("area of square:"+s1.areOfSquare());
        
    }
}
