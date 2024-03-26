package Source.Main;

import Source.Model.ListKeyWord;
import Source.Utils.FileIO;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileIO("list.dat");
        ListKeyWord listKeyWord =fileIO.listKeyWordout();
        listKeyWord.getLishKeyWold();

        fileIO.inputList(listKeyWord);
    }
}