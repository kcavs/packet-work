package DICE;

public class Dice {
    private int die1,die2;
    public Dice(){
        die1= 1;
        die2= 1;
    }
    public void roll(){
        die1=(int) (Math.random()*6)+1;
        die2=(((int)Math.random()*6)+1);
    }
    public int getTotal(){
        int t=die1+die2;
        return t;
    }
}
