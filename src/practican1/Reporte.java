
package practican1;

import Hoteles.HotelInternacionalMedellin;
import Personas.EfraínSantos;
import Personas.JulianRoman;
import Personas.MarceloSalerno;
import Personas.MartinPerez;
import javax.swing.DefaultListModel;


public class Reporte extends javax.swing.JFrame {

    /**
     * Creates new form Reporte
     */
    public Reporte() {
        initComponents();

    //posicion inicial    
    setLocationRelativeTo( null );    
     
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Actividades = new javax.swing.JLabel();
        Hotel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JGimnasio = new javax.swing.JRadioButton();
        JSpa = new javax.swing.JRadioButton();
        JPiscina = new javax.swing.JRadioButton();
        JSquash = new javax.swing.JRadioButton();
        Nombre = new javax.swing.JLabel();
        Cargo = new javax.swing.JLabel();
        dias = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));

        jScrollPane1.setViewportView(jList1);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel1.setText("Nombre : ");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel2.setText("Cargo :");

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel3.setText("- Registro -");

        Actividades.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        Actividades.setText("- Actividades Recreacionales -");

        Hotel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        Hotel.setText("- hotel Intercontinental de Medellin - ");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel6.setText("Reserva por Dias :");

        jButton1.setText("- Caso Nº1 - ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JGimnasio.setText("Gimnasio");

        JSpa.setText("SPA");

        JPiscina.setText("Piscina");
        JPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPiscinaActionPerformed(evt);
            }
        });

        JSquash.setText("Squash");

        Nombre.setText("Efraín Santos");

        Cargo.setText("Presidente de la Empresa Bimbo");

        dias.setText("5");

        jButton2.setText("- Caso Nº2 -");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("- Caso Nº3 -");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("- Caso Nº4 -");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(250, 250, 250))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(66, 66, 66)
                                .addComponent(jButton2))
                            .addComponent(jLabel3)
                            .addComponent(Hotel)
                            .addComponent(Actividades))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Cargo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JGimnasio)
                                    .addComponent(JSquash))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JPiscina)
                                    .addComponent(JSpa))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton3)
                .addGap(70, 70, 70)
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Hotel)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Cargo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dias))
                .addGap(18, 18, 18)
                .addComponent(Actividades)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JGimnasio)
                    .addComponent(JSpa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSquash)
                    .addComponent(JPiscina))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jButton5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jButton5.setText("- Menu Principal -");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Caso Nº1

//se hagan visible los servicios       
JPiscina.setVisible(true);
JSquash.setVisible(true);
JGimnasio.setVisible(true);
JSpa.setVisible(true);
Actividades.setVisible(true);


//llamar clase con las variables de efrain santos
EfraínSantos Efra = new EfraínSantos();

//nombre del hotel donde se hospeda efrain
Hotel.setText( Efra.getNameHotel() );

//nombre Completo del cliente "Efrain"
Efra.setNombre( Efra.Nombre );
Nombre.setText( Efra.getNombre() );

//cargo del cliente
Efra.setCargo( Efra.Cargo );
Cargo.setText( Efra.getCargo( ) );
        
//Dias de hospedaje
dias.setText( Efra.DiasHospedaje );
        
//seleccionar por default los servicio de piscina y squash       
JPiscina.setSelected( true );

JSquash.setSelected( true );


//______________________________________________________________________

          
//creacion de la lista        
DefaultListModel Lista = new DefaultListModel();
Lista.addElement("***********************************************************" );

//hotel en la lista
Lista.addElement( Efra.getNameHotel() );

Lista.addElement("***********************************************************" );

//nombre del cliente
Lista.addElement( Efra.getNombre() );

//cargo del cliente
Lista.addElement( Efra.getCargo() );

Lista.addElement("Tomo los Servicios : ");

//servicio de piscina
Lista.addElement( Efra.Piscina( Efra.Servicio1 ) );

//servicio de squash
Lista.addElement( Efra.Squash( Efra.Servicio2 ) );

Lista.addElement( "Reservado : " + Efra.DiasHospedaje + " Dias" );

Lista.addElement("***********************************************************" );

jList1.setModel(Lista);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void JPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPiscinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPiscinaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

