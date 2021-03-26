import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.*;

public class jNotes {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to jNotes!");
    System.out.println();
    System.out.println("What would you like to do?");
    System.out.println();
    while(true) {
        //DONE: save, add, exit
        //MERGED: save+add,
    System.out.println("add   delete   read   exit");
    String setting = in.nextLine();
    if(setting.equals("add")) {

System.out.println("What would you like to add to your note?");
String noteLine1 = in.nextLine();
System.out.println("Your note will now be saved.");
System.out.println();
System.out.println("Your note says the following:");
System.out.println();
System.out.println(noteLine1);
System.out.println();
System.out.println("What shall your file be called?");
System.out.println();
String fileName = in.nextLine();
try {
    FileWriter myWriter = new FileWriter(fileName);
    myWriter.write(noteLine1);
    myWriter.close();
    System.out.println();
    System.out.println("Your note has been saved.");
    System.out.println();
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
    }

    if(setting.equals("exit")){
System.out.println("Okay! Exiting... Have a good day!");
System.exit(0);
    }

    if(setting.equals("read")) {
System.out.println("What file would you like to read? Type the file name below.");
String fileToRead = in.nextLine();
System.out.println();
        try {
            File myObj = new File(fileToRead);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println("The note "+fileToRead+" says:");
              System.out.println();
              System.out.println(data);
              System.out.println();
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("Sorry, we couldn't find that note.");
            e.printStackTrace();
          }

    }
    /*
    if(setting.equals("save")){
        
System.out.println("What shall your file be called?");
String fileName = in.nextLine();
try {
    FileWriter myWriter = new FileWriter(fileName);
    myWriter.write(noteLine1);
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}*/ 
   
    /*
    try {
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      */
      /*  
      
      try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      
      */
}

}

    private static void exit() {
    }
}