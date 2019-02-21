
import java.util.Scanner;

public class Sternchen {
 

    static Scanner scanner;
 

    public Sternchen() {
        scanner = new Scanner(System.in);
    }
 

    public static void main(String[] args) {
    	Sternchen program = new Sternchen();
        program.run();
        scanner.close();
    }
 
 
    private void run() {
        
    	char stern = '*';
    	int zahl = 0;
    	
    	
    	for(;zahl < 5;zahl++) {
    		
    		System.out.println(stern);
    		
    	
    		}
    		
    	}
    	
    	
    }













