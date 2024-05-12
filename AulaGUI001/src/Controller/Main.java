/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.MainView;
import javax.swing.JFrame;

/** *
 * @author José Padilha
 */
public class Main {
    public static void main (String args[]){
        // Cria o Objeto Janela
        MainView mainView = new MainView();
        // CDefine o Objeto Janela como visível
        mainView.setVisible(true);
        // Centraliza o frame no centro da tela
        mainView.setLocationRelativeTo(null);
        //
        mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
    }
    
}
