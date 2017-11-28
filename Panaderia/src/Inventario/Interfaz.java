///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Inventario;
//import javax.swing.table.DefaultTableModel;
///**
// *
// * @author Familia Bastidas
// */
//public class Interfaz {
//    private BaseDatos db = new BaseDatos();
//    private Object[][] dtPersona;
//
//       private void Actualizar_Tabla(){
//        //actualiza los datos de la tabla realizando una consulta a la base de datos
//        String[] columNames = {"Codigo" ,"Nombre","Apellido","Edad"};
//        dtPersona = db.Select_Persona();
//        // se colocan los datos en la tabla
//        DefaultTableModel datos = new DefaultTableModel(dtPersona,columNames);
//        jTable1.setModel(datos);
//} 
//    public Interfaz() {
//        initComponents();
//        this.setTitle("JTable editable * http://www.jc-mouse.net/");
//
//        Actualizar_Tabla();
//        //oculta columna ID
//        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
//        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
//        jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
//        jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
//        //editor de caldas
//        jTable1.getColumnModel().getColumn( 1 ).setCellEditor(new MyTableCellEditor(db,"p_nombre"));//Columna Nombre
//        jTable1.getColumnModel().getColumn( 2 ).setCellEditor(new MyTableCellEditor(db,"p_apellido"));//Columna Apellido
//        jTable1.getColumnModel().getColumn( 3 ).setCellEditor(new MyTableCellEditor(db,"p_edad"));//Columna Edad
//    }
//
//}
//
