
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import lightoff_jouveneaux_version_console.CelluleGraphique;
import lightoff_jouveneaux_version_console.GrilleDeJeu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author emmaj
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    int i;
    int a;
    GrilleDeJeu grille; 
    int nbCoups=0;
    int verif;
    boolean abandon = false;
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale(int nbL, int max, int niveau) {
        initComponents();
        int nbLignes =nbL;
        int nbColonnes = nbL;
        int CoupsMax =max;
        verif=niveau;
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        jLabel2.setText("");
        jLabel3.setText("");
        jLabel1.setText("Il vous reste "+(CoupsMax)+" coups");
        
                    if (grille.cellulesToutesEteintes()==true && abandon==true) {
                        if (verif == 3 ) {
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }if (verif == 1) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(7, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                            
                        }
                        else if (verif == 2) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(10, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                        else if (verif == 4) {
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                        
                    }


            PanneauBoutonVerticaux.setLayout(new GridLayout(nbLignes, 1));
            for (i = 0; i < nbLignes; i++) {
                JButton bouton_ligne = new JButton();
                bouton_ligne.setText(""+i);
            
                ActionListener ecouteurClick = new ActionListener() {
                    final int j = i;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    if (verif==4){
                        Random generateurAleat = new Random();
                        int random = generateurAleat.nextInt(5);
                        if (random==0){
                            grille.activerLigneColonneOuDiagonaleAleatoire();
                            grille.activerLigneColonneOuDiagonaleAleatoire();
                            jLabel2.setText("Ho non !");
                            jLabel3.setText("le perturbateur a vole votre tour");
                        }
                        else{
                           grille.activerLigneDeCellules(j); 
                           jLabel2.setText("");
                           jLabel3.setText("");
                        }
                    }
                    if (verif==1 || verif==2 || verif ==3){
                        grille.activerLigneDeCellules(j);
                    }
                    
                    nbCoups++;
                    jLabel1.setText("Il vous reste "+(CoupsMax-nbCoups)+" coups");
                    repaint();
                    abandon=true;
                    if (grille.cellulesToutesEteintes()==true && abandon==true) {
                        if (verif == 3 ) {
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        } if (verif == 1) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(7, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                            
                        }
                        else if (verif == 2) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(10, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                        else if (verif == 4) {
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                    }

                    if (CoupsMax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            FenetrePrincipale.this.dispose();
                    }
                    
                    }


                    private void dispose() {
                        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                    }
                };
                bouton_ligne.addActionListener(ecouteurClick);
                PanneauBoutonVerticaux.add(bouton_ligne);
 
            }
        
            PanneauBoutonhorizontaux.setLayout(new GridLayout(1, nbColonnes));
            this.pack();
            this.revalidate();
            for (a = 0; a < nbColonnes; a++) {
                JButton bouton_colonne = new JButton();
                bouton_colonne.setText(""+a);
                ActionListener ecouteurClick = new ActionListener() {
                final int b = a;
                @Override
                public void actionPerformed(ActionEvent e) {
                    nbCoups++;
                    jLabel1.setText("Il vous reste "+(CoupsMax-nbCoups)+" coups");
                    if (verif==4){
                        Random generateurAleat = new Random();
                        int random = generateurAleat.nextInt(5);
                        if (random==0){
                            grille.activerLigneColonneOuDiagonaleAleatoire();
                            grille.activerLigneColonneOuDiagonaleAleatoire();
                            jLabel2.setText("Ho non !");
                            jLabel3.setText("le perturbateur a vole votre tour");
                        }
                        else{
                           grille.activerColonneDeCellules(b); 
                           jLabel2.setText("");
                           jLabel3.setText("");
                        }
                    }
                    if (verif==1 || verif==2 || verif ==3){
                        grille.activerColonneDeCellules(b);
                    }
                    
                    repaint();
                    abandon=true;
                   
                    if (grille.cellulesToutesEteintes()==true && abandon==true) {
                        
                        if (verif == 3 ) {
                            
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }if (verif == 1) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(7, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                            
                        }
                        else if (verif == 2) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(10, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                        else if (verif == 4) {
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                    
                    }
                    if (CoupsMax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            FenetrePrincipale.this.dispose();
                    }
                
               
                };
                };
                bouton_colonne.addActionListener(ecouteurClick);
                PanneauBoutonhorizontaux.add(bouton_colonne);
 
            }

            for (int i=0; i < nbLignes; i++) {
                for (int j=0; j < nbColonnes; j++ ) {
                    CelluleGraphique bouton_cellule = new CelluleGraphique( grille.lireCellule(i, j), 36,36);
                    PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
                }
            }
            
        diagonale_descendante.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            diagonale_descendanteActionPerformed(evt);
            nbCoups++;
                    if (verif==4){
                        Random generateurAleat = new Random();
                        int random = generateurAleat.nextInt(5);
                        if (random==0){
                            grille.activerLigneColonneOuDiagonaleAleatoire();
                            grille.activerLigneColonneOuDiagonaleAleatoire();
                            jLabel2.setText("Ho non !");
                            jLabel3.setText("le perturbateur a vole votre tour");
                        }
                        else{
                           grille.activerDiagonaleDescendante();
                           jLabel2.setText("");
                           jLabel3.setText("");
                        }
                    }
                    if (verif==1 || verif==2 || verif ==3){
                        grille.activerDiagonaleDescendante();
                    }
            jLabel1.setText("Il vous reste "+(CoupsMax-nbCoups)+" coups");
            repaint();
            abandon=true;
            if (grille.cellulesToutesEteintes()==true && abandon==true) {
                        
                        if (verif == 3 ) {
                            
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }if (verif == 1) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(7, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                            
                        }
                        else if (verif == 2) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(10, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                        else if (verif == 4) {
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                    
                    }
                    if (CoupsMax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            FenetrePrincipale.this.dispose();
                    }
            
        }
    });
        
        bouton_diagonale_montante.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            bouton_diagonale_montanteActionPerformed(evt);
            nbCoups++;
            if (verif==4){
                        Random generateurAleat = new Random();
                        int random = generateurAleat.nextInt(5);
                        if (random==0){
                            grille.activerLigneColonneOuDiagonaleAleatoire();
                            grille.activerLigneColonneOuDiagonaleAleatoire();
                            jLabel2.setText("Ho non !");
                            jLabel3.setText("le perturbateur a vole votre tour");
                        }
                        else{
                           grille.activerDiagonaleMontante();
                           jLabel2.setText("");
                           jLabel3.setText("");
                        }
            }
            if (verif==1 || verif==2 || verif ==3){
                grille.activerDiagonaleMontante();
            }
            jLabel1.setText("Il vous reste "+(CoupsMax-nbCoups)+" coups");
            repaint();
            abandon=true;
            
            if (grille.cellulesToutesEteintes()==true && abandon==true) {
                        
                        if (verif == 3 ) {
                            
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }if (verif == 1) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(7, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                            
                        }
                        else if (verif == 2) {
                            verif++;
                            FenetrePrincipale f = new FenetrePrincipale(10, CoupsMax - nbCoups, verif);
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                        else if (verif == 4) {
                            FenetreVictoire f = new FenetreVictoire();
                            FenetrePrincipale.this.dispose();
                            f.setVisible(true);
                        }
                    
                    }
                    if (CoupsMax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            FenetrePrincipale.this.dispose();
                    }
            
        }
    });
            
            
        this.pack();
        initialiserPartie();


    }
    
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonVerticaux = new javax.swing.JPanel();
        PanneauBoutonhorizontaux = new javax.swing.JPanel();
        diagonale_descendante = new javax.swing.JButton();
        bouton_diagonale_montante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(193, 221, 228));
        PanneauGrille.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 360, 360));

        PanneauBoutonVerticaux.setBackground(new java.awt.Color(230, 235, 236));

        javax.swing.GroupLayout PanneauBoutonVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonVerticaux);
        PanneauBoutonVerticaux.setLayout(PanneauBoutonVerticauxLayout);
        PanneauBoutonVerticauxLayout.setHorizontalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        PanneauBoutonVerticauxLayout.setVerticalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 50, 360));

        PanneauBoutonhorizontaux.setBackground(new java.awt.Color(230, 235, 236));

        javax.swing.GroupLayout PanneauBoutonhorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonhorizontaux);
        PanneauBoutonhorizontaux.setLayout(PanneauBoutonhorizontauxLayout);
        PanneauBoutonhorizontauxLayout.setHorizontalGroup(
            PanneauBoutonhorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonhorizontauxLayout.setVerticalGroup(
            PanneauBoutonhorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonhorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 360, 50));

        diagonale_descendante.setText("Diagonale");
        diagonale_descendante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagonale_descendanteActionPerformed(evt);
            }
        });
        getContentPane().add(diagonale_descendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        bouton_diagonale_montante.setText("Diagonale");
        bouton_diagonale_montante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_diagonale_montanteActionPerformed(evt);
            }
        });
        getContentPane().add(bouton_diagonale_montante, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        jButton1.setText("Quitter la partie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, -1, -1));

        jLabel2.setBackground(new java.awt.Color(144, 187, 231));
        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        jLabel3.setBackground(new java.awt.Color(144, 187, 231));
        jLabel3.setFont(new java.awt.Font("Britannic Bold", 0, 12)); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diagonale_descendanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagonale_descendanteActionPerformed
        grille.activerDiagonaleDescendante();
        repaint();
        
    }//GEN-LAST:event_diagonale_descendanteActionPerformed

    private void bouton_diagonale_montanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_diagonale_montanteActionPerformed
        grille.activerDiagonaleMontante();
        repaint();
    }//GEN-LAST:event_bouton_diagonale_montanteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        abandon =false;
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale(4).setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonVerticaux;
    private javax.swing.JPanel PanneauBoutonhorizontaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JButton bouton_diagonale_montante;
    private javax.swing.JButton diagonale_descendante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
