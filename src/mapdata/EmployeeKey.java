package mapdata;

public class EmployeeKey{
    private int id;
    private String emaployeeName;
    private String role;


    public EmployeeKey(int id, String emaployeeName, String role) {
        this.id = id;
        this.emaployeeName = emaployeeName;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getEmaployeeName() {
        return emaployeeName;
    }

    public String getRole() {
        return role;
    }

  /*  @Override
    public int compareTo(Object o) {
        if (this == o) return 0;

        EmployeeKey that = (EmployeeKey) o;

        if (getId() != that.getId()) return -1;
        if (getEmaployeeName() != null ? !getEmaployeeName().equals(that.getEmaployeeName()) : that.getEmaployeeName() != null)
            return -1;
        return getRole() != null ? getRole().equals(that.getRole()) ? 0:-1 : that.getRole() == null ? -1 :1;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeKey)) return false;

        EmployeeKey that = (EmployeeKey) o;

        if (getId() != that.getId()) return false;
        if (getEmaployeeName() != null ? !getEmaployeeName().equals(that.getEmaployeeName()) : that.getEmaployeeName() != null)
            return false;
        return getRole() != null ? getRole().equals(that.getRole()) : that.getRole() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getEmaployeeName() != null ? getEmaployeeName().hashCode() : 0);
        result = 31 * result + (getRole() != null ? getRole().hashCode() : 0);
        return result;
    }


}
