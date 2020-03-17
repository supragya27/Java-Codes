// eg Run Length Encoded string of “AaBBBBAAbD" is  “A1a1B4A2b1D1”

String RunLengthEncoding(String str){
  str=str.trim();
  int c=1,a,b;String res="";
  
  for(a=0;a<str.length();a++){c=1;
    for(b=a+1;b<str.length();b++){
      if(str.charAt(a)==str.charAt(b)){
        c++;a=b;
      }
      else{
        a=b-1;break;
      }
    }
       res+=str.charAt(a);res+=c;
  }
  
  
  
  return res;
}