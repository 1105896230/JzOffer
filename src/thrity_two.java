
/**
 * Created by Administrator on 2016/12/1.
 */
public class thrity_two {

    public static void main(String[] args) {
        test(2593);
    }

    static int test(int n){
        int x=5;
        if(n<0||x<1||x>9)
            return 0;
        int high,low,curr,tmp,i = 1;
        high = n;
        int total = 0;
        while(high!=0){
            high = n/(int)Math.pow(10, i);// 获取第i位的高位
            tmp = n%(int)Math.pow(10, i);
            curr = tmp/(int)Math.pow(10, i-1);// 获取第i位
            low = tmp%(int)Math.pow(10, i-1);// 获取第i位的低位
            if(curr==x){
                total+= high*(int)Math.pow(10, i-1)+low+1;
            }else if(curr<x){
                total+=high*(int)Math.pow(10, i-1);
            }else{
                total+=(high+1)*(int)Math.pow(10, i-1);
            }
            i++;
        }
        return total;
    }

    int NumberOflBetweenlAndN(int n){
        int number=0;
        for(int i=1;i<=n;i++){
            number+=NumberOf(i);
        }
        return number;
    }

    private int NumberOf(int i) {
        int number=0;
        while (i!=0){
            if (i%10==1){
                i=i/10;
            }
        }
        return i;
    }
}
