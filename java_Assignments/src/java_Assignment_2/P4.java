package java_Assignment_2;

public class P4 {
    public class Nested {

        public void nested() {
            class Inner {
                public Inner() {
                    System.out.println("This Is A Inner Class Example");
                }

            }
            System.out.println("This Is A Nested Class!! ");
            new Inner();

        }
    }

    public void useNested() {
        Nested N = new Nested();
        N.nested();
    }

    public static void main(String[] args) {
        P4 Obj = new P4();
        Obj.useNested();
    }

}
