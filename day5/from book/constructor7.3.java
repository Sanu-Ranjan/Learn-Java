class Jtc78{
    public static void main(String args[]){
        // Hello h1 = new Hello();
        // h1.m1();
        Hello h2 = new Hello(111);
        h2.m1();
        
    }
}
class Hello{
    int a;
    int b;
    static int c;
    Hello(int a1){
        System.out.print("m1 in hello");
        a=a1;
    }
    void m1(){
        System.out.println("m1 in Hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}