import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String id;
    private Map<String, String> name;

    @JsonCreator
    public User(
            @JsonProperty("_id") String id
    ) {
        this.id = id;
        this.name = new HashMap<String, String>();
    }

    @JsonAnySetter
    public void add(String key, String value) {
        name.put(key, value);
    }

    public String getId() {
        return id;
    }

    public Map<String, String> getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name=" + name +
                '}';
    }
}
