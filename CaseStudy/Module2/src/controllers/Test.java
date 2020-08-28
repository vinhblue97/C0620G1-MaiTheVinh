package controllers;

import models.Villa;

import java.util.List;
import java.util.TreeSet;

public class Test {
    TreeSet<Villa> villaTreeSet;
    List<Villa> villaList;

    public Test(List<Villa> villaList){
        this.villaList = villaList;
    }

    public void setTreeSet(){
        for(Villa vila:villaList){
            villaTreeSet.add(vila);
        }
    }

    public void printTreeSet(){
        for(Villa vila:villaTreeSet){
            System.out.println(vila.showInfor());
        }
    }

}
