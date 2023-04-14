import java.io.*;

public class CharacterCountInTextFile {
    public static void main(String[] args) {
        String fileName = "D:\\HeroVired.txt"; 
        int characterCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                characterCount += line.length();
            }
            
            System.out.println("Total number of characters in file are: " + characterCount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
