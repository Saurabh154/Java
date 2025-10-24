package Oops.Upcasting;

class X {
    int i = 10;
    void showI() { System.out.println("i = " + i); }
}

class Y extends X {
    int j = 20;
    void showJ() { System.out.println("j = " + j); }
}

public class Test4 extends Y {
    int k = 30;
    void showK() { System.out.println("k = " + k); }

    public static void main(String[] args) {
        Test4 t4 = new Test4();  // ✅ object bana
        Y y = t4;                // ✅ new reference (same object)
        X x = y;                 // ✅ another reference (same object)

        // ab sabhi ek hi object ko point kar rahe hain:
        // t3 → full access (k, j, i)
        // q  → only access to j, i
        // p  → only access to i

        System.out.println("Default values of I, J, K");
        t4.showK();  // ✅ allowed (Test3 ref)
        y.showJ();   // ✅ allowed (Q ref)
        x.showI();   // ✅ allowed (P ref)

        System.out.println("After changing K values");
        t4.k = 100;
        t4.showK();

        System.out.println("After changing J values");
        y.j = 200;
        y.showJ();

        System.out.println("After changing I values");
        x.i = 300;
        x.showI();
        // q.showK(); ❌ compile error (kyunki Q ke paas showK() declare nahi hai)
    }
}
