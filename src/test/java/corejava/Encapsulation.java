package corejava;
class Acconts {
    // we use private methode it access only within the class
    public String my_name, my_email;
    private long account_number, contact_no;
    private float salary;

    //crest a getter and setter
    public String getMy_name() {
        return my_name;
    }

    public void setMy_name(String my_name) {
        this.my_name = my_name;
    }

    public String getMy_email() {
        return my_email;
    }

    public void setMy_email(String my_email) {
        this.my_email = my_email;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;

    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Acconts q1=new Acconts();
        q1.setMy_name(" name=k.chennaih");
        q1.setMy_email("mail=chennai@mail");
        q1.setSalary(50000);
        q1.setContact_no(987654321);
        q1.setAccount_number(451136629);
        System.out.println(q1.getMy_name());
        System.out.println(q1.getMy_email());
        System.out.println(q1.getSalary());
        System.out.println(q1.getAccount_number());
        System.out.println(q1.getContact_no());
    }
}
