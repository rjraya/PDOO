package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * @author fvelasco
 */
public class Dice extends JDialog {
  
  private static Dice instance = null;
  private Random generator=new Random();
  private Timer timerDice;
  private int value;
  private Dice (JFrame parent) {
    //crea un jdialog contenido en parent y título vacío. 
    //true especifica el modo que bloquea las otras ventana cuando el diálogo esté activo
    super(parent, true);
    
    initComponents();
//  Creates a Timer and initializes both the initial delay and between-event delay to delay milliseconds. 
//  If delay is less than or equal to zero, the timer fires as soon as it is started. If listener is not null, 
//  it's registered as an action listener on the timer.
    //cada 50 milisegundos se cambia de número
    timerDice = new Timer (50,diceAction);
    //registro del evento cuando se cierre el diálogo se termina la aplicación
    this.addWindowListener(new java.awt.event.WindowAdapter() {
      @Override
      public void windowClosing(java.awt.event.WindowEvent e) {
        System.exit(0);
      }
    });
  }

  public static void createInstance (JFrame parent) {
    if (instance == null)
      instance = new Dice (parent);
  }
  
  public static Dice getInstance() {
      return instance;
  }
  
  private int privateNextNumber() {
    return (generator.nextInt(6)+1);
  }
  
  private ActionListener diceAction = new ActionListener() {
    @Override
    public void actionPerformed (ActionEvent ev) {
        value = privateNextNumber();
        jL_dice.setText(Integer.toString(value));
        pack();
      }
    };
  
  public int nextNumber () {
    return nextNumber ("Puedes llamar al método",
            "Pasándole 2 cadenas como parámetros");
    
  }
  //método que se llama para hacer visible la aplicación
  public int nextNumber (String message1, String message2) {
    jB_OK.setVisible(false);
    jL_message1.setText(message1);
    jL_message2.setText(message2);
    pack();
    timerDice.start();
    this.setVisible(true);
    return value;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jL_dice = new javax.swing.JLabel();
    jL_message1 = new javax.swing.JLabel();
    jB_OK = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jL_message2 = new javax.swing.JLabel();

    //esconde y dispose automaticamente el diálogo después de invocar un objeto WindowListener registrado. 
    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Dado");
    setMinimumSize(new java.awt.Dimension(400, 280));
    setPreferredSize(new java.awt.Dimension(400, 280));

    jL_dice.setBackground(new java.awt.Color(255, 255, 255));
    jL_dice.setFont(new java.awt.Font("Trebuchet MS", 2, 48)); // NOI18N
    jL_dice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jL_dice.setText("1");
    jL_dice.setOpaque(true);
    //sentencia de registro del click de ratón sobre la etiqueta jL_dice
    jL_dice.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jL_diceMouseClicked(evt);
      }
    });

    jL_message1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jL_message1.setText("jLabel1");

    jB_OK.setText("OK");
    //sentencia de registro del click de ratón sobre el botón ok
    jB_OK.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jB_OKActionPerformed(evt);
      }
    });

    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("pincha sobre el dado para detenerlo");

    jL_message2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jL_message2.setText("jLabel1");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jL_message1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jL_message2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(layout.createSequentialGroup()
        .addGap(70, 70, 70)
        .addComponent(jLabel1))
      .addGroup(layout.createSequentialGroup()
        .addGap(160, 160, 160)
        .addComponent(jL_dice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(layout.createSequentialGroup()
        .addGap(170, 170, 170)
        .addComponent(jB_OK))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addComponent(jL_message1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, 0)
        .addComponent(jL_message2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(10, 10, 10)
        .addComponent(jLabel1)
        .addGap(13, 13, 13)
        .addComponent(jL_dice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(10, 10, 10)
        .addComponent(jB_OK))
    );

    setSize(new java.awt.Dimension(400, 284));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jL_diceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_diceMouseClicked
    timerDice.stop();//cuando se clickea el ratón se pausa el contador
    jB_OK.setVisible(true);//aparece un botón ok
    pack();//se redimensiona adecuadamente dejando la gestión a los layouts
  }//GEN-LAST:event_jL_diceMouseClicked

  private void jB_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_OKActionPerformed
    // causes the dialog to be destroyed and cleaned up by the operating system
    // se trata de un método de awt.dialog heredado por el jdialog
    this.dispose();
  }//GEN-LAST:event_jB_OKActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jB_OK;
  private javax.swing.JLabel jL_dice;
  private javax.swing.JLabel jL_message1;
  private javax.swing.JLabel jL_message2;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables
}