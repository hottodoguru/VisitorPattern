public class DoctorA extends Visitor
{

    public DoctorA()
    {
    }

    public void visit(GrandParent gp)
    {
        int temp = gp.readTemperature();
        System.out.println(temp);
        gp.takeMedicine();
    
    }
    
    public void visit(Parent p)
    {
        p.takeMedicine();
        int temp = p.readTemperature();
        System.out.println(temp);
    
    }
    
}
