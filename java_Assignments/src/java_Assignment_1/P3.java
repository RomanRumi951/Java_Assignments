// JAVA PROGRAM THAT ACCEPTS THE RADIUS OF CIRCLE AND CALCULATE AND DISPLAY THE AREA OF IT..(ACCEPT RADIUS USING COMMAND LINE ARGUMENTS)..
package java_Assignment_1;

class P3 {
    public static void main(String arg[]) {
        int r = Integer.parseInt(arg[0]);
        float ans = (float) (3.14 * r) * (r);
        System.out.println("The Area Of Circle Is ::  " + ans);
    }
}