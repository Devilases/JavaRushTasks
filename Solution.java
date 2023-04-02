package com.javarush.task.pro.task15.task1503;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 
Если ресурсов много
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String psrv = "/Users/aleksand/Desktop/test.txt";
        try(FileReader fileReader = new FileReader(psrv); BufferedReader bufferedReader = new BufferedReader(fileReader)){
            while(bufferedReader.ready()){
                String line = bufferedReader.readLine();
                System.out.println(line);
            }
        }

    }
}

