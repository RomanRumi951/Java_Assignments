package java_Assignment_2;

class ExampleP7 {
    int rollNo;
    String Name;

    public ExampleP7(int rollNo, String Name) {
        this.rollNo = rollNo;
        this.Name = Name;
    }

    public void display() {
        System.out.println("Student Roll No :: " + rollNo);
        System.out.println("Student Name :: " + Name);
    }
}

public class P7 extends ExampleP7 {
    public P7() {
        // TODO Auto-generated constructor stub
        super(2, "Vishal");
    }

    // OVERRIDDING DISPLAY FUNCTION:::
    @Override
    public void display() {
        System.out.println("Student Roll No :: " + rollNo + " :: In Overrided Method !!!");
        System.out.println("Student Name :: " + Name + " :: In Overrided Method !!!");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ExampleP7 EP7 = new ExampleP7(1, "Vipul");
        EP7.display();
        P7 PTA = new P7();
        PTA.display();
    }

}
