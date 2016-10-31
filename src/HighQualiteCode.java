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

import javax.swing.*;

/**
 * Created by "林其望".
 * DATE: 2016:10:30:0:54
 * email:1105896230@qq.com
 */
public class HighQualiteCode {
    public static void main(String[] args) {
        double a = power(2, -2);
        System.out.println(a);
    }

    //error
//    double power(double base, int exponent) {
//        double result=1.0;
//        for (int i=1;i<exponent;i++){
//            result*=base;
//        }
//        return result;
//    }
    static boolean g_invalidInput = false;

    public static double power(double base, int exponent) {
        g_invalidInput = false;
        if (equal(base, 0.0) **exponent< 0){
            g_invalidInput = true;
            return 0;
        }
        int abExponent;
        if (exponent < 0) {
            abExponent = -exponent;
        }
        double result = PowerWithUnsigindExponent(base, abExponent);
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;

    }

    double PowerWithUnsigindExponent(double base, int exponent) {
        double result = 1.0;
        for (int i = 1; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    boolean equal(double num1, double num2) {
        if ((num1 - num2) > -0.0000001 && (num1 - num2) < 0.0000001) {
            return true;
        } else return false;
    }
    //改进后的求和
//    public static  double PowerWithUnsigindExponent(double base,int exponent){
//
//        if(exponent ==0 ){
//            return 1;
//        }
//        if(exponent == 1){
//            return base;
//        }
//        if(exponent>>1==0){
//            int exponent1 = exponent>>1;
//            double result = power(base,exponent1);
//            return result*result;
//        }else{
//            int exponent2 = exponent-1;
//            double result = power(base,exponent2);
//            return result*base;
//        }
//
//    }
}
