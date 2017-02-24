package introduction.domain.fundamentals.person.hometown;

public class Hometown {
    Prefecture prefecture;
    City city;

    public String homeTown() {
        return String.format("%s %s", prefecture.value, city.value);
    }
}
