interface College2
{
    void BE(String B_name,int B_Duration,float B_percentage);
    void PUC(String P_name,int P_Duration,float P_percentage);
    void SSLC(String S_name,int S_Duration,float S_percentage);
}
class College3 implements College2
{

    public void BE(String B_name, int B_Duration, float B_percentage)
    {
        System.out.println(B_name+" "+B_Duration+" "+B_percentage);
    }
    public void PUC(String P_name, int P_Duration, float P_percentage)
    {
        System.out.println(P_name+" "+P_Duration+" "+P_percentage);
    }
    public void SSLC(String S_name, int S_Duration, float S_percentage)
    {
        System.out.println(S_name+" "+S_Duration+" "+S_percentage);
    }

}
public class InterfaceExampleClg {
    public static void main(String[] args) {
        College3 obj = new College3();
         obj.BE("VIT",4,73);
         obj.PUC("GOVT.PU COLLEGE GIRLS",4,55);
         obj.SSLC("GOVT JUNIOR COLLEGE",3,80);
    }
}
