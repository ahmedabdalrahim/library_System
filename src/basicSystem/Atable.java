package basicSystem;

import java.util.Arrays;

public class Atable {

    public int colom;
    int r=0,q=1;
    public Object[][] entity;
   
    public Atable(int colom) {
        this.colom = colom;
        entity = new Object[r][colom];
        
    }

    public void addrow(Object[] row) {
        Object[][] copy = entity;
        r++;q++;
        entity = new Object[r][colom];
        System.arraycopy(copy, 0, entity, 0, r-1);
        entity[entity.length-1] = row;
    }

    public void edit(int row, Object[] change) {
        entity[row] = change;
    }

    public void edit(int row, int colom, String date) {
        entity[row][colom] = date;

    }

    public void delete(int row) {
        Object temper[][] = entity;
        entity = new Object[entity.length - 1][colom];
        for (int i =0; i <row; i++) {
            entity[i] = temper[i];
        }for(int i=row;i<entity.length;i++){
            if(i+1!=0){
            entity[i]=temper[i+1];
        }}
        
    }
    public void afterdelete(){
        if(entity.length!=0){            
        for(int i=0;i<entity.length;i++){
            entity[i][0]=i+1;
        }}
    }
    public Object[][] get() {
        return entity;
    }
    public int count(){
        return entity.length;
    }

    public Object[][] search(int colomm, String sear) {
        Object result[][] = new Object[entity.length][colom];
        int x = 0;
        for (int i = 0; i < entity.length; i++) {
            if (sear.equals(entity[i][colomm])) {
                result[x] = entity[i];
                x++;
            }
        }
        return result;
    }

    public int search(Object[] sear) {

        int x =0;
        for (int i = 0; i < entity.length; i++) {
            
            if (Arrays.equals(sear, entity[i])) {
                x = i + 1;
            }
        }
        return x;

    }

    public Object unit(int row, int colom) {
        return entity[row][colom];
    }
    public int searchborrow(Object[] borr){
        for (int i = 0; i < entity.length; i++) {
            if(borr[0].equals(entity[i][0])&& borr[1].equals(entity[i][1])&&borr[2].equals(entity[i][2])&&borr[3].equals(entity[i][4]))
                return i+1;
        }
    return 0;
    
    }
}
