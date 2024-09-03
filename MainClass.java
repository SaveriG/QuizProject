package com.QuizPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Quize Q=new Quize();
		Q.logic();
	}
}
class Quize{
	public void logic(){
		Scanner sc=new Scanner(System.in);
    int correctAnswer=0;
    int wrongAnswer=0;
		QuestionAndAnswer q1=new QuestionAndAnswer(" Which of the following is not a Java features",
				"A.Dynamic"
				,"B.Architecture Neutral" ,
				"C.Use of pointers" ,
				"D. Object Oriented");
		QuestionAndAnswer q2=new QuestionAndAnswer(" What is the return type of the hashCode() method in the Object class? ",
				"A.Obect",
				"B.int",
				"C.Long",
				"D.void");
		QuestionAndAnswer q3=new QuestionAndAnswer(" What does the expression float a = 35 / 0 return?",
				"A.0","B.not A number","C.Infinity","D.Run time error");
		QuestionAndAnswer q4=new QuestionAndAnswer("______is used to find and fix bugs in the Java programs",
				"A.JVM","B.JRE","C.JDK","D.JDB"); 
				
		QuestionAndAnswer q5=new QuestionAndAnswer("In which memory a String is stored, when we create a string using new operator",
				"A.Stack","B.String memory","C.Heap","D.Random Storage Space"); 

		QuestionAndAnswer q6=new QuestionAndAnswer(" Evaluate the following Java expression, if x=3, y=5, and z=10: ++z + y - y + z + x++",
				"A.24","B.23","C.21","D. 25 "); 
	 
		Map<QuestionAndAnswer,Character> hash=new HashMap<>();
		hash.put(q1,'C');
		hash.put(q2,'B');
		hash.put(q3,'C');
		hash.put(q4,'D');
		hash.put(q5,'C');
		hash.put(q6,'D');
		for(Map.Entry<QuestionAndAnswer, Character> map:hash.entrySet())
		{
			System.out.println(map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			System.out.println("Enter your Answer");
			Character ans=sc.next().charAt(0);
			int corrAns=Character.compare(ans, map.getValue());
			if(corrAns==0)
			{
				System.out.println("Correct Answer");
				correctAnswer++;
			}
			else
			{
				System.out.println("WronAnswer");
				wrongAnswer++;
			}

		}
		System.out.println();
		System.out.println("------------Result-----------");
		System.out.println("Total Questions::"+hash.size());
		System.out.println("Corrected Answer "+correctAnswer);
		System.out.println("Wrong Answer "+wrongAnswer);
		int per=(100*correctAnswer)/hash.size();
		System.out.println("Total Percentage  : "+per+"%");

		if(per>=60)
		{
			System.err.println("*******Qualified for Next Round*********");
		}
		else
		{
			System.err.println("--------DisQualified------");
		}
		
	}



			
		}





		

	
	


