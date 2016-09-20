
/**
 * 
 * It defines the user shoe size and foot width
 * @author (Abhijit Singh) 
 * @version (9.20.2016)
 */

public class ShoeSize
{
    //The person's shoe size.
    private int size;
    private int width;

    public ShoeSize ( int usersize, int userfootwidth)
    {
        size = usersize;
        width = userfootwidth;
    }
    /*
     * This function prints out the users foot size and foot width.
     * System.out.println(" foot" )- will print foot
     */
    public void UserShoesize()
    {
        System.out.println(" User Size is-" + size);
        System.out.println(" User food width is-" + width);
    }
}

