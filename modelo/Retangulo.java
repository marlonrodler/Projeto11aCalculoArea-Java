/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Retangulo {
    //Definição dos Atributos
    private float base;
    private float altura;

    //Contrutor vazio
    public Retangulo() {
    }

    //Contrutor Cheio
    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    //GETTERS SETTERS
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //METODO CALC AREA
    public float calcularArea(){
        float area = this.base * this.altura;
        return area;
    }
    
    //METODO CALC PERIMETRO
    public float calcularPerimetro(){
        float perimetro = (2 * this.base) + (2 * this.altura);
        return perimetro;
    }
    
}
