import java.util.ArrayList;

public class Array {
    private int[] items;
    private int size;
    public Array(int length){
        items = new int[length];
    }

    public void print(){
        for (int i = 0; i < size; i ++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        if (size == items.length){
            //create
            int[] newItems = new int[size*2];
            for(int i =0; i < size; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        else{
            items[size] = item;
            size++;
        }

    }

}
