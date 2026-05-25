import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public record UserForm (String email,
                       String password,
                       int age
) {
    public UserForm {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email is null or empty");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password is null or empty");
        }
    }
}
class UserValidator {
    private final List<Predicate<UserForm>> rules = new ArrayList<>();

    public void addRule(Predicate<UserForm> rule) {
        rules.add(rule);
    }

    public boolean isValid(UserForm form) {
        return rules.stream().allMatch(rule -> rule.test(form));
    }
}
