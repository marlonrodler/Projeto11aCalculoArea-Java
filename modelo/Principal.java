/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INSTANCIAR 5 OBJETOS DA CLASSE "Retangulo" USANDO O 
        //CONSTRUTOR CHEIO
        Retangulo r1 = new Retangulo(1,2);
        Retangulo r2 = new Retangulo(3,4);
        Retangulo r3 = new Retangulo(5,6);
        Retangulo r4 = new Retangulo(7,8);
        Retangulo r5 = new Retangulo(9,10);
        
        //OBJETO 'listaRetangulo' pertence 'a Classe ArrayList'
        //instanciando uma lista vazia que só receberá objetos da 
        //classe Retangulo
        ArrayList<Retangulo> listaRetangulo = new ArrayList<Retangulo>();
        
        //ADICIONANDO 5 OBJETOS DA CLASSE Retangulo
        //NA LISTA INSTANCIADA USANDO MÉTODO add()
        listaRetangulo.add(r1);
        listaRetangulo.add(r2);
        listaRetangulo.add(r3);
        listaRetangulo.add(r4);
        listaRetangulo.add(r5);
        
        
        Retangulo objRetangulo = new Retangulo();
        for(int k = 0; k <listaRetangulo.size(); k++){
            
            objRetangulo = listaRetangulo.get(k);
            
            objRetangulo.calcularArea();
            objRetangulo.calcularPerimetro();
            
            System.out.println((k+1)+"º Retangulo"+"\nBase: "+objRetangulo.getBase()+" - Altura: "+objRetangulo.getAltura()+
                    "\nArea: "+objRetangulo.calcularArea()+" - Perimetro: "+objRetangulo.calcularPerimetro()+"\n\n");
        }
        
        
        
    }
    
}
