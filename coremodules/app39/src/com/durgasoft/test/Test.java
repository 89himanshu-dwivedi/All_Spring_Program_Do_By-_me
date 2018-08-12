package com.durgasoft.test;

import java.beans.Expression;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.durgasoft.beans.CalBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

CalBean cal=new CalBean();
StandardEvaluationContext context = new StandardEvaluationContext(cal);
context.setVariable("number1", 10);
context.setVariable("number2", 5);
ExpressionParser parse=new SpelExpressionParser();
Expression expr1=(Expression) parse.parseExpression("num1 = #number1");
Expression expr2=(Expression) parse.parseExpression("num2 = #number2");

expr1.getValue(context);
expr2.getValue(context);

System.out.println(" ADD :"+cal.add());
System.out.println(" SUB :"+cal.sub());
System.out.println(" MUL :"+cal.mul());

}

}
