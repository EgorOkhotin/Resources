public class Manager {
    private Resource1 res1;
    private Resource2 res2;
    public Manager()
    {
        State1 s1 = new State1(1,3);
        State3 s3 = new State3(5,9);
        State4 s4 = new State4(9,15);
        Resource1 r1 = new Resource1(s1,s3,s4);
        res1 = r1;

        State2 s2_2 = new State2(1,3);
        State3 s3_2 = new State3(6,11);
        Resource2 r2 = new Resource2(s2_2,s3_2);
        res2 = r2;
    }

    public void checkTime(int time)
    {
        if(res1.changeState(time) | res2.changeState(time))
        {
            if(res1.isIntersection(res2.getActiveState()))
            {
                int[] result = res1.getIntersection(res2);
                System.out.println(result[0] + " " + result[1] + "; ");
            }
        }
    }

}
