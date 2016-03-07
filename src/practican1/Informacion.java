
package practican1;

import Hoteles.HotelInternacionalMedellin;
import javax.swing.DefaultListModel;


public class Informacion extends javax.swing.JFrame {


    public Informacion() {
        initComponents();

    //posicion inicial    
    setLocationRelativeTo( null );    

        
String Him = "Hotel intercontinental de Medellin" ;       
        
//Creacion de hotel internacional de medellin
HotelInternacionalMedellin A = new HotelInternacionalMedellin( Him );        
        
//creacion de la lista        
DefaultListModel Lista = new DefaultListModel();

//************************************************************************************************************************+
//add element
//nombre del hotel
A.setNameHotel( Him );
Lista.addElement( A.getNamehotel( ) );

//numero de estrellas
Lista.addElement( A.Nstart( A.Estrellas ) );

//Clase del hotel
Lista.addElement( A.getClasshotel() );

//Lista.addElement ubicacion del hotel
Lista.addElement( A.Ubicacion( A.UbicacionH ) );

//habitaciones disponibles
Lista.addElement( "Habitaciones Disponibles : " + A.DispHabitaciones( A.HabitacionesDefault , A.HabitaOcupadas ) );

//Costo de habitaciones
Lista.addElement( "Valor por Habitacion : " + A.PrecioHabita );

//toma todos los elemento de la lista
Detalles.setModel( Lista );
//************************************************************************************************************************+



//************************************************************************************************************************+
//creacion de la lista Restaurante italiana       
DefaultListModel Lista2 = new DefaultListModel();
   
//comida italiana 
Lista2.addElement( A.Rizzoto( A.Rizzotto, A.CostoRizzoto ) );

//comida italiana 
Lista2.addElement( A.PastaBoloñesa( A.PastasBoloñesa, A.CostoPastasBoloñesa ) );

//toma todos los elemento de la lista2
Restaurante.setModel( Lista2 );

//************************************************************************************************************************+




//************************************************************************************************************************+
//creacion de la lista Restaurante peruana       
DefaultListModel Lista3 = new DefaultListModel();

//comida peruana
Lista3.addElement( A.PolloBrasa( A.PolloBrasa, A.CostoPolloBrasa ) );

//comida peruana
Lista3.addElement( A.Chifa( A.Chifa, A.CostoChifa ) );

//comida peruana
Lista3.addElement( A.Pescado( A.Pescado, A.CostoPescado) );


//toma todos los elemento de la lista2
Restaurante2.setModel( Lista3 );
//************************************************************************************************************************+


//************************************************************************************************************************+
//creacion de la lista Restaurante asiatica        
DefaultListModel Lista4 = new DefaultListModel();

//comida asiatica
Lista4.addElement( A.Bibimbap( A.Bibimbap , A.CostoBibimbap ) );

//comida asiatica
Lista4.addElement( A.Sukiyaki( A.Sukiyaki, A.CostoSukiyaki) );

Restaurante3.setModel( Lista4 );
//************************************************************************************************************************+




//************************************************************************************************************************+
//Servicios
DefaultListModel Lista5 = new DefaultListModel();

//Servicio de Transporte
Lista5.addElement( A.Transporte( A.Transporte ) );

//tour por la ciudad 
Lista5.addElement( A.Tour( A.Tour ) );

VIP.setModel( Lista5 );

//************************************************************************************************************************+

//************************************************************************************************************************+
//Actividades recreativas 
DefaultListModel Lista6 = new DefaultListModel();

//Servicio de Gimnasio
Lista6.addElement( A.Gimnasio( A.Gimnasio ) );

//Servicio de Spa
Lista6.addElement( A.Spa( A.Spa ) );

//cachas de squash
Lista6.addElement( A.Squash( A.Squash ) );

//servicio de piscina
Lista6.addElement( A.Piscina( A.Piscina ) );

Actividades.setModel( Lista6 );

//************************************************************************************************************************+


//:FIN DEL CONSTRUCTOR        
    }

    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Imagen1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Detalles = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Restaurante = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Restaurante2 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        Restaurante3 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        VIP = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        Actividades = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        Imagen1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edwin Mendez\\Documents\\NetBeansProjects\\PracticaN1\\imagenes\\intercontinental-medellin-3682862697-2x1.jpg")); // NOI18N
        Imagen1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel2.setText("- Hotel Intercontinental De Medellin -");

        jScrollPane1.setViewportView(Detalles);

        Restaurante.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setViewportView(Restaurante);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel3.setText("- Restaurante -");

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel4.setText("- Platos italianos  -");

        jScrollPane3.setViewportView(Restaurante2);

        jScrollPane4.setViewportView(Restaurante3);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel5.setText("- Platos Peruanos -");

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel6.setText("- Platos Asiaticos -");

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel7.setText("- Actividades Recreativas -");

        jScrollPane5.setViewportView(VIP);

        jScrollPane6.setViewportView(Actividades);

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel8.setText("- VIP -");

        jButton1.setText("- Menu Principal -");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(228, 228, 228))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Imagen1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//boton para volver a menu principal

PraticaDesarrollo Volver = new PraticaDesarrollo();
Volver.setVisible(true);

//cerrar esta ventana
dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Actividades;
    private javax.swing.JList<String> Detalles;
    private javax.swing.JLabel Imagen1;
    private javax.swing.JList<String> Restaurante;
    private javax.swing.JList<String> Restaurante2;
    private javax.swing.JList<String> Restaurante3;
    private javax.swing.JList<String> VIP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
