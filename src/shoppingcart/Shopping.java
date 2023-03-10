package shoppingcart;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Shopping extends javax.swing.JFrame {
         
    public static ArrayList<Items> cartItems=new ArrayList<Items>();
    public static ArrayList<Cart> cartList=new ArrayList<Cart>();
    public static ArrayList<Integer> cartNumOfItems=new ArrayList<Integer>();
        public static ArrayList<Integer> isInCart=new ArrayList<>();

    /**
     * Creates new form shopping
     */
    public Shopping() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setTitle("shopping cart");
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setVisible(false);
        jButton1.setText("Buy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 485, -1, -1));

        jLabel1.setText("total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0.0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 1, 70, -1));

        jLabel2.setText("quantity");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 4, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 1, 60, -1));

        jButton2.setVisible(Home.isAdmin);
        jButton2.setText("admincp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane2.setViewportView(jPanel2);
        jPanel2.add(new ButtonsClass());

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 574, 431));

        if(cartList.size()==0)
        jButton3.setVisible(false);
        else
        jButton3.setVisible(true);
        jButton3.setText("Cart history");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        jCheckBox1.setText("customer");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jComboBox1.setVisible(false);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel( Customer.getCustomerNamesSTR()));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 100, -1));

        jButton4.setText("logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jButton6.setVisible(Home.isAdmin);
        jButton6.setText("add Customer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        jButton5.setVisible(false);
        jButton5.setText("clear cart");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                       Calendar c = new GregorianCalendar();
     Items[] itemsArr=new Items[cartItems.size()];
     int[] numOfItemsArr = new int[cartItems.size()];
                for (int i = 0; i < cartItems.size(); i++) {
                    itemsArr[i]=cartItems.get(i);
                    numOfItemsArr[i]=cartNumOfItems.get(i);
            
        }
  cartList.add(new Cart(cartList.size(),c.getTime(),itemsArr,Double.parseDouble( Shopping.jTextField1.getText()), numOfItemsArr));
                if(jComboBox1.getSelectedIndex()>-1&&jCheckBox1.isSelected()){
                           Customer.customerList.get(jComboBox1.getSelectedIndex()).setCart(cartList.get(cartList.size()-1));
                                           JOptionPane.showMessageDialog(null, Items.itemsString(cartList.get(cartList.size()-1).getItems(),cartList.get(cartList.size()-1).getNumOfItems())+"\n added to the selected customer");
                       }else{
                                           JOptionPane.showMessageDialog(null, Items.itemsString(cartList.get(cartList.size()-1).getItems(),cartList.get(cartList.size()-1).getNumOfItems())+"\n but no custmer selected");
                       }
                
                jTextField1.setText("0");
                jTextField2.setText("0");
                jButton1.setVisible(false);
                cartItems.clear();
                cartNumOfItems.clear();;
                isInCart.clear();
                jCheckBox1.setSelected(false);
                jComboBox1.setVisible(false);
                jButton3.setVisible((cartList.size()>0)?true:false);
                jButton5.setVisible(false);

               // jComboBox1.setSelectedIndex(-1);
               // jButton4.setVisible(true);
      // cartList.add(new Cart(cartList.size(),c.getTime(), (Items[]) cartItems.toArray(),Double.parseDouble( Shopping.jTextField1.getText()), Integer.parseInt( Shopping.jTextField2.getText())));
//                System.out.println(Arrays.toString(cartList.get(0).getItems())+" "+cartList.get(0).getDate());
                         //              cartList.add(new Cart(cartList.size(),c.getTime(),itemsArr,Double.parseDouble( Shopping.jTextField1.getText()), Integer.parseInt( Shopping.jTextField2.getText())));
                   
                    
              //  System.out.println(carttest.getItems()[0].getItemName()+" "+carttest.getDate());
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdminCP admincp=new AdminCP();
        admincp.setSize(500, 500);
        setVisible(false);
        admincp.setVisible(true);    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        for (int i = 0; i < cartList.size(); i++) {
            
         JOptionPane.showMessageDialog(null, Items.itemsString(cartList.get(i).getItems(),cartList.get(i).getNumOfItems()));
        }
        JOptionPane.showMessageDialog(null, "no more");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            jComboBox1.setVisible(true);
        }else{
                        jComboBox1.setVisible(false);

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        AddCustomer addCustomer = new AddCustomer();
        addCustomer.setSize(500, 500);
        addCustomer.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                        Home home = new Home();
              home.setSize(500, 500);
          home.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
            for (int i = 0; i < cartItems.size(); i++) {
            ShoppingCart.itemsArray.get(ShoppingCart.itemsArray.indexOf(cartItems.get(i))).setOnStock(ShoppingCart.itemsArray.get(ShoppingCart.itemsArray.indexOf(cartItems.get(i))).getOnStock()+Shopping.cartNumOfItems.get(i));
        }
           jTextField1.setText("0");
                jTextField2.setText("0");
                jButton1.setVisible(false);
                cartItems.clear();
                cartNumOfItems.clear();;
                isInCart.clear();
                jCheckBox1.setSelected(false);
                jComboBox1.setVisible(false);
                jButton3.setVisible((cartList.size()>0)?true:false);
                jButton5.setVisible(false);
                jPanel2.removeAll();
                jPanel2.add(new ButtonsClass());

    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

class ButtonsClass extends JPanel implements ActionListener {

        private List<JButton> btns = new ArrayList<>(ShoppingCart.itemsArray.size());

        public ButtonsClass() {

            setLayout(new GridLayout(4,4));
            for (int index = 0; index < ShoppingCart.itemsArray.size(); index++) {
                
                JButton btn = new JButton("<html>\n<p>"+ShoppingCart.itemsArray.get(index).getItemName()+" <p>\n<p>p :  ( "+ShoppingCart.itemsArray.get(index).getPrice()+" )  q : "+ShoppingCart.itemsArray.get(index).getOnStock()+"<p>\n</html>");
                btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ShoppingCart.itemsArray.get(index).getImage().toString())));
                btns.add(btn);
                btn.addActionListener(this);
                add(btn);

            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source instanceof JButton) {
                JButton btn = (JButton) source;
                int index = btns.indexOf(source);

                index = getComponentZOrder(btn);
                if(ShoppingCart.itemsArray.get(index).decreaseStock()){
                  btn.setText("<html>\n<p>"+ShoppingCart.itemsArray.get(index).getItemName()+" <p>\n<p>p :  ( "+ShoppingCart.itemsArray.get(index).getPrice()+" )  q : "+ShoppingCart.itemsArray.get(index).getOnStock()+"<p>\n</html>"); 
                  if(Shopping.isInCart.indexOf(index)==-1){
                     Shopping.cartItems.add(ShoppingCart.itemsArray.get(index)); 
                     Shopping.cartNumOfItems.add(0);
                     Shopping.isInCart.add(index);
                  }
                  Shopping.cartNumOfItems.set(Shopping.isInCart.indexOf(index), Shopping.cartNumOfItems.get(Shopping.isInCart.indexOf(index))+1);
               //   Shopping.cartNumOfItems.add(1);
               //    Shopping.cartNumOfItems.set(0, 3);
                 //   Shopping.cartNumOfItems.set(1, 2);
               //     System.out.println(Shopping.cartNumOfItems.get(Shopping.isInCart.indexOf(index))+" "+Shopping.isInCart.indexOf(index)+" "+index);
                  //  System.out.println(Shopping.cartItems.get(Shopping.cartItems.size()-1).getItemName());
                  Integer x = Integer.parseInt(Shopping.jTextField2.getText()) + 1;
                  Shopping.jTextField2.setText(x.toString());
                  Double y=Double.parseDouble(Shopping.jTextField1.getText())+ShoppingCart.itemsArray.get(index).getPrice();
                  DecimalFormat df = new DecimalFormat("##.##");
                  Shopping.jTextField1.setText(df.format(y));
                  Shopping.jButton1.setVisible(true);
                  Shopping.jButton5.setVisible(true);
                          
                }else{
                    JOptionPane.showMessageDialog(null, "out of stock");
                }
                
                revalidate();
            }
        }

    }

