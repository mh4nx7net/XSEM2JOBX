/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOBXCandiMantub;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion;
import java.awt.Color;
import java.awt.Desktop;
import static java.awt.event.KeyEvent.VK_ESCAPE;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.BorderFactory.createEtchedBorder;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author mh4nx7net
 */
public class CandiMantub extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int xx,xy;
    ImageIcon icon = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/logo.png"));
    ImageIcon xenter = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/icoCONTROLcloseact.png"));
    ImageIcon xexit = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/icoCONTROLclosenon.png"));
    ImageIcon minenter = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/icoCONTROLminact.png"));
    ImageIcon minexit = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/icoCONTROLminnon.png"));
    ImageIcon maxenter = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/icoCONTROLmaxact.png"));
    ImageIcon maxexit = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/icoCONTROLmaxnon.png"));
    
    ImageIcon dok1 = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/dok1.png"));
    ImageIcon dok2 = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/dok2.png"));
    ImageIcon dok3 = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/dok3.png"));
    ImageIcon dok4 = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/dok4.png"));
    ImageIcon dok5 = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/dok5.png"));
    ImageIcon dok6 = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/dok6.png"));
    ImageIcon albumbase = new ImageIcon(CandiMantub.class.getResource("/JOBXCandiMantub/ico/wal2.png"));
    
    JCheckBox next1 = new JCheckBox();
    JCheckBox next2 = new JCheckBox();
    JCheckBox next3 = new JCheckBox();
    JCheckBox next4 = new JCheckBox();
    
    JCheckBox nx1 = new JCheckBox();
    JCheckBox nx2 = new JCheckBox();
    JCheckBox nx3 = new JCheckBox();
    JCheckBox nx4 = new JCheckBox();
    JCheckBox nx5 = new JCheckBox();
    JCheckBox nx6 = new JCheckBox();
    JCheckBox albbase = new JCheckBox();
    
    JCheckBox bx1 = new JCheckBox();
    JCheckBox bx2 = new JCheckBox();
    JCheckBox bx3 = new JCheckBox();
    JCheckBox bx4 = new JCheckBox();
    JCheckBox bx5 = new JCheckBox();
    JCheckBox bx6 = new JCheckBox();
    
    JCheckBox anu1 = new JCheckBox();
    
    JFrame xz = new JFrame();
    
    /**
     *
     */
    
    public CandiMantub() {
        albbase.setSelected(true);
        
        initComponents();
        jLabel39.setVisible(false);
        jLabel40.setVisible(false);
        jPanel5.setOpaque(true);
        sbcontent.setBackground(new Color(0,0,0,0.7f));
        jLabel12.setBackground(new Color(255,255,255,70));
        jLabel16.setBackground(new Color(255,255,255,70));
        jLabel26.setBackground(new Color(255,255,255,70));
        
        jLabel18.setBackground(new Color(255,255,255,70));
        jLabel24.setBackground(new Color(255,255,255,70));
        
        jLabel15.setBackground(new Color(255,255,255,70));
        jLabel23.setBackground(new Color(255,255,255,70));
        
        jLabel17.setBackground(new Color(255,255,255,70));
        jLabel25.setBackground(new Color(255,255,255,70));
        
        jLabel11.setBackground(new Color(0,0,0,70));
        jLabel20.setBackground(new Color(0,0,0,70));
        jLabel13.setBackground(new Color(0,0,0,70));
        jLabel21.setBackground(new Color(0,0,0,70));
        
        jLabel29.setBackground(new Color (0,0,0,0.5f));
        jLabel30.setBackground(new Color (0,0,0,0.5f));
        
        title.setBackground(new Color(0,0,0,90));
        jLabel1.setBackground(new Color(0,0,0,90));
        
        jLabel41.setBackground(new Color(255,255,255,70));
        jLabel39.setBackground(new Color(255,255,255,70));
        jLabel40.setBackground(new Color(255,255,255,70));
        
        jLabel49.setBackground(new Color(255,255,255,70));
        jLabel47.setBackground(new Color(255,255,255,70));
        jLabel48.setBackground(new Color(255,255,255,70));
        
        jLabel7.setOpaque(true);
        jLabel7.setBackground(new Color(255,255,255,120));
        jPanel2.setBackground(new Color(255,255,255,50));
        
        jLabel31.setBackground(new Color (255,255,255,70));
        sidebar.setBackground(new Color (0,0,0,0.8f));
        jPanel5.setBackground(new Color(204,204,255,50));
        
        jLabel10.setBackground(new Color (0,0,0,70));
        jLabel32.setBackground(new Color (0,0,0,70));
        jLabel33.setBackground(new Color (0,0,0,70));
        jLabel34.setBackground(new Color (0,0,0,70));
        jLabel35.setBackground(new Color (0,0,0,70));
        jLabel36.setBackground(new Color (0,0,0,70));
        
        gbtour.add(next1);
        gbtour.add(next2);
        gbtour.add(next3);
        gbtour.add(next4);
        
        gbtour.add(nx1);
        gbtour.add(nx2);
        gbtour.add(nx3);
        gbtour.add(nx4);
        gbtour.add(nx5);
        gbtour.add(nx6);
        gbtour.add(albbase);
        
        gbtour.add(bx1);
        gbtour.add(bx2);
        gbtour.add(bx3);
        gbtour.add(bx4);
        gbtour.add(bx5);
        gbtour.add(bx6);
        
        
        setIconImage(icon.getImage());
        setTitle("Candi Mantup");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtour = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        opening = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        konten = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sbcontent = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        isi1 = new javax.swing.JPanel();
        utama = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        utama1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        mulai = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        mantub = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lj1 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        lj2 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lj3 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lj4 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        utama2 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        album = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        tentang = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new java.awt.CardLayout());

        opening.setPreferredSize(new java.awt.Dimension(600, 400));
        opening.setLayout(null);

        jLabel54.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Escape (esc) for exit");
        opening.add(jLabel54);
        jLabel54.setBounds(480, 380, 120, 15);

        title.setBackground(new java.awt.Color(255, 153, 153));
        title.setFont(new java.awt.Font("Droid Sans", 0, 16)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CANDI MANTUB");
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel16MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        opening.add(title);
        title.setBounds(230, 230, 130, 20);

        jLabel1.setBackground(new java.awt.Color(138, 124, 124));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/logo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        opening.add(jLabel1);
        jLabel1.setBounds(230, 140, 130, 110);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/WhatsApp Image 2018-04-12 at 13.02.48.jpeg"))); // NOI18N
        opening.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 400);

        jPanel1.add(opening, "card2");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("\" Bukan aplikasi cerita rakyat apalagi ebook lightnovel \"");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("SETUJU");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel5MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("KELUAR");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/wal2.png"))); // NOI18N

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel4))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(login, "card2");

        konten.setBackground(new java.awt.Color(51, 51, 51));
        konten.setLayout(null);

        sidebar.setBackground(new java.awt.Color(36, 36, 36));
        sidebar.setForeground(new java.awt.Color(0, 0, 0));
        sidebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sidebarMouseReleased(evt);
            }
        });
        sidebar.setLayout(null);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icosConsole.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sidebar.add(jLabel8);
        jLabel8.setBounds(0, 0, 40, 25);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icoBook.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
        });
        sidebar.add(jLabel15);
        jLabel15.setBounds(0, 150, 40, 30);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icoscpAbout.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel16MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
        });
        sidebar.add(jLabel16);
        jLabel16.setBounds(0, 330, 40, 30);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icoImage.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
        });
        sidebar.add(jLabel17);
        jLabel17.setBounds(0, 180, 40, 30);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icosDataLogout.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel18MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
        });
        sidebar.add(jLabel18);
        jLabel18.setBounds(0, 360, 40, 30);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icocpbar.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        sidebar.add(jLabel12);
        jLabel12.setBounds(0, 50, 40, 30);

        konten.add(sidebar);
        sidebar.setBounds(562, 0, 40, 400);

        sbcontent.setBackground(new java.awt.Color(0, 0, 0));
        sbcontent.setEnabled(false);
        sbcontent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sbcontentMouseReleased(evt);
            }
        });
        sbcontent.setLayout(null);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("MENU BAR");
        jLabel22.setPreferredSize(new java.awt.Dimension(50, 15));
        sbcontent.add(jLabel22);
        jLabel22.setBounds(0, 0, 100, 50);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("TOUR");
        jLabel23.setPreferredSize(new java.awt.Dimension(50, 15));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
        });
        sbcontent.add(jLabel23);
        jLabel23.setBounds(0, 150, 100, 30);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("KELUAR    ");
        jLabel24.setPreferredSize(new java.awt.Dimension(50, 15));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel18MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
        });
        sbcontent.add(jLabel24);
        jLabel24.setBounds(0, 360, 100, 30);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("ALBUM");
        jLabel25.setPreferredSize(new java.awt.Dimension(50, 15));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
        });
        sbcontent.add(jLabel25);
        jLabel25.setBounds(0, 180, 100, 30);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("TENTANG    ");
        jLabel26.setPreferredSize(new java.awt.Dimension(50, 15));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel16MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
        });
        sbcontent.add(jLabel26);
        jLabel26.setBounds(0, 330, 100, 30);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/logo.png"))); // NOI18N
        sbcontent.add(jLabel27);
        jLabel27.setBounds(0, 80, 100, 70);

        konten.add(sbcontent);
        sbcontent.setBounds(600, 0, 100, 400);

        isi1.setEnabled(false);
        isi1.setOpaque(false);
        isi1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        isi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                isi1MouseReleased(evt);
            }
        });
        isi1.setLayout(new java.awt.CardLayout());

        utama.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        utama.setOpaque(false);
        utama.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setOpaque(false);
        jPanel5.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Droid Sans", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("UTAMA");
        jPanel5.add(jLabel19);
        jLabel19.setBounds(140, 40, 140, 30);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icoImage.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        jPanel5.add(jLabel13);
        jLabel13.setBounds(250, 100, 40, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icoBook.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        jPanel5.add(jLabel11);
        jLabel11.setBounds(130, 100, 40, 30);

        jLabel20.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("TOUR");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel11MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        jPanel5.add(jLabel20);
        jLabel20.setBounds(130, 130, 40, 20);

        jLabel21.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("ALBUM");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        jPanel5.add(jLabel21);
        jLabel21.setBounds(250, 130, 39, 20);

        utama.add(jPanel5);
        jPanel5.setBounds(70, 80, 410, 250);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/WhatsApp Image 2018-04-12 at 13.03.21.jpeg"))); // NOI18N
        utama.add(jLabel14);
        jLabel14.setBounds(0, -130, 720, 960);

        isi1.add(utama, "card2");

        utama1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        utama1.setOpaque(false);
        utama1.setLayout(null);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.CardLayout());

        mulai.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MULAI TOUR !  ^_^ ===>");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout mulaiLayout = new javax.swing.GroupLayout(mulai);
        mulai.setLayout(mulaiLayout);
        mulaiLayout.setHorizontalGroup(
            mulaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mulaiLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        mulaiLayout.setVerticalGroup(
            mulaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mulaiLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        jPanel2.add(mulai, "card2");

        mantub.setOpaque(false);
        mantub.setLayout(null);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/tur1.png"))); // NOI18N
        mantub.add(jLabel9);
        jLabel9.setBounds(12, 12, 306, 270);

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/tur11.png"))); // NOI18N
        mantub.add(jLabel37);
        jLabel37.setBounds(370, 12, 78, 270);

        jLabel10.setFont(new java.awt.Font("Droid Sans", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("M");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        mantub.add(jLabel10);
        jLabel10.setBounds(320, 13, 50, 40);

        jLabel32.setFont(new java.awt.Font("Droid Sans", 0, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("A");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
        });
        mantub.add(jLabel32);
        jLabel32.setBounds(320, 53, 50, 40);

        jLabel33.setFont(new java.awt.Font("Droid Sans", 0, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("N");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
        });
        mantub.add(jLabel33);
        jLabel33.setBounds(320, 93, 50, 40);

        jLabel34.setFont(new java.awt.Font("Droid Sans", 0, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("T");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel34MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel34MouseEntered(evt);
            }
        });
        mantub.add(jLabel34);
        jLabel34.setBounds(320, 137, 50, 43);

        jLabel35.setFont(new java.awt.Font("Droid Sans", 0, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("P");
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel35MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel35MouseEntered(evt);
            }
        });
        mantub.add(jLabel35);
        jLabel35.setBounds(320, 233, 50, 50);

        jLabel36.setFont(new java.awt.Font("Droid Sans", 0, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("U");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
        });
        mantub.add(jLabel36);
        jLabel36.setBounds(320, 180, 50, 50);

        jPanel2.add(mantub, "card3");

        lj1.setOpaque(false);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/tur2.png"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Droid Sans", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("CANDI 1");

        javax.swing.GroupLayout lj1Layout = new javax.swing.GroupLayout(lj1);
        lj1.setLayout(lj1Layout);
        lj1Layout.setHorizontalGroup(
            lj1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lj1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        lj1Layout.setVerticalGroup(
            lj1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lj1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lj1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(lj1, "card4");

        lj2.setOpaque(false);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/tur4.png"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Droid Sans", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("AULA");

        javax.swing.GroupLayout lj2Layout = new javax.swing.GroupLayout(lj2);
        lj2.setLayout(lj2Layout);
        lj2Layout.setHorizontalGroup(
            lj2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lj2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        lj2Layout.setVerticalGroup(
            lj2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lj2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lj2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(lj2, "card4");

        lj3.setOpaque(false);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/tur3.png"))); // NOI18N

        jLabel50.setFont(new java.awt.Font("Droid Sans", 0, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("SITUS");

        javax.swing.GroupLayout lj3Layout = new javax.swing.GroupLayout(lj3);
        lj3.setLayout(lj3Layout);
        lj3Layout.setHorizontalGroup(
            lj3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lj3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        lj3Layout.setVerticalGroup(
            lj3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lj3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lj3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(lj3, "card4");

        lj4.setOpaque(false);
        lj4.setLayout(null);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/turdeskrip1.png"))); // NOI18N
        lj4.add(jLabel51);
        jLabel51.setBounds(22, 12, 170, 266);

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Droid Sans", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 102, 102));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("KLIK DISINI UNTUK BACA");
        jLabel52.setOpaque(true);
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel52MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel52MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel52MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel52MouseEntered(evt);
            }
        });
        lj4.add(jLabel52);
        jLabel52.setBounds(230, 120, 170, 30);

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 102, 102));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("RAKETOK ??");
        jLabel53.setOpaque(true);
        lj4.add(jLabel53);
        jLabel53.setBounds(270, 90, 90, 30);

        jPanel2.add(lj4, "card4");

        utama1.add(jPanel2);
        jPanel2.setBounds(70, 50, 460, 290);

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/left.png"))); // NOI18N
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel39MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel39MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel37MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
        });
        utama1.add(jLabel39);
        jLabel39.setBounds(40, 190, 40, 40);

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/right.png"))); // NOI18N
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel40MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel40MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
        });
        utama1.add(jLabel40);
        jLabel40.setBounds(520, 190, 40, 40);

        jLabel41.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icosConsole.png"))); // NOI18N
        jLabel41.setText("KEMBALI");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel41MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
        });
        utama1.add(jLabel41);
        jLabel41.setBounds(0, 370, 80, 21);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/aa.png"))); // NOI18N
        utama1.add(jLabel46);
        jLabel46.setBounds(-10, 0, 726, 400);

        isi1.add(utama1, "card2");

        utama2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        utama2.setOpaque(false);
        utama2.setLayout(null);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/dok4.png"))); // NOI18N
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel57MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel57MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel57MouseEntered(evt);
            }
        });
        utama2.add(jLabel57);
        jLabel57.setBounds(280, 300, 70, 70);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/dok3.png"))); // NOI18N
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel58MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel58MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel58MouseEntered(evt);
            }
        });
        utama2.add(jLabel58);
        jLabel58.setBounds(210, 300, 70, 70);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/dok1.png"))); // NOI18N
        jLabel59.setAlignmentY(0.0F);
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel59MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel59MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel59MouseEntered(evt);
            }
        });
        utama2.add(jLabel59);
        jLabel59.setBounds(70, 300, 70, 70);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/dok2.png"))); // NOI18N
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel60MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel60MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel60MouseEntered(evt);
            }
        });
        utama2.add(jLabel60);
        jLabel60.setBounds(140, 300, 70, 70);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/dok6.png"))); // NOI18N
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel61MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel61MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel61MouseEntered(evt);
            }
        });
        utama2.add(jLabel61);
        jLabel61.setBounds(420, 300, 70, 70);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/dok5.png"))); // NOI18N
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel62MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel62MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel62MouseEntered(evt);
            }
        });
        utama2.add(jLabel62);
        jLabel62.setBounds(350, 300, 70, 70);

        album.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/wal2.png"))); // NOI18N
        utama2.add(album);
        album.setBounds(30, 20, 500, 270);

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/left.png"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel47MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel47MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel47MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel47MouseEntered(evt);
            }
        });
        utama2.add(jLabel47);
        jLabel47.setBounds(30, 310, 40, 40);

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/right.png"))); // NOI18N
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel48MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel48MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel48MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel48MouseEntered(evt);
            }
        });
        utama2.add(jLabel48);
        jLabel48.setBounds(490, 310, 40, 40);

        jLabel49.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icosConsole.png"))); // NOI18N
        jLabel49.setText("KEMBALI");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel49MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel49MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel49MouseEntered(evt);
            }
        });
        utama2.add(jLabel49);
        jLabel49.setBounds(0, 370, 80, 21);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/WhatsApp Image 2018-04-15 at 19.22.32.jpeg"))); // NOI18N
        utama2.add(jLabel55);
        jLabel55.setBounds(-170, -70, 830, 530);

        isi1.add(utama2, "card2");

        konten.add(isi1);
        isi1.setBounds(0, 0, 600, 400);

        jPanel1.add(konten, "card2");

        tentang.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tentangMouseDragged(evt);
            }
        });
        tentang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tentangMousePressed(evt);
            }
        });
        tentang.setLayout(null);

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("OK");
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel29MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
        });
        tentang.add(jLabel29);
        jLabel29.setBounds(270, 170, 80, 40);

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Program dikembangkan guna memenuhi mandat tugas yang diberikan");
        jLabel30.setOpaque(true);
        tentang.add(jLabel30);
        jLabel30.setBounds(60, 135, 500, 30);

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/icosSources.png"))); // NOI18N
        jLabel31.setText("Sources");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel31MouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel31MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel31MouseEntered(evt);
            }
        });
        tentang.add(jLabel31);
        jLabel31.setBounds(510, 380, 80, 15);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JOBXCandiMantub/ico/WhatsApp Image 2018-04-15 at 19.22.26.jpeg"))); // NOI18N
        tentang.add(jLabel28);
        jLabel28.setBounds(-250, -120, 910, 560);

        jPanel1.add(tentang, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        // TODO add your handling code here:
        opening.setVisible(false);
        login.setVisible(true);
        opening.setEnabled(false);
    }//GEN-LAST:event_jLabel1MouseReleased

    private void jLabel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseReleased
        // TODO add your handling code here:
        login.setVisible(false);
        konten.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setOpaque(true);
        jLabel5.setBackground(new Color(204, 207, 212));
        login.repaint();
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setOpaque(false);
        login.repaint();
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setOpaque(true);
        jLabel6.setBackground(new Color(204, 207, 212));
        login.repaint();
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jLabel6.setOpaque(false);
        login.repaint();
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        // TODO add your handling code here:
        if (!sbcontent.isEnabled())
        {
            sbcontent.setEnabled(true);
            sbcontent.setLocation(462, 0);
        }
        else if (sbcontent.isEnabled())
        {
            sbcontent.setEnabled(false);
            sbcontent.setLocation(600, 0);
        }
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseReleased
        // TODO add your handling code here:
        konten.setVisible(false);
        opening.setVisible(true);
        opening.setEnabled(true);
        utama1.setVisible(false);
        utama2.setVisible(false);
        utama.setVisible(true);
        if (sbcontent.isEnabled())
        {
            sbcontent.setEnabled(false);
            sbcontent.setLocation(600, 0);
        }
    }//GEN-LAST:event_jLabel18MouseReleased

    private void jLabel16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseReleased
        // TODO add your handling code here:
        tentang.setVisible(true);
        konten.setVisible(false);
        opening.setVisible(false);
        if (sbcontent.isEnabled())
        {
            sbcontent.setEnabled(false);
            sbcontent.setLocation(600, 0);
        }
    }//GEN-LAST:event_jLabel16MouseReleased

    private void jLabel31MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseReleased
        // TODO add your handling code here:
        try 
        {
            String url ="https://www.github.com/mh4nx7net";
            
            Desktop dt = Desktop.getDesktop();
            URI uri = new URI(url);
            dt.browse(uri.resolve(uri));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(ManagementAssertion.Setting.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel31MouseReleased

    private void jLabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseEntered
        // TODO add your handling code here:
        jLabel31.setOpaque(true);
        jLabel28.repaint();
    }//GEN-LAST:event_jLabel31MouseEntered

    private void jLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseExited
        // TODO add your handling code here:
        jLabel31.setOpaque(false);
        jLabel28.repaint();
    }//GEN-LAST:event_jLabel31MouseExited

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        // TODO add your handling code here:
        jLabel29.setBackground(new Color(0,0,0,50));
        jLabel28.repaint();
    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
        // TODO add your handling code here:
        jLabel29.setBackground(new Color(0,0,0,0.5f));
        jLabel28.repaint();
    }//GEN-LAST:event_jLabel29MouseExited

    private void jLabel29MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseReleased
        // TODO add your handling code here:
        tentang.setVisible(false);
        if (opening.isEnabled())
        {
            opening.setVisible(true);
        }
        else if(!opening.isEnabled())
        {
            konten.setVisible(true);
        }
    }//GEN-LAST:event_jLabel29MouseReleased

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
        jLabel16.setOpaque(true);
        jLabel26.setOpaque(true);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
        jLabel16.setOpaque(false);
        jLabel26.setOpaque(false);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered

        // TODO add your handling code here:
        jLabel18.setOpaque(true);
        jLabel24.setOpaque(true);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        // TODO add your handling code here:
        jLabel18.setOpaque(false);
        jLabel24.setOpaque(false);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
        jLabel12.setOpaque(true);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
        jLabel12.setOpaque(false);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
        jLabel15.setOpaque(true);
        jLabel23.setOpaque(true);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
        jLabel15.setOpaque(false);
        jLabel23.setOpaque(false);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
        jLabel17.setOpaque(true);
        jLabel25.setOpaque(true);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
        jLabel17.setOpaque(false);
        jLabel25.setOpaque(false);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseReleased
        // TODO add your handling code here:
        if (sbcontent.isEnabled())
        {
            sbcontent.setEnabled(false);
            sbcontent.setLocation(600, 0);
        }
        if (utama.isVisible())
        {
            utama.setVisible(false);
            utama1.setVisible(true);
            utama1.repaint();
        }
        if (utama2.isVisible())
        {
            utama1.setVisible(true);
            utama2.setVisible(false);
            utama1.repaint();
        }
    }//GEN-LAST:event_jLabel11MouseReleased

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        // TODO add your handling code here:
        album.setIcon(albumbase);
        album.repaint();
        albbase.setSelected(true);
        jLabel57.setBorder(null);
        jLabel61.setBorder(null);
        jLabel58.setBorder(null);
        jLabel59.setBorder(null);
        jLabel60.setBorder(null);
        jLabel62.setBorder(null);
        if (sbcontent.isEnabled())
        {
            sbcontent.setEnabled(false);
            sbcontent.setLocation(600, 0);
        }
        if (utama.isVisible())
        {
            utama.setVisible(false);
            utama2.setVisible(true);
            utama2.repaint();
        }
        if (utama1.isVisible())
        {
            utama1.setVisible(false);
            utama2.setVisible(true);
            utama2.repaint();
        }
        
    }//GEN-LAST:event_jLabel13MouseReleased

    private void tentangMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tentangMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_tentangMouseDragged

    private void tentangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tentangMousePressed
        // TODO add your handling code here:
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_tentangMousePressed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setOpaque(true);
        title.setOpaque(true);
        jLabel2.repaint();
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setOpaque(false);
        title.setOpaque(false);
        jLabel2.repaint();
    }//GEN-LAST:event_jLabel1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void isi1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isi1MouseReleased
        // TODO add your handling code here:
        if (sbcontent.isEnabled())
        {
            sbcontent.setEnabled(false);
            sbcontent.setLocation(600, 0);
        }
    }//GEN-LAST:event_isi1MouseReleased

    private void sidebarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_sidebarMouseReleased

    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
        // TODO add your handling code here:
        jLabel40.setOpaque(false);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel40MouseExited

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        // TODO add your handling code here:
        jLabel40.setOpaque(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel41MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseReleased
        // TODO add your handling code here:
        utama1.setVisible(false);
        utama.setVisible(true);
        sidebar.setVisible(true);
        jPanel2.setOpaque(false);
        
        mulai.setVisible(true);
        mantub.setVisible(false);
        lj1.setVisible(false);
        lj2.setVisible(false);
        lj3.setVisible(false);
        lj4.setVisible(false);
        jLabel39.setVisible(false);
        jLabel40.setVisible(false);
        if (sbcontent.isEnabled())
        {
            sbcontent.setEnabled(false);
            sbcontent.setLocation(600, 0);
        }
    }//GEN-LAST:event_jLabel41MouseReleased

    private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
        // TODO add your handling code here:
        jLabel41.setOpaque(false);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel41MouseExited

    private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
        // TODO add your handling code here:
        jLabel41.setOpaque(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel41MouseEntered

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jLabel13.setOpaque(true);
        jLabel21.setOpaque(true);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        jLabel13.setOpaque(false);
        jLabel21.setOpaque(false);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        jLabel11.setOpaque(true);
        jLabel20.setOpaque(true);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jLabel11.setOpaque(false);
        jLabel20.setOpaque(false);
        jLabel14.repaint();
        jLabel46.repaint();
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
        // TODO add your handling code here:
        jLabel39.setOpaque(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel37MouseEntered

    private void jLabel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseExited
        // TODO add your handling code here:
        jLabel39.setOpaque(false);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel37MouseExited

    private void jLabel47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseExited
        // TODO add your handling code here:
        jLabel47.setOpaque(false);
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel47MouseExited

    private void jLabel47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseEntered
        // TODO add your handling code here:
        jLabel47.setOpaque(true);
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel47MouseEntered

    private void jLabel48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseExited
        // TODO add your handling code here:
        jLabel48.setOpaque(false);
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel48MouseExited

    private void jLabel48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseEntered
        // TODO add your handling code here:
        jLabel48.setOpaque(true);
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel48MouseEntered

    private void jLabel49MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseReleased
        // TODO add your handling code here:
        utama2.setVisible(false);
        utama.setVisible(true);
        album.setIcon(albumbase);
        album.repaint();
        albbase.setSelected(true);
        jLabel57.setBorder(null);
        jLabel61.setBorder(null);
        jLabel58.setBorder(null);
        jLabel59.setBorder(null);
        jLabel60.setBorder(null);
        jLabel62.setBorder(null);
        if (sbcontent.isEnabled())
        {
            sbcontent.setEnabled(false);
            sbcontent.setLocation(600, 0);
        }
    }//GEN-LAST:event_jLabel49MouseReleased

    private void jLabel49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseExited
        // TODO add your handling code here:
        jLabel49.setOpaque(false);
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel49MouseExited

    private void jLabel49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseEntered
        // TODO add your handling code here:
        jLabel49.setOpaque(true);
        jLabel55.repaint();
    }//GEN-LAST:event_jLabel49MouseEntered

    private void sbcontentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbcontentMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_sbcontentMouseReleased

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setBackground(new Color(255,255,255,120));
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jLabel7.setBackground(new Color(255,255,255,70));
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
        sidebar.setVisible(false);
        jPanel2.setOpaque(true);
        
        mulai.setVisible(false);
        mantub.setVisible(true);
        
        jLabel39.setVisible(true);
        jLabel40.setVisible(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        jLabel10.setOpaque(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jLabel10.setOpaque(false);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        // TODO add your handling code here:
        jLabel32.setOpaque(false);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel32MouseExited

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        // TODO add your handling code here:
        jLabel32.setOpaque(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        // TODO add your handling code here:
        jLabel33.setOpaque(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        // TODO add your handling code here:
        jLabel33.setOpaque(false);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel33MouseExited

    private void jLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseEntered
        // TODO add your handling code here:
        jLabel34.setOpaque(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel34MouseEntered

    private void jLabel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseExited
        // TODO add your handling code here:
        jLabel34.setOpaque(false);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel34MouseExited

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        // TODO add your handling code here:
        jLabel36.setOpaque(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        // TODO add your handling code here:
        jLabel36.setOpaque(false);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel36MouseExited

    private void jLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseEntered
        // TODO add your handling code here:
        jLabel35.setOpaque(true);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel35MouseEntered

    private void jLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseExited
        // TODO add your handling code here:
        jLabel35.setOpaque(false);
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel35MouseExited

    private void jLabel40MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseReleased
        // TODO add your handling code here:
        jLabel46.repaint();
        if (next1.isSelected())
        {
            mantub.setVisible(false);
            lj1.setVisible(true);
        }
        if (next2.isSelected())
        {
            lj1.setVisible(false);
            lj2.setVisible(true);   
        }
        if (next3.isSelected())
        {
            lj2.setVisible(false);
            lj3.setVisible(true);
        }
        if (next4.isSelected())
        {
            lj3.setVisible(false);
            lj4.setVisible(true);
            
        }
        
    }//GEN-LAST:event_jLabel40MouseReleased

    private void jLabel40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MousePressed
        // TODO add your handling code here:
        if (mantub.isVisible())
        {
            next1.setSelected(true);
        }
        if (lj1.isVisible())
        {
            next2.setSelected(true);
        }
        if (lj2.isVisible())
        {
            next3.setSelected(true);
        }
        if (lj3.isVisible())
        {
            next4.setSelected(true);
        }
    }//GEN-LAST:event_jLabel40MousePressed

    private void jLabel39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MousePressed
        // TODO add your handling code here:
        if (lj4.isVisible())
        {
            next3.setSelected(true);
        }
        if (lj3.isVisible())
        {
            next2.setSelected(true);
        }
        if (lj2.isVisible())
        {
            next1.setSelected(true);
        }
        if (lj1.isVisible())
        {
            next4.setSelected(true);
        }
    }//GEN-LAST:event_jLabel39MousePressed

    private void jLabel39MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseReleased
        // TODO add your handling code here:
        jLabel46.repaint();
        if (next3.isSelected())
        {
            lj4.setVisible(false);
            lj3.setVisible(true);
        }
        if (next2.isSelected())
        {
            lj3.setVisible(false);
            lj2.setVisible(true);   
        }
        if (next1.isSelected())
        {
            lj2.setVisible(false);
            lj1.setVisible(true);
        }
        if (next4.isSelected())
        {
            lj1.setVisible(false);
            mantub.setVisible(true);
            
        }
    }//GEN-LAST:event_jLabel39MouseReleased

    private void jLabel52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseEntered
        // TODO add your handling code here:
        jLabel52.setBackground(new Color(255,255,255,120));
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel52MouseEntered

    private void jLabel52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseExited
        // TODO add your handling code here:
        jLabel52.setBackground(new Color(255,255,255,70));
        jLabel46.repaint();
    }//GEN-LAST:event_jLabel52MouseExited

    private void jLabel52MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseReleased
        // TODO add your handling code here:
        
        if (anu1.isSelected())
        {
            new deskrip1().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"sudah dibuka. enter atau esc untuk menutup \n duatiga tutup botol, asulo kontlo");
        }
    }//GEN-LAST:event_jLabel52MouseReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode()==VK_ESCAPE)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_formKeyReleased

    private void jLabel52MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MousePressed
        // TODO add your handling code here:
        anu1.doClick();
    }//GEN-LAST:event_jLabel52MousePressed

    private void jLabel59MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseReleased
        // TODO add your handling code here:
        album.setIcon(dok1);
        album.repaint();
        jLabel59.setBorder(createEtchedBorder(Color.pink, null));
        bx1.setSelected(true);
    }//GEN-LAST:event_jLabel59MouseReleased

    private void jLabel59MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseEntered
        // TODO add your handling code here:
        jLabel59.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    }//GEN-LAST:event_jLabel59MouseEntered

    private void jLabel59MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseExited
        // TODO add your handling code here:
        jLabel59.setBorder(null);
    }//GEN-LAST:event_jLabel59MouseExited

    private void jLabel60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseEntered
        // TODO add your handling code here:
        jLabel60.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    }//GEN-LAST:event_jLabel60MouseEntered

    private void jLabel58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseEntered
        // TODO add your handling code here:
        jLabel58.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    }//GEN-LAST:event_jLabel58MouseEntered

    private void jLabel57MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseEntered
        // TODO add your handling code here:
        jLabel57.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    }//GEN-LAST:event_jLabel57MouseEntered

    private void jLabel62MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseEntered
        // TODO add your handling code here:
        jLabel62.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    }//GEN-LAST:event_jLabel62MouseEntered

    private void jLabel61MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseEntered
        // TODO add your handling code here:
        jLabel61.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    }//GEN-LAST:event_jLabel61MouseEntered

    private void jLabel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseExited
        // TODO add your handling code here:
        jLabel60.setBorder(null);
    }//GEN-LAST:event_jLabel60MouseExited

    private void jLabel58MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseExited
        // TODO add your handling code here:
        jLabel58.setBorder(null);
    }//GEN-LAST:event_jLabel58MouseExited

    private void jLabel57MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseExited
        // TODO add your handling code here:
        jLabel57.setBorder(null);
    }//GEN-LAST:event_jLabel57MouseExited

    private void jLabel62MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseExited
        // TODO add your handling code here:
        jLabel62.setBorder(null);
    }//GEN-LAST:event_jLabel62MouseExited

    private void jLabel61MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseExited
        // TODO add your handling code here:
        jLabel61.setBorder(null);
    }//GEN-LAST:event_jLabel61MouseExited

    private void jLabel60MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseReleased
        // TODO add your handling code here:
        album.setIcon(dok2);
        album.repaint();
        jLabel60.setBorder(createEtchedBorder(Color.pink, null));
        bx2.setSelected(true);
    }//GEN-LAST:event_jLabel60MouseReleased

    private void jLabel58MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseReleased
        // TODO add your handling code here:
        album.setIcon(dok3);
        album.repaint();
        jLabel58.setBorder(createEtchedBorder(Color.pink, null));
        bx3.setSelected(true);
    }//GEN-LAST:event_jLabel58MouseReleased

    private void jLabel57MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseReleased
        // TODO add your handling code here:
        album.setIcon(dok4);
        album.repaint();
        jLabel57.setBorder(createEtchedBorder(Color.pink, null));
        bx4.setSelected(true);
    }//GEN-LAST:event_jLabel57MouseReleased

    private void jLabel62MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseReleased
        // TODO add your handling code here:
        album.setIcon(dok5);
        album.repaint();
        jLabel62.setBorder(createEtchedBorder(Color.pink, null));
        bx5.setSelected(true);
    }//GEN-LAST:event_jLabel62MouseReleased

    private void jLabel61MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseReleased
        // TODO add your handling code here:
        album.setIcon(dok6);
        album.repaint();
        jLabel61.setBorder(createEtchedBorder(Color.pink, null));
        bx6.setSelected(true);
    }//GEN-LAST:event_jLabel61MouseReleased

    private void jLabel48MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MousePressed
        // TODO add your handling code here:
        if (albbase.isSelected())
        {
            nx1.setSelected(true);
        }
        if (bx1.isSelected())
        {
            nx2.setSelected(true);
        }
        if (bx2.isSelected())
        {
            nx3.setSelected(true);
        }
        if (bx3.isSelected())
        {
            nx4.setSelected(true);
        }
        if (bx4.isSelected())
        {
            nx5.setSelected(true);
        }
        if (bx5.isSelected())
        {
            nx6.setSelected(true);
        }
    }//GEN-LAST:event_jLabel48MousePressed

    private void jLabel48MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseReleased
        // TODO add your handling code here:
        if (nx1.isSelected())
        {
            album.setIcon(dok1);
            album.repaint();
            bx1.setSelected(true);
            jLabel59.setBorder(createEtchedBorder(Color.pink, null));
        }
        if (nx2.isSelected())
        {
            album.setIcon(dok2);
            album.repaint();
            bx2.setSelected(true);
            jLabel59.setBorder(null);
            jLabel60.setBorder(createEtchedBorder(Color.pink, null));
        }
        if (nx3.isSelected())
        {
            album.setIcon(dok3);
            album.repaint();
            bx3.setSelected(true);
            jLabel60.setBorder(null);
            jLabel58.setBorder(createEtchedBorder(Color.pink, null));
        }
        if (nx4.isSelected())
        {
            album.setIcon(dok4);
            album.repaint();
            bx4.setSelected(true);
            jLabel58.setBorder(null);
            jLabel57.setBorder(createEtchedBorder(Color.pink, null));
        }
        if (nx5.isSelected())
        {
            album.setIcon(dok5);
            album.repaint();
            bx5.setSelected(true);
            jLabel57.setBorder(null);
            jLabel62.setBorder(createEtchedBorder(Color.pink, null));
        }
        if (nx6.isSelected())
        {
            album.setIcon(dok6);
            album.repaint();
            bx6.setSelected(true);
            jLabel62.setBorder(null);
            jLabel61.setBorder(createEtchedBorder(Color.pink, null));
        }
    }//GEN-LAST:event_jLabel48MouseReleased

    private void jLabel47MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MousePressed
        // TODO add your handling code here:
        if (bx6.isSelected())
        {
            nx5.setSelected(true);
        }
        if (bx5.isSelected())
        {
            nx4.setSelected(true);
        }
        if (bx4.isSelected())
        {
            nx3.setSelected(true);
        }
        if (bx3.isSelected())
        {
            nx2.setSelected(true);
        }
        if (bx2.isSelected())
        {
            nx1.setSelected(true);
        }
        if (bx1.isSelected())
        {
            albbase.setSelected(true);
        }
    }//GEN-LAST:event_jLabel47MousePressed

    private void jLabel47MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseReleased
        // TODO add your handling code here:
        if (nx5.isSelected())
        {
            album.setIcon(dok5);
            album.repaint();
            bx5.setSelected(true);
            jLabel61.setBorder(null);
            jLabel62.setBorder(createEtchedBorder(Color.pink, null));
        }
        if (nx4.isSelected())
        {
            album.setIcon(dok4);
            album.repaint();
            bx4.setSelected(true);
            jLabel62.setBorder(null);
            jLabel57.setBorder(createEtchedBorder(Color.pink, null));
        }if (nx3.isSelected())
        {
            album.setIcon(dok3);
            album.repaint();
            bx3.setSelected(true);
            jLabel57.setBorder(null);
            jLabel58.setBorder(createEtchedBorder(Color.pink, null));
        }
        if (nx2.isSelected())
        {
            album.setIcon(dok2);
            album.repaint();
            bx2.setSelected(true);
            jLabel58.setBorder(null);
            jLabel60.setBorder(createEtchedBorder(Color.pink, null));
        }
        if (nx1.isSelected())
        {
            album.setIcon(dok1);
            album.repaint();
            bx1.setSelected(true);
            jLabel60.setBorder(null);
            jLabel59.setBorder(createEtchedBorder(Color.pink, null));
        }
        if (albbase.isSelected())
        {
            album.setIcon(albumbase);
            album.repaint();
            jLabel59.setBorder(null);
        }
    }//GEN-LAST:event_jLabel47MouseReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CandiMantub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CandiMantub().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel album;
    private javax.swing.ButtonGroup gbtour;
    private javax.swing.JPanel isi1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel konten;
    private javax.swing.JPanel lj1;
    private javax.swing.JPanel lj2;
    private javax.swing.JPanel lj3;
    private javax.swing.JPanel lj4;
    private javax.swing.JPanel login;
    private javax.swing.JPanel mantub;
    private javax.swing.JPanel mulai;
    private javax.swing.JPanel opening;
    private javax.swing.JPanel sbcontent;
    private javax.swing.JPanel sidebar;
    private javax.swing.JPanel tentang;
    private javax.swing.JLabel title;
    private javax.swing.JPanel utama;
    private javax.swing.JPanel utama1;
    private javax.swing.JPanel utama2;
    // End of variables declaration//GEN-END:variables
}
