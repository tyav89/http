import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;


public class Note {
    private String id;
    private String text;
    private String type;
    private User user;
    private int upvotes;
    private String userUpvoted;

    @JsonCreator
    public Note(
            @JsonProperty("_id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("upvotes") int upvotes,
            @JsonProperty("userUpvoted") String userUpvoted
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.upvotes = upvotes;
        this.userUpvoted = userUpvoted;
    }

    @JsonSetter("user")
    public void setUser(User user){
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public User getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public String getUserUpvoted() {
        return userUpvoted;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                ", upvotes=" + upvotes +
                ", userUpvoted=" + userUpvoted +
                '}';
    }

}
