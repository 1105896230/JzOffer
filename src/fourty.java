/**
 * Created by Administrator on 2016/12/7.
 */
public class fourty {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null || array.length < 2) {
            return;
        }
        int resultExclusiveOR = 0;
        for (int i = 0; i < array.length; i++) {
            resultExclusiveOR ^= array[i];
        }
        int indexOf1 = FindFirstBitIs1(resultExclusiveOR);
        for (int j = 0; j < array.length; j++) {
            if (IsBit1(array[j], indexOf1)) {
                num1[0] ^= array[j];
            }
            else
                num2[0] ^= array[j];
        }

    }

    private int FindFirstBitIs1(int num) {
        int indexBit = 0;
        while (((num & 1) == 0) && (indexBit < 8 * 4)) {
            num = num >> 1;
            ++indexBit;
        }
        return indexBit;
    }

    private boolean IsBit1(int num, int indexBit) {
        num = num >> indexBit;
        return (num & 1) == 0? false:true;
    }
}
