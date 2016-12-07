import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/7.
 */
public class fourty_one {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array == null || array.length < 2) {
            return list;
        }
        int i=0,j=array.length-1;
        while(i<j){
            if(array[i]+array[j]==sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }else if(array[i]+array[j]>sum){
                j--;
            }else{
                i++;
            }

        }
        return list;
    }

    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
        if(sum<3)return list;
        int s=(int) Math.sqrt(2*sum);
        for(int i=s;i>=2;i--)
        {
            if(2*sum%i==0)
            {
                int d=2*sum/i;
                if(d%2==0&&i%2!=0||d%2!=0&&i%2==0)
                {
                    int a1=(d-i+1)/2;
                    int an=(d+i-1)/2;
                    ArrayList<Integer>temp=new ArrayList<Integer>();
                    for(int j=a1;j<=an;j++)
                        temp.add(j);
                    list.add(temp);
                }
            }
        }
        return list;
    }
}
