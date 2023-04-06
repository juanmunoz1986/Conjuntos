/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oper_conjuntos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author juano
 */
public class Oper_Conjuntos {

    public static void main(String[] args) {

        int opcion = 0;
        int opcion_1 = 0;
        int opcion_2 = 0;
        int aux = 0;
        int aux_1 = 0;
        Conjuntos u = new Conjuntos(0);
        Conjuntos a = new Conjuntos(0);
        Conjuntos b = new Conjuntos(0);
        Conjuntos c = new Conjuntos(0);

        String menu = "***MENU PRINCIPAL***\n"
                + "1- Crear conjunto\n"
                + "2- mostrar conjunto\n"
                + "3- Borrar dato en conjunto\n"
                + "4- Contar elementos de los conjuntos\n"
                + "5- \n"
                + "6- \n"
                + "7- \n"
                + "8- \n"
                + "9- \n"
                + "10- \n"
                + "11- \n"
                + "12- \n"
                + "13- \n"
                + "14- \n"
                + "15- \n"
                + "16- \n"
                + "0- Salir";

        String menu_1 = "***MENU SECUNDARIO***\n"
                + "1- Crear conjunto universal\n"
                + "2- Crear conjunto A\n"
                + "3- Crear conjunto B\n"
                + "4- Crear conjunto C\n"
                + "0- Salir";

        String menu_2 = "***MENU SECUNDARIO***\n"
                + "1- mostrar conjunto universal\n"
                + "2- mostrar conjunto A\n"
                + "3- mostrar conjunto B\n"
                + "4- mostrar conjunto C\n"
                + "0- Salir";

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
                switch (opcion) {

                    // CREAR CONJUNTOS CON SUS COMPONETES.
                    case 1:
                        do {
                            try {
                                opcion_1 = Integer.parseInt(JOptionPane.showInputDialog(menu_1));

                                switch (opcion_1) {
                                    case 1:

                                        aux = Integer.parseInt(JOptionPane.showInputDialog("De cuantos elementos quiere crear el conjunto universal"));
                                        u = new Conjuntos(aux);
                                        for (int i = 0; i < aux; i++) {
                                            aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el " + (i + 1) + " elemento del conjunto"));
                                            if (!u.pertenece(aux_1)) {
                                                u.insertar(aux_1, i, 1);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "el dato esta repetido, digite nuevamente");
                                                i--;
                                            }

                                        }

                                        break;

                                    case 2:

                                        if (u.cantidadElementos() > 0) {

                                            aux = Integer.parseInt(JOptionPane.showInputDialog("De cuantos elementos quiere crear el conjunto A"));

                                            if (aux <= u.cantidadElementos()) {

                                                a = new Conjuntos(aux);
                                                for (int i = 0; i < aux; i++) {
                                                    aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el " + (i + 1) + " elemento del conjunto"));

                                                    if (u.pertenece(aux_1) && !a.pertenece(aux_1)) {
                                                        a.insertar(aux_1, i, 1);

                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "el dato no pertenece al universal, digite nuevamente");
                                                        i--;
                                                    }

                                                }

                                            } else {
                                                JOptionPane.showMessageDialog(null, "el conjunto A no puede ser mas grande que el universal!!");
                                                break;
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto universal esta vacio, porfavor llenar !!");
                                            break;
                                        }

                                        break;

                                    case 3:

                                        if (u.cantidadElementos() > 0) {

                                            aux = Integer.parseInt(JOptionPane.showInputDialog("De cuantos elementos quiere crear el conjunto B"));

                                            if (aux <= u.cantidadElementos()) {

                                                b = new Conjuntos(aux);
                                                for (int i = 0; i < aux; i++) {
                                                    aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el " + (i + 1) + " elemento del conjunto"));

                                                    if (u.pertenece(aux_1) && !b.pertenece(aux_1)) {
                                                        b.insertar(aux_1, i, 1);

                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "el dato no pertenece al univerzal, digite nuevamente");
                                                        i--;
                                                    }

                                                }

                                            } else {
                                                JOptionPane.showMessageDialog(null, "el conjunto B no puede ser mas grande que el universal!!");
                                                break;
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto universal esta vacio, porfavor llenar !!");
                                            break;
                                        }

                                        break;
                                    case 4:

                                        if (u.cantidadElementos() > 0) {

                                            aux = Integer.parseInt(JOptionPane.showInputDialog("De cuantos elementos quiere crear el conjunto C"));

                                            if (aux <= u.cantidadElementos()) {

                                                c = new Conjuntos(aux);
                                                for (int i = 0; i < aux; i++) {
                                                    aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el " + (i + 1) + " elemento del conjunto"));

                                                    if (u.pertenece(aux_1) && !c.pertenece(aux_1)) {
                                                        c.insertar(aux_1, i, 1);

                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "el dato no pertenece al univerzal, digite nuevamente");
                                                        i--;
                                                    }

                                                }

                                            } else {
                                                JOptionPane.showMessageDialog(null, "el conjunto c no puede ser mas grande que el universal!!");
                                                break;
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto universal esta vacio, porfavor llenar !!");
                                            break;
                                        }

                                        break;

                                    case 0:
                                        //System.exit(0);
                                        break;

                                }

                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "opcion no válida");
                            }

                        } while (opcion_1 != 0);

