/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagemanagement3;

import javax.swing.DefaultListModel;

/**
 *
 * @author arsoh
 */
public class App_Img_Panel extends javax.swing.JPanel {

    /**
     * Creates new form App_Img_Panel
     */
    public App_Img_Panel() {
        initComponents();
        
        //update my list from the repository of applications
        
        DefaultListModel model = (DefaultListModel) appsList.getModel();
        for(int i = 0; i < ImageManagement3.allApplications.size(); i++){
            Application a;
            //get the application from the repository
            a = ImageManagement3.allApplications.get(i);
            
            //add this to the jList directly
            model.addElement(a);
        }
        
        DefaultListModel model2 = (DefaultListModel) imagesList.getModel();
        for(int i = 0; i < ImageManagement3.allImages.size(); i++){
            Image a;
            a = ImageManagement3.allImages.get(i);
            model2.addElement(a);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appsList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        addApplicationButton = new javax.swing.JButton();
        ImageNameLabel = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        addImageButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ImageNameChangeField = new javax.swing.JTextField();
        ImageNameChangeButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        AppToImgButton = new javax.swing.JButton();
        AppNameChangeButton = new javax.swing.JButton();
        AppNameChangeField = new javax.swing.JTextField();
        IncrementCPUButton = new javax.swing.JButton();
        IncrementCPUButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        changeDiskSizeButton = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        imagesList = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Applications");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Images");

        appsList.setModel(new DefaultListModel());
        appsList.setToolTipText("A list of applications");
        jScrollPane1.setViewportView(appsList);

        jLabel3.setText("Name:");

        jLabel4.setText("CPUs:");

        jLabel5.setText("Disk Size:");

        jTextField1.setToolTipText("");

        addApplicationButton.setText("Add Application");
        addApplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addApplicationButtonActionPerformed(evt);
            }
        });

        ImageNameLabel.setText("Image Name:");

        addImageButton.setText("Add Image");
        addImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Image Modification");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Application Modification");

        ImageNameChangeButton.setText("Change Image Name");
        ImageNameChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageNameChangeButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Click Confirm to Add Selected Application to Selected Image");

        AppToImgButton.setText("Confirm");

        AppNameChangeButton.setText("Change Application Name");

        AppNameChangeField.setToolTipText("Change the name of the application.");
        AppNameChangeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppNameChangeFieldActionPerformed(evt);
            }
        });

        IncrementCPUButton.setText("Increment CPUs Size");
        IncrementCPUButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncrementCPUButtonActionPerformed(evt);
            }
        });

        IncrementCPUButton1.setText("Decrement CPUs Size");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        changeDiskSizeButton.setText("Change Disk Size");
        changeDiskSizeButton.setToolTipText("Change the disk size");
        changeDiskSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDiskSizeButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Basic Size:");

        imagesList.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(imagesList);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextField3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2))
                                    .addComponent(addApplicationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(3, 3, 3)
                                        .addComponent(jTextField6)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(changeDiskSizeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AppNameChangeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IncrementCPUButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IncrementCPUButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextField5)
                            .addComponent(AppNameChangeField))
                        .addGap(109, 109, 109)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AppToImgButton)
                        .addGap(227, 227, 227))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ImageNameLabel)
                                                .addGap(16, 16, 16)
                                                .addComponent(jTextField4))
                                            .addComponent(addImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jButton1)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ImageNameChangeButton)
                                        .addGap(52, 52, 52)
                                        .addComponent(ImageNameChangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel8)))
                                .addGap(0, 54, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(addApplicationButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ImageNameLabel)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addImageButton)
                        .addGap(85, 85, 85)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImageNameChangeButton)
                    .addComponent(ImageNameChangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AppNameChangeButton)
                    .addComponent(AppNameChangeField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IncrementCPUButton)
                    .addComponent(IncrementCPUButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AppToImgButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5)
                            .addComponent(changeDiskSizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(12, 12, 12))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents
   
    private void ImageNameChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageNameChangeButtonActionPerformed
         Image selected = imagesList.getSelectedValue();
        String name = ImageNameChangeField.getText();
        selected.setName(name);  
        imagesList.repaint();
        
        
    }//GEN-LAST:event_ImageNameChangeButtonActionPerformed

    private void addImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageButtonActionPerformed
//         String name = jTextField4.getText();
//          Image addImage = new Image();
//          addImage.setName(name);
//          allImages.add(addImage);
//          imagesList.repaint();  
    }//GEN-LAST:event_addImageButtonActionPerformed

    private void addApplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addApplicationButtonActionPerformed
        String name = jTextField1.getText();
        String codeSize = jTextField6.getText(); //in kb
        String cpus = jTextField2.getText();
        String diskSize = jTextField3.getText(); 
        
        
     
        if (!name.equals("") || !codeSize.equals("") || !cpus.equals("") || !diskSize.equals("")) {
            Application app = new Application(name, Double.parseDouble(codeSize),Double.parseDouble(cpus), Double.parseDouble(diskSize));
            boolean found = false;
            for (int a = 0; a < ImageManagement3.allApplications.size(); a++) {
                if (ImageManagement3.allApplications.get(a).getName().equalsIgnoreCase(name)) {                   
                    found = true;
                    jTextField1.setText("");
                    jTextField6.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                }
            }
            ImageManagement3.allApplications.add(app);
        } 
        //else {
            //JOptionPanel.showMessageDialog(null, "No fields can be empty");
            
            
    
    
    }//GEN-LAST:event_addApplicationButtonActionPerformed

    private void IncrementCPUButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncrementCPUButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IncrementCPUButtonActionPerformed

    private void AppNameChangeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppNameChangeFieldActionPerformed
        Application selected = appsList.getSelectedValue();
       String name = AppNameChangeField.getText();
        selected.setName(name);  
        appsList.repaint();

    }//GEN-LAST:event_AppNameChangeFieldActionPerformed

    private void changeDiskSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDiskSizeButtonActionPerformed
////        String diskSize = changeDiskSizeButton.getText();
////        Double.parseDouble(diskSize);
////        
////         for (int a = 0; a < ImageManagement3.allApplications.size(); a++) {
////               if (ImageManagement3.allApplications.get(a).getMemorySize().equalsIgnoreCase(jTextField3.getMemorySize())) {  
////                    
////                ImageManagement3.allApplications.get(a).jTextField3.setMemorySize(diskSize + 1);
////                
////            }
        
        
        
    }//GEN-LAST:event_changeDiskSizeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppNameChangeButton;
    private javax.swing.JTextField AppNameChangeField;
    private javax.swing.JButton AppToImgButton;
    private javax.swing.JButton ImageNameChangeButton;
    private javax.swing.JTextField ImageNameChangeField;
    private javax.swing.JLabel ImageNameLabel;
    private javax.swing.JButton IncrementCPUButton;
    private javax.swing.JButton IncrementCPUButton1;
    private javax.swing.JButton addApplicationButton;
    private javax.swing.JButton addImageButton;
    private javax.swing.JList<Application> appsList;
    private javax.swing.JButton changeDiskSizeButton;
    private javax.swing.JList<Image> imagesList;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
