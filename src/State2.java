public class State2 extends State{
    public State2(int start, int end)
    {
        startTime = start;
        endTime = end;
    }
    @Override
    public String getName()
    {
        return super.getName()+"2";
    }
}
