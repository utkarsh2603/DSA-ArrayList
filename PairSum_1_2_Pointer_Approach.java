import java.util.ArrayList;

public class PairSum_1_2_Pointer_Approach
{

        public static boolean pairSum1(ArrayList<Integer> list,int target)
        {
            int lp=0;
            int rp=list.size()-1;
            while(lp!=rp) {

                if (list.get(lp) + list.get(rp) == target) {
                    return true;
                }
                if (list.get(lp) + list.get(rp) < target) {
                    lp++;
                } else
                    rp--;
            }
                return false;
        }
    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        int target=6;

        System.out.println(pairSum1(height,target));
    }

}
