
public class ChaineCrypter {

	//private String _chaineClaire;
	private String _chaineCryp;
	private int _decalage;
	
//	public ChaineCrypter() {
//		_chaineClaire = "";
//		_decalage = 0;
//	}
	
	/**
	 * Constructeur de la classe ChaineCrypter
	 * @param chaineC
	 * @param decal
	 */
	public ChaineCrypter(String chaineC, int decal)
	{
		if(chaineC != null)
		{
			//this._chaineClaire = chaineC;
			_chaineCryp = chaineC;
			this._decalage = decal;
		}
		
	}
	
	/**
	 * decrypte
	 * 
	 * return la chaine claire
	 * @return _chaineClaire
	 */
//	public String decrypte()
//	{
//		return this._chaineClaire;
//	}
	
	public String decrypte()
	{
		String chaineC ="";
		if(_chaineCryp != null)
		{
			for(int i=0; i<_chaineCryp.length(); i++)
			{
				chaineC += decaleCaractere(_chaineCryp.charAt(i), _decalage);
			}
		}
		
		return chaineC;
	}
	
	/**
     * Décale un caractère majuscule.
     * Les lettres en majuscule ('A' - 'Z') sont décalés de <code>decalage</code>
     * caractères de façon circulaire. Les autres caractères ne sont pas modifiés.
     * 
     * @param c le caractère à décaler
     * @param decalage le décalage à appliquer
     * @return le caractère décalé
     */
    private static char decaleCaractere(char c, int decalage) {
        //return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
    	return (c < 'A' || c > 'Z')? c : (char)((((c + 'A') - decalage) % 26) + 'A');
    }
	
    
    /**
     * return la chaine crypter avec le decalage
     * 
     * @return la chaine crypter
     */
//	public String crypte()
//	{
//		String chaineC ="";
//		if(_chaineClaire != null)
//		{
//			for(int i=0; i<_chaineClaire.length(); i++)
//			{
//				chaineC += decaleCaractere(_chaineClaire.charAt(i), _decalage);
//			}
//		}
//		
//		return chaineC;
//	}
    
    public String crypte()
	{
		return _chaineCryp;
	}
    

}
