import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Cette classe représente une structure de données "Pile". C'est une structure du type LIFO (Last In First Out). Les objets contenus sont garantis
 * non-<code>null</code>. Les instances de cette classe sont immuables.
 * @param <T>
 */
public class Pile<T> extends Vector<T> {
    private ArrayList<T> elements;

    /**
     * Crée un nouvel objet Pile vide
     */
    public Pile() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Crée un nouvel objet Pile à partir d'une List
     * @throws IllegalArgumentException Si un élément du paramètre est <code>null</code>
     * @param elements Un liste des éléments à insérer dans la pile
     */
    public Pile(List<T> elements) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Ajoute un élément à la pile
     * @throws IllegalArgumentException Si T est <code>null</code>
     * @param element L'élément à ajouter à la pile
     */
    public void empiler(T element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Enlève le dernier élement ajouté
     * @throws IndexOutOfBoundsException Si la pile est vide
     * @return L'élément de type T
     */
    public T depiler() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Renvoie si la pile est vide
     * @return Vrai si la pile est vide, faux si la pile contient au moins un elements
     */
    public boolean estVide() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Renvoie la taille de la pile
     * @return La taille
     */
    public int taille() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Renvoie le sommet de la pile
     * @throws IndexOutOfBoundsException Si la pile est vide
     * @return L'élément de type T
     */
    public T sommet() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Vide la pile
     * @throws IndexOutOfBoundsException Si la pile est vide
     */
    public void vider() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Recherche l'élement T dans la pile
     * @param element L'élément à rechercher
     * @return La position de l'élément dans la pile, -1 si l'élément n'est pas trouvé
     */
    public int rechercher(T element) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Renvoie une représentation textuelle de la pile.
     *
     * @return Une String contenant la représentation de la pile
     */
    public String toString() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }
}
