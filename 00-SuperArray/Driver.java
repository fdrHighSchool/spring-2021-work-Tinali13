public class Driver{
  public static void main(String[] args){
    SuperArray array = new SuperArray(9);
    array.add(20);
    array.add(21,1);
    array.add(22,2);
    array.add(25,3);
    array.add(17,4);
    array.add(10,5);
    array.set(75,6);
    array.remove(1);
    array.toString();
    Grades hw = new Grades(5);
    int total =0;
    hw.gadd(87);
    hw.gadd(76,3);
    hw.gadd(89);
    hw.gadd(87);
    Grades Tests = new Grades(3);
    Tests.gadd(65);
    Tests.gadd(87);
    Tests.gadd(99);
    total += (hw.average()+Tests.average())/2;
    System.out.println(total);
  }

}
