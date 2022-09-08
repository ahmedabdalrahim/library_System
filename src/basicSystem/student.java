
package basicSystem;


public class student extends person{
    private String level;
    Object rowstring[] = new Object[2];

    public void setRowstring(Object[] rowstring) {
        this.rowstring = rowstring;
    }
    public void setRowstring() {
        rowstring[0]=level;
        rowstring[1]=name;
    }

    public student(int col) {
        super(col);
    }
     
    public void add() {               
        storage.addrow(rowstring);
    }
    @Override
    public void edit(int rownum) 
    { 
        storage.edit(rownum, rowstring);
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public int test(){
     return storage.search(rowstring);
    }

    @Override
    protected void add(Object[] aa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   

    
    
}
