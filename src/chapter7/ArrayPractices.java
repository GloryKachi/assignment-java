package chapter7;

public class  ArrayPractices {
    public static void main(String[] args) {
        //Array is a collection of items of the same data type.
        // Example: a crate of eggs, a crate of minerals
        //It has a fixed length
        //Index - numbering that starts from 0 to access any of the element of an array


//        int [] numbers;
//
//        numbers = new int[5];
//        numbers[0] = 2;
//        numbers[1] = 3;
//        numbers[2] = 5;
//        numbers[3] = 1;
//        numbers[4] = 3;
//
//        for ( =0; )

        String[] colours;

        colours = new String[7];
        colours[0] = "Pink";
        colours[1] = "Yellow";
        colours[2] = "Red";
        colours[3] = "White";
        colours[4] = "Green";
        colours[5] = "Purple";
        colours[6] = "Gray";


        for (int differentColours = 6; differentColours >= 0; differentColours--) {
            System.out.println(colours[differentColours]);
        }
    }
}