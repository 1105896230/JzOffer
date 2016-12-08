/**
 * Created by Administrator on 2016/12/8.
 */
public class fouty_eight {
    boolean flag = false;
    public int StrToInt(String str) {
        if(str ==null ||str.length()==0){
            flag = true;
            return 0;
        }
        char [] strs = str.toCharArray();
        boolean minus = false;
        int start = 0;
        if(strs[start]=='-'){
            minus = true;
            start++;
        }else if(strs[start]=='+'){
            start++;
        }
        for(int i=start;i<str.length();i++){
            if(strs[i]<'0' || strs[i]>'9'){
                flag = true;
                return 0;
            }
        }
        int num = strToInt(strs,start);
        if(minus)
            num=-num;
        return num;
    }
    private int strToInt(char[] strs, int start) {
        int n = 0;
        for(int i=start;i<strs.length;i++){
            n=n*10+strs[i]-'0';
        }
        return n;
    }
}
