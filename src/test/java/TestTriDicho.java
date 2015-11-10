import org.junit.Test;


public class TestTriDicho {

	@Test
	public void peutTrierUnTableau(){
		Integer[] tab= new Integer[] {15, 52, 88, 1};
		TriDicho.triTableauDicho(tab);
	}
}
