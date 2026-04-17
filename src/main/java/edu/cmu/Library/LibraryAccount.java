package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;
 
    /**
     * Retrieves an array of checked out books associated with the specified user ID. If the user
     * has no books checked out, the returned list will be empty.
     *
     * @param name the name of the user
     * @param id the id of the user
     * @return an array of Book objects the user has checked out
     */
    public Book[] getBooks(String name, String id) {
       return libraryService.getBooks(name, id);        
    }
}
