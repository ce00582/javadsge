
package graph;


public class simple {
 
double[] cn=new double[101];
double[] ln=new double[101];
double[] cm=new double[101];
double[] lm=new double[101];
double[] pm=new double[101];
double[] pn=new double[101];


double[] chcn=new double[101];
double[] chln=new double[101];
double[] chcm=new double[101];
double[] chlm=new double[101];



double[] k=new double[101];
double[] data=new double[101];
double[] th=new double[101];

double a,beta,ep;
 
    double ks,h,ls;
    int n,mode,time,m;
 
  
void makedata(){
 
for(m=1;m<101;m++){
lm[m]=0;
cm[m]=0;
}

ls=(1-a)/(2-a);
ks=ls*Math.pow((1 / beta - 1) / a , 1 / (a - 1)); 
h=2*ks/100; 
 
m=50;
for (n=1;n<101;n++){ 
k[n]=n*h; 
ln[n]=ls;
cn[n]=th[m]*f(k[n],ln[n]); 
} 
 

int card;
card=0; 

while(card<100){


capital();

techno();

check();

if(ep<0.001)card=1000;
card=card+1;

}


}

void techno(){

    mode=0;
 
while(mode<100){
 
sec();
  
if(ep<0.0001)mode=1000;
 
mode=mode+1;
  

}
    
    
}
void capital(){
int mode;
    
mode=0;
 
while(mode<100){
 
simple();
  
if(ep<0.0001)mode=1000;
 
mode=mode+1;
  

}
}
void check(){


ep=0; 
for (n=10;n<91;n++){ 
ep=ep+Math.pow(cn[n]-chcn[n],2)+Math.pow(ln[n]-chln[n],2); 
} 
 
for (m=1;m<101;m++){ 
ep=ep+Math.pow(cm[m]-chcm[m],2)+Math.pow(lm[m]-chlm[m],2); 
} 
 
for (m=1;m<101;m++){ 
chcm[m]=cm[m]; 
chlm[m]=lm[m];
}  
 


for (n=10;n<91;n++){ 
chcn[n]=cn[n]; 
chln[n]=ln[n];
}  









}

double price(int m,double nx){
double c1;
int n1,n2;
n1=(int)nx;
n2=n1+1;
c1=pn[n1]+(nx-n1)*(pn[n2]-pn[n1])+pm[m];
return c1;
}


void simple(){ 
 
double k1,l1,n1,c1,r1,uc,w1; 
int mx; 


double cns[]=new double[101]; 
double lns[]=new double[101]; 

m=50; 

for (n=10;n<91;n++){ 

k1=k[n]+th[m]*f(k[n],lab(m,n))-con(m,n); 
n1=(double)k1/h; 

uc=0;
for (mx=1;mx<101;mx++){ 
c1=con(mx,n1); 
l1=lab(mx,n1);
r1=a*th[mx]*Math.pow(k1,a-1)*Math.pow(l1,1-a); 
uc=uc+(beta*(1+r1))/c1;  
}
uc=0.01*uc;
cns[n]=1/uc-cm[m];
w1=th[m]*(1-a)*Math.pow(k[n],a)*Math.pow(lab(m,n),-a); 


lns[n]=1-con(m,n)/w1-lm[m];
} 
 
ep=0; 
for (n=10;n<91;n++){ 
ep=ep+Math.pow(cn[n]-cns[n],2)+Math.pow(ln[n]-lns[n],2); 
} 
 
for (n=10;n<91;n++){ 
cn[n]=cns[n]; 
ln[n]=lns[n];
}  
 
 
} 

void sec(){ 
 
double k1,l1,n1,c1,r1,uc,w1; 
int mx; 


double cms[]=new double[101]; 
double lms[]=new double[101]; 
n=50; 


for (m=1;m<101;m++){ 
k1=k[n]+th[m]*f(k[n],lab(m,n))-con(m,n); 
n1=(double)k1/h; 
uc=0;
for (mx=1;mx<101;mx++){ 
c1=con(mx,n1); 
l1=lab(mx,n1);
r1=a*th[mx]*Math.pow(k1,a-1)*Math.pow(l1,1-a); 
uc=uc+(beta*(1+r1))/c1;  
}
uc=0.01*uc;
cms[m]=1/uc-cn[n];
w1=th[m]*(1-a)*Math.pow(k[n],a)*Math.pow(lab(m,n),-a); 
lms[m]=1-con(m,n)/w1-ln[n];
} 
 
ep=0; 
for (m=1;m<101;m++){ 
ep=ep+Math.pow(cm[m]-cms[m],2)+Math.pow(lm[m]-lms[m],2); 
} 
 
for (m=1;m<101;m++){ 
cm[m]=cms[m]; 
lm[m]=lms[m];
}  
 
 
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
 