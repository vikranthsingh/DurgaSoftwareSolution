class Test {
    void m1(int i) {
        System.out.println("int arg method");
    }

    void m1(float f) {
        System.out.println("float arg method");
    }

}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.m1('C');
        t.m1(10l);
    }
}