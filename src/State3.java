public class State3 extends State{
    public State3(int start, int end)
    {
        startTime = start;
        endTime = end;
    }
    @Override
    public String getName()
    {
        return super.getName()+"3";
    }
}
