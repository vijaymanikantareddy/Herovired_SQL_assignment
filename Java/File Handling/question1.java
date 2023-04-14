import java.io.*;

public class FileOperationsApp {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Create a new folder");
            System.out.println("2. Create a new text file");
            System.out.println("3. Write into a text file");
            System.out.println("4. Append data to a text file");
            System.out.println("5. Rename a file");
            System.out.println("6. Delete a file");
            System.out.println("7. Exit");
            
            try {
                int choice = Integer.parseInt(br.readLine());
                
                switch (choice) {
                    case 1:
                        System.out.println("Enter folder name:");
                        String folderName = br.readLine();
                        createFolder(folderName);
                        break;
                    case 2:
                        System.out.println("Enter file name:");
                        String fileName = br.readLine();
                        createTextFile(fileName);
                        break;
                    case 3:
                        System.out.println("Enter file name:");
                        String writeFile = br.readLine();
                        System.out.println("Enter file content:");
                        String fileContent = br.readLine();
                        writeToFile(writeFile, fileContent);
                        break;
                    case 4:
                        System.out.println("Enter file name:");
                        String appendFile = br.readLine();
                        System.out.println("Enter content to append:");
                        String appendContent = br.readLine();
                        appendToFile(appendFile, appendContent);
                        break;
                    case 5:
                        System.out.println("Enter current file name:");
                        String currentFileName = br.readLine();
                        System.out.println("Enter new file name:");
                        String newFileName = br.readLine();
                        renameFile(currentFileName, newFileName);
                        break;
                    case 6:
                        System.out.println("Enter file name:");
                        String deleteFile = br.readLine();
                        deleteFile(deleteFile);
                        break;
                    case 7:
                        exit = true;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void createFolder(String folderName) {
        File folder = new File(folderName);
        if (folder.mkdir()) {
            System.out.println("Folder created successfully.");
        } else {
            System.out.println("Failed to create folder.");
        }
    }

    private static void createTextFile(String fileName) {
        File file = new File(fileName + ".txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Text file created successfully.");
            } else {
                System.out.println("Failed to create text file.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void writeToFile(String fileName, String fileContent) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
            bw.write(fileContent);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void appendToFile(String fileName, String appendContent) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt", true))) {
            bw.write(appendContent);
            System.out.println("Content appended to file successfully.");
        } catch (IOException){
        }
    }
}
