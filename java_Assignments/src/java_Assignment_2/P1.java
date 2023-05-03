package java_Assignment_2;

public class P1 {

    String str = "This is Instance Variable";

    public P1() {
        System.out.println("Obj is A Class Variable (ALSO CALLED AN INSTANCE)!!! ");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //This is Local Variable!!!
        int Num = 235;
        System.out.println("OutPut Of Local Variable Is :: " + Num);
        P1 Obj = new P1();
        System.out.println("String str :: " + Obj.str);
    }

}
