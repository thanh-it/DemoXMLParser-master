package vn.edu.poly.demoxmlparser.model;

public class News {

    public String title;
    public String description;
    public String pubDate;
    public String link;
    public String guiid;
    public News() {
    }

    public News(String title, String description, String pubDate,String link) {
        this.title = title;
        this.description = description;
        this.pubDate = pubDate;
        this.link = link;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getGuiid() {
        return guiid;
    }

    public void setGuiid(String guiid) {
        this.guiid = guiid;
    }

}
