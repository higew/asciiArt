package jp.meyerb.asciiart.manager;

import jp.meyerb.asciiart.alphabets.DefaultAlphabet;

public class AsciiManager {
	public DefaultAlphabet alphabet;
	
	public AsciiManager(DefaultAlphabet alphabet) {
		super();
		this.alphabet = alphabet;
	}
	public String[] getAsciiTranslation (String message){
        int L = this.alphabet.getW();
        int H = this.alphabet.getH();
        //int asciiMin = 65;
        //int asciiMax = 90;
        int asciiMin = 32;
        int asciiMax = 126;
        String T[] = this.alphabet.getDatas();
        char[] character = message.toCharArray();
       // T[] = T.toUpperCase();
        //StringBuilder builder = new StringBuilder();
        String asciiArt[] = new String[this.alphabet.getH()];
        String chaine = "";
        for (int i = 0; i < H; i++) {
            String ROW = T[i];
            //System.err.println(ROW);
            chaine = "";
            // char maj 65 => 90
            for(int j=0; j < character.length; j++){
                int  ascii = character[j];
                if(ascii >= asciiMin && ascii <= asciiMax){
                    ascii = ascii - asciiMin;
                    ascii = ascii * L;
                    chaine=chaine+ROW.substring(ascii, (ascii + L));
                } else {
                    character[j]   = '?';
                    ascii  = (asciiMax - asciiMin + 1) * L;
                    chaine = chaine+ROW.substring(ascii, (ascii + L));
                }
                asciiArt[i] = chaine;
            }
            //builder.append("\n");
            
        }

        //System.out.println(builder.toString());
		return asciiArt;
	};
	public AsciiManager () {
		
	}
}
