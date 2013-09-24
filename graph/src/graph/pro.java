
package graph;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class pro {

double maxp,minp;
int supp,infp;
int number;
int[] sline=new int[100];
int[] pline=new int[100];
int s;
String[] data=new String[500];
int datanumber;
double[] point=new double[101];


double[] cn=new double[101];
double[] ln=new double[101];
double[] cm=new double[101];
double[] lm=new double[101];
double[] pm=new double[101];
double[] pn=new double[101];

double[] k=new double[101];
double[] pc=new double[101];
double[] th=new double[101];


double a,beta,ms;
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


double k1,l1,n1;
int t;


k1=k[50];
for(t=1;t<101;t++){
n1=k1/h;
m=(int)(100*Math.random())+1;
k1=k1+th[m]*f(k1,lab(m,n1))-con(m,n1);
point[t]=con(m,n1);
}
    
graph sub=new graph();
sub.point=point;
sub.makedata();



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
