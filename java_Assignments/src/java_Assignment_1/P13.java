//DEVELOP JAVA CODE THAT USES THE VARIOUS INSTANCE AND STATIC METHODS OF INTEGER WRAPPER CLASS.
package java_Assignment_1;

class P13 {

    public static void main(String[] args) {
        String str = "11";
        Integer a = 10;
        Integer Int1 = new Integer(15);
        Integer Int2 = new Integer("150");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.parseInt(str));
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Int1.toString());
        System.out.println(Int2.intValue());
        System.out.println(Int1);
        System.out.println(Int2);
    }
}