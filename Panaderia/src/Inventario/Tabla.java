///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package Inventario;

import javax.swing.JTable; 
import javax.swing.JScrollPane; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;

public class Tabla extends JFrame {

public Tabla() { 
super("Ejemplo 1");

//Array bidimensional de objetos con los datos de la tabla 
Object[][] data = { 
{"Mary", "Campione", "Esquiar", new Integer(5), new Boolean(false)}, 
{"Lhucas", "Huml", "Patinar", new Integer(3), new Boolean(true)}, 
{"Kathya", "Walrath", "Escalar", new Integer(2), new Boolean(false)}, 
{"Marcus", "Andrews", "Correr", new Integer(7), new Boolean(true)}, 
{"Angela", "Lalth", "Nadar", new Integer(4), new Boolean(false)} 
};

//Array de ‘String’ con los titulos de las columnas 
String[] columnNames = {"Nombre", "Apellido", "Pasatiempo", "Años de Practica", "Soltero(a)"};

//Creacion de la tabla 
final JTable table = new JTable(data, columnNames); 
table.setPreferredScrollableViewportSize(new Dimension(500, 80));

//Creamos un scrollpanel y se lo agregamos a la tabla 
JScrollPane scrollpane = new JScrollPane(table);

//Agregamos el scrollpanel al contenedor 
getContentPane().add(scrollpane, BorderLayout.CENTER);

//manejamos la salida 
addWindowListener(new WindowAdapter() {

public void windowClosing(WindowEvent e) { 
System.exit(0); 
} 
}); 
}

public static void main(String ar[]) { 
Tabla frame = new Tabla(); 
frame.pack(); 
frame.setVisible(true); 
} 

}
