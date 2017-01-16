package admin;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anoop
 */
public class User {
     private final String name;
     private final String father;
     private final String cgpa;
     private final String branch;
     private final String contect;

    /**
     *
     * @param string
     * @param Name
     * @param Fname
     * @param string2
     */
    public User(String name,String father,String cgpa,String branch,String contect)
    {
        this.name=name;
        this.father=father;
        this.cgpa=cgpa;
        this.branch=branch;
        this.contect=contect;
    }
    public String getName()
    {
        return name;
    }
    public String getFather()
    {
        return father;
    }
    public String getCgpa()
    {
        return cgpa;
    }
    public String getBranch()
    {
        return branch;
    }
    public String getContect()
    {
        return contect;
    }
}
