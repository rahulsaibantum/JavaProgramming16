package Strings;

public class P2 
{
    public static void main(String[] args) {
        //ways to create an Immutable string
        /*String name="Rahul";
        String name1=new String("RahulSai");
        char[] ch={'b','a','n','t','u','m','i','l','l','i'};
        String name2=new String(ch);
        System.out.println(name);
        System.out.println(name1); 
        System.out.println(name2); */
        /*String name="Rahul";
        String name1="Rahul";
        System.out.println(name==name1);
        String name2=new String("Rahul");
        String name3=new String("Rahul");
        System.out.println(name2==name3);
        String name5=new String();
        System.out.println(name5);*/
        String s1="chinna";
        String s2=new String("chinna");
         s2=s1+s2;
         s1=s1+"chinna";
         s1=s1+"babu";//chinnachinnababu
         s2=s2+"babu";//chinnachinnababu
        System.out.println(s1.equals(s2));
        
    }
    
}
