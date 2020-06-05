public class MyStrArray {
    private String[] inputArray;
    private String numberInputMemory;
    private int arrayLocation = 0;

    public MyStrArray() {}

    public void printArray(String[] inputArray) {
        for(int x = 0; x<inputArray.length && inputArray[x] != null; x++) {
            System.out.println(inputArray[x]);
        }
    }

    public void printMemory () { System.out.println(numberInputMemory); }

    public void AddNumberToMemory (String input) {
        if (numberInputMemory != null) {
            numberInputMemory = numberInputMemory + input;
        } else if (input != "0" && input != ".") {
            numberInputMemory = input;
        }
    }
}
