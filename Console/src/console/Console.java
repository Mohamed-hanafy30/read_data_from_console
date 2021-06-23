/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

/**
 *
 * @author Kimo Store
 */
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try {
      //create a buffered reader that connects to the console, we use it so we can read lines
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String lineFromInput;
          //create an print writer for writing to a file
      PrintStream out = new PrintStream(new FileOutputStream("D:\\Mohamed data\\output.txt"));
      
      do{
      //read a line from the console
      System.out.println("Enter your data:");
      lineFromInput = in.readLine();

      //output to the file a line
      out.println(lineFromInput);
      }while(!lineFromInput.equals( "stop"));
      //close the file 
      out.close();
   }
      catch(IOException e1) {
        System.out.println("Error during reading/writing");
   }
        
    }
    
}
