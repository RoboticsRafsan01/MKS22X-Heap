public class MyHeap{

  private static void pushDown(int[]data,int size,int index){
    int pos = index;
    index = 2*index + 1;
    while(index < size){
      int num1 = data[index];
      if(data[pos] < num1){
        if(index+1 < size){
          int num2 = data[index+1];
          if(num1 < num2){
            exchange(pos,index+1,data);
            pos = index+1;
          }
          else{
            exchange(pos,index,data);
            pos = index;
          }
        }
      }
      System.out.println(toString(data));
      index = 2*pos + 1;
    }
  }

  private static void pushUp(int[]data,int index){


  }

  public static void heapify(int[]data){


  }


  public static void heapsort(int[]data){


  }

  private static boolean inBounds(int index, int[] data){
    return index < data.length;
  }

  private static void exchange(int num1, int num2, int[] data){
    int temp = data[num1];
    data[num1] = data[num2];
    data[num2] = temp;
  }

  public static String toString(int[] ary) {
    String result = "[";
    for (int i = 0; i < ary.length ; i++) {
      result += " " + ary[i];
      if (i != ary.length - 1) {
        result += ",";
      }
    }
    return result + "]";
  }

  public static void main(String[] args){
    int[] test = new int[]{2,3,18,9,5,4,20,6,1};
    System.out.println(toString(test));
    pushDown(test,test.length,2);
    System.out.println(toString(test));
  }

}
