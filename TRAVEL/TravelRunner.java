package TRAVEL;

public class TravelRunner {
    public static void main(String[]args){
        int num=6;
        for(int i=1;i<=21;i++){
            Travel t= new Travel(num);
            System.out.println("people= "+num+" vans= "+t.goByVan()+" canoes= "+t.goByCanoe()+" planes= "+t.goByPlane());
            num+=2;
        }
    }
}
