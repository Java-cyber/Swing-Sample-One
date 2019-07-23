package com.JavaCyber.Swing;

public class Main {

    public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CustomUi customUi = new CustomUi();
            }
        });
    }
}
