package corejava;
class Bank{
    int GetrateofInterest(){
        return 0;
    }
}
class OverridingSBI extends Bank {
    public int GetrateofInterest(){
    return 9;
    }
}
class AXIS extends Bank{
    public int GetrateofInterest(){
        return 8;
    }
}
class HDFC extends Bank{
    public int GetrateofInterest(){
        return 7;
    }
}
class bank2{
    public static void main(String[] args) {
        OverridingSBI a=new OverridingSBI();
        AXIS b=new AXIS();
        HDFC c=new HDFC();
        System.out.println("GetrateofInterest"+a.GetrateofInterest());
        System.out.println("GetrateofInterest"+b.GetrateofInterest());
        System.out.println("GetrateofInterestzfc"+c.GetrateofInterest());

    }
}