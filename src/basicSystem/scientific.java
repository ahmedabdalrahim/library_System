package basicSystem;

public class scientific implements book {
    

    protected String name;
    protected String unit;
    protected String number;
    protected String writer;
    protected String publisher;
    protected String price;
    Atable storage = new Atable(6);
    Object[] rowdo = new Object[6];

    @Override
    public void add(Object[] a) {
        storage.addrow(a);
    }

    @Override
    public void edit(int row, Object[] change) {
        storage.edit(row, change);
    }

    @Override
    public Object[][] search(int colom, String word) {
        return storage.search(colom, word);
    }

    @Override
    public void delete(int row) {
        storage.delete(row);
    }

    @Override
    public Object[][] getdata() {
        return storage.get();
    }

    @Override
    public int count() {
        return storage.count();
    }
     public int search(Object[] a){
    return storage.search(a);
    }
    public Object unit(int row){
    return storage.unit(row, 5);
    }
    public void edit(int row,String num) {
        storage.edit(row, 5, num);
    }
   
     
    
     public void after(){
         storage.afterdelete();
     }

//    public void setRowdo() {
//        rowdo[0] = number;
//        rowdo[1] = name;
//        rowdo[2] = publisher;
//        rowdo[3] = writer;
//        rowdo[4] = price;
//        rowdo[5] = unit;
//    }
    public void setRowdo(Object[] a){
        this.rowdo=rowdo;
    }
}