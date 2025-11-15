package Oops.EqualsMethod;

class Rectange{
    int l;
    int b;
    Rectange(int l, int b){
        this.l = l;
        this.b = b;
    }

    @Override
    public boolean equals(Object arg){
        if(!(arg instanceof Rectange)) return false;

//        Rectange r = (Rectange) arg;
        return l == ((Rectange)arg).l && b == ((Rectange)arg).b;
    }
}

public class Main {
    public static void main(String[] args) {

        Rectange r1 = new Rectange(10,20);
        Rectange r2 = new Rectange(10,20);

        System.out.println(r1.equals(r2));
    }
}
