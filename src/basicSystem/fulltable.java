package basicSystem;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class fulltable {

    public static void fullalldata(Object[][] data, JTable table) {
        try{

        DefaultTableModel mod = (DefaultTableModel) table.getModel();
        mod.setRowCount(0);

        for (Object[] ff:data) {

            mod.addRow(ff);
        }
    }catch(Exception e){}

}}
