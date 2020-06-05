public class MyStrArray {
    private String[] inputArray = new String[50];
    private String numberInputMemory;
    private int arrayLocation = 0;
    private String inputDisplayStr = "";

    public MyStrArray() {}

    public void PrintArray() {
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

    public void SendNumMemory () {
        if (numberInputMemory != null) {
            inputArray[arrayLocation] = numberInputMemory;
            arrayLocation++;
        }
    }

    public void SendOther (String input) {
        inputArray[arrayLocation] = input;
        arrayLocation++;
    }

    public void ClearArray () {
        for (int x = 0; x <= inputArray.length; x++) {
            inputArray[x] = null;
        }
        arrayLocation = 0;
    }
}
