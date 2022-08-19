package za.co.xgileit;

import za.co.xgileit.conditionals.Conditionals;
import za.co.xgileit.operators.ArithmeticOperators;
import za.co.xgileit.operators.AssignmentOperators;
import za.co.xgileit.operators.ComparisonOperators;
import za.co.xgileit.operators.LogicalOperators;

public class Solution {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        Conditionals conditionals = new Conditionals();
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        AssignmentOperators assignmentOperators = new AssignmentOperators();
        ComparisonOperators comparisonOperators = new ComparisonOperators();
        LogicalOperators logicalOperators = new LogicalOperators();

        arithmeticOperators.addition(a,b);
        arithmeticOperators.subtraction(a,b);
        arithmeticOperators.multiplication(a,b);
        arithmeticOperators.division(a,b);
        arithmeticOperators.modulus(a,b);
        arithmeticOperators.increment(a);
        arithmeticOperators.decrement(a);

        assignmentOperators.assignment(a);
        assignmentOperators.additionAssignment(a);
        assignmentOperators.subtractionAssignment(a);
        assignmentOperators.multiplicationAssignment(a);
        assignmentOperators.divisionAssignment(a);
        assignmentOperators.modulusAssignment(a);

        logicalOperators.logicalAnd();
        logicalOperators.logicalOr();
        logicalOperators.logicalNot();

        comparisonOperators.equalTo(a,b);
        comparisonOperators.notEqualTo(a,b);
        comparisonOperators.greaterThan(a,b);
        comparisonOperators.lessThan(a,b);
        comparisonOperators.greater0rEqualTo(a,b);

        conditionals.ifStatement();
        conditionals.elseStatement();
        conditionals.elseIfStatement();
        conditionals.switchStatement();
        conditionals.switchDefault();
    }
}
