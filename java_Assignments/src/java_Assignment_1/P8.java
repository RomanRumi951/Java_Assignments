//DEVELOP JAVA CODE THAT DEMONSTRATE ANY FIVE METHODS OF STRING BUFFER CLASS.
package java_Assignment_1;

class P8 {
    public static void main(String[] args) {
        StringBuffer strb = new StringBuffer("Roman_Rumi");
        System.out.println("Insertion At The Beginning :: " + strb.insert(0, "Hello "));
        System.out.println("The Length Of The String Is :: " + strb.length());
        System.out.println("Append \"How Are You\" At The End :: " + strb.append(" How are You?"));
        System.out.println("Capacity Of The String Is :: " + strb.capacity());
        System.out.println("Check Which Character Is at Fourth Index :: " + strb.charAt(4));
        System.out.println("Prints Given String In Reverse Mode :: " + strb.reverse());
    }
}