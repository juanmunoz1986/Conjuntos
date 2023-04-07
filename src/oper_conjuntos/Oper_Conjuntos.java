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
        Conjuntos res = new Conjuntos(0);

        String menu = "***MENU PRINCIPAL***\n"
                + "1- Crear conjunto\n"
                + "2- mostrar conjunto\n"
                + "3- Borrar dato en conjunto\n"
                + "4- Contar elementos de los conjuntos\n"
                + "5- Buscar dato dentro de un conjunto \n"
                + "6- Subconjunto de un conjunto\n"
                + "7- Consultar conjunto vacio\n"
                + "8- Union de dos conjuntos\n"
                + "9- Intercepcion de dos conjuntos\n"
                + "10- Validar igualdad entre dos conjuntos \n"
                + "11- Complemtno de un conjunto\n"
                + "12- Agregar elemento a un conjunto \n"
                + "13- Encontrar la posicion de un dato en un conjunto\n"
                + "14- Diferencia entre dos conjuntos\n"
                + "15- Diferencia simetrica entre dos conjuntos\n"
                + "16- Creacion automatica de conjuntos\n"
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
                                                        JOptionPane.showMessageDialog(null, "el dato no pertenece al universal, digite nuevamente");
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
                                                        JOptionPane.showMessageDialog(null, "el dato no pertenece al universal, digite nuevamente");
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
                                    opcion_2 = 0;
                                    break;
                            }

                        } while (opcion_2 != 0);

                        break;

                    //un subconjunto de otro    
                    case 6:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Usted desea saber si el conjunto que va ingresar es subconjunto de otro, ingrese el primer subconjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));
                        aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Segundo conjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));

                        String z = "";
                        String w = "";
                        switch (aux) {
                            case 1:
                                z = "Universal";

                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        if (u.subconjuntos(u)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 2:
                                        w = "A";

                                        if (u.subconjuntos(a)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 3:
                                        w = "B";

                                        if (u.subconjuntos(b)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }
                                        break;

                                    case 4:
                                        w = "C";

                                        if (u.subconjuntos(c)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 2:
                                z = "A";
                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        if (a.subconjuntos(u)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 2:
                                        w = "A";

                                        if (a.subconjuntos(a)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 3:
                                        w = "B";

                                        if (a.subconjuntos(b)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }
                                        break;

                                    case 4:
                                        w = "C";

                                        if (a.subconjuntos(c)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 3:
                                z = "B";
                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        if (b.subconjuntos(u)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 2:
                                        w = "A";

                                        if (b.subconjuntos(a)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 3:
                                        w = "B";

                                        if (b.subconjuntos(b)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }
                                        break;

                                    case 4:
                                        w = "C";

                                        if (b.subconjuntos(c)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 4:
                                z = "C";

                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        if (c.subconjuntos(u)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 2:
                                        w = "A";

                                        if (c.subconjuntos(a)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 3:
                                        w = "B";

                                        if (c.subconjuntos(b)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }
                                        break;

                                    case 4:
                                        w = "C";

                                        if (c.subconjuntos(c)) {

                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " es subconjunto de " + z);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "el conjunto " + w + " no es subconjunto de " + z);
                                        }

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 0:

                                break;

                            default:
                                break;

                        }

                        break;

                    // vacio     
                    case 7:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Cual conjunto desea validar si esta vacio\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));

                        switch (aux) {
                            case 1:
                                if (u.vacio()) {
                                    JOptionPane.showMessageDialog(null, "el conjunto U esta vacio");
                                } else {
                                    JOptionPane.showMessageDialog(null, "el conjunto U no esta vacio");
                                }

                                break;

                            case 2:

                                if (a.vacio()) {
                                    JOptionPane.showMessageDialog(null, "el conjunto A esta vacio");
                                } else {
                                    JOptionPane.showMessageDialog(null, "el conjunto A no esta vacio");
                                }

                                break;

                            case 3:

                                if (b.vacio()) {
                                    JOptionPane.showMessageDialog(null, "el conjunto B esta vacio");
                                } else {
                                    JOptionPane.showMessageDialog(null, "el conjunto B no esta vacio");
                                }

                                break;

                            case 4:

                                if (c.vacio()) {
                                    JOptionPane.showMessageDialog(null, "el conjunto C esta vacio");
                                } else {
                                    JOptionPane.showMessageDialog(null, "el conjunto C no esta vacio");
                                }

                                break;

                            case 0:

                                break;

                            default:
                                break;
                        }
                        break;

                    // union de dos conjuntos    
                    case 8:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Usted desea unir dos conjuntos, ingrese el primer subconjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));
                        aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Segundo conjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));

                        z = "";
                        w = "";
                        switch (aux) {
                            case 1:
                                z = "Universal";

                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";

                                        res = u.union(u);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto U con U es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 2:
                                        w = "A";

                                        res = u.union(a);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto U con A es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:
                                        w = "B";

                                        res = u.union(b);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto U con B es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:
                                        w = "C";

                                        res = u.union(c);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto U con c es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 2:
                                z = "A";
                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        res = a.union(u);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto A con U es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 2:
                                        w = "A";

                                        res = a.union(a);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto A con A es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:
                                        w = "B";

                                        res = a.union(b);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto A con B es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:
                                        w = "C";

                                        res = a.union(c);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto A con C es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 3:
                                z = "B";
                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        res = b.union(u);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto B con U es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 2:
                                        w = "A";

                                        res = b.union(a);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto B con A es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:
                                        w = "B";

                                        res = b.union(b);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto B con B es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:
                                        w = "C";

                                        res = b.union(c);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto B con C es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 4:
                                z = "C";

                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        res = c.union(u);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto C con U es:" + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 2:
                                        w = "A";

                                        res = c.union(a);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto C con A es:" + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:
                                        w = "B";

                                        res = c.union(b);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto C con B es:" + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:
                                        w = "C";

                                        res = c.union(c);
                                        JOptionPane.showMessageDialog(null, "el conjunto union del conjunto C con C es:" + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 0:

                                break;

                            default:
                                break;

                        }

                        break;

                    // intercepcion de dos conjuntos      
                    case 9:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Usted desea hacer la intercepcion entre dos conjuntos, ingrese el primer subconjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));
                        aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Segundo conjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));

                        z = "";
                        w = "";
                        switch (aux) {
                            case 1:
                                z = "Universal";

                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";

                                        res = u.intercepcion(u);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre U y U es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 2:
                                        w = "A";

                                        res = u.intercepcion(a);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre U y A es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:
                                        w = "B";

                                        res = u.intercepcion(b);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre U y B es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:
                                        w = "C";

                                        res = u.intercepcion(c);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre U y C es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 2:
                                z = "A";
                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";

                                        res = a.intercepcion(u);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre A y U es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 2:
                                        w = "A";

                                        res = a.intercepcion(a);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre A y A es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:
                                        w = "B";

                                        res = a.intercepcion(b);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre A y B es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:
                                        w = "C";

                                        res = a.intercepcion(c);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre A y C es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 3:
                                z = "B";
                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        res = b.intercepcion(u);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre B y U es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 2:
                                        w = "A";

                                        res = b.intercepcion(a);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre B y A es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:
                                        w = "B";

                                        res = b.intercepcion(b);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre B y B es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:
                                        w = "C";

                                        res = b.intercepcion(c);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre B y C es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 4:
                                z = "C";

                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        res = c.intercepcion(u);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre C y U es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 2:
                                        w = "A";

                                        res = c.intercepcion(a);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre C y A es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:
                                        w = "B";

                                        res = c.intercepcion(b);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre C y B es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:
                                        w = "C";

                                        res = c.intercepcion(c);
                                        JOptionPane.showMessageDialog(null, "el conjunto intercepcion entre C y C es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 0:

                                break;

                            default:
                                break;

                        }

                        break;

                    // validar igualdad   
                    case 10:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Usted desea validar le igualdad entre dos conjuntos, ingrese el primer conjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));
                        aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Segundo conjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));

                        z = "";
                        w = "";
                        switch (aux) {
                            case 1:
                                z = "Universal";

                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";

                                        if (u.igualdad(u)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }

                                        break;

                                    case 2:
                                        w = "A";

                                        if (u.igualdad(a)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 3:
                                        w = "B";

                                        if (u.igualdad(b)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 4:
                                        w = "C";

                                        if (u.igualdad(c)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 2:
                                z = "A";
                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";

                                        if (a.igualdad(u)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 2:
                                        w = "A";

                                        if (a.igualdad(a)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 3:
                                        w = "B";

                                        if (a.igualdad(b)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 4:
                                        w = "C";

                                        if (a.igualdad(c)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 3:
                                z = "B";
                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        if (b.igualdad(u)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 2:
                                        w = "A";

                                        if (b.igualdad(a)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 3:
                                        w = "B";

                                        if (b.igualdad(b)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 4:
                                        w = "C";

                                        if (b.igualdad(c)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 4:
                                z = "C";

                                switch (aux_1) {
                                    case 1:
                                        w = "Universal";
                                        if (c.igualdad(u)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 2:
                                        w = "A";

                                        if (c.igualdad(u)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 3:
                                        w = "B";

                                        if (c.igualdad(a)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 4:
                                        w = "C";

                                        if (c.igualdad(b)) {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son iguales ");

                                        } else {
                                            JOptionPane.showMessageDialog(null, "los conjuntos son diferentes");

                                        }
                                        break;

                                    case 0:

                                        break;
                                    default:
                                        break;

                                }

                                break;

                            case 0:

                                break;

                            default:
                                break;

                        }

                        break;

                    // calcular complemento   
                    case 11:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Usted desea calular el complemento de un conjunto, cual desea calcular\n"
                                + "1- Conjunto A\n"
                                + "2- Conjunto B\n"
                                + "3- Conjunto C\n"
                                + "0- salir"
                        ));

                        switch (aux) {
                            case 1:

                                if (u.subconjuntos(a)) {
                                    res = a.complemento(u);
                                    JOptionPane.showMessageDialog(null, "el complemento del conjunto es:" + Arrays.toString(res.Mostrar()));

                                } else {
                                    JOptionPane.showMessageDialog(null, "no es posible calcular el complemento");

                                }

                                break;

                            case 2:

                                if (u.subconjuntos(b)) {
                                    res = b.complemento(u);
                                    JOptionPane.showMessageDialog(null, "el complemento del conjunto es:" + Arrays.toString(res.Mostrar()));

                                } else {
                                    JOptionPane.showMessageDialog(null, "no es posible calcular el complemento");

                                }

                                break;

                            case 3:

                                if (u.subconjuntos(c)) {
                                    res = c.complemento(u);
                                    JOptionPane.showMessageDialog(null, "el complemento del conjunto es:" + Arrays.toString(res.Mostrar()));

                                } else {
                                    JOptionPane.showMessageDialog(null, "no es posible calcular el complemento");

                                }

                                break;

                            case 0:

                                break;

                            default:
                                break;
                        }

                        break;

                    // agregar elemento a un conjunto ya creado   
                    case 12:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Usted desea ingresar un numero a un conjunto, digite el conjunto \n"
                                + "1- Conjunto U\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));

                        aux_1 = Integer.parseInt(JOptionPane.showInputDialog("digite el numero a ingresar"));

                        if (u.pertenece(aux_1)) {

                            switch (aux) {
                                case 1:
                                    u.agregar(aux_1);
                                    break;
                                case 2:
                                    a.agregar(aux_1);
                                    break;

                                case 3:
                                    b.agregar(aux_1);
                                    break;

                                case 4:
                                    c.agregar(aux_1);
                                    break;

                                default:
                                    break;
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "el numero no pertenece al universal");
                            break;

                        }

                        break;

                    // posicion de un dato     
                    case 13:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Usted desea saber la posicion de un dato en un conjunto, digite el conjunto \n"
                                + "1- Conjunto U\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));

                        aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar"));

                        if (u.pertenece(aux_1)) {

                            switch (aux) {
                                case 1:
                                    if (u.pertenece(aux_1)) {
                                        JOptionPane.showMessageDialog(null, "El numero si pertenece al conjunto y su posicion es: " + u.posicion(aux_1));

                                    } else {
                                        JOptionPane.showMessageDialog(null, "El numero no pertenece al conjunto");

                                    }

                                    break;
                                case 2:
                                    if (a.pertenece(aux_1)) {
                                        JOptionPane.showMessageDialog(null, "El numero si pertenece al conjunto y su posicion es: " + a.posicion(aux_1));

                                    } else {
                                        JOptionPane.showMessageDialog(null, "El numero no pertenece al conjunto");

                                    }
                                    break;

                                case 3:
                                    if (b.pertenece(aux_1)) {
                                        JOptionPane.showMessageDialog(null, "El numero si pertenece al conjunto y su posicion es: " + b.posicion(aux_1));

                                    } else {
                                        JOptionPane.showMessageDialog(null, "El numero no pertenece al conjunto");

                                    }
                                    break;

                                case 4:
                                    if (c.pertenece(aux_1)) {
                                        JOptionPane.showMessageDialog(null, "El numero si pertenece al conjunto y su posicion es: " + c.posicion(aux_1));

                                    } else {
                                        JOptionPane.showMessageDialog(null, "El numero no pertenece al conjunto");

                                    }
                                    break;

                                default:
                                    break;
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "el numero no pertenece al universal");
                            break;

                        }

                        break;

                    // diferencia entre dos conjuntos    
                    case 14:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Usted desea realizar una diferencia entre conjuntos, ingrese el primer conjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));
                        aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Segundo conjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));

                        switch (aux) {
                            case 1:

                                switch (aux_1) {
                                    case 1:
                                        res = u.diferencia(u);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));
                                        break;

                                    case 2:
                                        res = u.diferencia(a);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:

                                        res = u.diferencia(b);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:

                                        res = u.diferencia(c);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    default:
                                        break;
                                }

                                break;

                            case 2:
                                switch (aux_1) {
                                    case 1:
                                        res = a.diferencia(u);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));
                                        break;

                                    case 2:
                                        res = a.diferencia(a);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:

                                        res = a.diferencia(b);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:

                                        res = a.diferencia(c);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    default:
                                        break;
                                }

                                break;

                            case 3:

                                switch (aux_1) {
                                    case 1:
                                        res = b.diferencia(u);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));
                                        break;

                                    case 2:
                                        res = b.diferencia(a);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:

                                        res = b.diferencia(b);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:

                                        res = b.diferencia(c);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    default:
                                        break;
                                }

                                break;

                            case 4:

                                switch (aux_1) {
                                    case 1:
                                        res = c.diferencia(u);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));
                                        break;

                                    case 2:
                                        res = c.diferencia(a);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:

                                        res = c.diferencia(b);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:

                                        res = c.diferencia(c);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    default:
                                        break;
                                }

                                break;

                            default:
                                break;
                        }

                        break;

                    //diferencia simetrica entre dos conjuntos    
                    case 15:

                        aux = Integer.parseInt(JOptionPane.showInputDialog("Usted desea realizar una diferencia simetrica entre conjuntos, ingrese el primer conjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));
                        aux_1 = Integer.parseInt(JOptionPane.showInputDialog("Segundo conjunto\n"
                                + "1- Conjunto universal\n"
                                + "2- Conjunto A\n"
                                + "3- Conjunto B\n"
                                + "4- Conjunto C\n"
                                + "0- salir"
                        ));

                        switch (aux) {
                            case 1:

                                switch (aux_1) {
                                    case 1:
                                        res = u.diferSimetrica(u);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));
                                        break;

                                    case 2:
                                        res = u.diferSimetrica(a);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:

                                        res = u.diferSimetrica(b);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:

                                        res = u.diferSimetrica(c);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    default:
                                        break;
                                }

                                break;

                            case 2:
                                switch (aux_1) {
                                    case 1:
                                        res = a.diferSimetrica(u);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));
                                        break;

                                    case 2:
                                        res = a.diferSimetrica(a);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:

                                        res = a.diferSimetrica(b);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:

                                        res = a.diferSimetrica(c);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    default:
                                        break;
                                }

                                break;

                            case 3:

                                switch (aux_1) {
                                    case 1:
                                        res = b.diferSimetrica(u);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));
                                        break;

                                    case 2:
                                        res = b.diferSimetrica(a);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:

                                        res = b.diferSimetrica(b);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:

                                        res = b.diferSimetrica(c);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    default:
                                        break;
                                }

                                break;

                            case 4:

                                switch (aux_1) {
                                    case 1:
                                        res = c.diferSimetrica(u);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));
                                        break;

                                    case 2:
                                        res = c.diferSimetrica(a);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 3:

                                        res = c.diferSimetrica(b);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    case 4:

                                        res = c.diferSimetrica(c);
                                        JOptionPane.showMessageDialog(null, "el resultado es: " + Arrays.toString(res.Mostrar()));

                                        break;

                                    default:
                                        break;
                                }

                                break;

                            default:
                                break;
                        }

                        break;

                    case 16:

                        u = new Conjuntos(10);
                        u.insertar(1, 0, 1);
                        u.insertar(2, 1, 1);
                        u.insertar(3, 2, 1);
                        u.insertar(4, 3, 1);
                        u.insertar(5, 4, 1);
                        u.insertar(6, 5, 1);
                        u.insertar(7, 6, 1);
                        u.insertar(8, 7, 1);
                        u.insertar(9, 8, 1);
                        u.insertar(10, 9, 1);

                        a = new Conjuntos(5);
                        a.insertar(6, 0, 1);
                        a.insertar(7, 1, 1);
                        a.insertar(8, 2, 1);
                        a.insertar(9, 3, 1);
                        a.insertar(10, 4, 1);

                        b = new Conjuntos(5);
                        b.insertar(1, 0, 1);
                        b.insertar(2, 1, 1);
                        b.insertar(3, 2, 1);
                        b.insertar(4, 3, 1);
                        b.insertar(5, 4, 1);

                        c = new Conjuntos(5);
                        c.insertar(4, 0, 1);
                        c.insertar(5, 1, 1);
                        c.insertar(6, 2, 1);
                        c.insertar(7, 3, 1);
                        c.insertar(8, 4, 1);

                        break;

                    case 0:
                        System.exit(0);
                        break;

                }//fin switch
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "opcion no válida");
            }
        } while (opcion != 0);

    }

}
