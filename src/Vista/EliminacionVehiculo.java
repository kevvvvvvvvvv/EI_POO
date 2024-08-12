
package Vista;

import Controlador.BuscarTodoEquipo;
import Controlador.BuscarTodoPiloto;
import Controlador.BuscarTodoVehiculo;
import Controlador.EliminarRegistroVehiculo;
import Controlador.MostrarDatosEquipo;
import Controlador.MostrarDatosPiloto;
import Controlador.MostrarDatosVehiculo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class EliminacionVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaPiloto
     */
    public EliminacionVehiculo() {
        initComponents();
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
        mostrar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        mp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehiculo = new javax.swing.JTable();
        metodoBusqueda = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        parametro = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        mp.setText("Menu principal");
        mp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpActionPerformed(evt);
            }
        });

        vehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Modelo", "Número", "Peso", "Velocidad máxima", "Color", "ID equipo", "ID piloto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vehiculo);

        metodoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Mostrar todos", " " }));

        jLabel1.setText("Método de búsqueda:");

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 916, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(metodoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrar)
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminar)
                .addGap(101, 101, 101)
                .addComponent(mp)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metodoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrar)
                    .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(mp)
                    .addComponent(eliminar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mpActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        MenuBusqueda  menub = new MenuBusqueda();
        menub.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        
        MostrarDatosVehiculo mdv = new MostrarDatosVehiculo();
        BuscarTodoVehiculo btv = new BuscarTodoVehiculo();
        
        int opc = metodoBusqueda.getSelectedIndex();
        
        try {
            mdv.mostrar(btv.buscar(), vehiculo);
        } catch (Exception ex) {
            Logger.getLogger(EliminacionVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_mostrarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

    int opc = vehiculo.getSelectedRow();
    
    if(opc!=-1 && vehiculo.getValueAt(opc, 0)!=null){
        EliminarRegistroVehiculo erv = new EliminarRegistroVehiculo();
        String id = vehiculo.getValueAt(opc, 0).toString();
        String [] btn  ={"Cancelar","Confirmar"};
        int sele = JOptionPane.showOptionDialog(this, "¿Deseas eliminar a este vehiculo?", "Confirmacion", 0, 0, null, btn, this);
        if(sele==JOptionPane.NO_OPTION){
            try {
                erv.eliminar(id);
                DefaultTableModel modelo =(DefaultTableModel) vehiculo.getModel();
                modelo.setRowCount(0); 
                JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente");
            }catch (Exception ex) {
                Logger.getLogger(EliminacionVehiculo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }else{
        JOptionPane.showMessageDialog(null,"Seleccione un dato");
    }

    }//GEN-LAST:event_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> metodoBusqueda;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton mp;
    private javax.swing.JTextField parametro;
    private javax.swing.JButton regresar;
    private javax.swing.JTable vehiculo;
    // End of variables declaration//GEN-END:variables
}
