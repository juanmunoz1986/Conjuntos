/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper_conjuntos;

import javax.swing.JOptionPane;

/**
 *
 * @author juano
 */
public class Conjuntos {

    private int tamaño;
    private int[] conj;

    public Conjuntos(int tamaño) {

        this.tamaño = tamaño;
        conj = new int[tamaño];

    }

    public void insertar(int dato, int pos, int tipo) {

        switch (tipo) {

            case 1:
                conj[pos] = dato;
                break;

            case 2:
                break;

            default:
                System.out.println("el dato tipo esta errado");

        }
    }

    public Conjuntos union(Conjuntos b) {

        Conjuntos res = new Conjuntos(tamaño + b.getTamaño());

        int ban = 0;
        int ref = tamaño;

        for (int i = 0; i < tamaño; i++) {

            res.insertar(getConj()[i], i, 1);

        }

        //res.Mostrar();
        //System.out.println("pase por aca 1");
        for (int j = 0; j < b.getTamaño(); j++) {

            for (int k = 0; k < tamaño; k++) {

                if (conj[k] == b.conj[j]) {
                    //System.out.println("pase por aca 2" + ban);
                    ban++;
                }

            }

            if (ban == 0 && b.getConj()[j] != 0) {

                //System.out.println("entre y debo insertar el numero: " + b.getConj()[j]);
                //System.out.println("debo ingresar en: " + ref);
                res.insertar(b.getConj()[j], ref, 1);
                ref++;

            }
            ban = 0;

        }

        //System.out.println("fin del ciclo");
        return res;

    }

    public int[] Mostrar() {
        String b = " ";

        for (int i = 0; i < tamaño; i++) {

            b = b + conj[i] + " ";

        }

        System.out.println(b);
      return conj;
    }

    public int cantidadElementos() {

        int cant = 0;

        for (int i = 0; i < tamaño; i++) {

            if (conj[i] != 0) {

                cant++;

            }
        }

        return cant;
    }

    public boolean pertenece(int a) {

        boolean ban = false;

        for (int i = 0; i < tamaño; i++) {

            if (conj[i] == a) {

                ban = true;

            }

        }

        return ban;
    }

    public boolean subconjuntos(Conjuntos b) {

        int ban = 0;
        int ref = b.cantidadElementos();
        boolean ban_1 = false;

        for (int j = 0; j < tamaño; j++) {
            for (int k = 0; k < b.getTamaño(); k++) {

                if (conj[j] == b.conj[k]) {
                    //System.out.println("pase por aca 2" + ban);
                    ban++;
                }

            }

        }

        if (ban >= ref) {

            ban_1 = true;
        }

        return ban_1;
    }

    public boolean vacio() {

        int ban = 0;

        boolean ban_1 = false;

        for (int j = 0; j < tamaño; j++) {

            if (conj[j] == 0) {
                //System.out.println("pase por aca 2" + ban);
                ban++;
            }

        }

        if (tamaño == ban) {

            ban_1 = true;
        }

        return ban_1;
    }

    public Conjuntos intercepcion(Conjuntos b) {

        Conjuntos res = new Conjuntos(tamaño + b.getTamaño());

        int ban = 0;
        int ref = 0;

        for (int j = 0; j < b.getTamaño(); j++) {

            for (int k = 0; k < tamaño; k++) {

                if (conj[k] == b.conj[j]) {
                    //System.out.println("pase por aca 2" + ban);
                    ban++;
                }

            }

            if (ban != 0 && b.getConj()[j] != 0) {

                //System.out.println("entre y debo insertar el numero: " + b.getConj()[j]);
                //System.out.println("debo ingresar en: " + ref);
                res.insertar(b.getConj()[j], ref, 1);
                ref++;

            }
            ban = 0;

        }

        //System.out.println("fin del ciclo");
        return res;

    }

    public boolean igualdad(Conjuntos b) {

        boolean igual = false;
        int ban = 0;

        if (tamaño == b.getTamaño()) {

            for (int j = 0; j < b.getTamaño(); j++) {

                for (int k = 0; k < tamaño; k++) {

                    if (conj[k] == b.conj[j]) {
                        //System.out.println("pase por aca 2" + ban);
                        ban++;
                    }

                }

            }

            if (ban == tamaño && ban == b.getTamaño()) {

                igual = true;

            }

        } else {
            igual = false;
        }

        return igual;
    }

    public Conjuntos complemento(Conjuntos b) {

        Conjuntos res = new Conjuntos(b.getTamaño());

        int ban = 0;
        int ref = 0;

        for (int j = 0; j < b.getTamaño(); j++) {

            for (int k = 0; k < tamaño; k++) {

                if (conj[k] == b.conj[j]) {
                    //System.out.println("pase por aca 2" + ban);
                    ban++;
                }

            }

            if (ban == 0 && b.getConj()[j] != 0) {

                res.insertar(b.getConj()[j], ref, 1);
                ref++;

            }
            ban = 0;

        }

        return res;
    }

    public void borrar(int a) {
      
        for (int i = 0; i < tamaño; i++) {
            if (conj[i] == a) {
                conj[i] = 0;
                   
            }

        }
        
        
        
        

    }

    public int posicion(int a) {

        int pos = 0;

        for (int i = 0; i < tamaño; i++) {
            if (conj[i] == a) {

                pos = i;

            }

        }
        return pos;
    }

    public Conjuntos diferencia(Conjuntos b) {

        Conjuntos res = new Conjuntos(tamaño + b.getTamaño());

        int ban = 0;
        int ref = 0;

        for (int j = 0; j < tamaño; j++) {

            for (int k = 0; k < b.getTamaño(); k++) {

                if (conj[j] == b.conj[k]) {
                    //System.out.println("pase por aca 2" + ban);
                    ban++;
                }

            }

            if (ban == 0 && conj[j]!=0 ) {

                //System.out.println("entre y debo insertar el numero: " + b.getConj()[j]);
                //System.out.println("debo ingresar en: " + ref);
                res.insertar(conj[j], ref, 1);
                ref++;

            }
            ban = 0;

        }

        //System.out.println("fin del ciclo");
        return res;

    }
    
    
    public Conjuntos diferSimetrica(Conjuntos b) {
        
        //la diferencia simetrica es igual a diferencia entre a y b , unido con la diferencia de b y a.

        Conjuntos res = new Conjuntos(tamaño + b.getTamaño());
        Conjuntos res_1 = new Conjuntos(tamaño + b.getTamaño());
        Conjuntos res_2 = new Conjuntos(tamaño + b.getTamaño());

        res = union(b);
        res_1 = intercepcion(b);
        res_2 = res.diferencia(res_1);

        return res_2;

    }
    
   public void vaciar(){
       
    for (int i = 0; i < tamaño; i++) {
            conj[i]=0;

        }   
     
   } 

    
    public void agregar(int a){
        
        
     
        int pos = posicion(0);
        
        if(pos==0 && conj[0]==0){
            
        conj[0]=a;    
            
        }
        
        else if (pos!=0){
        conj[pos]=a;
        
        }
        
        else{
        JOptionPane.showMessageDialog(null, "el conjunto esta lleno elimine un elemento antes de ingresar nuevamente");
        }
        
        
    }

    
    
    
    

    public int[] getConj() {
        return conj;
    }

    public void setConj(int[] conj) {
        this.conj = conj;
    }

    public int getTamaño() {
        return tamaño;
    }

}
