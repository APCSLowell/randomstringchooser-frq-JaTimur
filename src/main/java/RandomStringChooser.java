import java.util.*;
public class RandomStringChooser{
  private ArrayList<String> list;
  public RandomStringChooser(String[] array){
    list=new ArrayList<String>();
    for(int n=0;n<array.length;n++){
      list.add(array[n]);
    }
  }
  public String getNext(){
    if(list.size()<1) return "NONE";
    else{
      int n=(int)(Math.random()*list.size());
      return list.remove(n);
    }
  }
}
