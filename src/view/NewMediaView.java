package view;

import DAO.ClientDAO;
import DAO.MovieDAO;
import DAO.MusicDAO;
import DAO.TvDAO;
import Model.BoxSet;
import Model.Media;
import controller.MediaRegister;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Model.MediaFormat;
import Model.MediaType;
import Model.Movie;
import Model.Music;
import Model.PlanType;

/**
 *
 * @author Marcelo
 */
public class NewMediaView extends javax.swing.JFrame {

    private Media media = new Media();
    private MediaListView mediaList;
    // private final RentProcessView clientDetails;

    // *** Here is going to bring all media details to the mediaList page. ***
    public void setMusic(Music music) {
        this.media = music;
        jTextTitle.setText(music.getTitle());
        jTextComplement.setText(music.getBand());
        jTextYear.setText(String.valueOf(music.getYearOfRelease()));
        jTextPrice.setText(String.valueOf(music.getPrice()));
        //buttonGroupT.setSelected(mf, rootPaneCheckingEnabled);
        jTextAvailability.setText(String.valueOf(music.getAvailability()));
        jTexDescription.setText(music.getDescription());
        
        // *** GoupButton code:
        String mF = music.getMediaFormat().toUpperCase();
        //System.out.println("stop here " + mF);

        switch (mF) {
            case "CD":
                jRadioBCd.setSelected(true);
                break;
            case "DVD":
                jRadioBDvd.setSelected(true);
                break;
            case "BLUERAY":
                jRadioBBlueray.setSelected(true);
                break;
        }

        jTextidMedia.setVisible(true);
        jTextidMedia.setEditable(false);
        jLidMedia.setVisible(true);
        jTextidMedia.setText(music.getIdMedia());
        jRadioBMusic.setVisible(true);
        jRadioBMusic.setSelected(true);
    }

    public void setMovie(Movie movie) {
        this.media = movie;
        jTextTitle.setText(movie.getTitle());
        jTextComplement.setText(movie.getDirector());
        jTextYear.setText(String.valueOf(movie.getYearOfRelease()));
        jTextPrice.setText(String.valueOf(movie.getPrice()));
        //buttonGroupT.setSelected(mf, rootPaneCheckingEnabled);
        jTextAvailability.setText(String.valueOf(movie.getAvailability()));
        jTexDescription.setText(movie.getDescription());

        //*** GoupButton code ***
        String mF = movie.getMediaFormat().toUpperCase();
        //System.out.println("stop here " + mF);

        switch (mF) {
            case "CD":
                jRadioBCd.setSelected(true);
                break;
            case "DVD":
                jRadioBDvd.setSelected(true);
                break;
            case "BLUERAY":
                jRadioBBlueray.setSelected(true);
                break;
        }

        jLComplement.setText("Director");

        jTextidMedia.setVisible(true);
        jTextidMedia.setEditable(false);
        jLidMedia.setVisible(true);
        jTextidMedia.setText(movie.getIdMedia());
        jRadioBMovie.setVisible(true);
        jRadioBMovie.setSelected(true);
    }

    public void setBoxSet(BoxSet tv) {
        this.media = tv;
        jTextTitle.setText(tv.getTitle());
        jTextComplement.setText(tv.getStudio());
        jTextYear.setText(String.valueOf(tv.getYearOfRelease()));
        jTextPrice.setText(String.valueOf(tv.getPrice()));
        //buttonGroupT.setSelected(mf, rootPaneCheckingEnabled);
        jTextAvailability.setText(String.valueOf(tv.getAvailability()));
        jTexDescription.setText(tv.getDescription());

        //goupButton code:
        String mF = tv.getMediaFormat().toUpperCase();
        System.out.println("stop here " + mF);

        switch (mF) {
            case "CD":
                jRadioBCd.setSelected(true);
                break;
            case "DVD":
                jRadioBDvd.setSelected(true);
                break;
            case "BLUERAY":
                jRadioBBlueray.setSelected(true);
                break;
        }

        jLComplement.setText("Studio");

        jTextidMedia.setVisible(true);
        jTextidMedia.setEditable(false);
        jLidMedia.setVisible(true);
        jTextidMedia.setText(tv.getIdMedia());
        jRadioBTv.setVisible(true);
        jRadioBTv.setSelected(true);
    }

    /**
     * Creates new form RentProcessView
     */
    public NewMediaView(MediaListView mediaList) {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        initComponents();
        jTextidMedia.setVisible(true);
        jTextidMedia.setEditable(false);
        jLidMedia.setVisible(true);
        jRadioBMusic.setVisible(false);
        jRadioBMovie.setVisible(false);
        jRadioBTv.setVisible(false);
        this.mediaList = mediaList;
    }

