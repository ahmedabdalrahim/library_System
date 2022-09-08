package basicSystem;

public abstract class person {
    
    public person(int col){
       storage=new Atable(col);
    }

   public Atable storage ;
    
    protected Object name;
   
    

    public void setName(Object name) {
        this.name = name;
    }

    abstract protected void add(Object[] aa);

    abstract public void edit(int rownum);

    public void delete(int rownum) {
        storage.delete(rownum);
    }

    public Object[][] getdata() {
        return storage.get();
    }

    public Object[][] search(int colomm, String sear) {
        return storage.search(colomm, sear);
    }
    public int count(){
        return storage.count();
    }
     public int test(Object tes[]) {
        return storage.search(tes);
    }
}
