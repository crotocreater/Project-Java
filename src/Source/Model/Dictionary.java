package Source.Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Dictionary implements Serializable {
    Map<String, String> lishDictionary;
    public Dictionary(){
        lishDictionary = new HashMap<>();
    }

    public Map<String, String> getLishDictionary() {
        return lishDictionary;
    }

    public void setLishDictionary(Map<String, String> lishDictionary) {
        this.lishDictionary = lishDictionary;
    }
    public void inputKeyInDictionary(String key, String value){
        this.lishDictionary.put(key, value);
    }
    public void outputKeyInDictionary(){
        System.out.printf("%30s%30s\n","English", "VietNamese");
        for (Map.Entry<String,String> entry:this.lishDictionary.entrySet()){
            System.out.printf("%30s%30s\n",entry.getKey(), entry.getValue());
        }
    }
    public void findKeyOnDictionary(String key){
        if (this.lishDictionary.containsKey(key)){
            System.out.printf("%30s%30s\n","English", "VietNamese");
            System.out.printf("%30s%30s\n",key, this.lishDictionary.get(key));
        }else {
            System.out.println("Khong ton tai!!");
        }
    }
    public void findValueOnDictionary(String key){
        if (this.lishDictionary.containsValue(key)){
            for (Map.Entry<String,String> entry:this.lishDictionary.entrySet()){
                if (entry.getValue().equals(key)) {
                    System.out.printf("%30s%30s", entry.getKey(), entry.getValue());
                }
            }
        }else {
            System.out.println("Khong ton tai!!");
        }
    }
    public void eraseKeyOnDictionary(String key){
        this.lishDictionary.remove(key);
        System.out.println("Successful");
    }
    public void changeKeyOnDictionary(String key, String value){
        this.lishDictionary.remove(key);
        this.lishDictionary.put(key, value);
        System.out.println("Successful");
    }
}
