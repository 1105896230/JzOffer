//                            _ooOoo_
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//  
//         .............................................  
//                  佛祖保佑             永无BUG  

//          佛曰:    
//                  写字楼里写字间，写字间里程序员；    
//                  程序人员写程序，又拿程序换酒钱。    
//                  酒醒只在网上坐，酒醉还来网下眠；    
//                  酒醉酒醒日复日，网上网下年复年。    
//                  但愿老死电脑间，不愿鞠躬老板前；    
//                  奔驰宝马贵者趣，公交自行程序员。    
//                  别人笑我忒疯癫，我笑自己命太贱；    
//                  不见满街漂亮妹，哪个归得程序员？   

import java.util.Arrays;

/**
 * Created by Administrator on 2016/10/31.
 * email 1105896230@qq.com
 */
//输入数字n,按顺序打印出从1最大的n位十进制数。比如输入3，则打印出1、2、3一直到最大的3位数即999
public class twelve {
    public static void main(String[] args) {
        printToMax2(3);
    }
    //error
    void PrintToMaxOfNDigits_1(int n){
        int number=1;
        int i=0;
        while (i++<n)
            number*=10;
        for (i=1;i<number;++i)
            System.out.println(i);
    }

    //正确写法
    public static   void printToMaxOfDigst(int n){
            if (n<=0){
            return;
        }
        char[] num = new char[n];
        for(int i = 0;i<n;i++){
            num[i] = '0';
        }
        while (!increment(num)){
            System.out.println(num);
        }
    }
    private static boolean increment(char[] num){
        boolean isOverflow = false;
        int size = num.length;
        int carry = 0;
        for(int i = size - 1; i >= 0; i--){
            int temp = num[i] - '0' + carry;
            if(i == size - 1)
                temp++;
            if(temp >= 10){
                if(i == 0) //最高位溢出
                    isOverflow = true;
                else{
                    temp -= 10;
                    carry = 1;
                    num[i] = (char) ('0' + temp);
                }
            }else{
                num[i] = (char)('0' + temp);
                break;
            }
        }
        return isOverflow;
    }
    public static void printNumber(char[] num){
        int size = num.length;
        int i = 0;
        while(i < size && num[i] == '0') //i < size在前，否则越界
            i++;
        if(i == size)//不打印全0
            return;
        char[] printNum = Arrays.copyOfRange(num, i, size);//复制数组
        System.out.println(printNum);
    }

    public static void printToMax2(int n){
        if(n <= 0) return;
        char[] number = new char[n];
        Arrays.fill(number, '0');
        printOrder(number,n,0);
    }
    public static void printOrder(char[] number, int n, int loc){
        if(loc == n) return;
        for(int i = 0; i <= 9; i++){
            number[loc] = (char)('0' + i);
            if(loc == n - 1){
                printNumber(number);
            }
            printOrder(number,n,loc + 1);
        }
    }
}
