/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String lectura;
        int edad;
        lectura= JOptionPane.showInputDialog("digite su edad");
        edad= Integer.parseInt(lectura);
        if (edad>=18){
            System.out.println("Puede votar");
        }else{
            System.out.println("No puede votar");
        }

    }
    
}
