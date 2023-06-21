/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemainte;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author usuario
 */
public class prueba extends javax.swing.JFrame {

    /**
     * Creates new form prueba
     */
    public prueba() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ninstancia = new javax.swing.JTextField();
        contra = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        nombrebd = new javax.swing.JTextField();
        puerto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ninstancia2 = new javax.swing.JTextField();
        contra2 = new javax.swing.JTextField();
        usuario2 = new javax.swing.JTextField();
        nombrebd2 = new javax.swing.JTextField();
        puerto2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        GuardarConexion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablareplica = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_bitacora = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pasar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("Configuracion de Bases de Datos");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Base de Datos Origen");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Password");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 130, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Nombre Instancia");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 130, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Nombre Base de Datos");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Puerto");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 130, 20));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Nombre Usuario");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 130, 20));

        ninstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ninstanciaActionPerformed(evt);
            }
        });
        jPanel5.add(ninstancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 190, 30));
        jPanel5.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 190, 30));
        jPanel5.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 190, 30));
        jPanel5.add(nombrebd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 190, 30));
        jPanel5.add(puerto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 190, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Probar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 110, 50));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Base de Datos Destino");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Password");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 130, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Nombre Instancia");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 130, 20));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Nombre Base de Datos");
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 170, 20));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Puerto");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 130, 20));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Nombre Usuario");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 130, 20));

        ninstancia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ninstancia2ActionPerformed(evt);
            }
        });
        jPanel5.add(ninstancia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 190, 30));
        jPanel5.add(contra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, 190, 30));
        jPanel5.add(usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 190, 30));
        jPanel5.add(nombrebd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 190, 30));
        jPanel5.add(puerto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 190, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Probar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 710, 110, 50));

        GuardarConexion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        GuardarConexion.setText("Guardar");
        jPanel5.add(GuardarConexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 780, 190, 60));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 938, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Bases ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tablas BD Origen :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 15, -1, -1));

        tablareplica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tabla", "Operacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablareplica);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 104, 250, 333));

        tabla_bitacora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tabla", "Operacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabla_bitacora);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 85, 240, 333));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Sin Replicar");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 58, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Replicando");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 46, -1, -1));

        pasar.setText(">>>>>");
        pasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarActionPerformed(evt);
            }
        });
        jPanel3.add(pasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 114, -1, -1));

        regresar.setText("<<<<<");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel3.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 217, -1, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel3.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 100, 30));

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 110, 30));

        jTabbedPane1.addTab("Gestiones", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // busacar tablas origen

        System.out.println("pruebaaaaa");
        String urlPostgreSQL = "jdbc:postgresql://localhost:5432/concesionario_autos";
        String usuarioPostgreSQL = "postgres";
        String contraseñaPostgreSQL = "juan2003";
        ArrayList<String> nombresTablas = new ArrayList<>();
        Conexiones conexiones = new Conexiones();

        try {
            Connection conexionPostgreSQL = conexiones.conectarPostgreSQL(urlPostgreSQL, usuarioPostgreSQL, contraseñaPostgreSQL);

            // Consulta para obtener los datos de la tabla bitacora
            String consultaBitacora = "SELECT id, tabla, operacion FROM bitacora";
            Statement statementBitacora = conexionPostgreSQL.createStatement();
            ResultSet resultadoBitacora = statementBitacora.executeQuery(consultaBitacora);

            // Obtener metadatos de la consulta
            ResultSetMetaData metaDataBitacora = resultadoBitacora.getMetaData();
            int columnCount = metaDataBitacora.getColumnCount();

            // Crear un DefaultTableModel para la JTable
            // Crear un DefaultTableModel para la JTable
            DefaultTableModel modeloTabla = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Operacion");

            // Agregar los datos al modelo de tabla
            while (resultadoBitacora.next()) {
                Object[] fila = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    fila[i - 1] = resultadoBitacora.getObject(i);
                }
                modeloTabla.addRow(fila);
            }

            // Cerrar los recursos
            resultadoBitacora.close();
            statementBitacora.close();
            conexionPostgreSQL.close();

            tabla_bitacora.setModel(modeloTabla);

            // Utiliza la variable "tablaBitacora" en tu interfaz gráfica para mostrar la JTable
            // Asegúrate de agregarla correctamente a tu contenedor o panel correspondiente.
        } catch (SQLException e) {
            System.out.println("Error al conectar a PostgreSQL: " + e.getMessage());
        }

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        ArrayList<String> ids = new ArrayList<>();
// Obtener el modelo de la JTable
        TableModel modeloTabla = tablareplica.getModel();

