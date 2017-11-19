/*
 * ici nous avaons notre classe Salaire
 */
public class Salaire {

	public	Employer employe;
	public int anneeEmbauche;
	public int salaireDeBase = 150000;
	public int salaireT;
	/*
	 * création d'un constructeur qui permet d'initialiser \n
	 * les deux propiétés que voici: anneeEmbauche & employe
	 */
	public  Salaire( Employer employe, int anneeEmbauche ){
		
		this.employe = employe ;
		this.anneeEmbauche = anneeEmbauche;
		
	}
	/*
	 * création d'un accesseur pour la propriété employe
	 */



	public Employer getEmployer(){
		return employe;
	}
	/*
	 * création de notre méthode calculSalaire
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
