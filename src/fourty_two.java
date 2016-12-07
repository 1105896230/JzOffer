/**
 * Created by Administrator on 2016/12/7.
 */
public class fourty_two {
    public String ReverseSentence(String str) {
        if(str==null)
            return null;
        char[] chars=str.toCharArray();
        swap(chars,0,chars.length-1);
        int begin=0,end=0;
        while(begin<chars.length){
            while(begin<chars.length&&chars[begin]==' ')
                begin++;
            end=begin+1;
            while(end<chars.length&&chars[end]!=' ')
                end++;
            swap(chars,begin,end-1);
            end++;
            begin=end;
        }
        return new String(chars);
    }
    private void swap(char[] chars,int left,int right){
        char temp;
        while(left<right){
            temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
    }
    public String LeftRotateString(String str,int n) {
        char[] chars = str.toCharArray();
        if(chars.length < n) return "";
        reverse(chars, 0, n-1);
        reverse(chars, n, chars.length-1);
        reverse(chars, 0, chars.length-1);
        StringBuilder sb = new StringBuilder(chars.length);
        for(char c:chars){
            sb.append(c);
        }
        return sb.toString();
    }

    public void reverse(char[] chars,int low,int high){
        char temp;
        while(low<high){
            temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;
            low++;
            high--;
        }
    }
}
