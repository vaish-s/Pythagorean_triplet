//Author  : Deepansh Dubey.
//Date      : 10/10/2020.
//Purpose: Program to find Pythagorean triplet upto desired number

import java.io.*;
class ptriplet
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintStream ob=new PrintStream(new FileOutputStream("/Your new file path here/"));
long a=0,i,j,k,c,l;
System.out.println("Input the number upto which you want to check");
a=Long.parseLong(br.readLine());
for(i=3;i<=a;i++)
{
for(j=i+1;j<=a;j++)
{
for(k=j+1;k<=a;k++)
{
c=0;


//Checking triprime
for(l=2;l<=k;l++)
{
if(i%l==0&&j%l==0&&k%l==0)
{
c++;
}
}
if(c==0)
{
//Triprime checked




if(i*i+j*j==k*k)
{
System.out.println(i+" , "+j+" , "+k);
ob.println(i+" , "+j+" , "+k);
}
}}}}
ob.close();
}
}