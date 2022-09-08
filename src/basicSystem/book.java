package basicSystem;

public interface book {
    public void add(Object[] a);
    public void edit(int row,Object[] change);
    public Object[][] search(int colom,String word);
    public void delete(int row);
    public Object[][] getdata();
     public int count();
    
}
