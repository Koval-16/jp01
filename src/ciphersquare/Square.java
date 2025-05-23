package ciphersquare;

public class Square {
    static final int size = 5;
    char[][] square = new char[size][size];

    public Square(char[] input){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                square[i][j] = input[(size*i)+j];
            }
        }
    }

    public void print_square(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(square[i][j]);
            }
            System.out.println();
        }
    }
}
