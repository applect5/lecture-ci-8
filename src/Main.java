import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        //<Kieu du lieu> ten_bien = value;

        //Kieu so:
        //int a = 2; // -2^32 -> 2^31 - 1
        //long b = 4; // -2^63 -> 2^63 - 1
        //byte c = 6; // -2^7 - 2^7 - 1
        //short d = 8; // -2^15 - 2^15 - 1
        //float a = 1.001234f; // 4 byte -1.7*10^38 -> 1.7*10^38
        //double b = 1.4; //8 byte -3,4*10^308 -> 3.4*10^308

        //ky tu:
        //char a = "a";
        //String b = "abc";

        //boolean:
        //boolean a = true;
        //boolean b = failse;

        //Kieu mang:
        //<kieu du lieu>[] ten bien;
        //int[] a = new int[10];
        //int[] array = {1,2,3,4,5,6};
        //int elementZero = array[0];
        //array[0] = 3;

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("a");
//        arrayList.add("b");
//        arrayList.remove(0);
//        String element = arrayList.get(0);


        //Cac phep toan: +, -, *, /, +=, ++, --
//        int a = 6 ;
//        long b = 3 ;
//        long c = a + b;
//        long d = a / b;
//        int e = (int) ((long)a % b);

//        String s1 = "Hello, ";
//        String s2 = "World!";
//
//        System.out.println(s1+s2+a);
        //Math.function()

        //re nhanh

        //if - else
//        int a = 2;
//        int b = 3;
//        boolean result = true;
//        if (result) {
//
//        }
//        if (! (a == 2) || (b == 3)){
//
//        }
//
//        switch (a) {
//            case 1:
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            default:
//
//        }

        //loop
        //for
//        for (int i = 0; i <4 ; i++) {
//            System.out.println(i);
//        }
//
//        int[] array = {0,1,2,3,4,5,6};
//        for(int element:array){
//            System.out.println(element);
//        }


        //while
//        while(true){

//        }
//        //do - while
//        do {
//            System.out.println("");
//            }
//            while (true);


        //<kieu tra ve> ten_ham(<parameter>) {}

//        int print() {
//            return 1 ;
//        }

//        static int add(int a,int b){
//            return a + b;
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        String key = scanner.next();
////        double a = scanner.nextDouble();
//        System.out.println(key);

        Scanner scanner = new Scanner(System.in);

        String random = scanner.next();
        String random1 = scanner.next();
//        Random random = new Random();
//        random.nextInt(4);
        System.out.println(random);
        System.out.println(random1);

    }
}

