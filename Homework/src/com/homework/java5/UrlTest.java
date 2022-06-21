package com.homework.java5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @projectName: untitled1
 * @className: UrlTest
 * @author: AaronLi
 * @description: nothing
 * @date: 2022/6/20 下午8:13
 * @version: JDK17
 */
public class UrlTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.sohu.com/index.html");
            InputStream inputStream = url.openStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String data = bufferedReader.readLine();
            while(data != null){
                System.out.println(data);
                data = bufferedReader.readLine();
            }
            bufferedReader.close();
            inputStream.close();
            inputStreamReader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
