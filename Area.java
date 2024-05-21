class Area {
    private double length;
    private double breadth;

    // Method to set dimensions of the rectangle
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double getArea() {
        return length * breadth;
    }
}

public class Main {
    public static void main(String args[]) {
    
        Area rectangle = new Area();

        rectangle.setDim(5.0, 3.0);

        
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
