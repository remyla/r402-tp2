import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

public class Pile{

    private Collection<Object> pile = new ArrayList<>();

    /**
     * Constructeur vide.
     */
    public Pile() {}

    /**
     * Construit une nouvel pile contenant tous les éléments distinct d'une collection.
     *
     * @param objets la collection d'objet contenus dans la pile
     * @throws NullPointerException si la collection contient un élément <code>null</code>
     */
    public Pile(Collection<Object> objets) throws NullPointerException {
        try{
            if (objets.isEmpty()) {
                throw new Exception("La liste en argumzent est vide");
            }

        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
    }

    /**
     * Retourne le nombre d'éléments dans une pile (sa cardinalité).
     *
     * @return le nombre d'éléments distincts contenus dans une pile
     */
    public int taille() {
        int taille;
        try{
            taille = pile.size();
        }catch (Exception e){
            throw new UnsupportedOperationException(e.getMessage());
        }
        return taille;
    }

    /**
     * Retourne <code>true</code> si la pile contient l'élément spécifié.
     *
     * @param o l'élément dont la présence est testée
     * @return <code>true</code> si et seulement si une pile contient un élément <code>x</code> tel que <code>o.equals(x)</code>.
     */
    public boolean contient(Object o) {
        return pile.contains(o);
    }

    /**
     * Retourne un objet contenu dans une pile. Le choix de l'objet est arbitraire, mais différents appels à cette
     * méthode pour une pile donné retournent toujours le même élément.
     *
     * @return un objet contenu dans une pile
     * @throws NoSuchElementException si une pile ne contient aucun élément
     */
    public Object element() throws NoSuchElementException {
        if (pile.isEmpty()) {
            throw new NoSuchElementException();
        }
        return pile.iterator().next();
    }

    /**
     * Retourne l'union d'une pile et de la pile spécifié.
     *
     * @param e la pile avec lequel calculer l'union
     * @return une nouvelle pile contenant tous les éléments distincts contenus dans cet pile ou dans <code>e</code>
     */
    public Pile union(Pile e) {
        for (Object element: e.pile) {
            ajouter(element);
        }
        return this;
    }

    public void ajouter(Object element) {
        pile.add(element);
    }

    public Object enlever(Object element) {
        if (pile.isEmpty()) {
            throw new NoSuchElementException("La pile est vide");
        }
        return pile.remove(pile.size() - 1);
    }

    public Object dernierElement(){
        throw new UnsupportedOperationException("méthode non implémentée");
    }
}

