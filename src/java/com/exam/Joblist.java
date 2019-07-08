package com.exam;
// Generated Mar 22, 2019 1:58:40 AM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 * Joblist generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class Joblist  implements java.io.Serializable {
 private List<Joblist>list = new ArrayList<>();
         
     private int jobid;
     private String location;
     private String post;
     private String industries;
     private String experience;
     private Integer lastDate;
     private String salary;

    public Joblist() {
    }

	
    public Joblist(int jobid) {
        this.jobid = jobid;
    }
    public Joblist(int jobid, String location, String post, String industries, String experience, Integer lastDate, String salary) {
       this.jobid = jobid;
       this.location = location;
       this.post = post;
       this.industries = industries;
       this.experience = experience;
       this.lastDate = lastDate;
       this.salary = salary;
    }
   
    public int getJobid() {
        return this.jobid;
    }
    
    public void setJobid(int jobid) {
        this.jobid = jobid;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public String getPost() {
        return this.post;
    }
    
    public void setPost(String post) {
        this.post = post;
    }
    public String getIndustries() {
        return this.industries;
    }
    
    public void setIndustries(String industries) {
        this.industries = industries;
    }
    public String getExperience() {
        return this.experience;
    }
    
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public Integer getLastDate() {
        return this.lastDate;
    }
    
    public void setLastDate(Integer lastDate) {
        this.lastDate = lastDate;
    }
    public String getSalary() {
        return this.salary;
    }
    
    public void setSalary(String salary) {
        this.salary = salary;
    }
public String doSav(){
JoblistDao dd = new JoblistDao();
dd.doSav(this);
return "joblistp";

}
  public String doUp(){
JoblistDao dd = new JoblistDao();
dd.doUp(this);
return "joblistp1";

}  
public String doDel(){
JoblistDao dd = new JoblistDao();
dd.doDel(this);
return "joblistp2";

}  

    public List<Joblist> getList() {
        JoblistDao hh = new JoblistDao();
       list= hh.doSh();
        
        return list;
    }

    public void setList(List<Joblist> list) {
        this.list = list;
    }


}

