package ShutTheBox;

import java.util.ArrayList;

public class ShutTheBox {
    private Roll r;
    private ArrayList<Double> reNums;
    private boolean playing;

    public ShutTheBox()
    {
        reNums = new ArrayList();
        reNums.add(0,1.0);
        reNums.add(1,2.0);
        reNums.add(2,3.0);
        reNums.add(3,4.0);
        reNums.add(4,5.0);
        reNums.add(5,6.0);
        reNums.add(6,7.0);
        reNums.add(7,8.0);
        reNums.add(8,9.0);
        playing = true;
        while(playing)
        {
            Roll roll = new Roll(reNums);
            ArrayList<Double> knocks = roll.findNums();
            if(knocks.isEmpty())
            {
                print();
                break;
            }
            for(int i=0;i<knocks.size();i++)
            {
                System.out.println("REMOVAL: "+knocks.get(i));
                reNums.remove(knocks.get(i));
            }
            if(reNums.size()==0)
            {
                playing=false;
                System.out.println("You Shut The Box!");
                break;
            }
        }
    }

    public void print()
    {
        playing=false;
        System.out.println("Your number is: ");
        for(int i=0;i<reNums.size();i++)
        {
            int n = (int) Math.round(reNums.get(i));
            System.out.print(n);
        }
    }
    public static void main(String[] args) {
        ShutTheBox s = new ShutTheBox();
    }
}
