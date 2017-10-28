
public class Resource {
    protected State[] states;
    protected State activeState;

    public boolean changeState(int time)
    {
        if(activeState == null)
        {
            activeState = states[0];
            return true;
        }
        else
        {
            for (int i = 0; i < states.length; i++)
            {
                if (states[i].isActive(time))
                {
                    if (activeState.isEqual(states[i])) return false;
                    else
                    {
                        activeState = states[i];
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean isIntersection(State s)
    {
        if(activeState.isEqual(s))
        return activeState.isIntersection(s);
        else return false;
    }

    public State getActiveState()
    {
        return activeState;
    }

    public int[] getIntersection(Resource r)
    {
        if(isIntersection(r.activeState))
        {
            int[] result = new int[2];
            int st1 = activeState.Start(),
                    st2=r.activeState.Start(),
                    en1 = activeState.End(),
                    en2 = r.activeState.End();
            if(st1>=st2)
            {
                result[0] = st1;
                if(en1<=en2)
                {
                    result[1] = en1;
                }
                else
                {
                    result[1] = en2;
                }
            }
            else
            {
                result[0] = st2;
                if(en1<=en2)
                {
                    result[1] = en1;
                }
                else
                {
                    result[1] = en2;
                }
            }
            return result;
        }
        else
        {
            return null;
        }
    }
}
