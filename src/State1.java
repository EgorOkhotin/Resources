public class State1 extends State{
    public State1(int start, int end)
    {
        startTime = start;
        endTime = end;
    }
    @Override
    public String getName()
    {
        return super.getName()+"1";
    }
}
