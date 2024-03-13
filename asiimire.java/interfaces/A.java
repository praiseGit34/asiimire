package interfaces;
interface X{
    final int kX=5;
    double mX(int a);
}
interface Y{
    void mY(String K);
}
interface Z extends X,Y{
    final double KZ=2.5;
}
public class A implements Z {
    public double mX(int a){
        double b= 2.5*a;
        System.out.println(b);
        return b;
    }
    public void mY(String K){
        System.out.println(K);
    }
    public static void main(String[] args) {
        A a=new A();
        a.mX(3);
        a.mY("praise");
    }
}

