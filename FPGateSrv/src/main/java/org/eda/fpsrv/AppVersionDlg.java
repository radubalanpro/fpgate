/*
 * Copyright (C) 2019 EDA Ltd.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.eda.fpsrv;

import java.awt.Window;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Dimitar Angelov
 */
public class AppVersionDlg extends javax.swing.JFrame {

    protected AppUpdateChecker.VersionInformation VersionInformation;
    protected String installFile = "";
    /**
     * Creates new form NewAppVersionDlg
     */
    public AppVersionDlg(AppUpdateChecker.VersionInformation VersionInformation_) {
        VersionInformation = VersionInformation_;
        initComponents();
        ajustComponents();
    }

    protected void ajustComponents() {
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jlAppVersion.setText(VersionInformation.localVersion);
        jlBuildInfo.setText(VersionInformation.localBuild);
        jlAppVersionLast.setText(VersionInformation.remoteVersion);
        jlBuildInfoLast.setText(VersionInformation.remoteBuild);
        jtaVersionInfo.setText(VersionInformation.remoteVersionInfo);
        jpDownload.setToolTipText(VersionInformation.remoteVersionDownloadURL);
        jpDownload.setVisible(false);
        jpDownload.setStringPainted(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlAppName = new javax.swing.JLabel();
        jlAppVersion = new javax.swing.JLabel();
        jlBuildInfo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlAppVersionLast = new javax.swing.JLabel();
        jlBuildInfoLast = new javax.swing.JLabel();
        jbCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaVersionInfo = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpDownload = new javax.swing.JProgressBar();
        jbAct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Version Information");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jlAppName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlAppName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_eda_s.gif")));
        jlAppName.setText("EDA Fiscal Printer Gateway");

        jlAppVersion.setText("1.0.0");
        jlAppVersion.setToolTipText("");

        jlBuildInfo.setForeground(new java.awt.Color(153, 153, 153));
        jlBuildInfo.setText("build");

        jlAppVersionLast.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlAppVersionLast.setText("1.0.0");
        jlAppVersionLast.setToolTipText("");

        jlBuildInfoLast.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlBuildInfoLast.setText("1.0.0");
        jlBuildInfoLast.setToolTipText("");

        jbCancel.setText("Cancel");
        jbCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCancelMouseClicked(evt);
            }
        });

        jtaVersionInfo.setEditable(false);
        jtaVersionInfo.setColumns(20);
        jtaVersionInfo.setRows(5);
        jtaVersionInfo.setText("Version Information");
        jtaVersionInfo.setToolTipText("Version Information");
        jScrollPane1.setViewportView(jtaVersionInfo);

        jLabel1.setText("Version");

        jLabel2.setText("Build");

        jLabel3.setText("Latest Version");

        jLabel4.setText("Latest Build");

        jpDownload.setName(""); // NOI18N

        jbAct.setText("Download");
        jbAct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbActMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlAppName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlAppVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlBuildInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpDownload, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jbAct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlAppVersionLast, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(jlBuildInfoLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAppName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAppVersion)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuildInfo)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAppVersionLast)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBuildInfoLast)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbCancel)
                        .addComponent(jbAct))
                    .addComponent(jpDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void downloadNewVersion() {
        
        try {
            //connect
            jpDownload.setMaximum((int) VersionInformation.remoteVersionDownloadSize);
            // read from source and write into local file
            Thread t = new Thread(new Runnable() {
                public void run() {
                    jpDownload.setVisible(true);
                    jbAct.setEnabled(false);
                    jbAct.setText("Downloading ...");
                    String downloadURL = VersionInformation.remoteVersionDownloadURL;
                    BufferedInputStream  is = null;
                    BufferedOutputStream fos = null;
                    String tempDir = System.getProperty("java.io.tmpdir");
                    String outputPath = tempDir + downloadURL.substring(downloadURL.lastIndexOf('/')+1);
                    installFile = outputPath;
                    URLConnection urlConn = null;
                    boolean downloadOK = false;
                    try {
                        urlConn = (new URL(downloadURL)).openConnection();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if (urlConn != null) {
                        int length;
                        int downloadedSize = 0;
                        // 4KB buffer
                        byte[] buffer = new byte[4*1024*1024];
                        try {
                            //get inputstream from connection
                            is = new BufferedInputStream(urlConn.getInputStream());
                            fos = new BufferedOutputStream(new FileOutputStream(outputPath));   
                            while ((length = is.read(buffer, 0, buffer.length)) > 0) {
                                downloadedSize += length;
                                fos.write(buffer, 0, length);
                                jpDownload.setValue(downloadedSize);
//                                Thread.sleep(50);
                            }
                            downloadOK = true;
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        try {
                            if (is != null) {
                                try {is.close();} catch (IOException ex) {}
                            }
                        } finally {
                            if (fos != null) {
                                try {fos.close();} catch (IOException ex) {}
                            }
                        }
                        urlConn = null;
                    }    
                    if (downloadOK) {
                        jbAct.setText("Install");
                        jbAct.setActionCommand("Install");
                    } else {
                        jbAct.setText("Download");
                        jbAct.setActionCommand("Download");
                    }
                    jbAct.setEnabled(true);
                    jpDownload.setVisible(false);
                }
            });
            t.start();
//            jpDownload.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//            Logger.getLogger(AppVersionDlg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void installNewVersion() {
        if (installFile.length() > 0) {
            File f = new File(installFile);
            if (f.isFile()) {
                String[] run = {"java","-jar",installFile};
                try {
	            Runtime.getRuntime().exec(run);
                    System.exit(0);
	        } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	        }                
            } else {
                JOptionPane.showMessageDialog(null, "Install file doesn't exists!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else
            JOptionPane.showMessageDialog(null, "There is no install file!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void jbCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelMouseClicked
        // TODO add your handling code here:
        JComponent comp = (JComponent) evt.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
    }//GEN-LAST:event_jbCancelMouseClicked

    private void jbActMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbActMouseClicked
        // TODO add your handling code here:
        if (jbAct.getActionCommand().equals("Download")) {
            downloadNewVersion();
        } else if (jbAct.getActionCommand().equals("Install")) {
            installNewVersion();
        }
    }//GEN-LAST:event_jbActMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAct;
    private javax.swing.JButton jbCancel;
    private javax.swing.JLabel jlAppName;
    private javax.swing.JLabel jlAppVersion;
    private javax.swing.JLabel jlAppVersionLast;
    private javax.swing.JLabel jlBuildInfo;
    private javax.swing.JLabel jlBuildInfoLast;
    private javax.swing.JProgressBar jpDownload;
    private javax.swing.JTextArea jtaVersionInfo;
    // End of variables declaration//GEN-END:variables
}