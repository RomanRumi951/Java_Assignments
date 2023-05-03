// JAVA PROGRAM THAT DEMONSTRATE ANY FIVE METHODS OF STRING CLASS..
package java_Assignment_1;

class P7 {
    public static void main(String[] args) {
        String string = "Roman_Rumi";
        String string1 = "roman_rumi";
        System.out.println("The Default String is :: " + string);
        System.out.println("Check The Length Of The String :: " + string.length());
        System.out.println("Check If The Given String Contains _Ru :: " + string.contains("_Ru"));
        System.out.println("Check What Is The Fourth Character :: " + string.charAt(4));
        System.out.println("Check If The String Ends With i:: " + string.endsWith("i"));
        System.out.println("Check The Index Of The _ :: " + string.indexOf("_"));
        System.out.println("Check if Roman_Rumi is Equal To roman_rumi !!! " + string.equals(string1));
    }
}