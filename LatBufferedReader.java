import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LatBufferedReader {

public static void main(String[] args) {
BufferedReader dataIn = new BufferedReader (new InputStreamReader( System.in));
    String name ="";
    System.out.print("Yuli Arta");
    try{
    name = dataIn.readLine();
    }catch(IOException e ){
    System.out.println("Error!");
    }
    System.out.println("Hello " + name +"!");
    } 
}