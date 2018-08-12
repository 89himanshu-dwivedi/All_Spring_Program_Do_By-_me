package com.durgasoft.test;

import org.springframework.expression.Expression;

//import java.beans.Expression;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.durgasoft.beans.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExpressionParser parser=new SpelExpressionParser();
	Expression exp1= (Expression) parser.parseExpression("10+10");
	System.out.println(exp1.getValue());
	Expression exp2= (Expression) parser.parseExpression("10 eq 10");
	System.out.println(exp2.getValue());
	Expression exp3= (Expression) parser.parseExpression("10 le 10");
	System.out.println(exp3.getValue());
	Expression exp4= (Expression) parser.parseExpression("true and true");
	System.out.println(exp4.getValue());
	Expression exp5= (Expression) parser.parseExpression("T(Thread).MIN_PRIORITY + T(Thread).NORM_PRIORITY");
	System.out.println(exp5.getValue());
	
	User user=new User();
	user.setUname(null);
	StandardEvaluationContext context=new  StandardEvaluationContext(user);
	
	Expression exp6= parser.parseExpression("uname?.toUpperCase()");
	System.out.println(exp6.getValue(context));
	
	
	
	}

}
