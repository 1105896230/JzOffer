/**
 * Created by Administrator on 2016/12/1.
 */
public class thrity_one {
    boolean g_invalidInput=false;
    int FindGreatestSumofSubArray(int[] pdata) {
        if (pdata == null || pdata.length <= 0)
        {
            g_invalidInput=true;
            return 0;
        }
        g_invalidInput=false;
        int mCurSum=0;
        int nGreatestSum=pdata[0];
        for (int i=0;i<pdata.length;i++){
            if (mCurSum<=0){
                mCurSum=pdata[i];
            }else {
                mCurSum+=pdata[i];
            }
            if (mCurSum>nGreatestSum){
                nGreatestSum=mCurSum;
            }
        }
        return nGreatestSum;
    }


}
