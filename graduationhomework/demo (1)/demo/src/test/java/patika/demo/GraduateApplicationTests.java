package patika.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import patika.demo.bean.Credit;
import patika.demo.bean.User;
import patika.demo.repo.ICreditRepo;
import patika.demo.repo.IUserRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
class GraduateApplicationTests {
	@Autowired
	private IUserRepo userRepo;

	@Autowired
	private ICreditRepo creditRepo;

	@Test
	public void testCrestUser(){
		User user = new User();
		user.setName("patika");
		user.setUsername("dev");
		user.setSalary(4500);
		user.setCreditScore(500);
		user.setPhoneNumber("5698");
	}

	@Test
	public void testCreateCredit(){
		Credit credit = new Credit();
		credit.setCreditScore(500);
		credit.setCreditSituation("Onay");
	}

}
