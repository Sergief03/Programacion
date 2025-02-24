package tema5.ejercicio26;

import tema5.Ejercicio6.Punto;

import javax.swing.*;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador,int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public int getNumerador(){
        return this.numerador;
    }

    public int getDenominador(){
        return this.denominador;
    }

    public double getValorReal(){
        return ((double) getNumerador())/getDenominador();
    }

    public Fraccion getInversa(){
        return new Fraccion(getDenominador(),getNumerador());
    }

    public static Fraccion sumar(Fraccion a, Fraccion b){
        /*
        int numerador=(a.getNumerador()* b.getDenominador())+(b.getNumerador()*a.getDenominador());
        int denominador=a.getDenominador()*b.getDenominador();
        */

        return new Fraccion(a.getNumerador()* b.getDenominador()+b.getNumerador()*a.getDenominador(),a.getDenominador()*b.getDenominador());
    }

    public static Fraccion multiplicar(Fraccion a, Fraccion b){
        return new Fraccion(a.getNumerador()*b.getNumerador(),a.getDenominador()*b.getDenominador());
    }

    public static Fraccion dividir(Fraccion a, Fraccion b){
        return multiplicar(a,b.getInversa());
    }
}
