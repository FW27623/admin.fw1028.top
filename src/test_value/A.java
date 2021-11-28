package test_value;

class A
{
    public int f(int a,int b) {
        if(a<b) {int num=a;a=b;b=num;}
        int e=a%b;
        while(e!=0) {
            a=b;
            b=e;
            e=a%b;
        }
        return b;
    }
}
