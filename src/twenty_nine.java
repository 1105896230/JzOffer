import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/12/1.
 */
//数组出现次数超过一半的数字
public class twenty_nine {
    public static void main(String[] args) {

    }
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0 || array == null){
            return 0;
        }
        Arrays.sort(array);
        int mid = array[array.length/2];
        int j = 0;
        for (int i : array){

            if (i == mid){
                j++;
            }
        }
        return j > array.length/2 ? mid : 0;
    }
    public static int MpreThan(int [] array){
        if(array.length == 0 || array == null){
            return 0;
        }
        int result=array[0];
        int time=1;
        for (int i=1;i<array.length;i++){
            if (time==0){
                result=array[i];
                time++;
            }else if (array[i]==result){
                time++;
            }else {
                time--;
            }
        }
        if (check(array,result,array.length))
            result=0;
        return result;
    }

    private static boolean check(int[] numbers,int number,int length){
        int times=0;
        for (int i=0;i<length;++i){
            if (numbers[i]==number)
                times++;
        }
        boolean isMoreHalf=true;
        if (times*2<length){
            isMoreHalf=false;
        }
        return isMoreHalf;
    }
}
