package info;

/**
 * Created by lenovo on 2016/6/16.
 */
public class DataInfo{
    String summary;
    String icon;
    String title;
    String nid;
    String link;
    String type;
    public DataInfo(String summary, String icon, String title, String nid, String link, String type) {
        this.summary = summary;
        this.icon = icon;
        this.title = title;
        this.nid = nid;
        this.link = link;
        this.type = type;
    }
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Data{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", title='" + title + '\'' +
                ", nid='" + nid + '\'' +
                ", link='" + link + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
