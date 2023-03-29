import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import javax.naming.directory.NoSuchAttributeException;

/**
 * Cette classe modélise un tableau associatif, c'est-à-dire une collection d'objets distincts. Les objets contenus sont garantis
 * non null. Les instances de cette classe sont immuables.
 */
public class TableauAssociatif {

    /**
     * Construit un dictionnaire vide.
     */
    public TableauAssociatif() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Construit un dictionnaire a partir d'une collection
     *
     * @param objets la collection d'objet contenus dans le dictionnaire
     * @throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public TableauAssociatif(Collection<Object> objets) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne le nombre d'éléments dans le dictionnaire (sa cardinalité).
     *
     * @return le nombre d'éléments distincts contenus dans le dictionnaire
     */
    public int taille() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne <code>true</code> si le dictionnaire contient l'élément spécifié.
     *
     * @param o l'élément dont la présence est testée
     * @return <code>true</code> si et seulement si le dictionnaire contient un élément <code>x</code> tel que <code>o.equals(x)</code>.
     */
    public boolean contient(Object o) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne un objet contenu dans le dictionnaire. Le choix de l'objet est arbitraire, mais différents appels à cette
     * méthode pour un dictionnaire donné retournent toujours le même élément.
     *
     * @return un objet contenu dans le dictionnaire.
     * @throws NoSuchElementException si le dictionnaire ne contient aucun élément
     */
    public Object element() throws NoSuchElementException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne l'union de le dictionnaire et de le dictionnaire spécifié.
     *
     * @param e le dictionnaire avec lequel calculer l'union
     * @return un nouveau dictionnaire contenant tous les éléments distincts contenus dans ce dictionnaire ou dans <code>e</code>
     */
    public TableauAssociatif union(TableauAssociatif e) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Supprime une valeur pour une clé donnée dans un dictionnaire et retourne true si la suppression a eu lieu
     *
     * @param cle la clé de la valeur devant être supprimée dans le dictionnaire
     * @return true si la suppression a eu lieu, false sinon
     */
    public boolean supprimer(Object cle) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Modifie une valeur pour une clé donnée avec une nouvelle valeur donnée en parametre dans un dictionnaire et retourne true si la modification a eu lieu
     *
     * @param cle la clé de la valeur devant être modifié
     * @param val la nouvelle valeur
     * @return true si la modification a eu lieu, false sinon
     */
    public boolean modifier(Object cle, Object val) {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Converti les clés ou les valeurs du dictionnaire en liste
     *
     * @param contenu 'c' pour convertir les clés en liste; 'v' pour convertir les valeurs en liste
     * @throws NoSuchAttributeException si contenu ne contient pas 'v' ou 'c'
     * @return la liste contenant les clés ou valeurs du dictionnaire
     */
    public ArrayList<Object> convertir(String contenu) throws NoSuchAttributeException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Tri le dictionnaire dans l'odre souhaité.
     *
     * @param ordre 'ASC' pour trier le dictionnaire dans l'ordre ascendant; 'DESC' pour trier le dictionnaire dans l'ordre descendant
     * @throws NoSuchAttributeException si contenu ne contient pas 'ASC' ou 'DESC'
     * @return le dictionnaire dans l'ordre souhaité
     */
    public TableauAssociatif trier(String ordre) throws NoSuchAttributeException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Vide le dictionnaire
     *
     * @return le dictionnaire vidé
     */
    public TableauAssociatif vider() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Permet de saavoir si un dictionnaire est vide
     *
     * @return true si le tableau est vide, false sinon
     */
    public boolean est_vide() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Méthode permetant d'obtenir d'obtenir une copie d'un certain dictionnaire
     *
     * @return une copie du dictionnaire
     */
    public TableauAssociatif copier()  {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Méthode permettant d'inverser l'odre des éléments d'un dictionnaire
     *
     * @return le dictionnaire dans l'ordre inverse
     */
    public TableauAssociatif retourner()  {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Méthode permettant de supprimer et de renvoyer le dernier element d'un dictionnaire
     *
     * @return l'élément supprimé
     */
    public Object retirer()  {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Méthode permettant d'ajouter un élément a la fin d'un dictionnaire
     *
     * @param element l'élément a ajouter a la fin du dictionnaire
     * @return le dictionnaire avec la valeur ajoutée a la fin
     */
    public TableauAssociatif ajouter(Object element)  {
        throw new UnsupportedOperationException("méthode non implémentée");
    }











}


