package introduction.domain.model.hobby;

import java.util.ArrayList;
import java.util.List;

public class Hobbies {
    List<Hobby> values = new ArrayList<>();

    public Hobbies(List<Hobby> values) {
        this.values = values;
    }

    public Hobbies() {
    }
}
