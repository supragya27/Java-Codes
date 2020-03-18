public <Integer>ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
{
  for(int i=0;i<list.size()-1;i++){
    for(int j=i+1;j<list.size();j++){
      if(list.get(i)==list.get(j))
        {list.remove(j);j--;}
    }
  }
  return list;
}