import java.util.ArrayList;
        import java.util.List;

public class PersonService {

    private List<Person> people = new ArrayList<>();

    public boolean savePerson(Person person) {
        return people.add(person);
    }

    public List<Person> getAll() {
        return people;
    }
}
