/**
 * Created by brusk on 11/17/16.
 */
public class MyMethod {

    public static void main(String[] args) {

        myMethodCall("Yıldırım",25,0);

        myMethodCall("Yıldırım",25);

        myMethodCall("Yıldırım");

    }

    public static int myMethodCall(String name, int yas,int times){
        System.out.println("Your name is "+name+" your age is " +yas);
        return times+1;
    }

    public static int myMethodCall(String name, int yas){
        System.out.println("Your name is "+name+" your age is " +yas);
        return 1;

    }
    public static int myMethodCall(String name){
        System.out.println("Your name is "+name);
        return 1;

    }



}

