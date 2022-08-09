public class PatternPyramidNo15
{
public static void main(String args[])
{
int num=1;

for(int i=1;i<=4;i++)
{
for(int j=1;j<=(4-i);j++)
{
System.out.print(" ");
}

for(int k=1;k<=num;k++)
{
System.out.print(num);
}
System.out.println();
num=num+2;
}
}
}