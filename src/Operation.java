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
        //
        operand1 = input.charAt(0)-48;
        operand2 = input.charAt(2)-48;
        operator = input.charAt(1);
    }

    public static AbstractOperation getChainOfOperation() {
        AbstractOperation mul = new opsMultiplication();
        AbstractOperation add = new opsAddition();
        AbstractOperation sub = new opsSubtraction();
        AbstractOperation res = new opsResult();
        mul.setNextOperation(add);
        add.setNextOperation(sub);
        sub.setNextOperation(res);
        return mul;
    }

    public static void main(String[] args) {

        AbstractOperation chainOfOperations = getChainOfOperation();
        Operation op1 = new Operation();
        //String input = System.console().readLine();
        op1.input = "4*6";
        op1.parse();
        System.out.println(op1.operand1);
        System.out.println(op1.operator);
        System.out.println(op1.operand2);
        System.out.println("========");
        chainOfOperations.makeOperation(op1);
        System.out.println(op1.result);
    }

}
