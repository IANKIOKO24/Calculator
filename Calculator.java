/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculations;

/**
 *
 * @author GAMER
 */
public class Calculator extends javax.swing.JFrame {

    double firstnumber;
    double secondnumber;
    double result;
    String operations;
    
    public Calculator() {
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

        jtxtDisplay = new javax.swing.JTextField();
        jbt1 = new javax.swing.JButton();
        jbt2 = new javax.swing.JButton();
        jbt3 = new javax.swing.JButton();
        jbt4 = new javax.swing.JButton();
        jbt5 = new javax.swing.JButton();
        jbt6 = new javax.swing.JButton();
        jbt7 = new javax.swing.JButton();
        jbt8 = new javax.swing.JButton();
        jbt9 = new javax.swing.JButton();
        jbt0 = new javax.swing.JButton();
        jbt11 = new javax.swing.JButton();
        jbt12 = new javax.swing.JButton();
        jbt13 = new javax.swing.JButton();
        jbt14 = new javax.swing.JButton();
        jbt15 = new javax.swing.JButton();
        jbt16 = new javax.swing.JButton();
        jbt17 = new javax.swing.JButton();
        jbt20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtDisplay.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });

        jbt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt1.setText("1");
        jbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt1ActionPerformed(evt);
            }
        });
        jbt1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt1PropertyChange(evt);
            }
        });

        jbt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt2.setText("2");
        jbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt2ActionPerformed(evt);
            }
        });
        jbt2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt2PropertyChange(evt);
            }
        });

        jbt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt3.setText("3");
        jbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt3ActionPerformed(evt);
            }
        });
        jbt3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt3PropertyChange(evt);
            }
        });

        jbt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt4.setText("4");
        jbt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt4ActionPerformed(evt);
            }
        });
        jbt4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt4PropertyChange(evt);
            }
        });

        jbt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt5.setText("5");
        jbt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt5ActionPerformed(evt);
            }
        });
        jbt5.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt5PropertyChange(evt);
            }
        });

        jbt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt6.setText("6");
        jbt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt6ActionPerformed(evt);
            }
        });
        jbt6.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt6PropertyChange(evt);
            }
        });

        jbt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt7.setText("7");
        jbt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt7ActionPerformed(evt);
            }
        });
        jbt7.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt7PropertyChange(evt);
            }
        });

        jbt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt8.setText("8");
        jbt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt8ActionPerformed(evt);
            }
        });
        jbt8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt8PropertyChange(evt);
            }
        });

        jbt9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt9.setText("9");
        jbt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt9ActionPerformed(evt);
            }
        });
        jbt9.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt9PropertyChange(evt);
            }
        });

        jbt0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt0.setText("0");
        jbt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt0ActionPerformed(evt);
            }
        });
        jbt0.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt0PropertyChange(evt);
            }
        });

        jbt11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt11.setText("+");
        jbt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt11ActionPerformed(evt);
            }
        });
        jbt11.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt11PropertyChange(evt);
            }
        });

        jbt12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt12.setText("-");
        jbt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt12ActionPerformed(evt);
            }
        });
        jbt12.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt12PropertyChange(evt);
            }
        });

        jbt13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt13.setText("/");
        jbt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt13ActionPerformed(evt);
            }
        });
        jbt13.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt13PropertyChange(evt);
            }
        });

        jbt14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt14.setText("*");
        jbt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt14ActionPerformed(evt);
            }
        });
        jbt14.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt14PropertyChange(evt);
            }
        });

        jbt15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt15.setText("+/-");
        jbt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt15ActionPerformed(evt);
            }
        });
        jbt15.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt15PropertyChange(evt);
            }
        });

        jbt16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt16.setText(".");
        jbt16.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt16PropertyChange(evt);
            }
        });

        jbt17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt17.setText("C");
        jbt17.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt17PropertyChange(evt);
            }
        });

        jbt20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbt20.setText("=");
        jbt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt20ActionPerformed(evt);
            }
        });
        jbt20.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jbt20PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbt17, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbt20, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbt13)
                        .addGap(36, 36, 36)
                        .addComponent(jbt14)
                        .addGap(36, 36, 36)
                        .addComponent(jbt15)
                        .addGap(36, 36, 36)
                        .addComponent(jbt16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbt9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbt12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbt1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbt5)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbt0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(jbt11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbt2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addComponent(jbt3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbt6)
                                        .addGap(36, 36, 36)
                                        .addComponent(jbt7)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbt4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbt8, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jtxtDisplay))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void jbt1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt1PropertyChange

    private void jbt2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt2PropertyChange

    private void jbt3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt3PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt3PropertyChange

    private void jbt4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt4PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt4PropertyChange

    private void jbt5PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt5PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt5PropertyChange

    private void jbt6PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt6PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt6PropertyChange

    private void jbt7PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt7PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt7PropertyChange

    private void jbt8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt8PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt8PropertyChange

    private void jbt9PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt9PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt9PropertyChange

    private void jbt0PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt0PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt0PropertyChange

    private void jbt11PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt11PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt11PropertyChange

    private void jbt12PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt12PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt12PropertyChange

    private void jbt13PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt13PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt13PropertyChange

    private void jbt14PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt14PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt14PropertyChange

    private void jbt15PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt15PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt15PropertyChange

    private void jbt16PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt16PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt16PropertyChange

    private void jbt17PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt17PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt17PropertyChange

    private void jbt20PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jbt20PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt20PropertyChange

    private void jbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt1ActionPerformed
        String Enternumber = jtxtDisplay.getText() +jbt1.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt1ActionPerformed

    private void jbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt2ActionPerformed
        String Enternumber = jtxtDisplay.getText() +jbt2.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt2ActionPerformed

    private void jbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt3ActionPerformed
       String Enternumber = jtxtDisplay.getText() +jbt3.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt3ActionPerformed

    private void jbt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt4ActionPerformed
         String Enternumber = jtxtDisplay.getText() +jbt4.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt4ActionPerformed

    private void jbt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt5ActionPerformed
         String Enternumber = jtxtDisplay.getText() +jbt5.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt5ActionPerformed

    private void jbt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt6ActionPerformed
        String Enternumber = jtxtDisplay.getText() +jbt6.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt6ActionPerformed

    private void jbt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt7ActionPerformed
         String Enternumber = jtxtDisplay.getText() +jbt7.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt7ActionPerformed

    private void jbt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt8ActionPerformed
        String Enternumber = jtxtDisplay.getText() +jbt8.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt8ActionPerformed

    private void jbt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt9ActionPerformed
         String Enternumber = jtxtDisplay.getText() +jbt9.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt9ActionPerformed

    private void jbt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt0ActionPerformed
         String Enternumber = jtxtDisplay.getText() +jbt0.getText() ;
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbt0ActionPerformed

    private void jbt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt11ActionPerformed
       firstnumber = Double.parseDouble(jtxtDisplay.getText());
       jtxtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_jbt11ActionPerformed

    private void jbt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt12ActionPerformed
               firstnumber = Double.parseDouble(jtxtDisplay.getText());
       jtxtDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_jbt12ActionPerformed

    private void jbt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt13ActionPerformed
             firstnumber = Double.parseDouble(jtxtDisplay.getText());
       jtxtDisplay.setText("");
        operations = "/";
    }//GEN-LAST:event_jbt13ActionPerformed

    private void jbt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt14ActionPerformed
              firstnumber = Double.parseDouble(jtxtDisplay.getText());
       jtxtDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_jbt14ActionPerformed

    private void jbt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt15ActionPerformed
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops = ops*(-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbt15ActionPerformed

    private void jbt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt20ActionPerformed
        String answer;
        secondnumber =Double.parseDouble(jtxtDisplay.getText());
        if (operations ==("+") ){
        result =firstnumber+secondnumber;
        answer=String.format("%.Of", result);
        jtxtDisplay.setText(answer);
        }
       else if (operations ==("*") ){
        result =firstnumber*secondnumber;
        answer=String.format("%.Of", result);
        jtxtDisplay.setText(answer);
       }
        else if (operations ==("/") ){
        result =firstnumber/secondnumber;
        answer=String.format("%.Of", result);
        jtxtDisplay.setText(answer);
       }
        else if (operations ==("-") ){
        result =firstnumber-secondnumber;
        answer=String.format("%.Of", result);
        jtxtDisplay.setText(answer);
       }
        
      
    }//GEN-LAST:event_jbt20ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbt0;
    private javax.swing.JButton jbt1;
    private javax.swing.JButton jbt11;
    private javax.swing.JButton jbt12;
    private javax.swing.JButton jbt13;
    private javax.swing.JButton jbt14;
    private javax.swing.JButton jbt15;
    private javax.swing.JButton jbt16;
    private javax.swing.JButton jbt17;
    private javax.swing.JButton jbt2;
    private javax.swing.JButton jbt20;
    private javax.swing.JButton jbt3;
    private javax.swing.JButton jbt4;
    private javax.swing.JButton jbt5;
    private javax.swing.JButton jbt6;
    private javax.swing.JButton jbt7;
    private javax.swing.JButton jbt8;
    private javax.swing.JButton jbt9;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables

    private static class jtxtDiplay {

        private static void setText(String valueOf) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jtxtDiplay() {
        }
    }
}
