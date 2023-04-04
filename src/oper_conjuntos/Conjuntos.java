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
        int ref = -1;

        for (int i = 0; i < tamaño; i++) {

            res.insertar(getConj()[i], i, 1);

        }

        //System.out.println("pase por aca 1");
        
        for (int j = 0; j < tamaño; j++) {
            for (int k = 0; k < b.getTamaño(); k++) {

                if (conj[j] == b.conj[k]) {
                    //System.out.println("pase por aca 2" + ban);
                    ban++;
                }

            }

            if (ban <= 0) {
                ref++;
                //System.out.println("entre y debo insertar el numero: "+ conj[j] );
                res.insertar(b.getConj()[j], tamaño+ref , 1);
                

            }
            ban = 0;

        }
        
        
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
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    

    public int[] getConj() {
        return conj;
    }

    public void setConj(int[] conj) {
        this.conj = conj;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
    
    
    
    
    
    
    
}
