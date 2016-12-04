import java.util.ArrayList;

/**
 * Created by Administrator on 2016/12/4.
 */
public class thrity_four {
    int GerUglyNumber_Solution2(int index){
        if (index<=0)return 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        int count = 1;
        al.add(1);
        int min = 0;
        int m1 = 0, m3 = 0, m5 = 0;
        while(count < index){
            min = min(al.get(m1)*2, al.get(m3)*3, al.get(m5)*5);
            count++;
            al.add(min);
            if(min == al.get(m1)*2)
                m1++;
            if(min == al.get(m3)*3)
                m3++;
            if(min == al.get(m5)*5)
                m5++;
        }
        return al.get(index - 1);
    }

    int min(int number1,int number2,int number3){
        int min=(number1<number2)?number1:number2;
        min=(min<number3)?min:number3;
        return min;
    }
}
