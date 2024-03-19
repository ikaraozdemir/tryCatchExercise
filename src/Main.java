import java.util.Scanner;

public class Main {
    public static char checkArrayBoundaries (int index) throws ArrayIndexOutOfBoundsException{

        char[] myArray = {'a','b','c','d','e','f','g','h','i','j'};

        if (index < 0 || index > myArray.length - 1){
            throw new ArrayIndexOutOfBoundsException("Girdiğiniz değer liste sınırları dışında!");
        }
            return myArray[index];


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir indeks değeri giriniz: ");
        int myIndex = input.nextInt();

        try {
            System.out.println(checkArrayBoundaries(myIndex));
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}