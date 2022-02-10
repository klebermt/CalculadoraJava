package com.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton AC;
    private JButton Borrar;
    private JButton Porc;
    private JButton a7;
    private JButton a8;
    private JButton a9;
    private JButton a4;
    private JButton a5;
    private JButton a6;
    private JButton Dividir;
    private JButton Multiplicar;
    private JButton Restar;
    private JPanel Panel1;
    private JButton a1;
    private JButton a2;
    private JButton a3;
    private JButton Sumar;
    private JButton a0;
    private JButton Decimal;
    private JButton Igual;
    private JLabel Label1;
    private JLabel signo;

    //variables propias
    private double a = 0;
    private double b = 0;
    private boolean activar = false;
    private boolean punto = true;
    private String bloque = "";
    private String texto = "";

    Funciones f = new Funciones();

    public App() {
        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "1";
                Label1.setText(texto);
            }
        });
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "2";
                Label1.setText(texto);
            }
        });
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "3";
                Label1.setText(texto);
            }
        });
        a4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "4";
                Label1.setText(texto);
            }
        });
        a5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "5";
                Label1.setText(texto);
            }
        });
        a6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "6";
                Label1.setText(texto);
            }
        });
        a7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "7";
                Label1.setText(texto);
            }
        });
        a8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "8";
                Label1.setText(texto);
            }
        });
        a9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "9";
                Label1.setText(texto);
            }
        });
        a0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                texto += "0";
                Label1.setText(texto);
            }
        });
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                bloque = "0";
                texto = "";
                Label1.setText(bloque);
                signo.setText("?");
                punto = true;
            }
        });
        Borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    if (texto.length() == 1 || texto.length() == 0){
                        bloque = "0";
                        texto = "";
                        Label1.setText(bloque);
                    }else {
                        int x = texto.length() - 1;
                        texto = texto.substring(0,x);
                        Label1.setText(texto);
                    }
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        });
        Decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (punto){
                    if (texto.length() == 0){
                        texto = "0.";
                        Label1.setText(texto);
                    }else {
                        texto += ".";
                        Label1.setText(texto);
                    }
                    punto = false;
                }
            }
        });
        Sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (a == 0){
                    a = Double.parseDouble(texto);
                    f.a = a;
                    f.operar = "Sumar";
                    activar = true;
                    bloque = texto;
                    texto = "";
                    Label1.setText(bloque);
                    signo.setText("+");
                } else {

                }
            }
        });
        Igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (activar){
                    b = Double.parseDouble(texto);
                    f.b = b;
                    f.resultado();
                    double res = f.res;
                    bloque = String.valueOf(res);
                    texto = "";
                    Label1.setText(bloque);
                    a = 0;
                    activar = false;
                    signo.setText("?");
                } else {
                    bloque = "0";
                    texto = "";
                    Label1.setText(bloque);
                    signo.setText("?");
                }
                punto = true;
            }
        });
        Restar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (a == 0){
                    a = Double.parseDouble(texto);
                    f.a = a;
                    f.operar = "Restar";
                    activar = true;
                    bloque = texto;
                    texto = "";
                    Label1.setText(bloque);
                    signo.setText("-");
                }
            }
        });
        Multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (a == 0){
                    a = Double.parseDouble(texto);
                    f.a = a;
                    f.operar = "Multiplicar";
                    activar = true;
                    bloque = texto;
                    texto = "";
                    Label1.setText(bloque);
                    signo.setText("x");
                } else {

                }
            }
        });
        Dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (a == 0){
                    a = Double.parseDouble(texto);
                    f.a = a;
                    f.operar = "Dividir";
                    activar = true;
                    bloque = texto;
                    texto = "";
                    Label1.setText(bloque);
                    signo.setText("/");
                }
            }
        });
        Porc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (a == 0){
                    a = Double.parseDouble(texto);
                    f.a = a;
                    f.operar = "Porcentaje";
                    //activar = true;
                    bloque = texto;
                    texto = "";
                    Label1.setText(bloque);
                    //signo.setText("%");
                    f.resultado();
                    double res = f.res;
                    bloque = String.valueOf(res);
                    texto = "";
                    Label1.setText(bloque);
                    a = 0;
                    punto = true;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame cal = new JFrame("Calculadora");
        cal.setContentPane(new App().Panel1);
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setLocationRelativeTo(null);
        cal.pack();
        cal.setVisible(true);
    }
}
