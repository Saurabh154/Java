package ExceptionHandling;

final class FinalDemo {
    final int value = 100;

    final void show() {
        System.out.println("Final method and variable example: " + value);
    }

    protected void finalize() {
        System.out.println("finalize() called before GC");
    }

    public static void main(String[] args) {

        FinalDemo demo = new FinalDemo();
        try {
            demo.show();
        } finally {
            System.out.println("finally block executed");
        }
        demo = null;
        System.gc();
    }
}


