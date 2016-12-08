import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/8.
 */
public class fouty_four {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length != 5) {
            return false;
        }
        // 对元素进行排序
        Arrays.sort(numbers);
        int numberOfZero = 0;
        int numberOfGap = 0;
        for (int i = 0; i < numbers.length && numbers[i] == 0; i++) {
            numberOfZero++;
        }
        // 第一个非0元素的位置
        int small = numberOfZero;
        int big = small + 1;
        while (big < numbers.length) {
            if (numbers[small] == numbers[big]) {
                return false;
            }
            numberOfGap += (numbers[big] - numbers[small] - 1);
            small = big;
            big++;
        }
        return numberOfGap <= numberOfZero;
    }

}
