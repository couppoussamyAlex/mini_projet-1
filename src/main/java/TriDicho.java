public class TriDicho {
	public static void triTableauDicho(Comparable[] tab){
		int j=0;
		for(int i=0; i<tab.length;i++){
			Comparable elem=tab[i];
			for(j=i;j>0 && (tab[j-1]).compareTo(elem)>0;j--){
				tab[j]=tab[j-1];
			}
			tab[j]=elem;
		}
	}
}
