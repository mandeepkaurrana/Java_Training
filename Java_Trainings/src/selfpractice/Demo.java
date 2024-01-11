package selfpractice;
public class Demo
{
public static void main(String[] args)
{
String s1="Java Strings";
String s2=new String("Java Strings");
if(s1 == s2)
{
System.out.println("Strings s1 and s2 are equal");
}
else
{
System.out.println("Strings s1 and s2 are not equal");
}
}
}

//Output:- "Strings s1 and s2 are not equal"
//Else part will print because == operator use to check the reference, so in ur example both are having different reference
//Not Equal since strings are immutable