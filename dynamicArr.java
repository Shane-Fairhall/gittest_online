
/**
 * Write a description of class dynamicArr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dynamicArr
{
   public static void main(String[] args){
       /*declare the array*/
       int[] myArr = {2,3,7};
       
       /*print the array*/
       for(int item : myArr){
           System.out.println(item);
        }
       System.out.println();
       
       /*declare a new array of an increased size, add original elements and a new element*/
       int[] tempArr = new int[myArr.length + 1];
       for(int i = 0; i<myArr.length; i++){
        tempArr[i] = myArr[i];
        }
       tempArr[myArr.length] = 5;
       
       /*set the old array to the value of the new array*/
       myArr = tempArr;
       
       /*print the array again*/
       for(int item : myArr){
           System.out.println(item);
        }
       
       
       
       
       
    }
}
