public class Roll 
{
int clgcode;
long btchcode;
long deptcode;
long rollno;

Roll(int  clgcode,long btchcode,long deptcode,long rollno)
{
    this.clgcode=clgcode;
    this.btchcode=btchcode;
    this.deptcode=deptcode;
    this.rollno=rollno;
}
    void Show()
    {
        System.out.print("register number:"+ clgcode + btchcode + deptcode  +rollno);
    }
    
    
public static void main(String args[])
{
    Roll r1 = new Roll(6130,23,2050,61);
    r1.Show(); 
}

    
}
