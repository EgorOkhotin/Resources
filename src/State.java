public class State {
    protected int startTime,
        endTime;

    public boolean isActive(int time)
    {
        if((time>=startTime)&(time<=endTime)) return true;
        else return false;
    }

    public boolean isIntersection(State s2)
    {
        if(!this.getName().equalsIgnoreCase(s2.getName())) return false;
        int start1 = this.getStartTime();
        int start2 = s2.getStartTime();
        int endTime1 = this.getEndTime();
        int endTime2 = s2.getEndTime();
        if(((start1>=start2)&(start1<=endTime2)) |
                (start2>=start1)&(start2<=endTime1)) return true;
        else return false;
    }

    public int Start()
    {
        return startTime;
    }

    public int End()
    {
        return endTime;
    }

    public boolean isEqual(State s2)
    {
        if(!this.getName().equalsIgnoreCase(s2.getName())) return false;
        return true;
    }

    private int getStartTime()
    {
        return startTime;
    }

    private int getEndTime()
    {
        return endTime;
    }

    protected String getName()
    {
        return "State";
    }

}
