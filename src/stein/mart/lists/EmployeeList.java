
package stein.mart.lists;

public class EmployeeList {

    private String ID;
    private String name;
    private String gender;
    private String natId;
    private String department;
    
    
    public EmployeeList(String ID, String name, String gender, String natId, String departemnt){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.natId = natId;
        this.department = departemnt;
    }
    
    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the natId
     */
    public String getNatId() {
        return natId;
    }

    /**
     * @param natId the natId to set
     */
    public void setNatId(String natId) {
        this.natId = natId;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    
    
    
    
}
