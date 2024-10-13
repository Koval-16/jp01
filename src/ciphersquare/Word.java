package ciphersquare;

public class Word {
    private String word;
    private final char excluded;

    public Word(String word, char excluded){
        this.excluded = excluded;
        this.word = word;
        this.word = edit_word();
    }

    private String edit_word(){
        this.word = word.toLowerCase();
        String temp = "";
        for(int i=0; i<word.length(); i++){
            char character = word.charAt(i);
            if(character>='a' && character<='z' && character!=excluded){
                temp += character;
                if(i<(word.length()-1) && character == word.charAt(i+1) && i%2==0){
                    temp += 'x';
                }
            }
        }
        if(temp.length()%2==1) temp+='x';
        this.word = temp;
        return word;
    }

    public String getWord(){
        return word;
    }
}
