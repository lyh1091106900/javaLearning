package com.company;
import  com.company.FixedCapacityStack;
import  edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StdOut.print("helloworld");
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<String>(100);
        String content = FsUtil.readFileCotent("./tobe.txt");
        StdOut.print(content);
//        for(contentItem:content)
//        {
//            String item  =contentItem;
//            if(!item.equals("-"))
//                s.push(item);
//            else if(!s.isEmpty()){
//                StdOut.print(s.pop()+"");
//            }
//            StdOut.print("("+s.size()+"left on stack");
//        }
    }
}




