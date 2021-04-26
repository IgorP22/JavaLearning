public class P321_TestBox {
    Integer i=5;
    // чтобы программа скомпилировалась, нужно объекту присвоить число
    // простому типу ничего присваивать не нужно, т.к. он по умолчанию 0
    // а у объектного типа null
    int j;
    // static int x; //1 стр 315 скомпилируется
    // int x; //2 стр 315 скомпилируется
    // final int x; //3 стр 315 не скомпилируется, т.к. ч не задан
    //static final int x=12; //4, 5 стр 315 скомпилируется
    int x =12; //6 стр 315 не скомпилируется, х нельзя передать при вызове t.go

    public static void main (String [] args) {
        P321_TestBox t = new P321_TestBox();
        t.go ();
    }
    public void go() {
       j=i;
        System.out.println(j);
        System.out.println(i);
        //System.out.println(x); //1,2,3,4,5,6
    }

}
