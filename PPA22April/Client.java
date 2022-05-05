import PPA.Marvellous;
import PPA.Infosystems;
import PPA.LB.Demo;
import PPA.LB.DS.Hello;


class Client
{
    public static void main(String a[])
    {
        Marvellous mobj = new Marvellous();
        Infosystems iobj = new Infosystems();
        Demo dobj = new Demo();
        Hello hobj = new Hello();

        mobj.fun();
        iobj.gun();
        dobj.sun();
        hobj.run();
    }
}