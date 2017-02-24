package introduction.presentation.request;

public class Queries {
    String[] filter;

    public Filters filter() {
        Filters filters = Filter.of(filter);
        if (filters.isEmpty()) return Filters.all();
        return filters;
    }
}
