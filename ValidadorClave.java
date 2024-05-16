/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordvalidator;

import java.util.Scanner;

/**
 *
 * @author jvilches
 */
public class ValidadorClave {
    
    public static void main(String[] args) {
        
    //Ingreso de Clave       
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingrese Clave de Seguridad:");
    String clave = lector.nextLine();
     
    //Validación de clave si cumple con lo solicitado
     if(clave.length()<=6 && containsLetter(clave) && containsDigit(clave) && containsSpecialChar(clave)){
    //Mensaje si clave es correcta     
         System.out.println("Clave Correcta");
    //Mensaje si clave es incorrecta     
     }else{
         System.out.println("Clave Incorrecta");
     }
         
}
    //Metodo de validación para comprobar caracter
    private static boolean containsLetter(String s){ 
        for (char c : s.toCharArray()){
            
            if (Character.isLetter(c)){
                
                return true;               
            }
        }
        
        return false;   
    }
    
    //Metodo de validación para comprobar digito
    private static boolean containsDigit(String s){  
        for (char c : s.toCharArray()){
            
            if (Character.isDigit(c)){
                
                return true;
            }
        }
       
        return false;
    }
    
    //Metodo de validación para comprobar caracter especial
    private static boolean containsSpecialChar(String s){ 
        for (char c : s.toCharArray()){
            
            if(!Character.isLetterOrDigit(c)){
                
                return true;
                
            }
            
        }
        
        return false;
    }
    
}       
       
     
         
     
       
    
        
    
    

