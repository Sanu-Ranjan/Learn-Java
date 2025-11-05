class Jtc79{
    public static void main(String args[]){
         Hello h1 = new Hello();
         h1.m1();
         Hello h2 = new Hello(222);
         h2.m1();
    }
}
class Hello{
    int a;
    final Hello(int a1){
        System.out.print("1 param constructor in hello");
        a=a1;
    }
    void m1(){
        System.out.println("m1 in Hello");
        System.out.println(a);
    }
}