package ShutTheBox;

import java.util.ArrayList;

public class Algorithm {
    private ArrayList<Double> numsToKnock;

    public Algorithm(double roll, ArrayList<Double> reNums)
    {
        System.out.println("ROLL: "+roll);
        System.out.println(reNums.toString());
        numsToKnock = new ArrayList();
        if(roll<=9)
        {
            for(int i=reNums.size()-1;i>=0;i--)
            {
                //System.out.println(reNums.get(i));
                if(reNums.get(i)==roll)
                {
                    numsToKnock.add(reNums.get(i));
                    i = 0;
                }
            }
        }
        for(int i=reNums.size()-1;i>=0;i--)
        {
            for(int j=reNums.size()-1;j>=0;j--)
            {
                if(reNums.get(i)+reNums.get(j)==roll && i!=j)
                {
                    if(Math.random()>=.5)
                    {
                        numsToKnock.clear();
                        numsToKnock.add(reNums.get(i));
                        numsToKnock.add(reNums.get(j));
                    }
                    i = 0;
                    j = 0;
                }
            }
        }
        if(numsToKnock.isEmpty())
        {
            for(int i=reNums.size()-1;i>=0;i--)
            {
                for(int j=reNums.size()-1;j>=0;j--)
                {
                    for(int k=reNums.size()-1;k>=0;k--)
                    {
                        if(reNums.get(i)+reNums.get(j)+reNums.get(k)==roll && i!=j && i!=k && j!=k)
                        {
                            numsToKnock.add((double) (i+1));
                            numsToKnock.add((double) (j+1));
                            numsToKnock.add((double) (k+1));
                            i = 0;
                            j = 0;
                            k = 0;
                        }
                    }
                }
            }
        }
        if(numsToKnock.isEmpty())
        {
            for(int i=reNums.size()-1;i>=0;i--)
            {
                for(int j=reNums.size()-1;j>=0;j--)
                {
                    for(int k=reNums.size()-1;k>=0;k--)
                    {
                        for(int l=reNums.size()-1;l>=0;l--)
                        {
                            if(reNums.get(i)+reNums.get(j)+reNums.get(k)==roll && i!=j && i!=k && j!=k)
                            {
                                numsToKnock.add((double) (i+1));
                                numsToKnock.add((double) (j+1));
                                numsToKnock.add((double) (k+1));
                                numsToKnock.add((double) (l+1));
                                i = 0;
                                j = 0;
                                k = 0;
                                l = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    public ArrayList<Double> getNums()
    {
        return numsToKnock;
    }
}
