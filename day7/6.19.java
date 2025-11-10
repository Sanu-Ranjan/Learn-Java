class Hello {
    void m1(byte b1) {
        System.out.println("m1(byte b1) in Hello");
    }

    void m1(short s) {
        System.out.println("m1(short s) in Hello");
        return; // empty return is allowed in void method
    }

    void m1(int i) {
        System.out.println("m1(int i) in Hello");
    }

    void m1(long l) {
        System.out.println("m1(long l) in Hello");
    }

    void m1(char ch) {
        System.out.println("m1(char ch): " + ch);
    }
}

class Jtc71 {
    public static void main(String arg[]) {
        Hello h1 = new Hello();
        h1.m1(111);           // int literal
        h1.m1(65);            // int literal (ASCII of 'A')
        h1.m1((byte)111);     // explicit byte
        h1.m1((short)111);    // explicit short
    }
}
