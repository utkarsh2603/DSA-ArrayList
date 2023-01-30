import java.util.ArrayList;

public class Max_In_an_ArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(56);
        list.add(43);
        list.add(67);
        list.add(89);
        list.add(62);
        int max=Integer.MIN_VALUE;

        for(int i=0;i< list.size();i++)
        {
            if(max<list.get(i))
            {
                max= list.get(i);
            }
        }
        System.out.println(max);

    }
}
