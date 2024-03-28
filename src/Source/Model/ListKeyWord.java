package Source.Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ListKeyWord implements Serializable {
    Map<Integer , DictionaryWithTime> ListKeyWorld;

    public Map<Integer, DictionaryWithTime> getListKeyWorld() {
        return ListKeyWorld;
    }

    public void setListKeyWorld(Map<Integer, DictionaryWithTime> listKeyWorld) {
        ListKeyWorld = listKeyWorld;
    }

    int tmp;
    public ListKeyWord(){
        ListKeyWorld = new HashMap<>();
        this.tmp = ListKeyWorld.size();
    }
    public void addNewKeyWorld(String key, String value){
        this.tmp++;
        DictionaryWithTime dictionary = new DictionaryWithTime();
        dictionary.Set(key,value);
        this.ListKeyWorld.put(this.tmp, dictionary);
        System.out.println("Thanh cong");
    }
    public void getLishKeyWold(){
        System.out.printf("%5s%30s%30s%30s\n", "STT", "English" , "VietNamese" ,"Time Add");
        for (Map.Entry<Integer,DictionaryWithTime> entry:this.ListKeyWorld.entrySet()){
            System.out.printf("%5d", entry.getKey());
            entry.getValue().get();
        }
    }
    public void findKeyWorld(int k){
        System.out.printf("%5s%30s%30s%30s\n", "STT", "English" , "VietNamese" ,"Time Add");
        System.out.printf("%5d", k);
        this.ListKeyWorld.get(k).get();
    }
    public void eraseListKeyWorld(int k){
        this.ListKeyWorld.remove(k);
        System.out.println("Successful");
    }
    public void changeListKeyWorld(int k,String key, String value){
        DictionaryWithTime dictionary = new DictionaryWithTime();
        dictionary.Set(key,value);
        this.ListKeyWorld.replace(k, dictionary);
    }
}
