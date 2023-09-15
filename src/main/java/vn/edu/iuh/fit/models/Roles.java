package vn.edu.iuh.fit.models;

public class Roles {
    private String roile_id;
    private String role_name;
    private String description;
    private int status;

    public Roles() {

    }

    public Roles(String roleName, String description, int status) {
        role_name = roleName;
        this.description = description;
        this.status = status;
    }

    public String getRoile_id() {
        return roile_id;
    }

    public void setRoile_id(String roile_id) {
        this.roile_id = roile_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roile_id='" + roile_id + '\'' +
                ", role_name='" + role_name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
