/**
 * Created by Administrator on 2016/12/7.
 */
public class thrity_eight {
    public int GetNumberOfK(int [] array , int k) {
        int firstIndex = GetFirstIndex(array,k);
        int lastIndex = GetLastIndex(array,k);
        if(firstIndex != -1 && lastIndex != -1)
            return lastIndex - firstIndex + 1;
        return 0;
    }

    private int GetFirstIndex(int [] array , int k) {
        int left = 0;
        int right = array.length - 1;
        int firstIndex = -1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(array[mid] > k) {
                right = mid - 1;
            } else if(array[mid] < k) {
                left = mid + 1;
            } else {
                if(mid == 0 || array[mid - 1] != k) {
                    firstIndex = mid;
                    break;
                } else {
                    right = mid - 1;
                }
            }
        }
        return firstIndex;
    }

    private int GetLastIndex(int [] array , int k) {
        int left = 0;
        int right = array.length - 1;
        int lastIndex = -1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(array[mid] > k) {
                right = mid - 1;
            } else if(array[mid] < k) {
                left = mid + 1;
            } else {
                if(mid == array.length - 1 || array[mid + 1] != k) {
                    lastIndex = mid;
                    break;
                } else {
                    left = mid + 1;
                }
            }
        }
        return lastIndex;
    }
}
