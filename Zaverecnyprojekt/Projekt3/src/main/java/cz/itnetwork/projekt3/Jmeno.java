/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekt3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author rosea
 */
public class Jmeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        System.out.println("==========");
        System.out.println("Evidence pojistenych");
        System.out.println("==========");
        System.out.println("Vyberte si akci");
        System.out.println("1 - pridat noveho pojisteneho");
        System.out.println("2 - vypsat vsechny pojistene");
        System.out.println("3 - vyhledat pojistene");
        System.out.println("4 - konec");
        System.out.println("==========");
        
        
       ArrayList<Clovek> lide = new ArrayList<>();
       
       String vstup = sc.nextLine();
       while(!vstup.equals("4"))
       if (vstup.equals("1")){
        System.out.println("Zadej jméno: ");
        String jmeno = sc.nextLine();
        System.out.println("Zadej příjmení: ");
        String prijmeni = sc.nextLine();
        System.out.println("Zadej věk: ");
        int vek = Integer.parseInt(sc.nextLine());
        System.out.println("Zadej telefonní číslo: ");
        int telefon = Integer.parseInt(sc.nextLine());
        System.out.println("Data jsou uložena. Pokracujte dale,....");
     
       
        Clovek u = new Clovek(jmeno, prijmeni, vek, telefon);   
        lide.add(u);
        System.out.println("==========");
        System.out.println("Evidence pojistenych");
        System.out.println("==========");
        System.out.println("Vyberte si akci");
        System.out.println("1 - pridat noveho pojisteneho");
        System.out.println("2 - vypsat vsechny pojistene");
        System.out.println("3 - vyhledat pojistene");
        System.out.println("4 - konec");
        System.out.println("==========");
        vstup = sc.nextLine();        
 
     
       }
       
       else if (vstup.equals("2")){
            System.out.println("==========");
            System.out.println("Nasi pojistenci");
            System.out.println("=========="); 
            System.out.println("POCET NALEZENYCH ZAZNAMU: " + String.valueOf(lide.size()));
           for(int i = 0; i < lide.size(); i++){
               System.out.println(lide.get(i).toString());
           }
            System.out.println("==========");
            System.out.println("Evidence pojistenych");
            System.out.println("==========");
            System.out.println("Vyberte si akci");
            System.out.println("1 - pridat noveho pojisteneho");
            System.out.println("2 - vypsat vsechny pojistene");
            System.out.println("3 - vyhledat pojistene");
            System.out.println("4 - konec");
            System.out.println("==========");
            vstup = sc.nextLine();  
       }


       
        else if (vstup.equals("3")){
            System.out.println("Zadej jméno: ");
            String jmeno = sc.nextLine();
            System.out.println("Zadej příjmení: ");
            String prijmeni = sc.nextLine();
            boolean nalezen = false;
            int nalezen_pocet = 0;
            for(int i = 0; i < lide.size(); i++){
               if(lide.get(i).dejJmeno().equals(jmeno) && lide.get(i).dejPrijmeni().equals(prijmeni)){
                    nalezen = true;
                    nalezen_pocet++;
                    System.out.println(lide.get(i).toString());
               }
            }
            if(nalezen == false){
                System.out.println("UZIVATEL NENALEZEN");
            }
            else{
                System.out.println("POCET NALEZENYCH ZAZNAMU: " + String.valueOf(nalezen_pocet));
            }
            System.out.println("==========");
            System.out.println("Evidence pojistenych");
            System.out.println("==========");
            System.out.println("Vyberte si akci");
            System.out.println("1 - pridat noveho pojisteneho");
            System.out.println("2 - vypsat vsechny pojistene");
            System.out.println("3 - vyhledat pojistene");
            System.out.println("4 - konec");
            System.out.println("==========");
            vstup = sc.nextLine();  
            
       }
      
        }
    }
  
   
