public class Main
{
    public static void main(String[] args)
    {
        Manager mn = new Manager();
        int i=1;
        try
        {
            while (i < 20)
            {
                mn.checkTime(i);
                Thread.sleep(1000);
                i++;
            }
        }
        catch (InterruptedException e)
        {

        }
    }
}
