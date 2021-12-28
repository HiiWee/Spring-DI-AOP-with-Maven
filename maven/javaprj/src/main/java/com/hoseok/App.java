package com.hoseok;

import com.hoseok.examlib.entity.Exam;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Eclipse Maven!" );
        Exam exam = new Exam(10, 20, 30);
        
        System.out.printf("%d", exam.total());
    }
}
