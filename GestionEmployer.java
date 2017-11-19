/*
 *cette classe principale represente notre entrer du programme !!
 */
public class GestionEmployer {

	public static void main(String[] args) {

		
			/*
			 * instanciation & initilisation de notre objet employe!
			 */
					Employer employe = new Employer("NDEPO","LANDRY");
									
				/*
				 *  instanciation & initilisation de notre objet salaire!
				 */
					Salaire salaire = new Salaire(employe, 2000);
											
					int salaire1 = salaire.calculSalaire(2015);
									
					System.out.println("L'employe " +salaire.employe.getNom()+ " " +salaire.employe.getPrenom()+ " a été embauché en " +salaire.anneeEmbauche);
									
					System.out.println("Il a un salaire de " +salaire1+ "fr CFA");


		}

	

}
