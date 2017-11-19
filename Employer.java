/*
 * ici nous avaons notre classe Employer
 */
public class Employer {

	private String nom;
	private String prenom;
/*
 * cr�ation des deux savoir- faire "nom" et "prenom"	
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
    * cr�ation d'un constructeur sans param�tre
    */
   public Employer(){
	   super();
   }
   /*
    * cr�ation d'un constructeur avec deux param�tres ( "nom" & "prenom")
    */
   public Employer(String nom, String prenom){
	   super();
	   this.nom = nom;
	   this.prenom = prenom;
   }
}
