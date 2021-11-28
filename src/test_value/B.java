package test_value;

class B extends A
{
    @Override
    public int f(int a,int b) {
        A g=new A();
        int m=g.f(a,b);
        return a*b/m;
    }
}