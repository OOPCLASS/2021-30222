package ro.utcluj;

import ro.utcluj.model.DcComics;
import ro.utcluj.model.Movie;
import ro.utcluj.model.Product;
import ro.utcluj.second.Book;
import ro.utcluj.model.Comics;

/**
 * Create a hierarchy of products with some classes having
 * two levels of inheritance.
 *
 * - create some products of different types and add
 *   them to the same array
 * - create a method which returns the products of a
 *   specific type from the list of all products
 * - implement some overriden & overloaded methods
 * - try out equals on different classes
 * - draw the UML diagram for your classes
 */
public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Random book");
        book.setNumberOfPages(10);

        Movie first = new Movie();
        first.setTitle("Movie title");
        first.setRating(10.0);
        first.setLengthInMinutes(10);

        Product second = new Movie();
        second.setTitle("Movie title");

        System.out.println(first instanceof Movie);
        System.out.println(first instanceof Product);
        System.out.println(first instanceof Object);

        Book secondBook = new Book();
        secondBook.setTitle("Random second book");
        secondBook.setNumberOfPages(5);

        Product[] products = new Product[10];
        products[0] = book;
        products[1] = second;
        products[2] = secondBook;

        Comics comics = new Comics();
        comics.setVolume(3);
        comics.setArtist("Jonathan Glapion");
        comics.setTitle("Batman");

        products[3] = comics;

        for (int i = 0; i < 4; i++) {
            Product product = products[i];
            System.out.println(product.getTitle());
            System.out.println(product.getLinkNumber());
        }

        DcComics dcComics = new DcComics();
        dcComics.setCoWriter("James Tynion");
        Comics firstComics = new DcComics();
        firstComics = dcComics;
        firstComics.setArtist("Jonathan Glapion");

        System.out.println(firstComics.getArtist());

        products[4] = firstComics;
        Product product = products[4];
        System.out.println(product.getCoWriterIfExists());

        for (int i = 0; i < 4; i++) {
            Product productTest = products[i];
            if (productTest instanceof Movie)
                System.out.print(((Movie) productTest).getLengthInMinutes()+" ");
            else if (productTest instanceof Book)
                System.out.print(((Book) productTest).getNumberOfPages()+" ");
            else if (productTest instanceof Comics)
                System.out.print(((Comics) productTest).getArtist()+" ");
        }

    }
}