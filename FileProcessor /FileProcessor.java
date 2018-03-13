/**
*Andrew Reyes
*
*Homework 1
*
*06/08/16
*/

import java.io.*;

public class FileProcessor{

    public void FileProcessor(String inputFileName){

        String line = null;
    
    try{
        FileReader fileReader = new FileReader(inputFileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

    while((line = bufferedReader.readLine()) != null){
        String[] lineSplit = line.split("");
                    
        if(lineSplit[0].equalsIgnoreCase("#include")){
            if(lineSplit[1].equals(inputFileName)){
                 System.out.println("ERROR...FILE CANNOT INCLUDE ITSELF!");
            }
            
            else{
                Homework1 processor = new Homework1();
                processor.fileProcessor(lineSplit[1]);
            
            }
        }
            else{
                System.out.println(line);
            }
                    
                }
                bufferedReader.close();
            }
    catch(FileNotFoundException e){
        System.out.println("ERROR...FILE COULD NOT OPEN");
    }

    catch(IOException e){
        e.printStackTrace();
    
        }
    }
}
