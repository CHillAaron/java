import java.util.ArrayList;
import java.util.Arrays;


public class Basics {
    public void problem1() {
        for(int i = 0; i <= 255; i++){
            System.out.println(i);
        }
    }
    public void problem2(){
        for(int i=1; i<=255; i= i+2){
            System.out.println(i);
        }
    }
    public void problem3(){
        int num = 0;
        for(int i=0; i<=255; i++){
            num = num + i;
        }
        System.out.println(num);
    }
    public void problem4(){
        int arr[] = {1,3,5,7,9,13};
        for (int i =0; i< arr.length; i++){
            int j = arr[i];
            System.out.println(j);
        }
    }
    public void problem5(){
        int arr[] = {-3, -5, -7};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public void problem6(){
        int arr[] = {2, 16, 3};
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum= sum+arr[i];
        }
        int avg = sum/arr.length;
        System.out.println(avg);
    }
    public void problem7(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=1; i<=255; i= i+2){
            arr.add(i);
        }
        System.out.println(arr);
    }
    public void problem8(){
        int arr[] = {1, 3, 5, 7};
        int y = 3;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > y){
                count++;
            }
        }
        System.out.println(count);
    }
    public void problem9(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(5);
        arr.add(10);
        arr.add(-2);
        for (int i =0; i<arr.size(); i++){
            newarr.add(arr.get(i)*arr.get(i));
        }
        System.out.println(newarr);
    }
    public void problem10(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(-5);
        arr.add(10);
        arr.add(-2);
        for (int i =0; i<arr.size(); i++){
            if (arr.get(i) < 0){
                newarr.add(arr.get(i)*-1);
            }else{
                newarr.add(arr.get(i));
            }
        }
        System.out.println(newarr);
    }
    public void problem11(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(5);
        arr.add(10);
        arr.add(-2);
        int max = arr.get(0);
        int min = arr.get(0);
        int sum = 0;
        int avg = 0;
        for (int i =0; i<arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
            if(arr.get(i) < min){
                min = arr.get(i);
            }
            sum = sum+arr.get(i);
            avg = sum/arr.size();
        }
        System.out.println("max: "+max+" "+"min: "+ +min+ " "+"avg: "+ avg);
    }
}