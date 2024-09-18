package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    public Stream<String> findUserFamilyNameByImproperFraction() {
        return new UserDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isImproper))
                .map(User::getFamilyName);
    }
}