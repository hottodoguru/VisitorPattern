public class GrandParent
{
    
    public GrandParent()
    {

    }

    public int readTemperature(){
        return 36;
    }
    
    public void takeMedicine(){
        System.out.println("Take a pill.");
    }
    
    public void accept(Visitor v)
    {
        v.visit(this);
    }
}
