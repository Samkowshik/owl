class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f)
    {
        int x=0, y=0;
        if(c+d == e+f )
        {
            x = Math.max(c,e);
            y = Math.min(c,e);
            if(a+b == c+d && a>y && a<x)
                return 2;
            return 1;
        }
        if( c-d == e-f)
        {
            x = Math.max(c,e);
            y = Math.min(c,e);
            if(c-d == a-b && a>y && a<x)
                return 2;
            return 1;
        }
        if(a==e)
        {
            x = Math.max(b,f);
            y = Math.min(b,f);
            if(a == c && d>y && d<x)
                return 2;
            return 1;
        }
        if(b==f)
        {
            x = Math.max(a,e);
            y = Math.min(a,e);
            if(b == d && c>y && c<x)