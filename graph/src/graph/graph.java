
package graph;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class graph {

double maxp,minp;
int supp,infp;
int number;
int[] sline=new int[500];
int[] pline=new int[500];
int s;
String[] data=new String[500];
int datanumber;
double[] point=new double[101];
double[] p=new double[101];
int[] pp=new int[101];
double p1,avgp;  

void makedata(){

p1=0;
for(s=1;s<101;s++){    
p1=p1+point[s];
}    
avgp=p1/100;    


for(s=1;s<101;s++){    
p[s]=100*(point[s]/avgp-1);
}    

maxp=0;
for(s=1;s<101;s++){    
if(p[s]>maxp)maxp=p[s];
}    

minp=999;
for(s=1;s<101;s++){    
if(p[s]<minp)minp=p[s];
}    

infp=(int)minp-1;
supp=(int)maxp+1;

number=supp-infp;

for(s=1;s<number;s++){
sline[s]=infp+s;
}

for(s=1;s<number;s++){
pline[s]=(500*(sline[s]-infp))/(supp-infp);
}

for(s=1;s<101;s++){
pp[s]=(int)(500*(p[s]-infp))/(supp-infp);
}

 svg sub=new svg();

data[1]=sub.line(100,100,100,600,"BLACK",2);
data[2]=sub.line(100,600,600,600,"BLACK",2);
data[3]=sub.text(100,100,"消費","BLACK");
data[4]=sub.text(600,600,"期間","BLACK");

int z1,sx;
 
sx=4;
for(s=1;s<number;s++){
sx=sx+1;
z1=pline[s];
data[sx]=sub.line(100,600-z1,600,600-z1,"BLUE",1);
}  

String str1;

for(s=1;s<number;s++){
sx=sx+1;
z1=pline[s];
str1=""+sline[s]+"%";
data[sx]=sub.text(80,600-z1,str1,"BLUE");
}  

for(s=1;s<100;s++){
sx=sx+1;
data[sx]=sub.line(100+5*s,600-pp[s],105+5*s,600-pp[s+1],"RED",2);
}  

datanumber=sx;

writefile("dsge.svg");




}
void writefile(String file){ 
 
    int s;
    
try{ 
PrintWriter pw = new PrintWriter (new BufferedWriter(new FileWriter(file))); 
 
pw.println("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">");
for(s=1;s<datanumber+1;s++){
pw.println(data[s]);
}
pw.println("</svg>");
 
 
System.out.println("ABC"); 
pw.close(); 
} catch(IOException ep){ System.out.println("ABC"); } 
 
 
} 



}
