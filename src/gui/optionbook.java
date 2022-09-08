/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static basicSystem.ExtrLibrary.bookalm;
import static basicSystem.ExtrLibrary.booklet;
import static basicSystem.ExtrLibrary.liter;
import basicSystem.Helpme;
import basicSystem.fulltable;
import basicSystem.scientific;
import java.awt.Color;
import help.bott;
import help.textfield;
import java.text.MessageFormat;
import javax.swing.JTable;

/**
 *
 * @author en-mokhtar
 */
public class optionbook extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form
     */
    public optionbook() {
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

        grob = new javax.swing.ButtonGroup();
        grob1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        booktable = new javax.swing.JTable();
        rdname = new javax.swing.JRadioButton();
        rdprice = new javax.swing.JRadioButton();
        rdwriter = new javax.swing.JRadioButton();
        search = new textfield(15);
        jLabel6 = new javax.swing.JLabel();
        botsearch = new bott();
        jButton2 = new bott();
        botdelete = new bott();
        botedit = new bott();
        botadd = new bott();
        jButton6 = new bott();
        rdadb = new javax.swing.JRadioButton();
        rdalm = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numbo = new textfield(15);
        nameb0 = new textfield(15);
        publisherbo = new textfield(15);
        txtunit = new textfield(15);
        writerbo = new textfield(15);
        pricebo = new textfield(15);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdbooklet = new javax.swing.JRadioButton();
        print = new bott();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        booktable.getTableHeader().setForeground(Color.black);
        booktable.getTableHeader().setBackground(Color.decode("#FDD017"));
        //booktable.setParent().setBackground(Color.decode("#FDD017"));
        booktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Number", "Name", "Publisher", "Writer", "Price", "Units"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booktable.setGridColor(new java.awt.Color(255, 204, 51));
        booktable.setShowHorizontalLines(false);
        booktable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booktableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(booktable);

        rdname.setSelected(true);
        rdname.setText("name");

        rdprice.setText("price");

        rdwriter.setText("writer");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("search by:");

        botsearch.setText("Search");
        botsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botsearchActionPerformed(evt);
            }
        });

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botdelete.setText("Delete");
        botdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botdeleteActionPerformed(evt);
            }
        });

        botedit.setText("Edit");
        botedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boteditActionPerformed(evt);
            }
        });

        botadd.setText("Add");
        botadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaddActionPerformed(evt);
            }
        });

        jButton6.setText("back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        rdadb.setText("Magazine");
        rdadb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdadbMouseClicked(evt);
            }
        });
        rdadb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdadbActionPerformed(evt);
            }
        });

        rdalm.setSelected(true);
        rdalm.setText("Book");
        rdalm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdalmMouseClicked(evt);
            }
        });

        jLabel4.setText("writer");

        jLabel5.setText("price");

        numbo.setEditable(false);
        numbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numboActionPerformed(evt);
            }
        });

        nameb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameb0ActionPerformed(evt);
            }
        });

        publisherbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherboActionPerformed(evt);
            }
        });

        txtunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunitActionPerformed(evt);
            }
        });

        writerbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writerboActionPerformed(evt);
            }
        });

        pricebo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceboActionPerformed(evt);
            }
        });

        jLabel1.setText("book name");

        jLabel2.setText("book Number");

        jLabel3.setText("publisher");

        jLabel7.setText("Units");

        rdbooklet.setText("Booklet");
        rdbooklet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbookletMouseClicked(evt);
            }
        });

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(botadd)
                                        .addGap(26, 26, 26)
                                        .addComponent(botedit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botdelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))
                                    .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(writerbo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pricebo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(publisherbo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameb0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numbo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtunit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print)
                        .addGap(55, 55, 55)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdalm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdadb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbooklet)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdprice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdwriter))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(botsearch)))
                        .addGap(34, 34, 34))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nameb0, numbo, pricebo, publisherbo, txtunit, writerbo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botadd, botdelete, botedit, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 88, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdadb)
                                    .addComponent(rdalm)
                                    .addComponent(rdbooklet)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botsearch))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botdelete)
                                    .addComponent(botadd)
                                    .addComponent(botedit)
                                    .addComponent(jButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(rdname)
                                        .addComponent(rdprice)
                                        .addComponent(rdwriter))
                                    .addComponent(numbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(nameb0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(publisherbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(writerbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pricebo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print)
                        .addGap(34, 34, 34)
                        .addComponent(jButton6)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {nameb0, numbo, pricebo, publisherbo, txtunit, writerbo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botadd, botdelete, botedit, jButton2});

        rdname.setBackground(Color.decode("#FDD017"));
        rdprice.setBackground(Color.decode("#FDD017"));
        rdwriter.setBackground(Color.decode("#FDD017"));
        rdname.setBackground(Color.decode("#FDD017"));
        rdname.setBackground(Color.decode("#FDD017"));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botsearchActionPerformed
      String f=search.getText();        
        Object w[][] = null;
        if(f.isEmpty()){
            Helpme.error("Enter Word for Search");
            search.requestFocus();
        }
        else if(rdalm.isSelected()){
            if(rdname.isSelected()){
                w=bookalm.search(1,f);               
            }
            else if(rdwriter.isSelected()){
                w=bookalm.search(3,f);               
            }
            else
                w=bookalm.search(4, f);
                
        } else if(rdadb.isSelected()){
            if(rdname.isSelected()){
                w=liter.search(1,f);               
            }
            else if(rdwriter.isSelected()){
                w=liter.search(3,f);               
            }
            else
                w=liter.search(4,f);
                
        }else if(rdbooklet.isSelected()){
            if(rdname.isSelected()){
                w=booklet.search(1,f);               
            }
            else if(rdwriter.isSelected()){
                w=booklet.search(3,f);               
            }
            else
                w=booklet.search(4,f);
        
        }
        fulltable.fullalldata(w, booktable);
        clear();
    }//GEN-LAST:event_botsearchActionPerformed
    public void clear(){
        botadd.setEnabled(true);
        botedit.setEnabled(false);
        botdelete.setEnabled(false);
        if(rdalm.isSelected()){
            numbo.setText(String.valueOf(bookalm.count()+1));
        }
        else if(rdadb.isSelected()){
            numbo.setText(String.valueOf(liter.count()+1));
        }else{
            numbo.setText(String.valueOf(booklet.count()+1));
        }
        nameb0.setText("");
        publisherbo.setText("");
        writerbo.setText("");
        pricebo.setText("");
        txtunit.setText("");
        nameb0.requestFocus();
    
    }
    public void checkforchar(String check)throws Exception{
        Exception e=new Exception();
        int as;
       for(char c:check.toCharArray()){
           as=(int)c;
           if(!(as>=97&&as<=122||as>=65&&as<=90))
               throw e;
               
       }
       
       // }catch(Exception e){}
    
    }
    public void checkfornumbeer(String check)throws Exception{
        Exception e=new Exception();
       for(char c:check.toCharArray()){
           if(!(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'))
               throw e;
               
       }
       // }catch(Exception e){}
    
    }
    private void botedit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botedit1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_botedit1ActionPerformed
    public void checkforname(String check)throws Exception{
        Exception e=new Exception();
        int as;
       for(char c:check.toCharArray()){
           as=(int)c;
           if(!(as>=97&&as<=122||as>=65&&as<=90)||as>=48&&as<=57)
               throw e;
               
       }
    }
    private void botnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botnewActionPerformed
        // TODO add your handling code here
        clear();
        
    }//GEN-LAST:event_botnewActionPerformed
    public void addss(scientific a) {
        Object[] asd=new Object[6];
        asd[0] = numbo.getText();
        asd[1] = nameb0.getText();
        asd[2] = publisherbo.getText();
        asd[3] = writerbo.getText();
        asd[4] = pricebo.getText();
        asd[5] = txtunit.getText();
        a.add(asd);
fulltable.fullalldata(a.getdata(), booktable);
        clear();
        
       
    }
//
    public void go() {
        if (rdadb.isSelected()) {            
            addss(liter);
            fulladb();
        } else if (rdalm.isSelected()) {
          addss(bookalm);  
         
        } else {
           addss(booklet);
          
        }
    }

//   

    

   
    private void botaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaddActionPerformed
        try {
            String num = numbo.getText();
            String name1 = nameb0.getText();
            String publ = publisherbo.getText();
            String writ = writerbo.getText();
            String price = pricebo.getText();
            String unit = txtunit.getText();
            checkforname(name1);
            checkforchar(publ);
            checkforchar(writ);
             checkfornumbeer(price);
              checkfornumbeer(unit);
            
            if (name1.isEmpty()) {
                Helpme.error("Please Enter Name");
                nameb0.requestFocus();
            } else if (publ.isEmpty()) {
                Helpme.error("Please Enter Publisher");
                publisherbo.requestFocus();
            } else if (writ.isEmpty()) {
                Helpme.error("Please Enter Writer");
                writerbo.requestFocus();
            } else if (price.isEmpty()) {
                Helpme.error("Enter Price ! ");
                pricebo.requestFocus();
            } else if (unit.isEmpty()) {
                Helpme.error("Enter Unit ! ");
                txtunit.requestFocus();
            } else {
                go();
            }         
        } catch (Exception e) {
            Helpme.error("Please Do not Enter number in Name or Enter char in price or unit ");
        }
    }//GEN-LAST:event_botaddActionPerformed
    
    
    public void add(){
         String num = numbo.getText();
       String name1 = nameb0.getText();
       String publ = publisherbo.getText();
       String writ = writerbo.getText();
       String price = pricebo.getText();
       String unit = txtunit.getText(); 
    }
    private void botdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botdeleteActionPerformed
    
        if (rdalm.isSelected()) {
          
            deleteq(bookalm);
        } else if(rdadb.isSelected()) {
            deleteq(liter);            
        }else{
             deleteq(booklet);
         }
        
       
    }//GEN-LAST:event_botdeleteActionPerformed
    Object[] s = new Object[6];
    public void deleteq(scientific w){
         add();
             
        int e ;
          e=w.search(s);
            w.delete(e - 1);
            w.after();
            fulltable.fullalldata(w.getdata(), booktable);
             clear();
    }
    private void boteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boteditActionPerformed
        try {
            String num = numbo.getText();
            String name1 = nameb0.getText();
            String publ = publisherbo.getText();
            String writ = writerbo.getText();
            String price = pricebo.getText();
            String unit = txtunit.getText();            
            checkforname(name1);
            checkforchar(publ);
            checkforchar(writ);
            checkfornumbeer(price);
            checkfornumbeer(unit);                      
            if (nameb0.getText().isEmpty()) {
                Helpme.error("Please Enter Name");
                nameb0.requestFocus();
            } else if (publisherbo.getText().isEmpty()) {
                Helpme.error("Please Enter Publisher");
                publisherbo.requestFocus();
            } else if (writerbo.getText().isEmpty()) {
                Helpme.error("Please Enter Writer");
                writerbo.requestFocus();
            } else if (pricebo.getText().isEmpty()) {
                Helpme.error("Enter Price ! ");
                pricebo.requestFocus();
            } else if (txtunit.getText().isEmpty()) {
                Helpme.error("Enter Unit ! ");
                txtunit.requestFocus();
            } else {
                
                if (rdalm.isSelected()) {
                   editt(bookalm);
                } else if (rdadb.isSelected()) {
                    editt(liter);
                } else {
                   editt(booklet);
                }
               
            }
        } catch (Exception e) {
            Helpme.error("Please Do not Enter number in Name or Enter char in price or unit ");
        }

    }//GEN-LAST:event_boteditActionPerformed
    public void editt(scientific q) {
        Object[] t = new Object[6];
        t[0] = numbo.getText();
        t[1] = nameb0.getText();
        t[2] = publisherbo.getText();
        t[3] = writerbo.getText();
        t[4] = pricebo.getText();
        t[5] = txtunit.getText();
        int e;
        e = Integer.parseInt(numbo.getText());
        q.setRowdo(t);
        q.edit(e - 1, t);
        fulltable.fullalldata(q.getdata(), booktable);
         clear();
}
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        grob.add(rdname);
        grob.add(rdprice);
        grob.add(rdwriter);
        grob1.add(rdadb);
        grob1.add(rdbooklet);
        fullalm();
        rdalm.setBackground(Color.decode("#FDD017"));
        rdadb.setBackground(Color.decode("#FDD017"));
        rdbooklet.setBackground(Color.decode("#FDD017"));
        setBackground(Color.decode("#FDD017"));
        grob1.add(rdalm);
        clear();
    }//GEN-LAST:event_formWindowOpened

    private void booktableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booktableMouseClicked
        // TODO add your handling code here:
        try{ int row = booktable.getSelectedRow();
        String num = booktable.getValueAt(row, 0).toString();
        String name1= booktable.getValueAt(row, 1).toString();
       String  publ = booktable.getValueAt(row, 2).toString();
       String  writ = booktable.getValueAt(row, 3).toString();
        String price = booktable.getValueAt(row, 4).toString();
        String unit = booktable.getValueAt(row, 5).toString();
        numbo.setText(num);
        nameb0.setText(name1);
        publisherbo.setText(publ);
        writerbo.setText(writ);
        pricebo.setText(price);
        txtunit.setText(unit);
        botedit.setEnabled(true);
        botdelete.setEnabled(true);
        botadd.setEnabled(false);
        }catch(Exception e){}
    }//GEN-LAST:event_booktableMouseClicked
       
    private void rdadbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdadbMouseClicked
        // TODO add your handling code here:
        botedit.setEnabled(false);
        rdadb.setSelected(true);
        rdalm.setSelected(false);
        rdbooklet.setSelected(false);
        botdelete.setEnabled(false);
        botadd.setEnabled(true);
         fulladb();
         clear();

    }//GEN-LAST:event_rdadbMouseClicked
    public void fulladb(){
        fulltable.fullalldata(liter.getdata(), booktable);
    }
     public void fullalm(){
        fulltable.fullalldata(bookalm.getdata(), booktable);
    }
      public void fullbooklet(){
        fulltable.fullalldata(booklet.getdata(), booktable);
    }
    private void rdalmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdalmMouseClicked
        // TODO add your handling code here:
        botedit.setEnabled(false);
        rdadb.setSelected(false);
        rdbooklet.setSelected(false);
        rdalm.setSelected(true);
        botdelete.setEnabled(false);
        botadd.setEnabled(true);
                fullalm();
                clear();
    }//GEN-LAST:event_rdalmMouseClicked

    private void numboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numboActionPerformed

    private void nameb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameb0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameb0ActionPerformed

    private void publisherboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherboActionPerformed

    private void txtunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtunitActionPerformed

    private void writerboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writerboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_writerboActionPerformed

    private void priceboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         jmansger m = new jmansger();
        Helpme.form(m,"manager","man.jpg");
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void rdadbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdadbActionPerformed
//////        // TODO add your handling code here:
    }//GEN-LAST:event_rdadbActionPerformed

    private void rdbookletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbookletMouseClicked
        // TODO add your handling code here:
       botedit.setEnabled(false);
        rdadb.setSelected(false);
        rdalm.setSelected(false);
        botdelete.setEnabled(false);
        botadd.setEnabled(true);
               fullbooklet();
                clear();
        
    }//GEN-LAST:event_rdbookletMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            MessageFormat head;
            if(rdalm.isSelected()){
                head=new MessageFormat("Books");
            }else if(rdadb.isSelected()){
                head=new MessageFormat("Magazine");
            }else{
               head=new MessageFormat("Booklet");
            }
        MessageFormat pagee=new MessageFormat("page - {0}");
        
        booktable.print(JTable.PrintMode.FIT_WIDTH,head,pagee);
        }catch(Exception e){}
        
    }//GEN-LAST:event_printActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booktable;
    private javax.swing.JButton botadd;
    private javax.swing.JButton botdelete;
    private javax.swing.JButton botedit;
    private javax.swing.JButton botsearch;
    private javax.swing.ButtonGroup grob;
    private javax.swing.ButtonGroup grob1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameb0;
    private javax.swing.JTextField numbo;
    private javax.swing.JTextField pricebo;
    private javax.swing.JButton print;
    private javax.swing.JTextField publisherbo;
    private javax.swing.JRadioButton rdadb;
    private javax.swing.JRadioButton rdalm;
    private javax.swing.JRadioButton rdbooklet;
    private javax.swing.JRadioButton rdname;
    private javax.swing.JRadioButton rdprice;
    private javax.swing.JRadioButton rdwriter;
    private javax.swing.JTextField search;
    private javax.swing.JTextField txtunit;
    private javax.swing.JTextField writerbo;
    // End of variables declaration//GEN-END:variables
}
