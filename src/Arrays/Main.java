package Arrays;

/**
 * Created by brusk on 12/12/16.
 */
public class Main {

    public static void main(String[] args) {

        int [] myIntArray= new int[10];

        printArray(myIntArray);
        printArray(myIntArray);
//        for(int i=0;i<myIntArray.length ;i++){
//            System.out.println("adasda "+myIntArray[i]);
//        }


    }
    public static void printArray(int[] array){

        for(int i=0;i<array.length ;i++){
            System.out.print("adasda "+array[i]);
        }

    }
}
