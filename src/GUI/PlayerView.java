package GUI;

import Model.BadConsequence;
import Model.BadDeath;
import Model.BadNumberOfTreasures;
import Model.BadTreasureKind;
import Model.Player;
import Model.Treasure;
import Model.CultistPlayer;
import java.util.ArrayList;
import Model.Napakalaki;
import java.awt.Component;
import javax.swing.JPanel;

public class PlayerView extends javax.swing.JPanel {

  Player playerModel;
  private Napakalaki napakalakiModel;
  
  private boolean showvisibles;
  private boolean showinvisibles;

  public PlayerView() {
    initComponents();
    showvisibles = true;
    showinvisibles = true;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jL_level = new javax.swing.JLabel();
    jL_combatlevel = new javax.swing.JLabel();
    jL_name = new javax.swing.JLabel();
    jL_showlevel = new javax.swing.JLabel();
    jL_showcombatlevel = new javax.swing.JLabel();
    jL_playerbadconsequence = new javax.swing.JLabel();
    jL_visibles = new javax.swing.JLabel();
    jL_ocultos = new javax.swing.JLabel();
    jP_visibletreasures = new javax.swing.JPanel();
    jP_hiddentreasures = new javax.swing.JPanel();
    jP_badconsequence = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jL_cultist = new javax.swing.JLabel();
    jL_showcultist = new javax.swing.JLabel();
    jP_buttons = new javax.swing.JPanel();
    jB_maketreasurevisible = new javax.swing.JButton();
    jB_buylevels = new javax.swing.JButton();
    jB_discardtreasure = new javax.swing.JButton();

    jL_level.setText("Nivel:");

    jL_combatlevel.setText("Combate:");

    jL_name.setText("/*Nombre*/");

    jL_showlevel.setText("/*Nivel*/");

    jL_showcombatlevel.setText("/*Combat*/");

    jL_playerbadconsequence.setText("Mal rollo:");

    jL_visibles.setText("Visibles");
    jL_visibles.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jL_visiblesMouseClicked(evt);
      }
    });

    jL_ocultos.setText("Ocultos");
    jL_ocultos.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jL_ocultosMouseClicked(evt);
      }
    });

    jP_visibletreasures.setBorder(new javax.swing.border.MatteBorder(null));

    jP_hiddentreasures.setBorder(new javax.swing.border.MatteBorder(null));

    jL_cultist.setText("Cultista:");

    jL_showcultist.setText("/*Puntos*/");

    jB_maketreasurevisible.setText("Hacer visibles");
    jB_maketreasurevisible.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jB_maketreasurevisibleActionPerformed(evt);
      }
    });

    jB_buylevels.setText("Comprar");
    jB_buylevels.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jB_buylevelsActionPerformed(evt);
      }
    });

    jB_discardtreasure.setText("Descartar");
    jB_discardtreasure.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jB_discardtreasureActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jP_buttonsLayout = new javax.swing.GroupLayout(jP_buttons);
    jP_buttons.setLayout(jP_buttonsLayout);
    jP_buttonsLayout.setHorizontalGroup(
      jP_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jP_buttonsLayout.createSequentialGroup()
        .addComponent(jB_buylevels)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jB_maketreasurevisible)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jB_discardtreasure))
    );
    jP_buttonsLayout.setVerticalGroup(
      jP_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_buttonsLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jP_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jB_maketreasurevisible)
          .addComponent(jB_buylevels)
          .addComponent(jB_discardtreasure)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jP_badconsequence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jP_hiddentreasures, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jP_visibletreasures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jL_ocultos)
              .addComponent(jL_playerbadconsequence)
              .addComponent(jL_visibles)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jL_level)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_showlevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_combatlevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_showcombatlevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_cultist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_showcultist)
                .addGap(3, 3, 3)
                .addComponent(jLabel1))
              .addComponent(jP_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jL_name))
            .addGap(0, 144, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jL_name)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jL_level)
          .addComponent(jL_showlevel)
          .addComponent(jL_combatlevel)
          .addComponent(jL_showcombatlevel)
          .addComponent(jLabel1)
          .addComponent(jL_cultist)
          .addComponent(jL_showcultist))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jL_playerbadconsequence)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jP_badconsequence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jL_visibles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jP_visibletreasures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jL_ocultos)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jP_hiddentreasures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jP_buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jB_maketreasurevisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_maketreasurevisibleActionPerformed
    ArrayList<Treasure> selHidden = this.getSelectedTreasures(this.jP_hiddentreasures);
    for (Treasure t : selHidden) {
      this.napakalakiModel.makeTreasureVisible(t);
    }
    this.setPlayer(napakalakiModel.getCurrentPlayer());
  }//GEN-LAST:event_jB_maketreasurevisibleActionPerformed

  private void jB_buylevelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buylevelsActionPerformed
    ArrayList<Treasure> visible = this.getSelectedTreasures(jP_visibletreasures);
    ArrayList<Treasure> hidden = this.getSelectedTreasures(jP_hiddentreasures);
    this.napakalakiModel.buyLevels(visible, hidden);
    this.setPlayer(napakalakiModel.getCurrentPlayer());
  }//GEN-LAST:event_jB_buylevelsActionPerformed

  private void jB_discardtreasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_discardtreasureActionPerformed
    ArrayList<Treasure> visible = this.getSelectedTreasures(jP_visibletreasures);
    ArrayList<Treasure> hidden = this.getSelectedTreasures(jP_hiddentreasures);

    for (Treasure t : visible) {
      this.napakalakiModel.discardVisibleTreasure(t);
    }
    for (Treasure t : hidden) {
      this.napakalakiModel.discardHiddenTreasure(t);
    }
    
    this.setPlayer(this.napakalakiModel.getCurrentPlayer());
  }//GEN-LAST:event_jB_discardtreasureActionPerformed

  private void jL_visiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_visiblesMouseClicked
    this.showvisibles = !this.showvisibles;
    this.jP_visibletreasures.setVisible(showvisibles);
  }//GEN-LAST:event_jL_visiblesMouseClicked

  private void jL_ocultosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_ocultosMouseClicked
    this.showinvisibles = !this.showinvisibles;
    this.jP_hiddentreasures.setVisible(showinvisibles);
  }//GEN-LAST:event_jL_ocultosMouseClicked

  public void setPlayer(Player p) {
    this.playerModel = p;
    jL_name.setText(p.getName());
    jL_showlevel.setText(Integer.toString(p.getLevel()));
    jL_showcombatlevel.setText(Integer.toString(p.getCombatLevel()));
    // Actualizamos, la información de sectario. 
    if (playerModel.getClass() == CultistPlayer.class) {
      jL_showcultist.setText(Integer.toString(((CultistPlayer) playerModel).getCardBonus()));
    } else {//si no es sectario su nivel de sectario es cero
      jL_showcultist.setText(Integer.toString(0));
    }
    fillBadConsequencePanel(this.jP_badconsequence, p.getPendingBadConsequence());
    fillTreasurePanel(jP_visibletreasures, p.getVisibleTreasures());
    fillTreasurePanel(jP_hiddentreasures, p.getHiddenTreasures());
    repaint();
    revalidate();
  }

  public void fillTreasurePanel(javax.swing.JPanel aPanel, ArrayList<Treasure> aList) {
    aPanel.removeAll();
    for (Treasure t : aList) {
      TreasureView aTreasureView = new TreasureView();
      aTreasureView.setTreasure(t);
      aTreasureView.setVisible(true);
      aPanel.add(aTreasureView);
    }
    aPanel.repaint();
    aPanel.revalidate();
  }

  public void fillBadConsequencePanel(javax.swing.JPanel aPanel, BadConsequence bad) {
    if (playerModel.getPendingBadConsequence() != null) {
      if (bad instanceof BadDeath) {
        BadDeathView bcView = new BadDeathView();
        bcView.setBC((BadDeath) bad);
        aPanel.removeAll();//borro lo anterior
        aPanel.add(bcView);//añado la vista al panel
        aPanel.repaint();//lo vuelvo a pintar
        aPanel.revalidate();//y reajusto
      } else if (bad instanceof BadNumberOfTreasures) {
        BadNumberView bcView = new BadNumberView();
        bcView.setBC((BadNumberOfTreasures) bad);
        aPanel.removeAll();
        aPanel.add(bcView);
        aPanel.repaint();
        aPanel.revalidate();
      } else if (bad instanceof BadTreasureKind) {
        BadSpecificView bcView = new BadSpecificView();
        bcView.setBC((BadTreasureKind) bad);
        aPanel.removeAll();
        aPanel.add(bcView);
        aPanel.repaint();//causes a call to this component's paint method as soon as possible
        aPanel.revalidate();
      }
    } else {
      aPanel.removeAll();//Removes all the components from this container
      aPanel.repaint();
      aPanel.revalidate();
    }
  }

  public void setNapakalaki(Napakalaki nap) {
    this.napakalakiModel = nap;
    this.setPlayer(nap.getCurrentPlayer());
  }

  public ArrayList<Treasure> getSelectedTreasures(JPanel aPanel) {
    //se recorren los tesoros que contiene el panel,
    //almacenando en un vector aquellos que están seleccionaados
    //Finalmente se devuelve dicho vector.
    TreasureView tv;
    ArrayList<Treasure> output = new ArrayList();
    for (Component c : aPanel.getComponents()) {
      tv = (TreasureView) c;
      if (tv.isSelected()) {
        output.add(tv.getTreasure());
      }
    }
    return output;
  }

  //códigos para habilitar o deshabilitar los botones
  public void newTurn() {
    this.jB_buylevels.setEnabled(true);
    this.jB_maketreasurevisible.setEnabled(true);
    this.jB_discardtreasure.setEnabled(true);
  }

  public void vsMonster() {
    this.jB_buylevels.setEnabled(false);
    this.jB_maketreasurevisible.setEnabled(false);
    this.jB_discardtreasure.setEnabled(false);
  }

  public void afterMonster() {
    this.jB_buylevels.setEnabled(false);//ya estaba desactivado
    this.jB_maketreasurevisible.setEnabled(true);
    this.jB_discardtreasure.setEnabled(true);
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jB_buylevels;
  private javax.swing.JButton jB_discardtreasure;
  private javax.swing.JButton jB_maketreasurevisible;
  private javax.swing.JLabel jL_combatlevel;
  private javax.swing.JLabel jL_cultist;
  private javax.swing.JLabel jL_level;
  private javax.swing.JLabel jL_name;
  private javax.swing.JLabel jL_ocultos;
  private javax.swing.JLabel jL_playerbadconsequence;
  private javax.swing.JLabel jL_showcombatlevel;
  private javax.swing.JLabel jL_showcultist;
  private javax.swing.JLabel jL_showlevel;
  private javax.swing.JLabel jL_visibles;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jP_badconsequence;
  private javax.swing.JPanel jP_buttons;
  private javax.swing.JPanel jP_hiddentreasures;
  private javax.swing.JPanel jP_visibletreasures;
  // End of variables declaration//GEN-END:variables
}
