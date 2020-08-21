package exception_debug.practice.array_index_out_of_bounds;

class ArrayExample {
    private int[] arr;
    public ArrayExample(){
        arr = new int[20];
        for (int index = 0; index < 20; index++){
            arr[index] = (int) Math.round(Math.random()*100);
        }
    }

    public int[] getArray(){
        for (int element:arr){
            System.out.print(element+" ");
        }
        return arr;
    }
}
