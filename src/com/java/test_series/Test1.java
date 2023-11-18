package com.java.test_series;


//java.lang package lo object class gurinchi
public class Test1
{
    String name ;
    int rollNo;
    Test1()
    {

    }
    Test1(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

//    public String toString(int i)
//    {
//        return i;
//    }
    public static void main(String[] args)
    {
//        Object obj = new Object() ;
////
////        String s =new String();
////        int i = 10;
////        s = Integer.toString(i);
////        System.out.println(obj);
////        obj.toString();
////        StringBuffer sb = new StringBuffer();
////        sb.append("john");
////        System.out.println(sb);
//        Test1 o1 = new Test1("john",1);
//        Test1 o2 = new Test1("john",1);
////        System.out.println(new Test1().hashCode());
////        System.out.println(o1);
//        System.out.println(o1.equals(o2));


        Child1 c1 = new Child1();
        c1.cfun1();
    }

    public int hashCode()
    {
        return rollNo;
    }

    public boolean equals(Object o)
    {
        try{
            String name1 =this.name;
            int rollNo1 = this.rollNo;
            Test1 t = (Test1)o;
            String name2 = t.name;
            int rollNo2 = t.rollNo;
            if(name1.equals(name2) && rollNo1==rollNo2)
            {
                return true;
            }
            else {
                return false;
            }
        }
        catch (ClassCastException e1)
        {
            return false;
        }
        catch (NullPointerException e2)
        {
            return false;
        }
    }


}

class Example extends Test1 implements Comparable
{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Child1
{
    void cfun1()
    {
        Integer i = 10;
        System.out.println(i.getClass().getName());
    }
}


