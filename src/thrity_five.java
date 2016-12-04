/**
 * Created by Administrator on 2016/12/4.
 */
public class thrity_five {
    int FirstNotRepeatingChar(String str){
        if((str==null)||str.length()<0) return 0;
        int [] hash=new int[256];
        for(int i=0;i<256;i++){
            hash[i]=0;
        }
        for(int i=0,len=str.length();i<len;i++){
            hash[str.charAt(i)]++;
        }
        for(int i=0,len=str.length();i<len;i++){
            if(hash[str.charAt(i)]==1) return i;
        }
        return -1;
    }
}
