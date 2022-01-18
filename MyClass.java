import java.util.Scanner;
import java.util.HashMap;


public class MyClass {
    
    
    
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        Integer liczba1,liczba2;
        mapa.put(1,"jeden");
        mapa.put(2,"dwa");
        mapa.put(3,"trzy");
        mapa.put(4,"cztery");
        mapa.put(5,"pięć");
        mapa.put(6,"sześć");
        mapa.put(7,"siedem");
        mapa.put(8,"osiem");
        mapa.put(9,"dziewięć");
        mapa.put(0,"zero");
        System.out.println("Podaj liczbe : ");
        //String flag = "";
        
        Scanner scanner=new Scanner(System.in);
        
        //While flag()
        liczba1=scanner.nextInt();
        
        String string_number = Integer.toString(liczba1);
        
        for (int i = 0; i < string_number.length(); i++) {
 
            // Printing the characters at each position
            Integer digit = Integer.parseInt(String.valueOf(string_number.charAt(i)));
            System.out.print (mapa.get(digit)+ "\t" );
        }
        
        
        //System.out.print(liczba1);
        //while (number > 0)
        //{
            //sum += number % 10;
            //number = number / 10;
        //}
        
        //for (Integer x : liczba1)
            //System.out.print (mapa.get(x));
        
        
//for(liczba1=0;liczba1<=9;liczba1++){
        //System.out.print (mapa.get(liczba1));
        //for (Integer x : liczba1){
            //System.out.print (mapa.get(x));
    }
}
