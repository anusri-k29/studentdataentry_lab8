//Student.java
public class Student {
    private String name;
    private int prn;
    private String branch;
    private String batch;
    private float cgpa;

    // Constructor
    public Student(String name, int prn, String branch, String batch, float cgpa) {
        this.name = name;
        this.prn = prn;
        this.branch = branch;
        this.batch = batch;
        this.cgpa = cgpa;
    }
    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getPRN() { return prn; }
    public void setPRN(int prn) { this.prn = prn; }
    
    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }
    
    public String getBatch() { return batch; }
    public void setBatch(String batch) { this.batch = batch; }
