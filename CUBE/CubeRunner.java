package CUBE;

public class CubeRunner {
    public static void main(String[]args){
        Cube c=new Cube(3);
        System.out.println("the surface area is "+c.surfaceArea());
        System.out.println("the volume is "+c.volume());
        Cube n=new Cube(5);
        System.out.println("the side is now "+n.getSide());
        System.out.println("the surface area is now "+n.surfaceArea());
    }

}
