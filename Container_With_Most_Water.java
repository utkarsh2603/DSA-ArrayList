import java.util.ArrayList;

public class Container_With_Most_Water {
    public static void main(String args[]) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        for (int i = 0; i < height.size(); i++)
        {
            for (int j =i+1; j < height.size(); j++)
            {
                int width=j-i;
                int hei=Math.min(height.get(i),height.get(j));
                int area=width*hei;
                if(max<area)
                {
                    max=area;
                }
            }

        }
        System.out.println(max);
    }
}