    /**
     * Creates new form MediaItens
     */
    public NewMediaView() {
        initComponents();
         /* *** Here is going to hide the id field on the NewMediaView and 
         show the music mediaFormat selected as default *** */
        jTextidMedia.setVisible(false);
        jTextidMedia.setEditable(false);
        jLidMedia.setVisible(false);
        jRadioBMusic.setSelected(rootPaneCheckingEnabled);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        buttonGroupMediaF = new javax.swing.ButtonGroup();
        buttonGroupT = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLidMedia = new javax.swing.JLabel();
        jTextidMedia = new javax.swing.JTextField();
        jLTitle = new javax.swing.JLabel();
        jLYear = new javax.swing.JLabel();
        jLMediaF = new javax.swing.JLabel();
        jTextTitle = new javax.swing.JTextField();
        jTextYear = new javax.swing.JTextField();
        jLPrice = new javax.swing.JLabel();
        jTextPrice = new javax.swing.JTextField();
        jLComplement = new javax.swing.JLabel();
        jTextComplement = new javax.swing.JTextField();
        jLDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTexDescription = new javax.swing.JTextArea();
        jLAvailability = new javax.swing.JLabel();
        jTextAvailability = new javax.swing.JTextField();
        jBSave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioBDvd = new javax.swing.JRadioButton();
        jRadioBCd = new javax.swing.JRadioButton();
        jRadioBBlueray = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jRadioBMusic = new javax.swing.JRadioButton();
        jRadioBTv = new javax.swing.JRadioButton();
        jRadioBMovie = new javax.swing.JRadioButton();
        jBClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("*** Ultra-Vision Media ***");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("NEW MEDIA"));

        jLidMedia.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLidMedia.setText("ID Media: ");

        jTextidMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidMediaActionPerformed(evt);
            }
        });

        jLTitle.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLTitle.setText("Title: ");

        jLYear.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLYear.setText("Year of Release:");

        jLMediaF.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLMediaF.setText("Media Format:");

        jLPrice.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLPrice.setText("Price:");

        jTextPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPriceActionPerformed(evt);
            }
        });

        jLComplement.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLComplement.setText("Band: ");

        jTextComplement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextComplementActionPerformed(evt);
            }
        });

        jLDescription.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLDescription.setText("Description:");

        jTexDescription.setColumns(20);
        jTexDescription.setRows(5);
        jScrollPane1.setViewportView(jTexDescription);

        jLAvailability.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLAvailability.setText("Availability:");

        jBSave.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jBSave.setText("Save");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonGroupMediaF.add(jRadioBDvd);
        jRadioBDvd.setText("DVD");

        buttonGroupMediaF.add(jRadioBCd);
        jRadioBCd.setText("CD");

        buttonGroupMediaF.add(jRadioBBlueray);
        jRadioBBlueray.setText("BLUERAY");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setText("Media Type: ");

        buttonGroupT.add(jRadioBMusic);
        jRadioBMusic.setText("Music");
        jRadioBMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBMusicActionPerformed(evt);
            }
        });

        buttonGroupT.add(jRadioBTv);
        jRadioBTv.setText("TV");
        jRadioBTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBTvActionPerformed(evt);
            }
        });

        buttonGroupT.add(jRadioBMovie);
        jRadioBMovie.setText("Movie");
        jRadioBMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBMovieActionPerformed(evt);
            }
        });

        jBClose.setText("Close");
        jBClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextTitle))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLComplement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(jTextComplement, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLMediaF)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLYear)
                                .addGap(12, 12, 12)
                                .addComponent(jTextYear))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jRadioBDvd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioBCd)
                                .addGap(58, 58, 58)
                                .addComponent(jRadioBBlueray)
                                .addGap(45, 45, 45))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLidMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextidMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jRadioBMusic)
                                        .addGap(45, 45, 45)
                                        .addComponent(jRadioBTv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioBMovie)))))
                        .addGap(56, 56, 56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jBSave))
                            .addComponent(jLDescription)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLAvailability))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextPrice)
                                    .addComponent(jTextAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBClose))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLidMedia)
                                    .addComponent(jTextidMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLTitle)
                                    .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioBMusic)
                                    .addComponent(jRadioBTv)
                                    .addComponent(jRadioBMovie))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLComplement)
                                    .addComponent(jTextComplement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLYear)
                                    .addComponent(jTextYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLMediaF)
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioBDvd)
                                    .addComponent(jRadioBCd)
                                    .addComponent(jRadioBBlueray))
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBClose)
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPrice)
                            .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jBSave)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextidMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidMediaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextidMediaActionPerformed

    private void jTextPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPriceActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        // TODO add your handling code here:
        //Here is gonna save the medias details
        if (media.getIdMedia() == null) {
            if (jRadioBMovie.isSelected()) {
                media = new Movie();
            }
            if (jRadioBMusic.isSelected()) {
                media = new Music();
            }
            if (jRadioBTv.isSelected()) {
                media = new BoxSet();
            }
        }
        media.setTitle(jTextTitle.getText());
        //media.setDirector(jTextDirector.getText());
        media.setYearOfRelease(Integer.parseInt(jTextYear.getText()));
        media.setMediaType(jTextComplement.getText());
        media.setMediaType(jTextComplement.getText());
        media.setAvailability(Integer.parseInt(jTextAvailability.getText()));
        media.setDescription(jTexDescription.getText());
        //media.setBand(jTextComplement.getText());
        //media.setStudio(jTextStudio.getText());
        
        //media.setMediaFormat(buttonGroupMediaF.getSelection());
        media.setPrice(Float.parseFloat(jTextPrice.getText()));

        if (jRadioBMusic.isSelected()) {
            media.setMediaType(MediaType.MUSIC.name());
        } else if (jRadioBTv.isSelected()) {
            media.setMediaType(MediaType.TV.name());
        } else if (jRadioBMovie.isSelected()) {
            media.setMediaType(MediaType.MOVIE.name());
        } else {
            JOptionPane.showMessageDialog(this, "Select a Media Type");
            return;
        }
        // *** Here is to show up the media format selected on the edit page.
        if (jRadioBCd.isSelected()) {
            media.setMediaFormat(MediaFormat.CD.name());
        } else if (jRadioBDvd.isSelected()) {
            media.setMediaFormat(MediaFormat.DVD.name());
        } else if (jRadioBBlueray.isSelected()) {
            media.setMediaFormat(MediaFormat.BLUERAY.name());
        } else {

            JOptionPane.showMessageDialog(this, "Select a Media Format");
            return;
        }

        /* *** save process *** Here will verify the type of media according to the type of 
         media inserted or altered */
        String msg = "Media was registed";
        boolean sucess = false;
        if (media.getIdMedia() == null) {
            if (media.getMediaType().equals(MediaType.MUSIC.name())) {
                Music music = (Music) media;
                music.setBand(jTextComplement.getText());
                sucess = MusicDAO.insert(music);
            }
            if (media.getMediaType().equals(MediaType.MOVIE.name())) {
                Movie movie = (Movie) media;
                movie.setDirector(jTextComplement.getText());
                sucess = MovieDAO.insert(movie);
            }
            if (media.getMediaType().equals(MediaType.TV.name())) {
                BoxSet tv = (BoxSet) media;
                tv.setStudio(jTextComplement.getText());
                sucess = TvDAO.insert(tv);
            }
        } else {
            if (media.getMediaType().equals(MediaType.MUSIC.name())) {
                Music music = (Music) media;
                music.setBand(jTextComplement.getText());
                sucess = MusicDAO.update(music);
            }
            if (media.getMediaType().equals(MediaType.MOVIE.name())) {
                Movie movie = (Movie) media;
                movie.setDirector(jTextComplement.getText());
                sucess = MovieDAO.update(movie);
            }
            if (media.getMediaType().equals(MediaType.TV.name())) {
                BoxSet tv = (BoxSet) media;
                tv.setStudio(jTextComplement.getText());
                sucess = TvDAO.update(tv);
            }

            msg = "Media was updated";
        }

        if (sucess) {
            JOptionPane.showMessageDialog(this, msg);

            if (mediaList != null) {
                mediaList.createMediaList();
            }
            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Error in register a media");
        }


    }//GEN-LAST:event_jBSaveActionPerformed

    private void jTextComplementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextComplementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextComplementActionPerformed

    private void jRadioBMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBMusicActionPerformed
        // TODO add your handling code here:
        jLComplement.setText("Band:");
    }//GEN-LAST:event_jRadioBMusicActionPerformed

    private void jRadioBTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBTvActionPerformed
        // TODO add your handling code here:
        jLComplement.setText("Studio:");
    }//GEN-LAST:event_jRadioBTvActionPerformed

    private void jRadioBMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBMovieActionPerformed
        // TODO add your handling code here:
        jLComplement.setText("Director:");
    }//GEN-LAST:event_jRadioBMovieActionPerformed

    private void jBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCloseActionPerformed
        // TODO add your handling code here:
         // *** Close the register client window without close the program.
         dispose();
    }//GEN-LAST:event_jBCloseActionPerformed

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
            java.util.logging.Logger.getLogger(NewMediaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMediaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMediaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMediaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMediaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupMediaF;
    private javax.swing.ButtonGroup buttonGroupT;
    private javax.swing.JButton jBClose;
    private javax.swing.JButton jBSave;
    private javax.swing.JLabel jLAvailability;
    private javax.swing.JLabel jLComplement;
    private javax.swing.JLabel jLDescription;
    private javax.swing.JLabel jLMediaF;
    private javax.swing.JLabel jLPrice;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JLabel jLYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLidMedia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioBBlueray;
    private javax.swing.JRadioButton jRadioBCd;
    private javax.swing.JRadioButton jRadioBDvd;
    private javax.swing.JRadioButton jRadioBMovie;
    private javax.swing.JRadioButton jRadioBMusic;
    private javax.swing.JRadioButton jRadioBTv;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTexDescription;
    private javax.swing.JTextField jTextAvailability;
    private javax.swing.JTextField jTextComplement;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextTitle;
    private javax.swing.JTextField jTextYear;
    private javax.swing.JTextField jTextidMedia;
    // End of variables declaration//GEN-END:variables
}

// *** REFERENCES: ***
/* ula 07 - LTP III - Parte 2 - Exemplo de alteração e exclusão de dados
YouTube, 26 May. 2016, https://youtu.be/efWt0cVmSuc*/
