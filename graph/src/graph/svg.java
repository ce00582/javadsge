
package graph;


public class svg{
 
String text(int x,int y,String strx,String col){
String str;
str="<text x=\""+x+"\" y=\""+y+"\" fill=\""+col+"\">"+strx+"</text>";
return str;
}
 
String line(int x1,int y1,int x2,int y2,String col,int w){
String str;
str="<line x1=\""+x1+"\" y1=\""+y1+"\" x2=\""+x2+"\" y2=\""+y2+"\" style=\"stroke:"+col+";stroke-width:"+w+"\"/>";
 
return str;
}
 
String circle(int x,int y,int r,String col){
String str;
str="<circle cx=\""+x+"\" cy=\""+y+"\" r=\""+r+"\" fill=\""+col+"\"/>";
 
return str;
}
 
 
 
String rect(int x1,int y1,int w1,int h1,String col){
String str;
str="<rect x=\""+x1+"\" y=\""+y1+"\"width=\""+w1+"\" height=\""+h1+"\" fill=\""+col+"\"/>";
 
return str;
}
 
}
