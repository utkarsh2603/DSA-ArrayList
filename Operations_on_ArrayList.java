import java.util.ArrayList;

public class Operations_on_ArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();

        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get operation
        int element=list.get(3);
        System.out.println(element);

        //remove operation
        list.remove(3);
        System.out.println(list);

        //set operation
        list.set(1, 9);
        System.out.println(list);

        //contains operations
        System.out.println(list.contains(5));
        System.out.println(list.contains(11));

        //size operation
        System.out.println("The size of arraylist is: "+list.size());

        //iteration
        for(int i=0;i< list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}