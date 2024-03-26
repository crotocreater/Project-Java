package Source.Model;

import java.io.Serializable;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DictionaryWithTime implements Serializable {
    private Map<Dictionary, String>lisistMap;
    private Dictionary dictionary;
    private String localDateTime;

    public DictionaryWithTime(){
        this.lisistMap = new HashMap<>();
        this.dictionary = new Dictionary();
    }

    public Map<Dictionary, String> getLisistMap() {
        return lisistMap;
    }

    public void setLisistMap(Map<Dictionary, String> lisistMap) {
        this.lisistMap = lisistMap;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
    public void Set(String key, String value){
        this.dictionary.inputKeyInDictionary(key,value);
        Date currentDate = new Date();
        this.localDateTime = DateFormat.getInstance().format(currentDate);
        this.lisistMap.put(this.dictionary, this.localDateTime);
    }
    public void get(){
        System.out.printf("%30s%30s%30s\n","English", "VietNamese", "Time add");
        for (Map.Entry<Dictionary, String> entry:this.lisistMap.entrySet()){
            entry.getKey().outputKeyInDictionary();
            System.out.printf("%30s\n", entry.getValue());
        }
    }
}
