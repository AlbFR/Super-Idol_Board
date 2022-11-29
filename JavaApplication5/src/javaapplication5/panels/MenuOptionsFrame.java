package javaapplication5.panels;
public class MenuOptionsFrame extends javax.swing.JFrame {

    public MenuOptionsFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private boolean flagLayerOne = true;
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawLine = new javax.swing.JButton();
        drawSquare = new javax.swing.JButton();
        selectSquare = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        selectEraser = new javax.swing.JButton();
        layerTwo = new javax.swing.JButton();
        selectUML = new javax.swing.JButton();
        layerOne = new javax.swing.JButton();
        selectColor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drawLine.setText("drawLine");
        drawLine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawLineMouseClicked(evt);
            }
        });

        drawSquare.setText("drawSquare");
        drawSquare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawSquareMouseClicked(evt);
            }
        });

        selectSquare.setText("selectSquare");
        selectSquare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectSquareMouseClicked(evt);
            }
        });

        jButton4.setText("iForgor");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        selectEraser.setText("selectEraser");
        selectEraser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectEraserMouseClicked(evt);
            }
        });

        layerTwo.setText("layerTwo");
        layerTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                layerTwoMouseClicked(evt);
            }
        });

        selectUML.setText("selectUML");
        selectUML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectUMLMouseClicked(evt);
            }
        });

        layerOne.setText("layerOne");
        layerOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                layerOneMouseClicked(evt);
            }
        });
        layerOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                layerOneActionPerformed(evt);
            }
        });

        selectColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Black", "Red", "Green", "Blue" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(drawLine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(drawSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(selectEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 95, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(selectUML, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(layerTwo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(layerOne, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drawLine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drawSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectUML, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(selectColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(layerOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(layerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void layerOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_layerOneActionPerformed
    }//GEN-LAST:event_layerOneActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void drawLineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawLineMouseClicked
        System.out.println("Draw Line Selected.");
    }//GEN-LAST:event_drawLineMouseClicked

    private void drawSquareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawSquareMouseClicked
        System.out.println("Draw Square Selected.");
    }//GEN-LAST:event_drawSquareMouseClicked

    private void selectSquareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectSquareMouseClicked
        System.out.println("Selection Square Selected.");
    }//GEN-LAST:event_selectSquareMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        System.out.println("I forgot what this one did hehe");
    }//GEN-LAST:event_jButton4MouseClicked

    private void selectEraserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectEraserMouseClicked
        System.out.println("Eraser Selected.");
    }//GEN-LAST:event_selectEraserMouseClicked

    private void selectUMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectUMLMouseClicked
        System.out.println("UML Menu Selected.");
    }//GEN-LAST:event_selectUMLMouseClicked

    private void layerOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_layerOneMouseClicked
        if(flagLayerOne == false){
            System.out.println("Moved to Layer 1");
            flagLayerOne = true;
        }else{
            System.out.println("Already in Layer 1");
        }
    }//GEN-LAST:event_layerOneMouseClicked

    private void layerTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_layerTwoMouseClicked
        if(flagLayerOne == true){
            System.out.println("Moved to Layer 2");
            flagLayerOne = false;
        }else{
            System.out.println("Already in Layer 2");
        }     
    }//GEN-LAST:event_layerTwoMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton drawLine;
    private javax.swing.JButton drawSquare;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton layerOne;
    private javax.swing.JButton layerTwo;
    private javax.swing.JComboBox<String> selectColor;
    private javax.swing.JButton selectEraser;
    private javax.swing.JButton selectSquare;
    private javax.swing.JButton selectUML;
    // End of variables declaration//GEN-END:variables
}
