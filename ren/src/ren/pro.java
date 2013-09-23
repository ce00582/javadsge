
package ren;
 
import java.io.*;
 
public class pro {
 
    String str;
    String[] data=new String[500];
    double[] point=new double[101];
    double[] p=new double[101];
    int[] px=new int[101];
    int s,datanumber;
 
    public static void main(String[] args) {
       pro test=new pro();
    }
pro(){
 
 
    dsge sub2=new dsge();
    point=sub2.point;
 
    double maxp,minp,avgp;
 double p1;
   
    
    
    p1=0;
    for(s=1;s<101;s++){
    p1=p1+point[s];
    }
 
    avgp=p1/100;
   
    double p2;
    int p3;
    
    for(s=1;s<101;s++){
    p2=100*point[s]/avgp-100;
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
    
    double n1,n2;
    
    n1=(int)(1000*maxp);
     n2=(int)(1000*minp);
    
     n1=n1/10;
     n2=n2/10;
     
   System.out.println(n1);
    System.out.println(n2);
    
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
      
      data[104]=sub.text(70,300,"消費","BLUE");
      data[105]=sub.text(300,600,"期間","BLUE");
      
      writefile("dsge8.svg");
 
 
}
 
void writefile(String file){ 
 
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
 
 
 
 

 