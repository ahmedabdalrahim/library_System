/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicSystem;


/**
 *
 * @author en-mokhtar
 */
public class borrow {

    private final Atable borr = new Atable(5);
    private String level;
    private String student;
    private String book;
    private String da;
      Object[] doo = new Object[5];

    
    //{level,student,book,da,""};

   

    public void setDoo(Object[] doo) {
        this.doo = doo;
    }

   

    

    public void addtake() {
        

        borr.addrow(doo);
    }

    public void addreturn(int row) {
        
        borr.edit(row, doo);
    }

    public int search(Object[] search) {
        int b = borr.search(search);
        return b;

    }public Object[][] get(){
        return borr.get();
    }
    public Object[][] search(String search,int clom) {
        
        return  borr.search(clom, search);
    }
    public int rows(){
        return borr.count();
    }
    public Object unit(int row,int colom){
        return borr.unit(row, colom);
    }public int searchb(Object[] search) {
        int b = borr.searchborrow(search);
        return b;

    }
}
