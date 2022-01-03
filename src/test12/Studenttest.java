package test12;

import java.util.*;
import java.io.*;
public class Studenttest {
	    public static void main(String[] args) throws IOException {
	        Set<Student> students = new HashSet<Student>();
	        Scanner input = new Scanner(System.in);
	        System.out.println("输入学生 学号 姓名 年龄:");
	        String id=input.next();
	        while(!id.equals("-1")){
	            String name;
	            int year;
	            name = input.next();
	            year = input.nextInt();
	            Student stu = new Student(id,name,year);
	            students.add(stu);
	            id=input.next();
	        }
	        BufferedWriter out = new BufferedWriter(new FileWriter("students.txt"));
	        for (Student student : students) {
	            String info="id: "+student.getId()+" name: " + student.getName()+" year: "+student.getYear();
	            System.out.println(info);
	            out.write(info);
	            out.write("\n");
	        }
	        out.close();
	    }
}

