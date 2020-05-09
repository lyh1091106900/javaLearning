package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FsUtil {

public static String readFileCotent(String fileName){
    File file = new File(fileName);
    BufferedReader reader = null;
    StringBuffer sbf = new StringBuffer();
    try{
        reader = new BufferedReader(new FileReader(file));
        String tempStr;
        while((tempStr = reader.readLine()) != null){
            sbf.append(tempStr);
        }
        reader.close();
        return sbf.toString();
    }catch (IOException e){
        e.printStackTrace();
    }finally {
         if(reader != null){
             try{
                reader.close();
             }catch(IOException e1){
                 e1.printStackTrace();
             }
         }
    }
    return sbf.toString();
}
}