
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> identifier = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifierInput = scanner.nextLine();
            if (identifierInput.isEmpty()) {
                break;
            }             
            
            System.out.println("Name? (empty will stop)");
            String nameInput = scanner.nextLine();
            if (nameInput.isEmpty()) {
                break;
            }
            if (!(identifier.contains(identifierInput))) {
                name.add(nameInput);
                identifier.add(identifierInput);
            }
        }
        System.out.println("==Items==");
        
        for (int i=0;i< name.size();i++) {
            System.out.println(identifier.get(i) + ": " + name.get(i));
            
        }
        
        }     
        
    }

