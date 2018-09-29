/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcadagua;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.lang.ArrayUtils;
import mdlaf.*;
import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import javax.imageio.*;
import javax.imageio.ImageWriter;
import static javax.swing.JOptionPane.showMessageDialog;
import mdlaf.animation.*;
import mdlaf.utils.MaterialColors;
import static oracle.jrockit.jfr.events.Bits.intValue;

/**
 *
 * @author asus
 */
public class ImportarFotos extends javax.swing.JFrame {

    public File arquivo = null;
    public File[] arquivos = null;
    public File logoMarca = null;

    public List<File> imagens = new ArrayList<File>();

    public String caminhoSalvar = "";
    public String diretorio = "/home/asus/Imagens";
    public String[] formatos = {"png", "jpg"};
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "JPG & PNG Images", "jpg", "png");

    Image imgtemp = null;
    Image imgFinal = null;

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
            java.util.logging.Logger.getLogger(ImportarFotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportarFotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportarFotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportarFotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new ImportarFotos().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ImportarFotos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public ImportarFotos() throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new MaterialLookAndFeel());
        initComponents();
        MaterialUIMovement.add(btn_iniciar, MaterialColors.GRAY_100);
        MaterialUIMovement.add(jButton2, MaterialColors.GRAY_100);
        MaterialUIMovement.add(jButton3, MaterialColors.GRAY_100);
        MaterialUIMovement.add(jButton4, MaterialColors.GRAY_100);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_caminho_fotos = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txt_caminho_logo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txt_caminho_salvar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btn_iniciar = new javax.swing.JButton();
        img_previa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        barra_progresso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione os arquivos"));

        txt_caminho_fotos.setText("C:\\users\\usuario\\");

            jButton2.setBackground(new java.awt.Color(255, 51, 51));
            jButton2.setText("Procurar");
            jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    procurarPasta(evt);
                }
            });

            txt_caminho_logo.setText("C:\\users\\usuario\\logo.png");

            jButton3.setBackground(new java.awt.Color(255, 51, 51));
            jButton3.setText("Procurar");
            jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    pegarLogo(evt);
                }
            });

            txt_caminho_salvar.setText("C:\\users\\usuario\\logo.png");

            jButton4.setBackground(new java.awt.Color(255, 51, 51));
            jButton4.setText("Procurar");
            jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    caminhoSalvar(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            jLabel1.setText("Logo marca:");

            jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            jLabel2.setText("Caminho da pasta com as imagens:");

            jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            jLabel3.setText("Local onde salvar as imagens novas:");

            jLabel6.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
            jLabel6.setText("em");
            jLabel6.setToolTipText("");

            jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
            jLabel7.setText("Logomarca");
            jLabel7.setToolTipText("");

            jLabel8.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
            jLabel8.setText("Massa v0.1");
            jLabel8.setToolTipText("");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(15, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txt_caminho_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txt_caminho_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txt_caminho_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addContainerGap(58, Short.MAX_VALUE)))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_caminho_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_caminho_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addGap(4, 4, 4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_caminho_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(465, Short.MAX_VALUE)))
            );

            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Arquivos selecionados"));

            jList1.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
            jScrollPane1.setViewportView(jList1);

            btn_iniciar.setBackground(new java.awt.Color(51, 255, 51));
            btn_iniciar.setText("Iniciar");
            btn_iniciar.setEnabled(false);

            img_previa.setBackground(new java.awt.Color(204, 204, 204));
            img_previa.setForeground(new java.awt.Color(255, 255, 255));
            img_previa.setOpaque(true);

            jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            jLabel4.setText("Imagens da pasta:");

            jLabel5.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
            jLabel5.setText("Logo:");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel5)))
                                .addComponent(img_previa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(barra_progresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(img_previa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(barra_progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void procurarPasta(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_procurarPasta
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecione a pasta com as imagens!");
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.showOpenDialog(null);
        try {
            pegarFotos(jfc.getSelectedFile().getPath());
            txt_caminho_fotos.setText(jfc.getSelectedFile().getPath());
            if (arquivos != null && logoMarca != null && caminhoSalvar != "") {
                btn_iniciar.setEnabled(true);
                btn_iniciar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            gerarFotos();
                        } catch (IOException ex) {
                            Logger.getLogger(ImportarFotos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
            }
        } catch (IOException ex) {
            Logger.getLogger(ImportarFotos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_procurarPasta

    private void pegarLogo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegarLogo
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecione a logo marca!");
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.setFileFilter(filter);
        jfc.showOpenDialog(null);
        logoMarca = new File(jfc.getSelectedFile().getPath());
        txt_caminho_logo.setText(jfc.getSelectedFile().getPath());
        try {
            imgtemp = ImageIO.read(new File(jfc.getSelectedFile().getPath()));

        } catch (MalformedURLException ex) {
            Logger.getLogger(ImportarFotos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportarFotos.class.getName()).log(Level.SEVERE, null, ex);
        }
        imgFinal = imgtemp.getScaledInstance(280, 114, java.awt.Image.SCALE_SMOOTH);

        img_previa.setIcon(new ImageIcon(imgFinal));
        if (arquivos != null && logoMarca != null && caminhoSalvar != "") {
            btn_iniciar.setEnabled(true);
            btn_iniciar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        gerarFotos();
                    } catch (IOException ex) {
                        Logger.getLogger(ImportarFotos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }
    }//GEN-LAST:event_pegarLogo

    private void caminhoSalvar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caminhoSalvar
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecione o caminho para salvar!");
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jfc.showOpenDialog(null);
        caminhoSalvar = jfc.getSelectedFile().getPath();
        txt_caminho_salvar.setText(caminhoSalvar);

        if (arquivos != null && logoMarca != null && caminhoSalvar != "") {
            btn_iniciar.setEnabled(true);
            btn_iniciar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        gerarFotos();
                    } catch (IOException ex) {
                        Logger.getLogger(ImportarFotos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        }
    }//GEN-LAST:event_caminhoSalvar

    public void pegarFotos(String caminho) throws IOException {
        arquivo = new File(caminho);
        arquivos = arquivo.listFiles(); //recebo a lista de arquivos em um array
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < arquivos.length; i++) {
            String nomeTemp = arquivos[i].getName();
            //pego apenas os arquivos de imagens (png e jpg)
            if (ArrayUtils.contains(formatos, nomeTemp.substring(nomeTemp.length() - 3))) {
                imagens.add(arquivos[i]);
                model.addElement(nomeTemp);
            }
        }
        jList1.setModel(model);
    }

    public void gerarFotos() throws IOException {
        try {
            //Imagem da logo
            BufferedImage imgMarca = converterBuffered(imgFinal);
                  
            for (int i = 0; i < imagens.size(); i++) {
                double percentual = ((i+1)*100)/imagens.size();
                BufferedImage img = ImageIO.read(imagens.get(i));
                //Crio o novo "canvas"(BufferedImage) no tamanho maximo das duas imagens
                int w = Math.max(img.getWidth(), imgMarca.getWidth());//vejo qual a maior
                int h = Math.max(img.getHeight(), imgMarca.getHeight());//vejo qual a maior
                BufferedImage canvas = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

                //Desenho as duas imagens no mesmo "canvas"(BufferedImage)
                Graphics g = canvas.getGraphics();
                //Desenho no centro
                g.drawImage(img, 0, 0, null);
                g.drawImage(imgMarca, img.getWidth() - imgMarca.getWidth(), img.getHeight() - imgMarca.getHeight() - 5, null); //5 de paddin

                //Salvo o resultado final
                ImageIO.write(canvas, "PNG", new File(caminhoSalvar + '/' + imagens.get(i).getName() + "-editado.png"));
                
                barra_progresso.setValue(intValue(percentual));
               
            }
        } catch (Exception e) {
            showMessageDialog(null, "Erro ao editar imagens!");
        } finally {
            showMessageDialog(null, "Imagens editadas com sucesso!\nLocal: " + caminhoSalvar);
        }
    }

    public static BufferedImage converterBuffered(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra_progresso;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JLabel img_previa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_caminho_fotos;
    private javax.swing.JTextField txt_caminho_logo;
    private javax.swing.JTextField txt_caminho_salvar;
    // End of variables declaration//GEN-END:variables
}
