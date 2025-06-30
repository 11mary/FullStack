class x
{
    public void Configuration(String model,String storage,String display,String battery_life)
    {
       System.out.println("Parent mobile configuartion are"+" "+(model+storage+display+battery_life));
    }
}
class y extends x
{
    public void Configuaration(String model,String storage,String display,String battery_life,String RAM)
    {
        System.out.println("Child mobile configuartion are"+" "+(model+storage+display+battery_life+RAM));
    }
}
public class overridingMobileConf {
    public static void main(String[] args) {
        y obj=new y();
        obj.Configuration("Nokia 3.4","6GB"," 3inch HD","5000mAh");
        obj.Configuaration("One plus","256GB"," 6.7inch QHD ","5000mAh","24GB LPDDR5X");;
    }
}
