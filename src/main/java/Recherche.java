public class Recherche {
	public static int recherche(Comparable[] tab, Comparable val){
		boolean trouve=false;
		int id=0,ifin=tab.length;
		int im;
		do{
			
			im=(int)(id+ifin)/2;
			trouve=tab[im].compareTo(val)==0;
			if(tab[im].compareTo(val)<0)
			{
				id=im;
			}
				
			else if(tab[im].compareTo(val)>0)
			{
				ifin=im;
			}
		}while(!trouve && ((ifin-id)>0));
		if(tab[im]==val)
			return id;
		else
			return -1;
	}
}
