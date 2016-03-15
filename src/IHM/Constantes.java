package IHM;

import java.awt.Font;

public class Constantes{
    public static final int TAILLE_BLOC = 40;
    
    public static final int NB_BLOC_MIN_WIDTH = 4;
    public static final int NB_BLOC_MAX_WIDTH = 16;
    public static final int NB_BLOC_MIN_HEIGHT = 3;
    public static final int NB_BLOC_MAX_HEIGHT = 12;
    
    public static final int BANDEAU_HEIGHT = 100;
    
    public static final int FRAME_WIDTH = NB_BLOC_MAX_WIDTH * TAILLE_BLOC;
    public static final int FRAME_HEIGHT = BANDEAU_HEIGHT + NB_BLOC_MAX_HEIGHT*TAILLE_BLOC + 29; //29 : taille des bordures de fenetre ?
    
    
    public static final Font BANDEAU_FONT = new Font("SansSerif", Font.BOLD, 15);
    
    public static final String COULEUR_ROUGE = "Rouge";
    public static final String COULEUR_VERTE = "Verte";
    public static final String COULEUR_JAUNE = "Jaune";
    public static final String COULEUR_BLEUE = "Bleue";
    
}