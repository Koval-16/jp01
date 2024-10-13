import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        char[] input = {'o','m','z','s','u',
                'x','w','i','b','t',
                'f','a','k','e','r',
                'l','y','n','d','c',
                'g','v','h','j','p'};
        char excluded = 'q';
        Square square = new Square(input);
        Scanner scanner = new Scanner(System.in);
        square.print_square();
        System.out.print("Enter the word: ");
        Word word = new Word(scanner.nextLine(), excluded);
        Coder coder = new Coder(square, word);
        System.out.print("Code or Decode the Word? (C/D): ");
        char option = scanner.nextLine().toLowerCase().charAt(0);
        System.out.println(word.getWord());
        String result;
        switch (option){
            case 'c':
                result = coder.coding();
                System.out.println("Coded word: "+result);
                break;
            case 'd':
                result = coder.decoding();
                System.out.println("Decoded word: "+result);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

}
