import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/12/1.
 */
public class thirty {
    public ArrayList GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList aList = new ArrayList();
        if(input.length == 0 || k > input.length || k <= 0)
            return aList;
        int low = 0;
        int high = input.length-1;
        int index = Partition(input,k,low,high);
        while(index != k-1){
            if (index > k-1) {
                high = index-1;
                index = Partition(input,k,low,high);
            }else{
                low = index+1;
                index = Partition(input,k,low,high);
            }
        }
        for (int i = 0; i < k; i++)
            aList.add(input[i]);
        return aList;
    }

    int Partition(int[] input,int k,int low,int high){
        int pivotkey = input[k-1];
        swap(input,k-1,low);
        while(low < high){
            while(low < high && input[high] >= pivotkey)
                high--;
            swap(input,low,high);
            while(low < high && input[low] <= pivotkey)
                low++;
            swap(input,low,high);
        }
        return low;
    }


    private void swap(int[] input, int low, int high) {
        int temp = input[high];
        input[high] = input[low];
        input[low] = temp;
    }

    public ArrayList<Integer> GetLeastNumbers_Solution1(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        if(input==null||input.length==0||k==0||k>input.length)
            return list;
        TreeSet<Integer> set=new TreeSet<Integer>();
        for(int i=0;i<input.length;i++){
            set.add(input[i]);
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int x=it.next();
            list.add(x);
        }
        for(int i=0;i<k;i++){
            list2.add(list.get(i));
        }
        return list2;
    }
}
