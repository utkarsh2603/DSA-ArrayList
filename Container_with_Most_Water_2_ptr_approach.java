import java.util.ArrayList;

public class Container_with_Most_Water_2_ptr_approach {
    public static int storedWater(ArrayList<Integer> height)
    {
        int lp=0;
        int rp=height.size()-1;
        int maxArea=0;
        while(lp<rp)
        {
            int hp=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currArea=hp*width;
            maxArea=Math.max(currArea,maxArea);

            if(height.get(lp)<height.get(rp))
            {
                lp++;
            }
            else
                rp--;
        }
        return maxArea;
    }
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(30);
        height.add(4);
        height.add(80);
        height.add(3);
        height.add(7);

        int max=storedWater(height);
        System.out.println(max);
    }
}
