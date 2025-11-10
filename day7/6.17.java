class Hai {
}

class Hello {
    void m1() {
        System.out.println("m1() in Hello");
    }

    void m1(Hai hai) {
        System.out.println("m1(Hai hai) in Hello");
    }

    void m1(int a[]) {
        System.out.println("m1(int a[]) in Hello");
    }

    void m1(Object o) {
        System.out.println("m1(Object o) in Hello");
    }

    void m1(String str) {
        System.out.println("m1(String str) in Hello");
    }
}

class Jtc68 {
    public static void main(String arg[]) {
        Hello h1 = new Hello();
        h1.m1();
        h1.m1(new Hai());
        // h1.m1(null);   // <-- causes ambiguity (explained below)
        h1.m1("abc");
    }
}
