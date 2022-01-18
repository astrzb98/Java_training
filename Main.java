import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<String> haslo1 = new ArrayList<>();
        System.out.println("Podaj haslo");
        String input = scanner.nextLine();
        String helper = "";
        //haslo1.add(input);
        
        System.out.print(input + "\n");
        
        int getIndex;
        char c;
        
        char[] password = new char[input.length()];
        char[] toBePassworded = new char[input.length()];
        
        for (int i=0; i<input.length(); i++)
            password[i] = input.charAt(i);
        
        Scanner sc = new Scanner(System.in);
        
        while(Arrays.equals(password, toBePassworded) == false){
            
            System.out.print("Podaj literę \n");
            
            c = sc.next().charAt(0);
            
            if(new String(password).indexOf(c) == -1){
                
                System.out.print("Litera nie jest w haśle");
                
            
            }
            
            else{
                
                getIndex = new String(password).indexOf(c);
                toBePassworded[getIndex] = password[getIndex];
                //System.out.print(toBePassworded[1]);
                
                for(char X: toBePassworded){
                    if (X == 0){
                        System.out.print("-");
                    }
                    else {
                        System.out.print(X);
                    }
                    
                }
            }
            
            
            
            
        }

        }
    }
    
