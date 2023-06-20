 interface a {
    public abstract void setdata();
    public abstract void display();
    public abstract void employee();
    
 }
 class b implements a
 {

 public void setdata()

 {
System.out.println("hi");
 }
 public void display()
 {
    System.out.println("hello");
 }
 public void employee()
 {
System.out.println("yes");

 }


 }
class Employee{
    public static void main(String args[])
    {
b b1=new b();
b1.setdata();
b1.display();
b1.employee();
    }
}

    
    
    