                        break;

                    // MOSTRAR    
                    case 2:

                        do {

                            try {
                                opcion_1 = Integer.parseInt(JOptionPane.showInputDialog(menu_2));

                                switch (opcion_1) {
                                    case 1:

                                        if (u.vacio()) {

                                            JOptionPane.showMessageDialog(null, "El conjunto universal esta vacio");

                                        } else {
                                            //JOptionPane.showMessageDialog(null,  u.Mostrar().toString());
                                            System.out.print("Universal: ");
                                            JOptionPane.showMessageDialog(null, "el conjunto universal es: " + Arrays.toString(u.Mostrar()));
                                        }

                                        break;
                                    case 2:

                                        if (a.vacio()) {

                                            JOptionPane.showMessageDialog(null, "El conjunto A esta vacio");

                                        } else {
                                            //JOptionPane.showMessageDialog(null,  u.Mostrar().toString());
                                            System.out.print("A: ");
                                            JOptionPane.showMessageDialog(null, "el conjunto A es: " + Arrays.toString(a.Mostrar()));
                                        }

                                        break;

                                    case 3:

                                        if (b.vacio()) {

                                            JOptionPane.showMessageDialog(null, "El conjunto B esta vacio");

                                        } else {
                                            //JOptionPane.showMessageDialog(null,  u.Mostrar().toString());
                                            System.out.print("B: ");
                                            JOptionPane.showMessageDialog(null, "el conjunto B es: " + Arrays.toString(b.Mostrar()));
                                        }

                                        break;
                                    case 4:

                                        if (c.vacio()) {

                                            JOptionPane.showMessageDialog(null, "El conjunto C esta vacio");

                                        } else {
                                            //JOptionPane.showMessageDialog(null,  u.Mostrar().toString());
                                            System.out.print("C: ");
                                            JOptionPane.showMessageDialog(null, "el conjunto C es: " + Arrays.toString(c.Mostrar()));
                                        }

                                        break;

                                    case 0:
                                        // System.exit(0);
                                        break;

                                }

                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "opcion no válida");
                            }

                        } while (opcion_1 != 0);

                        break;

                    //eliminar dato especifico    
                    case 3:

                        opcion_2 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                      En cual conjunto desea eliminar el dato ?
                                                                                      1- Conjunto universal
                                                                                      2- Conjunto A
                                                                                      3- Conjunto B
                                                                                      4- Conjunto C
                                                                                      0- Salir"""));

                        opcion_1 = Integer.parseInt(JOptionPane.showInputDialog("cual es el dato que desea eliminar?"));

                        switch (opcion_2) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "el conjunto U antes de eliminar el dato es: " + Arrays.toString(u.Mostrar()));
                                if (u.pertenece(opcion_1)) {
                                    u.borrar(opcion_1);
                                    a.borrar(opcion_1);
                                    b.borrar(opcion_1);
                                    c.borrar(opcion_1);

                                    JOptionPane.showMessageDialog(null, "el dato se ha eliminado");
                                    JOptionPane.showMessageDialog(null, "el conjunto U luego de eliminar el dato es: " + Arrays.toString(u.Mostrar()));
                                } else {
                                    JOptionPane.showMessageDialog(null, "el dato no se encuentra en el conjunto");
                                }

                                break;

                            case 2:

                                JOptionPane.showMessageDialog(null, "el conjunto A antes de eliminar el dato es: " + Arrays.toString(a.Mostrar()));
                                if (a.pertenece(opcion_1)) {
                                    a.borrar(opcion_1);
                                    JOptionPane.showMessageDialog(null, "el dato se ha eliminado");
                                    JOptionPane.showMessageDialog(null, "el conjunto A luego de eliminar el dato es: " + Arrays.toString(a.Mostrar()));
                                } else {
                                    JOptionPane.showMessageDialog(null, "el dato no se encuentra en el conjunto");
                                }

                                break;

                            case 3:
                                JOptionPane.showMessageDialog(null, "el conjunto B antes de eliminar el dato es: " + Arrays.toString(b.Mostrar()));
                                if (b.pertenece(opcion_1)) {
                                    b.borrar(opcion_1);
                                    JOptionPane.showMessageDialog(null, "el dato se ha eliminado");
                                    JOptionPane.showMessageDialog(null, "el conjunto B luego de eliminar el dato es: " + Arrays.toString(b.Mostrar()));
                                } else {
                                    JOptionPane.showMessageDialog(null, "el dato no se encuentra en el conjunto");
                                }

                                break;

                            case 4:

                                JOptionPane.showMessageDialog(null, "el conjunto C antes de eliminar el dato es: " + Arrays.toString(c.Mostrar()));
                                if (c.pertenece(opcion_1)) {
                                    c.borrar(opcion_1);
                                    JOptionPane.showMessageDialog(null, "el dato se ha eliminado");
                                    JOptionPane.showMessageDialog(null, "el conjunto A luego de eliminar el dato es: " + Arrays.toString(c.Mostrar()));
                                } else {
                                    JOptionPane.showMessageDialog(null, "el dato no se encuentra en el conjunto");
                                }

                                break;

                            case 0:

                                break;

                        }

                        break;

                    // CANTIDAD DE ELEMENTOS EN UN CONJUNTO    
                    case 4:

                        opcion_2 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                           En cual conjunto desea saber su cantidad de elementos ?
                                                           1- Conjunto universal
                                                           2- Conjunto A
                                                           3- Conjunto B
                                                           4- Conjunto C
                                                           5- En Todos                 
                                                           0- Salir"""));

                        switch (opcion_2) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "el conjunto universal tiene: " + u.cantidadElementos() + " elementos");

                                break;

                            case 2:
                                JOptionPane.showMessageDialog(null, "el conjunto A tiene: " + a.cantidadElementos() + " elementos");

                                break;

                            case 3:
                                JOptionPane.showMessageDialog(null, "el conjunto b tiene: " + b.cantidadElementos() + " elementos");
                                break;

                            case 4:
                                JOptionPane.showMessageDialog(null, "el conjunto c tiene: " + c.cantidadElementos() + " elementos");
                                break;

                            case 5:
                                JOptionPane.showMessageDialog(null, "el conjunto universal tiene: " + u.cantidadElementos() + " elementos\n"
                                        + "el conjunto A tiene: " + a.cantidadElementos() + " elementos\n"
                                        + "el conjunto b tiene: " + b.cantidadElementos() + " elementos\n"
                                        + "el conjunto c tiene: " + c.cantidadElementos() + " elementos\n"
                                );
                                break;

                            case 0:
                                break;

                            default:
                                break;
                        }

                        break;

                    // UN DATO PERTENECE A UN CONJUNTO    
                    case 5:
                        aux = Integer.parseInt(JOptionPane.showInputDialog("Que dato dese buscar ?"));

                        do {

                            opcion_2 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                           En cual conjunto desea que se realice la busqueda ?
                                                           1- Conjunto universal
                                                           2- Conjunto A
                                                           3- Conjunto B
                                                           4- Conjunto C                                                                           
                                                           0- Salir"""));

                            switch (opcion_2) {
                                case 1:

                                    if (u.pertenece(aux)) {
                                        JOptionPane.showMessageDialog(null, "el numero: " + aux + " si pertenece al conjunto universal");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "el numero: " + aux + " no pertenece al conjunto universal");
                                    }

                                    break;

                                case 2:
                                    if (a.pertenece(aux)) {
                                        JOptionPane.showMessageDialog(null, "el numero: " + aux + " si pertenece al conjunto A");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "el numero: " + aux + " no pertenece al conjunto A");
                                    }

                                    break;

                                case 3:
                                    if (b.pertenece(aux)) {
                                        JOptionPane.showMessageDialog(null, "el numero: " + aux + " si pertenece al conjunto B");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "el numero: " + aux + " no pertenece al conjunto B");
                                    }

                                    break;

                                case 4:
                                    if (c.pertenece(aux)) {
                                        JOptionPane.showMessageDialog(null, "el numero: " + aux + " si pertenece al conjunto C");

                                    } else {
                                        JOptionPane.showMessageDialog(null, "el numero: " + aux + " no pertenece al conjunto C");
                                    }

                                    break;

                                case 0:
                                    break;

                                default:
                                    opcion_2=0;
                                    break;
                            }

                        } while (opcion_2 != 0);

                        break;



                    case 6:

                        JOptionPane.showMessageDialog(null, "el arbol tiene: ");
                        break;

                    case 7:

                        break;

                    case 8:

                        break;

                    case 9:

                        break;

                    case 10:

                        break;

                    case 11:

                        break;

                    case 12:

                        break;

                    case 13:

                        break;

                    case 14:

                        break;

                    case 15:

                        break;

                    case 16:

                        break;

                    case 0:
                        //System.exit(0);
                        break;

                }//fin switch
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "opcion no válida");
            }
        } while (opcion != 0);

    }

}

/*   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////

        Conjuntos a = new Conjuntos(5);
        Conjuntos b = new Conjuntos(3);
        Conjuntos c = new Conjuntos(20);
        Conjuntos d = new Conjuntos(5);
        Conjuntos u = new Conjuntos(10);
        Conjuntos x = new Conjuntos(10);
        

        a.insertar(1, 0, 1);
        a.insertar(2, 1, 1);
        a.insertar(3, 2, 1);
        a.insertar(4, 3, 1);
        a.insertar(5, 4, 1);   
        a.Mostrar();
        
        
        
        

        b.insertar(7, 0, 1);
        b.insertar(8, 1, 1);
        b.insertar(9, 2, 1);
        b.Mostrar();
       
        
        
        
        
        c = a.diferSimetrica(b);
        
        c.Mostrar();
        
        
        
        if(u.pertenece(39)){
            
            System.out.println("el dato 39 esta en la posicion: "+ u.posicion(39));
             
        }
        
        else{System.out.println("el dato no se encuentra en el conjunto");}
        
        
        
        
        
        
        if(u.subconjuntos(a)){
        System.out.println("conjunto universal: ");
        u.Mostrar();
        System.out.println("conjunto a:");
        a.Mostrar();

        System.out.println("el complemento de a : ");

        x = a.complemento(u);
        x.Mostrar();
        
        }
        
        else{
            System.out.println("no es posible extraer el complemento");
        }

    }

}


 */
