public class MainClient
{
    public static void main(String args[])
    {
       Visitor v = VisitorFactory.getDrA(); //new DoctorA();
       GrandParent gp = FamilyFactory.getGrandParent();//new GrandParent();
       gp.accept(v);
       
       GrandParent p = FamilyFactory.getParent();
       p.accept(v);
       
       
    }


}
