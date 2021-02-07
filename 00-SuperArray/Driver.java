public class Driver{
  public static void main(String[] args){
    SuperArray array = new SuperArray(9);
    array.toString();
    array.add(20);
    array.add(21,1);
    array.add(22,2);
    array.add(25,3);
    array.add(17,4);
    array.add(10,5);
    array.set(75,6);
    array.toString();
    array.remove(1);
    array.toString();
  }

}
