package com.Calculadora;

public class Funciones {
    public String operar;
    public double res = 0;
    public double a = 0;
    public double b = 0;
    public String error = "Syntax ERROR";

    public void sumar(){
        res = a + b;
    }
    public void restar(){
        res = a - b;
    }
    public void multiplicar(){
        res = a * b;
    }
    public void dividir(){
        if (b == 0){
            res = 0;
        } else {
            res = a / b;
        }
    }
    public void porcen(){
        res = a/100;
    }

    public void resultado(){
        switch (operar){
            case "Sumar":
                sumar();
                break;
            case "Restar":
                restar();
                break;
            case "Multiplicar":
                multiplicar();
                break;
            case "Dividir":
                dividir();
                break;
            case "Porcentaje":
                porcen();
                break;
        }
    }
}
