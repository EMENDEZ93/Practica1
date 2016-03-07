
package practican1;

import Hoteles.HotelAlamos;
import Hoteles.HotelPortonMedellin;
import javax.swing.DefaultListModel;


public class Informacion3 extends javax.swing.JFrame {


    public Informacion3() {
        initComponents();

    //posicion inicial    
    setLocationRelativeTo( null );    

        
String Ha = "Hotel Álamos" ;       
        
//Creacion de hotel
HotelAlamos A = new HotelAlamos( Ha );       
        
//creacion de la lista        
DefaultListModel Lista = new DefaultListModel();

//************************************************************************************************************************+
//add element
//nombre del hotel
A.setNameHotel( Ha );
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
//creacion de la lista Restaurante tradicional        
DefaultListModel Lista2 = new DefaultListModel();
   
//comida Tradicional bandeja paisa
Lista2.addElement( A.BandejaPaisa( A.BandejaPaisa, A.CostoBandejaPaisa ) );

//comida Tradicional filete res
Lista2.addElement( A.FiletesRes( A.FiletesRes, A.CostoFiletesRes ) );

//comida Tradicional filete cerdo
Lista2.addElement( A.FileteCerdo( A.FileteCerdo, A.CostoFileteCerdo ) );

//comida Tradicional filete pollo
Lista2.addElement( A.FiletePollo( A.FiletePollo, A.CostoFiletePollo ) );

//toma todos los elemento de la lista2
Restaurante.setModel( Lista2 );

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
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        Imagen1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edwin Mendez\\Documents\\NetBeansProjects\\PracticaN1\\imagenes\\alamosssss.jpg")); // NOI18N
        Imagen1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel2.setText("- Hotel Álamos -");

        jScrollPane1.setViewportView(Detalles);

        Restaurante.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setViewportView(Restaurante);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel3.setText("- Restaurante -");

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        jLabel5.setText("- Platos Tradicionales -");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(214, 214, 214))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(170, 170, 170)))))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
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
Volver.setVisible( true );

//cerrar esta ventana
dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Detalles;
    private javax.swing.JLabel Imagen1;
    private javax.swing.JList<String> Restaurante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
