/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.exercises;

class Bicycle {
    //Data Member
    private String ownerName;
    private String tagNo;
    
    //Constructor: Initializes the data Member 
    public Bicycle(){
        ownerName = "Unknown";
        tagNo = "unknown";
    }
    public Bicycle( String ownerName, String tagNo){
        this.ownerName = ownerName;
        this.tagNo = tagNo;
    }
    //Returns the name of this bicycle's owner
    public String getOwnerName(){
        return ownerName;
    }
    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name){
        ownerName = name;
    }
    public String getTagNo(){
        return tagNo;
    }
    public void setTagNo(String num){
        tagNo = num;
    }
}
