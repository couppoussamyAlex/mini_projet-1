public class TriDicho {

	public TriDicho(){
		
	}
	public Comparable<Object>[] triTableauDicho(Comparable<Object>[] tab){
		int j=0;
		for(int i=0; i<tab.length;i++){
			Comparable<Object> elem= tab[i];
			for(j=i;j>0 && tab[j-1].compareTo(elem)<0;j--){
				tab[j]=tab[j-1];
			}
			tab[j]=elem;
		}
		return tab;
	}
}
