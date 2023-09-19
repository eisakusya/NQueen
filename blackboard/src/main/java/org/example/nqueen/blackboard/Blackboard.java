package org.example.nqueen.blackboard;

import java.util.ArrayList;

public class Blackboard {
    public int N;
    private ArrayList<int[]> solutions;
    public Blackboard(int n){
        N=n;
        solutions=new ArrayList<>();
    }
    public int[] read(){
        //返回最后一个（当前）解决方案
        return solutions.get(solutions.size()-1);
    }
    public void write(int[] s){
        //写入一个解决方案
        solutions.add(s);
    }
    public int[] pop(){
        return solutions.remove(solutions.size()-1);
    }
}
