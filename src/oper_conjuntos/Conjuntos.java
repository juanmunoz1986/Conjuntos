/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oper_conjuntos;

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

        res.Mostrar();

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
               // System.out.println("debo ingresar en: " + ref);

                res.insertar(b.getConj()[j], ref, 1);
                ref++;

            }
            ban = 0;

        }

        //System.out.println("fin del ciclo");
        return res;

    }
    
    
    
    
    public void Mostrar(){
        String b = " ";
        
     for (int i=0; i<tamaño; i++){
         
       b = b + conj[i] + " " ;
         
         
     }   
        
        
        System.out.println(b);   
        
        
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

        if (ban == ref) {

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
