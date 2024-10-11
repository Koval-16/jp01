public class Coder {
    Square square;
    Word word;

    public Coder(Square square, Word word){
        this.square = square;
        this.word = word;
    }

    public String coding(){
        return converting(true);
    }

    public String decoding(){
        return converting(false);
    }

    private String converting(boolean isCoding){
        String coded_word = "";
        for(int c=0; c<word.getWord().length(); c+=2) {
            char c1 = word.getWord().charAt(c);
            char c2 = word.getWord().charAt(c+1);
            int[] xy1 = coordinates(c1);
            int[] xy2 = coordinates(c2);
            int modifier = 1;
            if(!isCoding) modifier = -1;
            if(xy1[0]==xy2[0]){
                xy1[1] = (((xy1[1]+modifier)%5)+5)%5;
                xy2[1] = (((xy2[1]+modifier)%5)+5)%5;
            }
            else if(xy1[1]==xy2[1]){
                xy1[0] = (((xy1[0]+modifier)%5)+5)%5;
                xy2[0] = (((xy2[0]+modifier)%5)+5)%5;
            }
            else{
                int temp = xy1[1];
                xy1[1] = xy2[1];
                xy2[1] = temp;
            }
            coded_word += square.square[xy1[1]][xy1[0]];
            coded_word += square.square[xy2[1]][xy2[0]];
        }
        return coded_word;
    }

    private int[] coordinates(char character){
        int[] xy = new int[2];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(square.square[i][j]==character){
                    xy[0] = j;
                    xy[1] = i;
                }
            }
        }
        return xy;
    }

}

