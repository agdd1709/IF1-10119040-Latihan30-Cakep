/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan30.cakep;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class IF110119040Latihan30Cakep {
public static final String RED = "\u001b[31m";
        public static final String GREEN = "\u001b[32m";
        public static final String YELLOW = "\u001b[33m";
        public static final String BLUE = "\u001b[34m";
        public static final String PURPLE = "\u001b[35m";
        public static final String CYAN = "\u001b[36m";
        
         public static void kondisi(String hasil) {
         if ("yoi".equals(hasil)){
            System.out.println("");
            System.out.println(RED+"Cakep Bener,"+PURPLE+" Good Job");
            } else {
                System.out.println("");
                System.out.println(RED+"Tetep cakep sih.");
                System.out.println(CYAN+"sing penting paham konsep nya yee.");
                System.out.println("Keep the code works dude");
                }
      
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String hasil;
        System.out.println(RED + " Kamu" + GREEN + " ngerjain Sendiri " +YELLOW+ " Latihan 17 sampe " +BLUE + " Latihan 30 ini? " + BLUE);
        System.out.print(BLUE + "Jawab" +RED+"(Yoi/Engga) : " );
        hasil = input.next();
        System.out.println("");
        kondisi (hasil);
         
   }
    
}         