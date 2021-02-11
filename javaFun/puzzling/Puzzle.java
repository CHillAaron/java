import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.lang.StringBuilder;

public class Puzzle {
    public void sumAndAboveTen(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(7);
        arr.add(9);
        arr.add(8);
        arr.add(13);
        arr.add(25);
        arr.add(32);
        int sum  = 0;
        for( int i =0; i<arr.size(); i++){
            if(arr.get(i) > 10){
                newarr.add(i);
            }
            sum = sum + arr.get(i);
        }
        System.out.println("this is the sum: "+sum + " This is all the numbers above 10" + newarr);
    }
    public void names(){
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> newarr = new ArrayList<String>();
        arr.add("Nancy");
        arr.add("Jinichi");
        arr.add("Fujibayashi");
        arr.add("Momochi");
        arr.add("Ishikawa");
        for (int i=0; i<arr.size(); i++){
            // System.out.println(arr.get(i));
            if(arr.get(i).length() > 5){
                newarr.add(arr.get(i));
                // System.out.println(i);
            }
        }
        System.out.println(newarr);
    }
    public void alphabet(){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("f");
        arr.add("g");
        arr.add("h");
        arr.add("i");
        arr.add("j");
        arr.add("k");
        arr.add("l");
        arr.add("m");
        arr.add("n");
        arr.add("o");
        arr.add("p");
        arr.add("q");
        arr.add("r");
        arr.add("s");
        arr.add("t");
        arr.add("u");
        arr.add("v");
        arr.add("w");
        arr.add("x");
        arr.add("y");
        arr.add("z");
        Collections.shuffle(arr);
        if(arr.get(0) == "a" || arr.get(0) == "e" || arr.get(0) == "i" || arr.get(0) =="o" || arr.get(0) == "u"){
            System.out.print("This is the last letter: "+arr.get(25)+ " The first letter of the array was a vowel: "+arr.get(0) +"  Congrats You have gotten the first letter as a vowel");
        }else {
            System.out.println("this is the last letter "+arr.get(25) + " This is the first letter: "+arr.get(0));
        }
        
    }
    public void randomnTen(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random random=new Random();
        for(int i=0; i <10; i++){
            int rando = random.nextInt(45) + 55;
            arr.add(rando);
        }

        int min = arr.get(0);
        int max = arr.get(0);
        for(int i=0;i<arr.size();i++){
            if(min > arr.get(i)){
                min = arr.get(i);
            }
            if(max < arr.get(i)){
                max = arr.get(i);
            }
        }
        Collections.sort(arr);

        System.out.println("This is the array: "+arr+" This is the min: "+min+" This is the max: "+max);

    }
    public void stringFive(){
        Random random=new Random();
        StringBuilder word = new StringBuilder("");
        for(int i=0; i < 5; i++){
            word.append((char) ('a' + random.nextInt(26)));
        }
        System.out.println(word);
    }
    public void stringFiveArray(){
        ArrayList<Object> arr = new ArrayList<Object>();
        Random random=new Random();
        for(int i=0; i < 10; i++){
            StringBuilder word = new StringBuilder("");
            for(int j=0; j < 5; j++){
                word.append((char) ('a' + random.nextInt(26)));
            }
        arr.add(word);
    }
    System.out.println(arr);
    }
}