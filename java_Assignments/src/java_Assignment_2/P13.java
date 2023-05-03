package java_Assignment_2;

interface IF {
    public void ifMethod();
}

public class P13 implements IF {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        P13 Obj = new P13();
        Obj.ifMethod();
    }

    @Override
    public void ifMethod() {
        // TODO Auto-generated method stub
        System.out.println("RunTime Polymorphism Happened Using Interface !!!");
    }

}
