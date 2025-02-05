class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i=0,c=0,j=0;
        int ar[]= new int [2];
        for(i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
                c++;
            else if(j<2)
            {
                ar[j]=i;
                j++;
            }
            else 
                return false;
        }
        if(s1.length()==c)
            return true;
        else if(c==s1.length()-2)
        {
            if(s1.charAt(ar[1])==s2.charAt(ar[0]) && s1.charAt(ar[0])==s2.charAt(ar[1]))
                return true;
            else
                return false;
        }
        else 
            return false;
    }
}