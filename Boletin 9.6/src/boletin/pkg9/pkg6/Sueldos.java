/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Sueldos {
    float sueldo;
    float sueldoalto=0;
    float sueldobajo=0;
    
    public void getSueldo(){
    sueldo= Float.parseFloat(JOptionPane.showInputDialog("Introducir sueldo : "));
    
    do{
        if(sueldo>=1000&sueldo<=1750){
          sueldoalto= sueldoalto+1;
        }
    else{sueldobajo=sueldobajo+1;
            }
            sueldo= Integer.parseInt(JOptionPane.showInputDialog("Introducir sueldo :"));
    }
    while(sueldo!=0);
  JOptionPane.showMessageDialog(null,"Trabajadores que ganan más de 1000€ : "+sueldoalto);
  JOptionPane.showMessageDialog(null,"Trabajadores que ganan menos de 1000€ : "+sueldobajo);
    }
   }
