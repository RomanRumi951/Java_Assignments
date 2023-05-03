// JAVA PROGRAM TO COUNT THE NUMBER OF OBJECTS CREATED OF A GIVEN CLASS...
package java_Assignment_1;

class Part1 {
    static int Obj_Count;

    public Part1() {
        Obj_Count++;
    }

    public void OutPut() {
        if (Obj_Count == 0) {
            System.out.println(Obj_Count + " Object Created");
        } else if (Obj_Count == 1) {
            System.out.println(Obj_Count + " Object Created");
        } else {
            System.out.println(Obj_Count + " Objects Created");
        }
    }
}

class P12 {

    public static void main(String[] args) {
        new Part1();
        new Part1();
        new Part1();
        new Part1();
        Part1 p5 = new Part1();
        p5.OutPut();
    }
}