/**
 * Created by inf112225 on 05.05.2017.
 */
public class Operation {
    String input;
    float operand1;
    float operand2;
    char operator;
    float result;

    public Operation() {}

    public void parse() {
        String [] temp = input.split("[^0-9|.]");
        if(input.charAt(0)=='-') {
            operand1 = -Float.parseFloat(temp[1]);
            operator = input.charAt(temp[1].length()+1);
        }
        else {
            operand1 = Float.parseFloat(temp[0]);
            operator = input.charAt(temp[0].length());
        }
        operand2 = Float.parseFloat(temp[temp.length-1]);
    }

    public static AbstractOperation getChainOfOperations() {
        AbstractOperation zzz = new opsCustomZ();
        AbstractOperation mul = new opsMultiplication();
        AbstractOperation div = new opsDivision();
        AbstractOperation add = new opsAddition();
        AbstractOperation sub = new opsSubtraction();
        AbstractOperation res = new opsResult();
        zzz.setNextOperation(mul);
        mul.setNextOperation(div);
        div.setNextOperation(add);
        add.setNextOperation(sub);
        sub.setNextOperation(res);
        return zzz;
    }

    public static void main(String[] args) {
        AbstractOperation chainOfOperations = getChainOfOperations();
        Operation op1 = new Operation();

        //input takes float, any single character operator and another float, with no spaces between.
        //implemented operations: [*, /, +, -, z]
        op1.input = "-0.12*9.87";

        op1.parse();
        System.out.println(op1.operand1);
        System.out.println(op1.operator);
        System.out.println(op1.operand2);
        System.out.println("=");

        chainOfOperations.makeOperation(op1);
        System.out.println(op1.result);
    }

}
