import static org.junit.Assert.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.ipiecoles.java.java350.model.Employe;

import com.ipiecoles.java.java350.MySpringApplication;
import com.ipiecoles.java.java350.model.Commercial;
import com.ipiecoles.java.java350.repository.BaseEmployeRepository;
import com.ipiecoles.java.java350.repository.EmployeRepository;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringApplication.class)

public class EmployeRepositoryTest {

	@Autowired
	private EmployeRepository employeRepository;
	@Test
	public void test() {
		//Given
		Commercial c = new Commercial();
		c.setPrenom("");
		c.setNom("");
		
		//When
		List<Employe> employeList = employeRepository.findByNomOrPrenomAllIgnoreCase("pierre");
		//Then
		Assertions.assertThat(employeList).isEmpty();
	}

}
