package ShutTheBox;
import java.util.ArrayList;
import java.util.Random;

public class Roll {
    private double r1;
    private double r2;
    private double r;
    private ArrayList<Double> reNums;

    public Roll()
    {
        r1 = Math.floor(Math.random() * 5)+1;
        r2 = Math.floor(Math.random() * 5)+1;
    }
    public Roll(ArrayList<Double> aReNums)
    {
        r1 = Math.floor(Math.random() * 5)+1;
        r2 = Math.floor(Math.random() * 5)+1;
        reNums = aReNums;
    }

    public ArrayList<Double> findNums()
    {
        return new Algorithm(r1+r2,reNums).getNums();
    }

/*public static void main(String[] args) {
    Roll r = new Roll();
    double[] n = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
    Roll r2 = new Roll(n);
    System.out.println(r2.r1);
    System.out.println(r2.r2);
    double[] rolls = r2.findNums();
    for(int i=0;i<rolls.length;i++)
    {
        System.out.println(rolls[i]);
    }
}*/
}