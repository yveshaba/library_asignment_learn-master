
package domain;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Book {
    @Id
    private String bookId;
    private String title;
    private String author;
    private int pages;
    @Temporal(TemporalType.DATE)
    private Date publishDate;

    @OneToMany
    private List<CheckInOut> checkInOut;
    
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public List<CheckInOut> getCheckInOut() {
        return checkInOut;
    }

    public void setCheckInOut(List<CheckInOut> checkInOut) {
        this.checkInOut = checkInOut;
    }
    
    
    
}
