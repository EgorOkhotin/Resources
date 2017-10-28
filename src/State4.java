public class State4 extends State{
    public State4(int start, int end)
    {
        startTime = start;
        endTime = end;
    }
    @Override
    public String getName()
    {
        return super.getName()+"4";
    }
}
