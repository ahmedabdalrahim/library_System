package basicSystem;

public class manager extends person {

    private Object pass;
    Object rowstring[] = new Object[2];

    public manager(int col) {
        super(col);
        //storage.entity[0][0]="ahmed";
        // storage.entity[0][1]="143256";
    }

    public void setPass(Object pass) {
        this.pass = pass;
    }

    @Override
    public void add(Object[] aa) {
        rowstring[0] = name;
        rowstring[1] = pass;

        storage.addrow(aa);

    }

    @Override
    public void edit(int rownum) {
        rowstring[0] = name;
        rowstring[1] = pass;

        storage.edit(rownum, rowstring);
    }
    

   

    

}
