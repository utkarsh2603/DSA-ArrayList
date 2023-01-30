import java.util.ArrayList;
import java.util.Collections;

public class Sorting_an_ArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(56);
        list.add(43);
        list.add(67);
        list.add(89);
        list.add(62);

        //in ascending order
        //Collections.sort(list);

        //in desecending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
