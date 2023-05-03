//JAVA PROGRAM TO CONVERT DECIMAL NUMBER TO HEXADECIMAL, OCTAL AND
//BINARY....
package java_Assignment_1;

class Part {
    public void DecToBin(int a) {
        int c[] = new int[100], i = 0;
        if (a <= 1) {
            System.out.print("The Binary Number Of " + a + " Is " + a);
        } else {
            System.out.print("The Binary Number Of " + a + " Is ");
            while (a != 0) {
                c[i] = a % 2;
                a = a / 2;
                i++;
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(c[j]);
            }
        }
    }

    public void DecToOct(int a) {
        int c[] = new int[100], i = 0;
        if (a <= 7) {
            System.out.print("The Octal Number Of " + a + " Is " + a);
        } else {
            System.out.print("The Octal Number Of " + a + " Is ");
            while (a != 0) {
                c[i] = a % 8;
                a = a / 8;
                i++;
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(c[j]);
            }
        }
    }

    public void DecToHex(int a) {
        int c[] = new int[100], i = 0;
        if (a <= 9) {
            System.out.print("The HexDecimal Number Of " + a + " Is " + a);
        } else {
            System.out.print("The HexDecimal Number Of " + a + " Is ");
            while (a != 0) {
                c[i] = a % 16;
                a = a / 16;
                i++;
            }
            for (int j = i - 1; j >= 0; j--) {
                switch (c[j]) {
                    case 10:
                        System.out.print("A");
                        break;
                    case 11:
                        System.out.print("B");
                        break;
                    case 12:
                        System.out.print("C");
                        break;
                    case 13:
                        System.out.print("D");
                        break;
                    case 14:
                        System.out.print("E");
                        break;
                    case 15:
                        System.out.print("F");
                        break;
                    default:
                        System.out.print(c[j]);
                        break;
                }
            }
        }
    }
}

class P4 {
    public static void main(String[] args) {
        Part p1 = new Part();
        p1.DecToBin(101);
        System.out.println();
        p1.DecToOct(110);
        System.out.println();
        p1.DecToHex(150);
    }
}
