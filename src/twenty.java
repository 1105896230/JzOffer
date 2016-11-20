import java.util.ArrayList;

/**
 * Created by FMT on 2016/11/20.
 */
//顺时针打印矩阵
public class twenty {

    public static void main(String[] args) {
        printMatrixClockwisely(null);
    }
    private static ArrayList<Integer> arrayList=new ArrayList<Integer>();
    static void printMatrixClockwisely(int[][] numbers) {
        numbers=new int[1][1];
        numbers[0][0]=1;
        if (numbers == null || numbers[0].length <= 0 ||  numbers.length <= 0) {
            return ;
        }
        int start = 0;
        while (numbers[0].length > start * 2 &&  numbers.length > start * 2) {
            printMatrixIncircle(numbers,  numbers[0].length, numbers.length, start);
            ++start;
        }
    }

    static   void printMatrixIncircle(int[][] numbers, int columns, int rows, int start) {
        int endX = columns - 1 - start;
        int endY = rows - 1 - start;
        for (int i = start; i <=endX; ++i) {
            int number=numbers[start][i];
            printNumber(number);
        }
        //从上打印到下
        if (start<endY){
            for (int i=start+1;i<=endY;++i){
                int number=numbers[i][endX];
                printNumber(number);
            }
        }
        //从右到左打印一行
        if (start<endX&&start<endY){
            for (int i=endX-1;i>=start;--i){
                int number=numbers[endY][i];
                printNumber(number);
            }
        }
        //从右到左打印一行
        if (start<endX&&start<endY-1){
            for (int i=endY-1;i>=start+1;--i){
                int number=numbers[i][start];
                printNumber(number);
            }
        }

    }
    static  void printNumber(int number){
        System.out.print(number);
    }
}
