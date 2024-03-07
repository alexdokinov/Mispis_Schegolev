public class Institute {

    private String name;
    private String address;
    private ResearchStaff[] employees;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ResearchStaff[] getEmployees() {
        return this.employees;
    }

    public void setEmployees(ResearchStaff[] employees) {
        this.employees = employees;
    }

    public void hire(ResearchStaff employee) {
        // TODO - implement Institute.hire
        throw new UnsupportedOperationException();
    }

    public void fire(ResearchStaff employee) {
        // TODO - implement Institute.fire
        throw new UnsupportedOperationException();
    }

}