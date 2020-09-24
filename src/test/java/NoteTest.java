import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoteTest {
    @Test
    void test() throws JsonProcessingException {
        String json = "[{\"_id\":\"5f605bbab2e4b7001719b256\",\"type\":\"cat\",\"text\":\"Sry.\",\"user\":{\"_id\":\"5f5f145fb2e4b7001719b196\",\"name\":{\"first\":\"Yurii\",\"last\":\"Starinov\"}},\"upvotes\":1,\"userUpvoted\":null},{\"_id\":\"5f6062788ade8300170a25c6\",\"type\":\"cat\",\"text\":\"Cats can not be spelled as 'test'.\",\"user\":{\"_id\":\"5f5f145fb2e4b7001719b196\",\"name\":{\"first\":\"Yurii\",\"last\":\"Starinov\"}},\"upvotes\":1,\"userUpvoted\":null}]";
        ObjectMapper objectMapper = new ObjectMapper();

        List<Note> list = objectMapper.readValue(json, new TypeReference<List<Note>>() {
        });

        for(Note note: list) {
            System.out.println(note);
        }
    }
}