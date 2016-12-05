/**
 * Created by Administrator on 2016/12/5.
 */
public class thrity_six{
    public static void main(String[] args) {

    }
    public int InversePairs(int [] array) {
        if(array==null||array.length==0)
        {
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            copy[i] = array[i];
        }
        int count = InversePairsCore(array,copy,0,array.length-1);//数值过大求余
        return count;

    }

    private int InversePairsCore(int[] array, int[] copy, int start, int end) {
        if (start==end){
            copy[start]=array[start];
            return 0;
        }
        int length=(end-start)/2;
        int left=InversePairsCore(copy,array,start,start+length);
        int right=InversePairsCore(copy,array,start+length+1,end);
        int i=start+length;
        int j=end;
        int indexCopy=end;
        int count=0;
        while (i>start&&j>=start+length+1){
            if (array[i]>array[j]){
                copy[indexCopy--]=array[i--];
                count+=j-start-length;
            }else {
                copy[indexCopy--]=array[j--];
            }
        }
        for (;i>=start;--i){
            copy[indexCopy--]=array[i];
        }
        for (; j>=start+length+1;--j){
            copy[indexCopy--]=array[j];
        }
        return left+right+count;
    }
}

