package BOX;
public class BoxRunner {
    public static void main(String[]args){
        Box kiersten = new Box(2,6);
        System.out.println("the area is "+kiersten.getArea());
        kiersten.bigger(2);
        System.out.println("the perimeter is "+kiersten.getPerimeter());
    }
}
