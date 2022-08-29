class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        System.out.println(res);
        for(int i=1;i<strs.length;i++)
        {
            System.out.println(strs[i].indexOf(res));
            while(strs[i].indexOf(res)!=0) //indexof() return 0 if found else -1
            { 
                res=res.substring(0,res.length()-1);
                System.out.println(res);
                //substring() will chop 1 letter at last each time indexOf gives -1;
            }
        }
        return res;
    }
}

public class longestprefix
{
    public static void main(String[] args)
    {
        String[] str1;
        str1=new String[]{"flower","fling","frock"};
        Solution s1=new Solution();
        System.out.println(s1.longestCommonPrefix(str1));

    }
}