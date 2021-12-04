package config;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWrite<T> {

    public void writeToFile(String path, List<T> t){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(t);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> readFromFile(String path){
        try {
            File file = new File(path);
            if (!file.isFile()) {
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream(path);
            List<T> tList ;
            if (fileInputStream.available() != 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                tList = (List<T>) objectInputStream.readObject();
                fileInputStream.close();
                objectInputStream.close();
                return tList;
            }
            return new ArrayList<>();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }



}
