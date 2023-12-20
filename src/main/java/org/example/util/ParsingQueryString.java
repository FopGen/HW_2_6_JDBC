package org.example.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParsingQueryString {

    public String getStringQuery(String fileName){

        String fileSql = "./src/main/resources/sql/" + fileName;
        String result;

        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fileSql))){
            while(br.ready()){
                sb.append(br.readLine() + " ");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
