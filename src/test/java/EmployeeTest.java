import com.verge.entity.Employee;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class EmployeeTest {

    @Test
    public void testEmployee() {
        Employee employee = new Employee("Dave", "Davido", 1234567L, 100000L);
        assertThat(employee.getFirstName(), equalTo("Dave"));
        assertThat(employee.getSurname(), equalTo("Davido"));
        assertThat(employee.getEmployeeNumber(), equalTo(1234567L));
        assertThat(employee.getSalary(), equalTo(100000L));
    }
}
