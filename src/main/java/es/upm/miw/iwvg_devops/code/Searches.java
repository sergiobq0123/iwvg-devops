package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    public Stream<String> findUserFamilyNameByImproperFraction() {
        return new UserDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isImproper))
                .map(User::getFamilyName);
    }

    public Stream<String> findUserIdBySomeProperFraction() {
        return new UserDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(Fraction::isProper))
                .map(User::getId);
    }

    public Stream<Double> findDecimalFractionByNegativeSignFraction() {
        // Simulate fix bug
        return new UserDatabase().findAll()
                .flatMap(user -> user.getFractions().stream()
                        .map(Fraction::decimal)
                        .filter(decimal -> decimal < 0));
    }

    public Stream<String> findUserIdByAllProperFraction() {
        return new UserDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .allMatch(Fraction::isProper))
                .map(User::getId);
    }
}