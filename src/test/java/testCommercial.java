import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.ipiecoles.java.java350.model.Commercial;

public class testCommercial {

	@Test
	public void testPrimeAnnelleWitchCaNull() {
		//Given
		Commercial commercial = new Commercial();
		commercial.setCaAnnuel(null);
		
		//When
		Double prime = commercial.getPrimeAnnuelle();
		
		//Then
		Assertions.assertThat(prime).isEqualTo(500d);
	}
	
	@Test
	public void testPrimeAnnelleWitchCaO() {
		//Given
		Commercial commercial = new Commercial();
		commercial.setCaAnnuel(0d);
		
		//When
		Double prime = commercial.getPrimeAnnuelle();
		
		//Then
		Assertions.assertThat(prime).isEqualTo(500d);
	}
}
