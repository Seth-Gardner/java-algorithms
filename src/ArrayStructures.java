import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStructures {

    private int[] theArray = new int[50];

    private int arraySize = theArray.length;

    public void generateRandomArray(){

        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random() * 10) + 10;
        }

    }

    public void printArray(){
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");

            System.out.println("----------");

        }
    }

    public int getValueAtIndex(int index){
        if(index < arraySize) return theArray[index];
        return 0;
    }

    public boolean doesArrayContainValue(int searchValue){

        boolean valueInArray = false;

        for (int i = 0; i < arraySize; i++) {

            if (theArray[i] ==  searchValue) return true;

        }
        return false;
    }

    public void deleteIndex(int index){

        if(index < arraySize && index >= 0){

            for (int i = index; i < arraySize - 1; i++) {

                theArray[i] = theArray[i + 1];


            }
            arraySize--;

        }
    }

    public void insertValue(int value){
        if(arraySize < 50){
            theArray[arraySize] = value;
            arraySize++;
        }

    }

    public String linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexesWithValue = "";

        System.out.print("The value was found in the following: ");

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value){
                valueInArray = true;
                indexesWithValue += i + " ";
            }
        }
        if(valueInArray){
            return indexesWithValue;
        }
        return "\nSorry but the indexes weren't found anywhere";
    }

    public String binarySearchValue(int value){
        boolean valueInArray = false;
        System.out.println("The value was found in the following: ");

        int floor = 0;
        int ceiling = 1000000;

        while(floor < ceiling){
            int middleNum = (floor + ceiling) / 2;
            if (middleNum > value){
                ceiling = middleNum;
                System.out.println(middleNum);
                continue;
            }
            else if (middleNum < value){
                floor = middleNum;
                System.out.println(middleNum);
                continue;
            }
            System.out.println(middleNum);
            break;
        }
        return "all done bud";




    }

    public static void main(String[] args) {

        ArrayStructures newArray = new ArrayStructures();
//
        newArray.generateRandomArray();
//
//        newArray.printArray();
//
//        System.out.println(newArray.getValueAtIndex(4));
//        System.out.println(newArray.doesArrayContainValue(18));
//
//        newArray.deleteIndex(5);
//        newArray.printArray();
//
//        newArray.insertValue(70);
//        newArray.printArray();

//        System.out.println(newArray.linearSearchForValue(10));

        System.out.println(newArray.binarySearchValue(507));



    }
}
