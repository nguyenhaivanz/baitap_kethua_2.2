package ngay_8;

public class Parttime extends Dad{
    private int Date;

    public Parttime(){
    }
    public Parttime(int Date){
        this.Date = Date;
    }
    public Parttime(int id,String name,int age,String address,int Date){
        super(id, name, age, address);
        this.Date = Date;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        Date = Date;
    }
    public int show(){
        return Date * 120000;
    }
    @Override
    public String toString(){
        return super.toString() +"Date ="+ this.Date;
    }
}