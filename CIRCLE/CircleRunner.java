package CIRCLE;

public class CircleRunner {
    public static void main(String[]args){
        Circle tushi= new Circle(3);
        System.out.println(tushi.getC());
        System.out.println(tushi.getArea());
        tushi.changeR(1);
        System.out.println(tushi.getArea());
    }


}
