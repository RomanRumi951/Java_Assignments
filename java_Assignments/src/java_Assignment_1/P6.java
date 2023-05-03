//DEVELOP JAVA CODE THAT CREATES & INITIALIZE AN ARRAY OF CHARACTERS & APPEND TO A STRING BUFFER CLASS..
package java_Assignment_1;

class P6 {
    public static void main(String[] args) {
        char cha[] = new char[5];
        cha[0] = 'a';
        cha[1] = 'b';
        cha[2] = 'c';
        cha[3] = 'd';
        cha[4] = 'e';
        StringBuffer s1 = new StringBuffer("Roman");
        for (int i = 0; i < cha.length; i++) {
            s1.append(cha[i]);
        }
        System.out.println(s1);
    }
}