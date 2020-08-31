public class MyStrArray {
    private String[] inputArray = new String[50];
    public String numberInputMemory = "";
    private int arrayLocation = 0;
    private String inputDisplayStr = "";
    private String inputArrayToStr = "";
    private int lParPos = -1;
    private int rParPos = -1;

    public boolean calculateFinished = false;
    public boolean stopCalculation = true;

    String[] inputArrayCopy = new String[50];

    public MyStrArray() {}

    public void PrintArray() {
        for(int x = 0; x<inputArray.length && inputArray[x] != null; x++) {
            System.out.println(inputArray[x]);
        }
    }

    public void printMemory() { System.out.println(numberInputMemory); }

    public void addNumberToMemory (String input) {
        if (numberInputMemory != null) {
            numberInputMemory = numberInputMemory + input;
        } else if (input != "0" && input != ".") {
            numberInputMemory = input;
        }
    }

    public void sendNumMemory() {
        if (numberInputMemory != null) {
            inputArray[arrayLocation] = numberInputMemory;
            numberInputMemory = "";
            arrayLocation++;
        }
    }

    public void sendOther(String input) {
        inputArray[arrayLocation] = input;
        arrayLocation++;
    }

    public void backspace() {
        try {
            if (numberInputMemory == null) {
                arrayLocation--;
                inputArray[arrayLocation] = null;
            } else if ( numberInputMemory.length() > 1 ) {
                char[] temp = numberInputMemory.toCharArray();

                numberInputMemory = "";
                for (int x = 0;  x <= temp.length - 2; x++) {
                    numberInputMemory = numberInputMemory + temp[x];
                }
            } else {
                numberInputMemory = null;
            }
        } catch (Exception e) {}
    }

    public void clearArray() {
        for (int x = 0; x <= inputArray.length && inputArray[x] != null; x++) {
            inputArray[x] = null;
        }
        arrayLocation = 0;
    }

    public String getInputDisplayStr() {
        for (int x = 0; x <= inputArray.length && inputArray[x] != null; x++) {
            inputArrayToStr = inputArrayToStr + " " + inputArray[x];
        }

        if (numberInputMemory != null) {
            inputDisplayStr = inputArrayToStr + numberInputMemory;
        } else {
            inputDisplayStr = inputArrayToStr;
        }

        inputArrayToStr = "";
        return inputDisplayStr;
    }

    public void caluclate() {

    }

    public void readForPar() {
        boolean parFound = false;

        for (int x = 0; x <= inputArray.length && inputArray[x] != null && !parFound; x++) {
            if (inputArray[x] == "(") {
                lParPos = x;
            }

            if (inputArray[x] == ")") {
                rParPos = x;
                parFound = true;
            }
        }
    }

    public void findAndUseOperands() {
        boolean opFound = false;
        int priorityLvl = 0;

        String operandTarget1 = null;
        String operandTarget2 = null;

        String operand = null;
        int operandPos = 0;

        double leftNumber = 0;
        double rightNumber = 0;

        boolean foundLeftVal = false;
        boolean foundRightVal = false;

        int individualAnswer = 0;

        if (!stopCalculation) {

        if (priorityLvl == 0) {
            operandTarget1 = "^";
            operandTarget2 = null;
        }

        if (priorityLvl == 1) {
            operandTarget1 = "X";
            operandTarget2 = "/";
        }

        if (priorityLvl == 2) {
            operandTarget1 = "-";
            operandTarget2 = "+";
        }

        if (lParPos > 0) {
            for (int x = lParPos; !opFound && x < rParPos; x++) {
                if (operandTarget1 == inputArray[x] || operandTarget2 == inputArray[x]) {
                    operand = inputArray[x];
                    operandPos = x;
                }
            }

            for (int x = 0; !foundLeftVal && x > 0; x--) {
                if (inputArray[x] != null) {
                    try {
                        String parseToInt = null;
                        parseToInt = inputArray[x];
                        leftNumber = Integer.parseInt(parseToInt);
                        foundLeftVal = true;
                    } catch (Exception e) {
                        System.out.println("Syntax Error");
                        stopCalculation = true;
                    }
                }
            }

            for (int x = 0; !foundRightVal && x < inputArray.length; x++) {
                if (inputArray[x] != null) {
                    try {
                        String parseToInt = null;
                        parseToInt = inputArray[x];
                        rightNumber = Integer.parseInt(parseToInt);
                        foundRightVal = true;
                    } catch (Exception e) {
                        System.out.println("Syntax Error");
                        stopCalculation = true;
                    }
                }
            }

            if (operand == "^") {

            }

            if (operand == "X") {
            //    leftNumber * rightNumber = individualAnswer;

            }

            if (operand == "/") {

            }

            if (operand == "-") {

            }

            if (operand == "+") {

            }
        }
        }
    }
}