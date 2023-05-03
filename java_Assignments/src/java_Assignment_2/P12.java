package java_Assignment_2;

// The Below Class Is An Example Of An Abstract Class...
// We Can't Create An Abstract Class's Object...
abstract class Abs {
    // The Below Method Is An Example Of An Abstract Method...
    public abstract void myMethod();
}

public class P12 extends Abs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        P12 P = new P12();
        P.myMethod();
    }

    @Override
    public void myMethod() {
        // TODO Auto-generated method stub
        System.out.println("Abstract Method Of Abs Class is Called By It's SubClass P12!!");
    }

}
