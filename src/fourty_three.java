/**
 * Created by Administrator on 2016/12/7.
 */
public class fourty_three {
    public static void main(String[] args) {
        prointProbability(2);
    }
    static  int g_maxValue=6;
   static void prointProbability(int number){
        if (number<1)
            return;
        int maxSum=number*g_maxValue;
        int[] pProbabilities=new int[maxSum-number+1];
        for (int i=number;i<=maxSum;++i)
            pProbabilities[i-number]=0;
        Probability(number,pProbabilities);
       double total=  Math.pow((double) g_maxValue,number);
        for (int i=number;i<=maxSum;i++){
            double ratio=pProbabilities[i-number]/total;
            System.out.println(ratio);
        }
    }

    private static void Probability(int number, int[] pProbabilities) {
        for (int i=1;i<g_maxValue;i++){
            Probability(number,number,i,pProbabilities);
        }
    }

    private static void Probability(int original, int current, int sum, int[] pProbabilities) {
        if (current==1){
            pProbabilities[sum-original]++;
        }else {
            for(int i=1;i<=g_maxValue;i++){
                Probability(original,current-1,i+sum,pProbabilities);
            }
        }
    }
}