//anular los servicio de recreacion
JGimnasio.setVisible(false);
JSpa.setVisible(false);
JPiscina.setVisible(false);
JSquash.setVisible(false);
Actividades.setVisible(false);

//Caso nº2
//llamar clase con las variables de emarcelo salerno
MarceloSalerno Marc = new MarceloSalerno();

//nombre de hotel a hospedar
Hotel.setText( Marc.getNameHotel() );

//nombre del cliente "marcelo salerno"
Marc.setNombre( Marc.Nombre );
Nombre.setText( Marc.getNombre() );

//cargo del cliente
Marc.setCargo( Marc.Cargo );
Cargo.setText( Marc.getCargo());
        
dias.setText( Marc.DiasHospedaje );

//*************************************************



//*************************************************
//creacion de la lista        
DefaultListModel Lista = new DefaultListModel();
Lista.addElement("***********************************************************" );
//nombre del hotel
Lista.addElement( Marc.getNameHotel() );

Lista.addElement("***********************************************************" );

//nombre del cliente
Lista.addElement( Marc.getNombre() );

Lista.addElement( Marc.getCargo() );

Lista.addElement( "Reservado : " + Marc.DiasHospedaje + " Dias" );

Lista.addElement("***********************************************************" );

jList1.setModel(Lista);





    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//Caso nº3
        
//anular los servicio de recreacion
JGimnasio.setVisible(false);
JSpa.setVisible(false);
JPiscina.setVisible(false);
JSquash.setVisible(false);
Actividades.setVisible(false);

//llamar clase con las variables de emarcelo salerno
MartinPerez Mart = new MartinPerez();

//nombre de hotel a hospedar
Hotel.setText( Mart.getNameHotel() );

//nombre del cliente "marcelo salerno"
Mart.setNombre( Mart.Nombre );
Nombre.setText( Mart.getNombre() );

//cargo del cliente
Mart.setCargo( Mart.Cargo );
Cargo.setText( Mart.getCargo());
        
dias.setText( Mart.DiasHospedaje );

//*************************************************



//*************************************************
//creacion de la lista        
DefaultListModel Lista = new DefaultListModel();
Lista.addElement("***********************************************************" );
//nombre del hotel
Lista.addElement( Mart.getNameHotel() );

Lista.addElement("***********************************************************" );

//nombre del cliente
Lista.addElement( Mart.getNombre() );

Lista.addElement( Mart.getCargo() );

Lista.addElement( "Reservado : " + Mart.DiasHospedaje + " Dias" );

Lista.addElement("***********************************************************" );

jList1.setModel(Lista);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//Caso nº4
        
//anular los servicio de recreacion
JGimnasio.setVisible(false);
JSpa.setVisible(false);
JPiscina.setVisible(false);
JSquash.setVisible(false);
Actividades.setVisible(false);

//llamar clase con las variables de emarcelo salerno
JulianRoman Jul = new JulianRoman();

//nombre de hotel a hospedar
Hotel.setText( Jul.getNameHotel() );

//nombre del cliente "marcelo salerno"
Jul.setNombre( Jul.Nombre );
Nombre.setText( Jul.getNombre() );

//cargo del cliente
Jul.setCargo( Jul.Cargo );
Cargo.setText( Jul.getCargo());
        
dias.setText( Jul.DiasHospedaje );

//*************************************************



//*************************************************
//creacion de la lista        
DefaultListModel Lista = new DefaultListModel();
Lista.addElement("***********************************************************" );
//nombre del hotel
Lista.addElement( Jul.getNameHotel() );

Lista.addElement("***********************************************************" );

//nombre del cliente
Lista.addElement( Jul.getNombre() );

Lista.addElement( Jul.getCargo() );

Lista.addElement( "Reservado : " + Jul.DiasHospedaje + " Dias" );

Lista.addElement("***********************************************************" );

jList1.setModel(Lista);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//boton para volver a menu principal

PraticaDesarrollo Volver = new PraticaDesarrollo();
Volver.setVisible( true );

//cerrar esta ventana
dispose();

    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Actividades;
    private javax.swing.JLabel Cargo;
    private javax.swing.JLabel Hotel;
    private javax.swing.JRadioButton JGimnasio;
    private javax.swing.JRadioButton JPiscina;
    private javax.swing.JRadioButton JSpa;
    private javax.swing.JRadioButton JSquash;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel dias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
