/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author tanzanita
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        /*
        
        //Consulta dinamica
        ArrayList<String> provincia= new ArrayList<String>();        
        ArrayList<String> canton= new ArrayList<String>();
        ArrayList<String> distrito= new ArrayList<String>();
        ArrayList<String> rangoAno = new ArrayList<String>();
        ArrayList<String> consulta = new ArrayList<String>();
        ArrayList<String> edadQuinquenal = new ArrayList<String>();
        ArrayList<String> edad = new ArrayList<String>();
        ArrayList<String> sexo = new ArrayList<String>();
        ArrayList<String> rol = new ArrayList<String>();
        ArrayList<String> lesion = new ArrayList<String>();
        
        dtoDinamica = new DTODinamica(provincia,canton, distrito, rangoAno, consulta, edadQuinquenal, edad, sexo, rol, lesion);
        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxCanton = new javax.swing.JComboBox<>();
        jComboBoxDistrito = new javax.swing.JComboBox<>();
        jComboBoxAño = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        BtnComportamiento = new javax.swing.JToggleButton();
        BtnDinamica = new javax.swing.JToggleButton();
        BtnDinamica1 = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxLesion = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxRol = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaProvincias = new javax.swing.JTextArea();
        jPanelBase = new javax.swing.JPanel();
        jPanelComportamiento = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelDinamica = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPaneLibre = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Provincia");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cantón");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Distrito");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Año");

        jComboBoxCanton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abangares", "Acosta", "Aguirre o Quepos", "Alajuela", "Alajuelita", "Alvarado", "Aserrí", "Atenas", "Bagases", "Barva", "Belén", "Buenos Aires", "Cañas", "Carrillo", "Cartago", "Corredores", "Coto Brus", "Cuddidabat", "Desamparados", "Dota", "El Guarco", "escazú", "esparza", "Flores", "garabito", "Giocochea", "Golfito", "Grecia", "Guácimo", "Guatuso", "Heredia", "Hojancha", "Jiménez", "La Cruz", "La Unión", "León Cortés", "Liberia", "Limón", "Los Chiles", "Matina", "montes de Oca", "" }));

        jComboBoxDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2012", "2013", "2014", "2012-2013", "2013-2014", "2012-2014" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Indicadores");

        BtnComportamiento.setText("Comportamiento");
        BtnComportamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComportamientoActionPerformed(evt);
            }
        });

        BtnDinamica.setText("Dinamica");
        BtnDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDinamicaActionPerformed(evt);
            }
        });

        BtnDinamica1.setText("Libre");
        BtnDinamica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDinamica1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Sexo");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Desconocido" }));

        jLabel10.setText("Edad");

        jLabel11.setText("Lesion");

        jComboBoxLesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ileso", "Herido leve", "Herido grave", "Muerte" }));

        jLabel12.setText("Rol");

        jComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciclista", "Conductor", "Dueño de propiedad", "Motociclista", "Otro", "Pasajero Bus o Microbus", "Pasajero Carro", "Pasajero Moto", "Peatón" }));

        jTextAreaProvincias.setColumns(20);
        jTextAreaProvincias.setRows(5);
        jTextAreaProvincias.setText("Cartago\nSan José\nAlajuela\nHeredia\nPuntarenas\nGuanacaste\nLimón");
        jScrollPane2.setViewportView(jTextAreaProvincias);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(110, 110, 110))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldEdad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jComboBoxLesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jComboBoxRol, 0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jComboBoxCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4))
                                    .addComponent(jComboBoxDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnDinamica, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnDinamica1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnComportamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxLesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(BtnComportamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnDinamica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnDinamica1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBase.setLayout(new java.awt.CardLayout());

        jPanelComportamiento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("jLabel2");

        javax.swing.GroupLayout jPanelComportamientoLayout = new javax.swing.GroupLayout(jPanelComportamiento);
        jPanelComportamiento.setLayout(jPanelComportamientoLayout);
        jPanelComportamientoLayout.setHorizontalGroup(
            jPanelComportamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(jPanelComportamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelComportamientoLayout.createSequentialGroup()
                    .addGap(318, 318, 318)
                    .addComponent(jLabel7)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );
        jPanelComportamientoLayout.setVerticalGroup(
            jPanelComportamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
            .addGroup(jPanelComportamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelComportamientoLayout.createSequentialGroup()
                    .addGap(349, 349, 349)
                    .addComponent(jLabel7)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );

        jPanelBase.add(jPanelComportamiento, "card2");

        jPanelDinamica.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("jLabel2");

        javax.swing.GroupLayout jPanelDinamicaLayout = new javax.swing.GroupLayout(jPanelDinamica);
        jPanelDinamica.setLayout(jPanelDinamicaLayout);
        jPanelDinamicaLayout.setHorizontalGroup(
            jPanelDinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(jPanelDinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDinamicaLayout.createSequentialGroup()
                    .addGap(318, 318, 318)
                    .addComponent(jLabel8)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );
        jPanelDinamicaLayout.setVerticalGroup(
            jPanelDinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
            .addGroup(jPanelDinamicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDinamicaLayout.createSequentialGroup()
                    .addGap(349, 349, 349)
                    .addComponent(jLabel8)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );

        jPanelBase.add(jPanelDinamica, "card2");

        jPaneLibre.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Base");

        javax.swing.GroupLayout jPaneLibreLayout = new javax.swing.GroupLayout(jPaneLibre);
        jPaneLibre.setLayout(jPaneLibreLayout);
        jPaneLibreLayout.setHorizontalGroup(
            jPaneLibreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneLibreLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel2)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPaneLibreLayout.setVerticalGroup(
            jPaneLibreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneLibreLayout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel2)
                .addContainerGap(370, Short.MAX_VALUE))
        );

        jPanelBase.add(jPaneLibre, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnComportamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComportamientoActionPerformed
        //Eliminar paneles
        jPanelBase.removeAll();
        jPanelBase.repaint();
        jPanelBase.revalidate();
        //Agregar paneles
        jPanelBase.add(jPanelComportamiento);
        jPanelBase.repaint();
        jPanelBase.revalidate();
    }//GEN-LAST:event_BtnComportamientoActionPerformed

    
    private void BtnDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDinamicaActionPerformed
        //Eliminar paneles
        jPanelBase.removeAll();
        jPanelBase.repaint();
        jPanelBase.revalidate();
        //Agregar paneles
        jPanelBase.add(jPanelDinamica);
        jPanelBase.repaint();
        jPanelBase.revalidate();  
        obtenerDatosDinamica();
        
               
    }//GEN-LAST:event_BtnDinamicaActionPerformed
public void obtenerDatosDinamica(){
     ArrayList<String> canton= new ArrayList<String>();
     ArrayList<String> distrito= new ArrayList<String>();
     ArrayList<String> rangoAno= new ArrayList<String>();
     ArrayList<String> edad= new ArrayList<String>();
     ArrayList<String> sexo= new ArrayList<String>();
     ArrayList<String> rol= new ArrayList<String>();
     ArrayList<String> lesion = new ArrayList<String>();
     ArrayList<String> consulta = new ArrayList<String>();
     ArrayList<String> edadQuinquenal = new ArrayList<String>();
     
    //Nivel Pais, todas las provincias
    //Veridficar si se piden toas las provincias
     ArrayList<String> provincia= new ArrayList<String>();
        int size = jTextAreaProvincias.getLineCount();
        System.out.println("size: "+size);
        if(size > 1){
            jComboBoxCanton.enableInputMethods(false);
            jComboBoxDistrito.enableInputMethods(false);
            StringBuilder provincias = new StringBuilder();
            for(int i=0; i<size; i++){
            provincias.append("\n").append(jTextAreaProvincias.getLineCount());
            //muchas provincias no se pide canton ni distrito
            rangoAno.add(jComboBoxAño.getSelectedItem().toString());
            int ed = Integer.parseInt(jTextFieldEdad.getText());
            if(ed >= 0 && ed<=90){
                edad.add(jTextFieldEdad.getText());
                //calcular edad quinquenal
            }else{
                JOptionPane.showMessageDialog(null, "Error la edad no se encuentra del del rango de busqueda", "InfoBox: " + "ERROR", JOptionPane.INFORMATION_MESSAGE);
             }
            
            }
            sexo.add(jComboBoxSexo.getSelectedItem().toString());
            rol.add(jComboBoxRol.getSelectedItem().toString());
            lesion.add(jComboBoxLesion.getSelectedItem().toString());
            provincia.add(provincias.toString());
        
        }else{
            jComboBoxCanton.enableInputMethods(true);
            jComboBoxDistrito.enableInputMethods(true);
                        StringBuilder provincias = new StringBuilder();
            for(int i=0; i<size; i++){
            provincias.append("\n").append(jTextAreaProvincias.getLineCount());
            //muchas provincias no se pide canton ni distrito
            rangoAno.add(jComboBoxAño.getSelectedItem().toString());
            int ed = Integer.parseInt(jTextFieldEdad.getText());
            if(ed >= 0 && ed<=90){
                edad.add(jTextFieldEdad.getText());
                //calcular edad quinquenal
            }else{
                JOptionPane.showMessageDialog(null, "Error la edad no se encuentra del del rango de busqueda", "InfoBox: " + "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            sexo.add(jComboBoxSexo.getSelectedItem().toString());
            rol.add(jComboBoxRol.getSelectedItem().toString());
            lesion.add(jComboBoxLesion.getSelectedItem().toString());
            }
            provincia.add(provincias.toString()); 
        }
       
        //Cracion DTODinamica
        dtoDinamica = new DTODinamica(provincia,canton, distrito, rangoAno, consulta, edadQuinquenal, edad, sexo, rol, lesion);
        //Se pasa al conrolador
        controlador = new Controlador(dtoDinamica);
    
}
    private void BtnDinamica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDinamica1ActionPerformed
        //Eliminar paneles
        jPanelBase.removeAll();
        jPanelBase.repaint();
        jPanelBase.revalidate();
        //Agregar paneles
        jPanelBase.add(jPaneLibre);
        jPanelBase.repaint();
        jPanelBase.revalidate();
    }//GEN-LAST:event_BtnDinamica1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private DTODinamica dtoDinamica;
    private Controlador controlador;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnComportamiento;
    private javax.swing.JToggleButton BtnDinamica;
    private javax.swing.JToggleButton BtnDinamica1;
    private javax.swing.JComboBox<String> jComboBoxAño;
    private javax.swing.JComboBox<String> jComboBoxCanton;
    private javax.swing.JComboBox<String> jComboBoxDistrito;
    private javax.swing.JComboBox<String> jComboBoxLesion;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPaneLibre;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelComportamiento;
    private javax.swing.JPanel jPanelDinamica;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaProvincias;
    private javax.swing.JTextField jTextFieldEdad;
    // End of variables declaration//GEN-END:variables
}

