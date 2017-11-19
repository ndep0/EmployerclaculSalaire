/*
 * ici nous avaons notre classe Employer
 */
public class Employer {

	private String nom;
	private String prenom;
/*
 * création des deux savoir- faire "nom" et "prenom"	
 */
   public String getNom(){
	   return nom;
   }	
   public void setNom(String nom){
	   this.nom = nom;
   }
   public String getPrenom(){
	   return prenom;
   }
   public void setPrenom(String prenom){
	   this.prenom = prenom;
   }
   /*
    * création d'un constructeur sans paramètre
    */
   public Employer(){
	   super();
   }
   /*
    * création d'un constructeur avec deux paramètres ( "nom" & "prenom")
    */
   public Employer(String nom, String prenom){
	   super();
	   this.nom = nom;
	   this.prenom = prenom;
   }
}
