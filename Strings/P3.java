package Strings;
import java.util.Scanner;
import java.lang.String;
public class P3 {
    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s);*/
        /*2 
        String s="refrigerator";
        System.out.println(s.length());*/
        
        
        String l="Umbrella";
        System.out.println(l.contains("e"));
        
        String w="Hello,have a good day.";
        w=w.toLowerCase().replaceAll("[b,c,d,f,g,h,j,k,l,m,n,p,q,r,s,t,u,v,w,x,y,z]","");
        
       String s="rahul";
       s=s+"sai"+"bantumilli";
       String s1=s.substring(0, 18);
        System.out.println(s1);
       
    }
}
