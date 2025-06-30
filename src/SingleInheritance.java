class car1 {
    String door;
    String color;
    int model;

    car1(String na, String co, int mo) {
        door = na;
        color = co;
        model = mo;
    }

    void cardetails()
    {
        System.out.println(door + " " + color + " " + model);
    }
}
    class rolls_roys extends car1
    {
        String fueltype;
        rolls_roys(String na, String co, int mo,String fu)
        {
            super(na, co, mo);
            this.fueltype=fu;
    }
    void rrdetails()
    {
        System.out.println(door+" "+  color + " " + model+""+fueltype );
    }

}
public class SingleInheritance {
    public static void main(String[] args) {
        car1 obj=new car1("front","Black",2025);
        rolls_roys obj2=new rolls_roys("front","white",2024,"petrol");
        obj.cardetails();
        obj2.cardetails();
        obj2.rrdetails();
    }
}
