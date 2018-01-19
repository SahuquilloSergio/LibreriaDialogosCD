package com.Sergio.dialogos;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.Scanner;

/**
 *
 * @author serxa
 */
public class Dialogos {
    Scanner sc = new Scanner(System.in);
    
    public static void YESNO(){
    String Pregunta = JOptionPane.showInputDialog("Introduce la Pregunta");
    String Titulo = JOptionPane.showInputDialog("Introduce el Titulo");
       int ele = JOptionPane.showOptionDialog(new JFrame(), Pregunta, Titulo, JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
       if (ele ==JOptionPane.YES_OPTION){
           
       }else if (ele == JOptionPane.NO_OPTION){
           JOptionPane.showMessageDialog(null,"Has Fallado");
       }else if (ele == JOptionPane.CLOSED_OPTION){
           JOptionPane.showMessageDialog(null, "Hasta la Próxima");
       }
    }
}
