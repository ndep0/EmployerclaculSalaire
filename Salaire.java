/*
 * ici nous avaons notre classe Salaire
 */
public class Salaire {

	public	Employer employe;
	public int anneeEmbauche;
	public int salaireDeBase = 150000;
	public int salaireT;
	/*
	 * cr�ation d'un constructeur qui permet d'initialiser \n
	 * les deux propi�t�s que voici: anneeEmbauche & employe
	 */
	public  Salaire( Employer employe, int anneeEmbauche ){
		
		this.employe = employe ;
		this.anneeEmbauche = anneeEmbauche;
		
	}
	/*
	 * cr�ation d'un accesseur pour la propri�t� employe
	 */



	public Employer getEmployer(){
		return employe;
	}
	/*
	 * cr�ation de notre m�thode calculSalaire
	 */
	public int calculSalaire(int anneeEmbauche){
		
		int sur_Salaire;
		
		if (anneeEmbauche == 0) {
			sur_Salaire = 50000;
			salaireT = salaireDeBase + sur_Salaire;
			}
		
		else if (anneeEmbauche == 1) {
			sur_Salaire = 80000;
			salaireT = salaireDeBase + sur_Salaire;
			}
		
		else
			sur_Salaire = 100000;
			salaireT = salaireDeBase + sur_Salaire;
		
		return salaireT;
	}
	public String employe() {
		// TODO Auto-generated method stub
		return null;
		}
		
}
