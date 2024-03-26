package Source.Utils;

import Source.Model.ListKeyWord;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIO {
    private String filePath;
    public FileIO(String filePath){
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public void inputList(ListKeyWord listKeyWord){
        try (ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream(this.filePath))){
            obs.writeObject(listKeyWord);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public ListKeyWord listKeyWordout(){
        ListKeyWord listKeyWord = new ListKeyWord();
        try (ObjectInputStream obs = new ObjectInputStream(new FileInputStream(this.filePath))){
            listKeyWord = (ListKeyWord) obs.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return listKeyWord;
    }
}
