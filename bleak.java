class Solution
{
    static int bits(int n)
    {
        int c=0;
        while(n>0)
        {
            if((n&1)==1) c++;
            n>>=1;
        }
        // System.out.println(c);
        return c;
    }
    static int msb(int n)
    {
        int c=0;
        while(n>0)
        {
            n>>=1;
            c++;
        }
        return c-1;
    }
    public int is_bleak(int n)
    {
        int c = msb(n);
        for(int i=n-1; i>=n-c; i--)
        {
            if(bits(i)+i==n)
            return 0;
        }
        return 1;
    }
}