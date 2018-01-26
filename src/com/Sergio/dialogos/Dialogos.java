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
    /**
     * Metodo YESNO permite formular una pregunta con respuesta simple. Tanto la pregunta como las respuestas son modificables.
     */
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
    /**
     * Metodo Introducir Dato que permite pedir un dato. La pregunta es editable
     * 
     * @return dato introducido
     */
    public static String IntroducirDato(){
        String Titulo = JOptionPane.showInputDialog("Introduce el titulo");
        String Pregunta = JOptionPane.showInputDialog("Introduce la Pregunta");
        String dato = JOptionPane.showInputDialog(new JFrame(), Pregunta, Titulo);
                JOptionPane.showMessageDialog(null, dato);
                return dato;
              }
    
    /**
     * Metodo para pedir un dato de tipo String
     * 
     * @return dato introducido
     */
     public static String lerString(){
     String dato;
     dato = JOptionPane.showInputDialog("Introduce dato");
     return dato;
     }
 
     /**
      * Metodo para pedir un dato de tipo Integet
      * 
      * @return dato introducido 
      */
     public static int lerInt(){
     int dato;
     dato = Integer.parseInt(JOptionPane.showInputDialog("Introduce dato"));
     return dato;
     }
     
     /**
      * Metodo para pedir un dato de tipo Float
      * 
      * @return dato introducido 
      */
     public static float lerFloat(){
         float dato;
         dato = Float.parseFloat(JOptionPane.showInputDialog("Introduce dato"));
         return dato;
     }
     
     /**
      * Metodo para pedir un dato de tipo Double
      * 
      * @return dato introducido 
      */
     public static double lerDouble(){
         double dato;
         dato = Double.parseDouble(JOptionPane.showInputDialog("Introduce dato"));
         return dato;
     }
 }
    
