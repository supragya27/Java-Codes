//task is to find the area of the largest square that can be formed using these sticks and the count of such squares. Note that a single side of the square can only use a single stick.

static void findMaxSquare(int arr[], int n){
  int ls=arr[0],sm=arr[0],a,b,c,ct=0,als,efl=0;
  float ar=0;
  for(a=1;a<n;a++)
  {
    if(sm>arr[a])
      sm=arr[a];
  }
  for(a=1;a<n;a++)
  {
    if(ls<(arr[a]))
      ls=arr[a];
  }
  for(b=0;b<n;b++){
    if(arr[b]==ls)
      ct++;
  }
  while((ct/4)==0)
  {ct=0;efl++;
    als=sm;
    for(a=0;a<n;a++)
    {
      if(arr[a]>als&&arr[a]<ls)
        als=arr[a];
    }
    for(b=0;b<n;b++){
    if(arr[b]==als)
      ct++;
  }
   ls=als;
   if(efl==n+1)
     break;
  }
  ar=(float)ls*ls;
  if(ct/4==0){ar=(float)0;
    System.out.println(ar);}
  else
  System.out.println(ar);
  System.out.println(ct/4);
}