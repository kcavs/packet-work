package DICE;

public class Dice100 {
    public static void main(String[]args){
        int s=0;
        int t=0;
        for(int i=1;100>=i;i++){
            Dice d= new Dice();
            d.roll();
            int n= d.getTotal();
            if((n==7)||(n==11)){
                s+=1;
            }
            if(((n==2)||(n==3))||(n==12)){
                t+=1;
            }
        }
        int p1=100-(100-s);
        int p2=100-(100-t);
        System.out.println("you rolled 7 or 11 "+p1+"% of the time");
        System.out.println("you rolled 2, 3, or 12 "+p2+"% of the time");
    }
}