// Recorrer las filas de la JTable y obtener los IDs
        for (int row = 0; row < modeloTabla.getRowCount(); row++) {
            String id = (String) modeloTabla.getValueAt(row, 0);
            ids.add(id);
        }
        Conexiones conexiones = new Conexiones();
        String urlOracle = "jdbc:oracle:thin:@localhost:1521:";
        String usuarioOracle = "SYSTEM";
        String contraseñaOracle = "juan2003";
        String urlPostgreSQL = "jdbc:postgresql://localhost:5432/concesionario_autos";
        String usuarioPostgreSQL = "postgres";
        String contraseñaPostgreSQL = "juan2003";
// Imprimir los IDs almacenados en el ArrayList
        for (int i = 0; i < ids.size(); i++) {
            try {
                // Conexión a la base de datos de origen (PostgreSQL)
                Connection conexionPostgreSQL = conexiones.conectarPostgreSQL(urlPostgreSQL, usuarioPostgreSQL, contraseñaPostgreSQL);
                // Conexión a la base de datos de destino (Oracle)
                Connection conexionOracle = conexiones.conectarOracle(urlOracle, usuarioOracle, contraseñaOracle);
                // ID deseado
                int id = (Integer.parseInt(ids.get(i)));
                System.out.println(id);
                // Consulta para obtener el registro con el ID deseado y operación "insercion" de la tabla bitacora en la base de datos de origen
                String consultaSelect = "SELECT tabla, datos_nuevos FROM bitacora WHERE id = ? AND operacion = 'inserción'";
                PreparedStatement statementSelect = conexionPostgreSQL.prepareStatement(consultaSelect);
                statementSelect.setInt(1, id);
                ResultSet resultadoSelect = statementSelect.executeQuery();

                // Verificar si se obtuvo un resultado
                if (resultadoSelect.next()) {
                    // Obtener los valores de la columna "tabla" y "datos_nuevos"
                    String tabla = resultadoSelect.getString("tabla");
                    String datosNuevos = resultadoSelect.getString("datos_nuevos");

                    // Construir la consulta de inserción en la base de datos de destino
                    int id2 = Integer.parseInt(extractValue(datosNuevos, "id"));
                    String marca = extractValue(datosNuevos, "marca");
                    String modelo = extractValue(datosNuevos, "modelo");
                    int anio = Integer.parseInt(extractValue(datosNuevos, "anio"));
                    int precio = Integer.parseInt(extractValue(datosNuevos, "precio"));
                    String color = extractValue(datosNuevos, "color");
                    String tipocombustible = extractValue(datosNuevos, "tipocombustible");

                    //  System.out.println("'" + marca + "', '" + modelo + "', " + anio + ", " + precio + ", '" + color + "', '" + tipocombustible + "'");
                    System.out.println("'" + id2 + "', '" + marca + "', '" + modelo + "', " + anio + ", " + precio + ", '" + color + "', '" + tipocombustible + "'");

                    /////modificar string datosnuevos consultas 
                    String consultaInsert = "INSERT INTO " + tabla + "(ID, Marca, Modelo, Anio, Precio, Color, TipoCombustible) VALUES (" + id + ", '" + marca + "', '" + modelo + "', " + anio + ", " + precio + ", '" + color + "', '" + tipocombustible + "'" + ");";
                    System.out.println(consultaInsert);
                    // Ejecutar la consulta de inserción en la base de datos de destino
                    Statement statementInsert = conexionOracle.createStatement();
                    statementInsert.executeUpdate(consultaInsert);
                    conexionOracle.commit();

                    System.out.println("Se realizó la inserción en la tabla " + tabla + " de la base de datos de destino.");
                } else {
                    System.out.println("No se encontró ningún registro con ID " + id + " y operación 'insercion' en la tabla bitacora.");
                }
                resultadoSelect.close();
                statementSelect.close();
                conexionPostgreSQL.close();
                conexionOracle.close();

            } catch (SQLException e) {
                System.out.println("Error al ejecutar la consulta o realizar la inserción: " + e.getMessage());
            }

        }

    }//GEN-LAST:event_guardarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        String nombreSeleccionado = "";
        String tabla = "";
        String operacion = "";
        int filaSeleccionada = tablareplica.getSelectedRow();

        if (filaSeleccionada != -1) {
            nombreSeleccionado = tablareplica.getValueAt(filaSeleccionada, 0).toString();
            tabla = tablareplica.getValueAt(filaSeleccionada, 1).toString();
            operacion = tablareplica.getValueAt(filaSeleccionada, 2).toString();
        }
        //regresar a la tabla normal
        DefaultTableModel tablanom = (DefaultTableModel) tabla_bitacora.getModel();
        Object[] fila = {nombreSeleccionado, tabla, operacion};
        tablanom.addRow(fila);
        System.out.println("Nombre seleccionado: " + nombreSeleccionado);
        //eliminarlo de la tabla 1
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tablareplica.getModel();
            modelo.removeRow(filaSeleccionada);
        }
    }//GEN-LAST:event_regresarActionPerformed

    private void pasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarActionPerformed
        // TODO add your handling code here:
        String nombreSeleccionado = "";
        String tabla = "";
        String operacion = "";
        int filaSeleccionada = tabla_bitacora.getSelectedRow();

        if (filaSeleccionada != -1) {
            nombreSeleccionado = tabla_bitacora.getValueAt(filaSeleccionada, 0).toString();
            tabla = tabla_bitacora.getValueAt(filaSeleccionada, 1).toString();
            operacion = tabla_bitacora.getValueAt(filaSeleccionada, 2).toString();
        }
        //llenar tabla replica
        DefaultTableModel tablanom = (DefaultTableModel) tablareplica.getModel();
        Object[] fila = {nombreSeleccionado, tabla, operacion};
        tablanom.addRow(fila);
        //  System.out.println("Nombre seleccionado: " + nombreSeleccionado);
        //eliminarlo de la tabla 1
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_bitacora.getModel();
            modelo.removeRow(filaSeleccionada);
        }
    }//GEN-LAST:event_pasarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // busacar tablas origen
        DefaultTableModel modeloTabla2 = new DefaultTableModel();

        // Agregar las columnas al modelo de tabla
        modeloTabla2.addColumn("ID");
        modeloTabla2.addColumn("Nombre");
        modeloTabla2.addColumn("Operacion");

        tablareplica.setModel(modeloTabla2);
        System.out.println("pruebaaaaa");
        String urlPostgreSQL = "jdbc:postgresql://localhost:5432/concesionario_autos";
        String usuarioPostgreSQL = "postgres";
        String contraseñaPostgreSQL = "juan2003";
        ArrayList<String> nombresTablas = new ArrayList<>();
        Conexiones conexiones = new Conexiones();

        try {
            Connection conexionPostgreSQL = conexiones.conectarPostgreSQL(urlPostgreSQL, usuarioPostgreSQL, contraseñaPostgreSQL);

            // Consulta para obtener los datos de la tabla bitacora
            String consultaBitacora = "SELECT id, tabla, operacion FROM bitacora";
            Statement statementBitacora = conexionPostgreSQL.createStatement();
            ResultSet resultadoBitacora = statementBitacora.executeQuery(consultaBitacora);

            // Obtener metadatos de la consulta
            ResultSetMetaData metaDataBitacora = resultadoBitacora.getMetaData();
            int columnCount = metaDataBitacora.getColumnCount();

            // Crear un DefaultTableModel para la JTable
            // Crear un DefaultTableModel para la JTable
            DefaultTableModel modeloTabla = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Operacion");

            // Agregar los datos al modelo de tabla
            while (resultadoBitacora.next()) {
                Object[] fila = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    fila[i - 1] = resultadoBitacora.getObject(i);
                }
                modeloTabla.addRow(fila);
            }

            // Cerrar los recursos
            resultadoBitacora.close();
            statementBitacora.close();
            conexionPostgreSQL.close();

            tabla_bitacora.setModel(modeloTabla);

            // Utiliza la variable "tablaBitacora" en tu interfaz gráfica para mostrar la JTable
            // Asegúrate de agregarla correctamente a tu contenedor o panel correspondiente.
        } catch (SQLException e) {
            System.out.println("Error al conectar a PostgreSQL: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void ninstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ninstanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ninstanciaActionPerformed

    private void ninstancia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ninstancia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ninstancia2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //probar conexion oracle        // TODO add your handling code here:
        String instancia=ninstancia.getText();
        String nombre=nombrebd.getText();
        String puerto2=puerto.getText();
        String usuario2=usuario.getText();
        String contrase=contra.getText();
      //   String urlPostgreSQL = "jdbc:postgresql://localhost:5432/concesionario_autos";
     //  String urlPostgreSQL2 = "jdbc:postgresql://localhost:5432/concesionario_autos";
       String urlPostgreSQL="jdbc:"+instancia+"://localhost:"+puerto2+"/"+nombre;
        String usuarioPostgreSQL = usuario2;
        String contraseñaPostgreSQL = contrase;
        
        Conexiones conexiones = new Conexiones();
        try {
            Connection conexionPostgreSQL = conexiones.conectarPostgreSQL(urlPostgreSQL, usuarioPostgreSQL, contraseñaPostgreSQL);

            conexionPostgreSQL.close(); // Cerrar la conexión

             JOptionPane.showMessageDialog(null, "Si conecto postgress exitosamente");
            conexionPostgreSQL.close(); // Cerrar la conexión
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a PostgreSQL: " + e.getMessage());
           
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // probar conexion oracle 
         String instancia=ninstancia2.getText();
        String nombre=nombrebd2.getText();
        String puerto=puerto2.getText();
        String usuario=usuario2.getText();
        String contrase=contra2.getText();
        //  String urlOracle = "jdbc:oracle:thin:@localhost:1521:";
           String urlOracle = "jdbc:"+instancia+":thin:@localhost:"+puerto+":"+nombre;
        String usuarioOracle = usuario;
        String contraseñaOracle = contrase;
         Conexiones conexiones = new Conexiones();
        try {
            Connection conexionOracle = conexiones.conectarOracle(urlOracle, usuarioOracle, contraseñaOracle);
           
              JOptionPane.showMessageDialog(null, "Si conecto oracle exitosamente");
            // Realizar operaciones con la conexión a Oracle
            
            conexionOracle.close(); // Cerrar la conexión
        } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, "Error al conectar a Oracle: " + e.getMessage());
            System.out.println("Error al conectar a Oracle: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    public static String extractValue(String input, String key) {
        int keyIndex = input.indexOf("\"" + key + "\"");
        String temp = input.substring(keyIndex + key.length() + 3); // +3 to account for the ": "
        int endIndex = temp.indexOf(",");
        if (endIndex == -1) { //if this key-value pair is the last one in the string
            endIndex = temp.indexOf("}");
        }

        return temp.substring(0, endIndex).replace("\"", "").trim(); //remove any quotes and trailing spaces
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarConexion;
    private javax.swing.JTextField contra;
    private javax.swing.JTextField contra2;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField ninstancia;
    private javax.swing.JTextField ninstancia2;
    private javax.swing.JTextField nombrebd;
    private javax.swing.JTextField nombrebd2;
    private javax.swing.JButton pasar;
    private javax.swing.JTextField puerto;
    private javax.swing.JTextField puerto2;
    private javax.swing.JButton regresar;
    private javax.swing.JTable tabla_bitacora;
    private javax.swing.JTable tablareplica;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuario2;
    // End of variables declaration//GEN-END:variables
}