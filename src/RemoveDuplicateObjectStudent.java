import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateObjectStudent {
    private String firstName;
    private String lastName;
    private int RemoveDuplicateObjectStudentId;

    public RemoveDuplicateObjectStudent() {
    }

    public RemoveDuplicateObjectStudent(int RemoveDuplicateObjectStudentId, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.RemoveDuplicateObjectStudentId = RemoveDuplicateObjectStudentId;
    }

    @Override
    public String toString() {
        return "RemoveDuplicateObjectStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", RemoveDuplicateObjectStudentId=" + RemoveDuplicateObjectStudentId +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRemoveDuplicateObjectStudentId() {
        return RemoveDuplicateObjectStudentId;
    }

    public void setRemoveDuplicateObjectStudentId(int RemoveDuplicateObjectStudentId) {
        this.RemoveDuplicateObjectStudentId = RemoveDuplicateObjectStudentId;
    }

    @Override
    public int hashCode() {
        System.out.println("In hashcode method");
        int hashcode = 0;
        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("In equals method");
        if (obj instanceof RemoveDuplicateObjectStudent) {
            RemoveDuplicateObjectStudent emp = (RemoveDuplicateObjectStudent)obj;
            return (emp.firstName.equals(this.firstName)
                    && emp.lastName == this.lastName && emp.RemoveDuplicateObjectStudentId == this.RemoveDuplicateObjectStudentId);
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        List<RemoveDuplicateObjectStudent> RemoveDuplicateObjectStudentList = new ArrayList<>();
        RemoveDuplicateObjectStudentList.add(new RemoveDuplicateObjectStudent(1, "Ram", "Tripathi"));
        RemoveDuplicateObjectStudentList.add(new RemoveDuplicateObjectStudent(2, "Shyam", "Yadav"));
        RemoveDuplicateObjectStudentList.add(new RemoveDuplicateObjectStudent(4, "Abhisheak", "Singh"));
        RemoveDuplicateObjectStudentList.add(new RemoveDuplicateObjectStudent(4, "Abhisheak", "Singh"));

        Map<RemoveDuplicateObjectStudent,Boolean> hm = new HashMap<>();
        for(RemoveDuplicateObjectStudent stu: RemoveDuplicateObjectStudentList){
            hm.put(stu,true);
        }

        for(Map.Entry<RemoveDuplicateObjectStudent,Boolean> ent: hm.entrySet()){
            System.out.println(ent.getKey() +"    "+ ent.getValue());
        }
    }
}
