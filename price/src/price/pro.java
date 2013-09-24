package price;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class pro {
 
double[] cn=new double[101];
double[] ln=new double[101];
double[] cm=new double[101];
double[] lm=new double[101];
double[] pm=new double[101];
double[] pn=new double[101];

double[] k=new double[101];
double[] pc=new double[101];
double[] th=new double[101];
String[] data=new String[1000];


double a,beta,ms;
 int datanumber;
    double ks,h,ls;
    int n,m;
 
    int[] px=new int[101];
    double[] p=new double[101];
 
    public static void main(String[] args) {
        pro test=new pro();
    }
pro(){
 
a=0.33;
beta=0.95;
ms=20;

for(m=1;m<101;m++){
th[m]=0.95+0.001*m;
}

simple sub3=new simple();
sub3.a=a;
sub3.beta=beta;
sub3.th=th;
sub3.makedata();
cn=sub3.cn;
cm=sub3.cm;
ln=sub3.ln;
lm=sub3.lm;
k=sub3.k;
h=sub3.h;

money sub2=new money();
sub2.cn=cn;
sub2.cm=cm;
sub2.ln=ln;
sub2.lm=lm;
sub2.k=k;
sub2.h=h;
sub2.ms=ms;
sub2.a=a;
sub2.beta=beta;
sub2.makedata();
pm=sub2.pm;
pn=sub2.pn;



double k1,l1,n1;
int t;


k1=k[50];
for(t=1;t<101;t++){
n1=k1/h;
m=(int)(100*Math.random())+1;
k1=k1+th[m]*f(k1,lab(m,n1))-con(m,n1);
pc[t]=price(m,n1);
}

 double maxp,minp,avgp;
 double p1;
   int s;
    
    
    p1=0;
    for(s=1;s<101;s++){
    p1=p1+pc[s];
    }
 
    avgp=p1/100;
   
    double p2;
    int p3;
    
    for(s=1;s<101;s++){
    p2=100*pc[s]/avgp-100;
    p[s]=p2/100;
    }
    
    
    minp=999;
    for(s=1;s<101;s++){
    if(p[s]<minp)minp=p[s];
    }
 
      maxp=0;
    for(s=1;s<101;s++){
    if(p[s]>maxp)maxp=p[s];
    }
   
    int n2;
    
    n1=(int)(1000*maxp);
     n2=(int)(1000*minp);
    
     n1=n1/10;
     n2=n2/10;
   
    
    for(s=1;s<101;s++){
    px[s]=(int)(500*(p[s]-minp)/(maxp-minp));
    }
 
    svg sub=new svg();
 
 
   for(s=1;s<100;s++){
    data[s]=sub.line(100+5*s,600-px[s],105+5*s,600-px[s+1],"RED",2);
   }
 
   String str1,str2;
   
   str1=""+n1+"%";
   str2=""+n2+"%";
   
   datanumber=105;
     data[100]=sub.line(100,100,100,600,"BLACK",2);
      data[101]=sub.line(100,600,600,600,"BLACK",2);
    data[102]=sub.text(60,100,str1,"BLACK");
      data[103]=sub.text(60,600,str2,"BLACK");
      
      data[104]=sub.text(70,300,"消費","BLACK");
      data[105]=sub.text(300,600,"期間","BLACK");
      
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
 
double price(int m,double nx){
double c1;
int n1,n2;
n1=(int)nx;
n2=n1+1;
c1=pn[n1]+(nx-n1)*(pn[n2]-pn[n1])+pm[m];
return c1;
}

double f(double k1,double l1){
double c1;
c1=Math.pow(k1,a)*Math.pow(l1,1-a);    
return c1;    
}


double lab(int m,double n1){
int n2,n3;
double c1;
n2=(int)n1; 
n3=n2+1;      
c1=ln[n2]+(n1-n2)*(ln[n3]-ln[n2])+lm[m];     
return c1;    
}
double con(int m,double n1){
int n2,n3;
double c1;
n2=(int)n1; 
n3=n2+1;      
c1=cn[n2]+(n1-n2)*(cn[n3]-cn[n2])+cm[m];     
return c1;    
}
 
}
 