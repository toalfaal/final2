package Extras;

import java.util.Random;

public class CodeGenerator {
    private int digitNumber;

    public CodeGenerator(int digitNumber) {
        this.digitNumber = digitNumber;
    }

    public int getDigitNumber() {
        return digitNumber;
    }

    public CodeGenerator setDigitNumber(int digitNumber) {
        this.digitNumber = digitNumber;
        return this;
    }

    public String getCode() {
        return generate();
    }

    private String generate() {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        int digitNumber = getDigitNumber();
        int digit ;
        while (true){
            if (result.length()==digitNumber)
                return result.toString();

            digit = random.nextInt(10);
            if (digit>0)
                result.append(digit);
        }
    }
}
