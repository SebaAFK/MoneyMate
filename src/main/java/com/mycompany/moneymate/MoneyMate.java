/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moneymate;

/**
 *
 * @author Admin
 */
public class MoneyMate {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(() -> {
            System.out.println("Launching HomeFrame..."); // debug message
            HomeFrame frame = new HomeFrame();
            frame.setVisible(true); // VERY IMPORTANT
        });
    }
}
