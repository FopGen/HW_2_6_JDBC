package org.example.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParsingQuery {

    public ArrayList getListQuery(String fileName){
        String filePathInit = "./src/main/resources/sql/"+fileName;
        ArrayList<String> arrayFromInitDb = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePathInit))){
        while(br.ready()){
            arrayFromInitDb.add(br.readLine());
        }
    } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return arrayFromInitDb;
    }
}
