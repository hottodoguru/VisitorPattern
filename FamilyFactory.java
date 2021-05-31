
/**
 * Write a description of class FamilyFactory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FamilyFactory
{
    public static GrandParent getGrandParent(){
        return new GrandParent();
    }
    
    public static GrandParent getParent(){
        return new Parent();
    }
}
