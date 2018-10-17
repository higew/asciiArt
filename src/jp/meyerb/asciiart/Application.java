package jp.meyerb.asciiart;

import jp.meyerb.asciiart.alphabets.AlphaBaybe;
import jp.meyerb.asciiart.alphabets.AlphaBlock;
import jp.meyerb.asciiart.alphabets.DefaultAlphabet;
import jp.meyerb.asciiart.manager.AsciiManager;
import jp.meyerb.asciiart.utils.ScannerProvider;

public class Application {

	public static void main(String[] args) {
		//DefaultAlphabet Bonjour = new AlphaBaybe();
		DefaultAlphabet Bonjour = new AlphaBlock();
		AsciiManager Manager = new AsciiManager(Bonjour);
		String[] salam = Manager.getAsciiTranslation(ScannerProvider.getInstance().getScanner().nextLine());
		for (int i = 0; i < salam.length; i++) {
			System.out.println(salam[i]);
		}
	}

}
