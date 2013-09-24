
package price;


class money{ 
    
double a,beta;    
double th[]=new double[101]; 
double k[]=new double[101]; 
double cn[]=new double[101]; 
double ln[]=new double[101]; 
double pn[]=new double[101]; 
double pm[]=new double[101]; 
double cm[]=new double[101]; 
double lm[]=new double[101];
int m,n;

int mode,card;
double ep;
double ms;
double h;

    
    double[] chpn=new double[101];
    double[] chpm=new double[101];


 
void makedata(){ 
 
   
    
for (n=1;n<101;n++){ 
     chpn[n]=0;   
    }
    
    for (m=1;m<101;m++){ 
chpm[m]=0; 
} 
    
  

for (n=1;n<101;n++){ 
pn[n]=1; 
} 
 
for (m=1;m<101;m++){ 
pm[m]=0; 
} 



card=0;

while(card<100){


capital();

techno();

check();

card=card+1;

if(ep<0.001)card=100;

System.out.println(ep);

}
 



 
 
} 
void check(){

ep=0; 
for (n=10;n<91;n++){ 
ep=ep+Math.pow(pn[n]-chpn[n],2); 
} 

for (n=10;n<91;n++){ 
chpn[n]=pn[n];  
} 


for (m=1;m<101;m++){ 
ep=ep+Math.pow(pm[m]-chpm[m],2); 
} 

for (m=1;m<101;m++){ 
chpm[m]=pm[m];  
} 


}
void capital(){

    int mode;
    
mode=0;
 
while (mode<100){
 
    mfast();
 
if(ep<0.0001)mode=10000;
 
 
    mode=mode+1;

    
}
 
}

void techno(){

    int mode;
    
mode=0;
 
while (mode<100){
 
    msec();
 
if(ep<0.0001)mode=10000;
 
 
    mode=mode+1;

    
}
 
}

double g(double pp,double k1){ 
double dp,l1,r1,c1,pc,pi,i1; 
int mx;
double n1;
dp=0;
n1=k1/h;
for (mx=1;mx<101;mx++){ 
l1=lab(mx,n1); 
r1=th[mx]*a*Math.pow(k1,a-1)*Math.pow(l1,1-a); 
c1=con(mx,n1); 
pc=price(mx,n1); 
pi=pc/pp-1; 
i1=(1+r1)*(1+pi)-1; 
dp=dp+i1*ms*beta/(c1*(1+pi)); 
} 
dp=0.01*dp; 
return dp; 
} 
 
void mfast(){ 
 
int t1,t2,n; 
double p1,p2,p3; 
double dp,k1,n1; 
double z1,z2; 
double pns[]=new double[101];

 m=50;    
 
for (n=10;n<91;n++){ 
p1=1.05*price(m,n); 
p2=0.95*price(m,n); 
k1=k[n]+th[m]*Math.pow(k[n],a)*Math.pow(lab(m,n),1-a)-con(m,n); 
dp=g(p1,k1); 
z1=dp-p1; 
t1=0; 
while (t1<100){ 
dp=g(p2,k1); 
z2=dp-p2; 
p3=p2-z2*(p2-p1)/(z2-z1); 
z1=z2; 
p1=p2; 
p2=p3; 
if (z2*z2<0.001)t1=1000;  
t1=t1+1; 
} 
pns[n]=p2-pm[m]; 
} 
 
 
ep=0; 
for (n=10;n<91;n++){ 
ep=ep+Math.pow(pn[n]-pns[n],2); 
} 
 
for (n=10;n<91;n++){ 
pn[n]=pns[n]; 
} 
 
 
} 
 
void msec(){ 
 
int t1,t2; 
double p1,p2,p3; 
double dp; 
double z1,z2,k1; 
 int n;
 double pms[]=new double[101]; 
 
n=50;    
 
for (m=1;m<101;m++){ 
p1=1.05*price(m,n); 
p2=0.95*price(m,n); 
k1=k[n]+th[m]*Math.pow(k[n],a)*Math.pow(lab(m,n),1-a)-con(m,n); 
dp=g(p1,k1); 
z1=dp-p1; 
t1=0; 
while (t1<100){ 
dp=g(p2,k1); 
z2=dp-p2; 
p3=p2-z2*(p2-p1)/(z2-z1); 
z1=z2; 
p1=p2; 
p2=p3; 
if (z2*z2<0.001)t1=1000;  
t1=t1+1; 
} 
pms[m]=p2-pn[n]; 
} 
 
ep=0; 
for (m=1;m<101;m++){ 
ep=ep+Math.pow(pm[m]-pms[m],2); 
} 
  
for (m=1;m<101;m++){ 
pm[m]=pms[m]; 
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
 
double lab(int m,double nx){
double c1;
int n1,n2;
n1=(int)nx;
n2=n1+1;
c1=ln[n1]+(nx-n1)*(ln[n2]-ln[n1])+lm[m];
return c1;
}
double con(int m,double nx){
double c1;
int n1,n2;
n1=(int)nx;
n2=n1+1;
c1=cn[n1]+(nx-n1)*(cn[n2]-cn[n1])+cm[m];
return c1;
}
 
 
}
 
 

