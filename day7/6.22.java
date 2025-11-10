class Hai {
    public static void main(String arg[]) {
    }
}

class Jtc74 {
    static {
        System.out.println("SB in Jtc74");
        String str[] = {"abc"};
        Jtc74.main(str);
        Jtc74.main(str);
    }

    public static void main(String arg[]) {
        System.out.println("main in Jtc74");
    }
}
