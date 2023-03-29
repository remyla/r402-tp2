import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * Cette classe modélise un tableau associatif, c'est-à-dire une collection d'objets distincts.
 * @param <V>
 * @param <K>
 */
public class AssociativeArray<V, K> {

    //Constructors

    /**
     * Construit une nouvelle table associative vide.
     */
    public AssociativeArray() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Construit une nouvelle table associative à partir des éléments d'une collection
     * @param elements la collection d'éléments
     * @throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public AssociativeArray(Collection<V> elements) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    //Getters

    /**
     * Retourne le nombre d'éléments dans la table.
     * @return le nombre d'éléments dans la table
     * @throws NoSuchElementException si la table est vide
     */
    public int size() throws NoSuchElementException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne un booléen indiquant si la table est vide.
     * @return <code>true</code> si la table est vide, <code>false</code> sinon
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne la valeur associée à une clé.
     * @param key la clé de l'association
     * @return la valeur associée à la clé, ou null si la clé n'est pas présente dans la table
     * @throws NullPointerException si la clé est <code>null</code>
     * @throws NoSuchElementException si la clé n'est pas présente dans la table
     */
    public V getValue(K key) throws NullPointerException, NoSuchElementException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne une collection contenant les clés associées à une valeur.
     * @param value la valeur de l'association
     * @return une collection contenant les clés associées à la valeur, ou null si la valeur n'est pas présente dans la table
     * @throws NoSuchElementException si la valeur n'est pas présente dans la table
     */

    public Collection<K> getKey(V value) throws NoSuchElementException{
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne une collection contenant les valeurs de la table.
     * @return une collection contenant les valeurs de la table
     * @throws NoSuchElementException si la table est vide
     */

    public Collection<V> values() throws NoSuchElementException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne une collection contenant les clés de la table.
     * @return une collection contenant les clés de la table
     * @throws NullPointerException si la clé est <code>null</code>
     */

    public Collection<K> keys() throws NullPointerException{
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne un booléan indiquant si la table contient une association pour une valeur donnée.
     * @param value la valeur de l'association
     * @return true si la table contient une association pour la valeur, false sinon
     * @throws NullPointerException si la valeur est <code>null</code>
     */
    public boolean containsValue(V value) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne un booléen indiquant si la table contient une association pour une clé donnée.
     * @param key la clé de l'association
     * @return true si la table contient une association pour la clé, false sinon
     * @throws NullPointerException si la clé est <code>null</code>
     */
    public boolean containsKey(K key) throws NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    //Setters

    /**
     * Ajoute une association à la table.
     * @param key la clé de l'association
     * @param value la valeur de l'association
     * @throws NullPointerException si la clé ou la valeur est <code>null</code>
     * @throws IllegalArgumentException si la clé est déjà présente dans la table
     */
    public void put(K key, V value) throws NullPointerException, IllegalArgumentException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Set la valeur associée à une clé.
     * @param key la clé de l'association
     * @param value la nouvelle valeur de l'association
     * @throws NullPointerException si la clé ou la valeur est <code>null</code>
     * @throws NoSuchElementException si le tableau ne contient pas la clé
     */

    public void setValue(K key, V value) throws NullPointerException, NoSuchElementException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Supprime une association de la table.
     * @param key la clé de l'association
     * @throws NullPointerException si la clé est <code>null</code>
     * @throws NoSuchElementException si le tableau ne contient pas la clé
     *
     */
    public void remove(K key) throws NoSuchElementException, NullPointerException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }

    /**
     * Retourne une représentation textuelle de la table.
     * @return une représentation textuelle de la table
     * @throws NoSuchElementException si la table est vide
     */

    public String toString() throws NoSuchElementException {
        throw new UnsupportedOperationException("méthode non implémentée");
    }
}
