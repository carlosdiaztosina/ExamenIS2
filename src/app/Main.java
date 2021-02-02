package app;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {
    private Container contentPanel;
    
    private JPanel panelBotones;
    private JButton añadir;
    private JButton eliminar;
    
    private JTextArea textoDatos;
    
    public Main(){
        this.setTitle("Lsita de la Compra");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,762);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        contentPanel = getContentPane();
        contentPanel.setLayout(new BorderLayout(5,5));
        
        textoDatos = new JTextArea(20,20);
        textoDatos.setEditable(false);
        contentPanel.add(textoDatos , BorderLayout.CENTER);
        
        panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(5,5,5));
        
        añadir = new JButton("Añadir");
        añadir.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0){
               
           }
        });
        eliminar = new JButton("Eliminar");
        eliminar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent arg0){
               
           }
        });
        panelBotones.add(añadir);
        panelBotones.add(eliminar);
        contentPanel.add(panelBotones , BorderLayout.SOUTH);
        
        pack();
        this.setVisible(true);
        
    }
    
    
    
        
    public static void main(String[] args) {
        
        
        ProductoFinal p0 = new ProductoFinal("Arroz");
        ProductoFinal p1 = new ProductoFinal("Carne");
        ProductoFinal p2 = new ProductoFinal("Folios");
        
        GrupoProducto g0 = new GrupoProducto("Supermercado");
        GrupoProducto g1 = new GrupoProducto("Asadero");
        GrupoProducto g2 = new GrupoProducto("Libros");
        
        g0.añadir(p0);
        g0.añadir(p1);
        g0.añadir(p2);
                
        g0.setOrden();
        
        System.out.println(g0.print());
        
        g0.eliminar(p1);
        
        System.out.println(g0.print());
    }
    
}
