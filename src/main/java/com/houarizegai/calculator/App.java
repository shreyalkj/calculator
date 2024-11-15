package com.houarizegai.calculator;

import com.houarizegai.calculator.ui.CalculatorUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class App {

    public static void main(String[] args) {
        try {
          UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
          e.printStackTrace();
        }
        new CalculatorUI();
    }
}
