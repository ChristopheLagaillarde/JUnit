package testJUnit;

public class CalculCarre {
	int perimetre;

	int carreDe(int nb) {
		return nb*nb;
	}
	
	void perimetreCarre(int longueur, int largeur) {
		perimetre =((longueur*2)+(largeur*2));
	}
}

