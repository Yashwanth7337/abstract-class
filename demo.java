abstract class abs{
    public abstract void getdata();

    public void setdata() {
        System.out.println("hi");

    }
}

class dbs extends abs {
    public void getdata()
    {
System.out.println("hello");
    }

     }
    
class demo
{
    public static void main(String args[]) {
    dbs d=new dbs();
        d.getdata();
        d.setdata();

    }
}
