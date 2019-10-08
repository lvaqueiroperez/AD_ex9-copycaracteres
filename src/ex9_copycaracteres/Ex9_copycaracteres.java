/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_copycaracteres;

import java.io.*;

/**
 *
 * @author oracle
 */
public class Ex9_copycaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader readFile = new FileReader("/home/oracle/Desktop/ex9/texto10.txt");
        FileWriter writeFile = new FileWriter("/home/oracle/Desktop/ex9/texto11.txt");

        int caracter = 0;

        while (caracter != -1) {

            caracter = readFile.read();

            writeFile.write(caracter);

        }

        readFile.close();
        writeFile.close();

    }

}
