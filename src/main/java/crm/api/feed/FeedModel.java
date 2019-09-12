package crm.api.feed;

import crm.api.user.UserModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="feeds")
public class FeedModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id", unique = true)
    private Integer id;
    @Lob
    @Column(name="content", length=1024)
    private String content;
    private String image;
    private String file;
    private String video;
    private String music;
    private String location;
    private String feelings;
    private String gif;
    private String entityType;
    
    @ManyToOne
    private UserModel userModel;
    
    public FeedModel() {
    	
    }

    public FeedModel(int id, String content, String image, String file, String video, String music, String location, String feelings, String gif, String entityType, int userId) {
        super();
        this.id = id;
        this.content = content;
        this.image = image;
        this.file = file;
        this.video = video;
        this.music = music;
        this.location = location;
        this.feelings = feelings;
        this.gif = gif;
        this.entityType = entityType;
        this.userModel = new UserModel(userId,"","","","","","","","","","","","");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFeelings() {
        return feelings;
    }

    public void setFeelings(String feelings) {
        this.feelings = feelings;
    }

    public String getGif() {
        return gif;
    }

    public void setGif(String gif) {
        this.gif = gif;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
