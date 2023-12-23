package baranovviacheslav.jdrest.repository;

import baranovviacheslav.jdrest.model.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();

        if (user.equals("admin") && password.equals("admin12345")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("reader") && password.equals("reader12345")) {
            authorities.add(Authorities.READ);
        } else if (user.equals("writer") && password.equals("writer12345")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else {
            return Collections.emptyList();
        }
        return authorities;
    }
}
