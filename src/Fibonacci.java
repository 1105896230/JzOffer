//                  /+++=))    ((=+++\
//             /++++++++//      \\+++++++++\
 /*
                           _ooOoo_
                          o8888888o
                          88" . "88
                          (| -_- |)
                          O\  =  /O
                       ____/`---'\____
                     .'  \\|     |//  `.
                    /  \\|||  :  |||//  \
                   /  _||||| -:- |||||-  \
                   |   | \\\  -  /// |   |
                   | \_|  ''\---/''  |   |
                   \  .-\__  `-`  ___/-. /
                 ___`. .'  /--.--\  `. . __
              ."" '<  `.___\_<|>_/___.'  >'"".
             | | :  `- \`.;`\ _ /`;.`/ - ` : | |
             \  \ `-.   \_ __\ /__ _/   .-` /  /
        ======`-.____`-.___\_____/___.-`____.-'======
                           `=---='
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                 佛祖保佑       永无BUG
        */

/**
 * Created by "林其望".
 * DATE: 2016:10:29:20:36
 * email:1105896230@qq.com
 */
//斐波那契数列
public class Fibonacci {
    //效率最低的解法,递归的方式
    public long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //从后往前算
    public static long fibonaci(int n) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 1;
        if (n < 2) return result[n];
        long fibNMinusOne = 1;
        long fibNMinuesTwo = 2;
        long fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = fibNMinusOne + fibNMinuesTwo;
            fibNMinuesTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return fibN;
    }
}
