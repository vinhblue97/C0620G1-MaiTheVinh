package dsa_stack_queue.exercise.convert_decimal_to_binary;

class Main {
    public static void main(String[] args){
        ConvertToBinary convert = new ConvertToBinary();
        convert.convertBinary(8);
        convert.printStack();
        convert.convertBinary(10);
        convert.printStack();
        convert.convertBinary(20);
        convert.printStack();
        convert.convertBinary(157);
        convert.printStack();

    }
}
