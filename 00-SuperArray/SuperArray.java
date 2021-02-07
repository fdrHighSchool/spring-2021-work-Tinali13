import java.util.Scanner;
import java.util.Arrays;

public class SuperArray{// CONSTRUCTORS
  private int[] array;
  public SuperArray(){
    this.array = new int[10];
  }
  public SuperArray(int s){ // SETTERS
    this.array = new int[s];
  }
  public void add(int v){// increase the size by 1 and adds a num to the end of the array
    grow(1);
    this.array[array.length-1] = v;
  }
  public void add(int v,int index){// increase size by 1 and add a specific number to a specific index
    grow(1);
    this.array[index-1] = v;
  }

  public void grow(int num){// uses the inputted num to increase the size of an array based on the num
    int[] tarray = new int[array.length+num];
    for (int i =0; i < array.length;i++){
      tarray[i] = array[i];
    }
    this.array = tarray;
  }
    public void set(int val, int i){ // sets a value at a specific index
    this.array[i-1] = val;
  }
    public boolean isEmpty(){// checks if its empty
    for (int i = 0; i < this.array.length; i++){
      if (array[i] != 0){
        return false;
      }
    }
    return true;
  }
  public void remove (int index){ // remove the numbers to a certain index
    int[] tarray = new int[array.length-1];
    for (int i = 0; i < tarray.length; i++){
      tarray[i] = array[i];
    }
    this.array=tarray;
  }

    public String toString(){// strings the array
    System.out.println(Arrays.toString(this.array));
    return Arrays.toString(this.array);
  }
}
