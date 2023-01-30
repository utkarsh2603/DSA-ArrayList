import java.util.ArrayList;

public class PairSum_2_Sorted_and_rotated_arraylist
{

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

            int n = list.size();
            int lp = bp + 1;
            int rp = bp;
            while (lp != rp) {

                if (list.get(lp) + list.get(rp) == target) {
                    return true;
                }
                if (list.get(lp) + list.get(rp) < target) {
                    lp = (lp + 1) % n;
                } else
                    rp = (n + rp - 1) % n;
            }

        return false;
    }
        public static void main(String args[]) {
            ArrayList<Integer> height = new ArrayList<>();
            height.add(4);
            height.add(5);
            height.add(1);
            height.add(2);
            height.add(3);
            int target=78;

            System.out.println(pairSum2(height,target));
        }

    }

