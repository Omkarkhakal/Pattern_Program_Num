public class PatternNo5
{
public static void main(String args[])
{
for(int i=5;i>=1;i--)
{
for(int k=5;k>=i+1;k--)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(j);
}

System.out.println();
}
}
}