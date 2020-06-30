
package hey;

/**
 *
 * @author Dell
 */
public class cust {
private String name;
private String email;
private String addr;
private String custid;

public cust(String Name, String mail,String add, String cust)
{
    this.name = Name;
    this.addr= add;
    this.custid=cust;
    this.email=mail;  
}

public String getName()
{
    return name;
}

public String getadd()
{
    return addr;
}
public String getcust()
{
    return custid;
}
public String getemail()
{
    return email;
}
}



