import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StandardIOExample {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Start typing");
//        String line;
//        try {
//            do {
//                line = reader.readLine();
//                System.out.println(">> "+ line.toUpperCase());
//            }while (!"quit".equals(line));
//        }catch (IOException e){
//            System.out.println("An error occurred while reading input: "+ e.getMessage());
//        }

//        Path path = Paths.get("hello.txt");
//        if(Files.exists(path)){
//            System.out.println("|File is existed "+path);
//        }else {
//            System.out.println("File does not exist.");
//            try {
//                // Create a new file
//                Files.createFile(path);
//                System.out.println("File created: " + path);
//            } catch (IOException e) {
//                System.out.println("Error creating file: " + e.getMessage());
//            }
//        }
//        BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
//        FileTime creationTime = attr.creationTime();
//        System.out.println("CreationTime = "+ creationTime);
//
//        long size = attr.size();
//        System.out.println("Size = "+size);
//        UserPrincipal owner = Files.getOwner(path);
//        System.out.println("Owner = "+owner);

//        Path targetPath = Paths.get("hello_renamed.txt");
//        Path moved = Files.move(path,targetPath);

//        Path copyTo = Paths.get("copied.txt");
//        Files.copy(path,copyTo, StandardCopyOption.REPLACE_EXISTING);

            Path readFile = Paths.get("hello.txt");
        try (BufferedReader reader = Files.newBufferedReader(readFile)) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            String text = stringBuilder.toString();
            System.out.println(text);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}