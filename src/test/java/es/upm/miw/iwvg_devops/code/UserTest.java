package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;
    private Fraction fraction1;
    private Fraction fraction2;

    @BeforeEach
    void setUp() {
        // Inicializa objetos reales de Fraction
        fraction1 = new Fraction();
        fraction2 = new Fraction();
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(fraction1);
        fractions.add(fraction2);
        user = new User("1", "John", "Doe", fractions);
    }

    @Test
    void testUserConstructorWithoutParams() {
        User userWithoutParams = new User();
        assertNotNull(userWithoutParams.getFractions());
        assertTrue(userWithoutParams.getFractions().isEmpty());
    }

    @Test
    void testUserConstructorWithParams() {
        assertEquals("1", user.getId());
        assertEquals("John", user.getName());
        assertEquals("Doe", user.getFamilyName());
        assertEquals(2, user.getFractions().size());
        assertEquals(fraction1, user.getFractions().get(0));
        assertEquals(fraction2, user.getFractions().get(1));
    }

    @Test
    void testGetName() {
        assertEquals("John", user.getName());
    }

    @Test
    void testSetName() {
        user.setName("Jane");
        assertEquals("Jane", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Doe", user.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        user.setFamilyName("Smith");
        assertEquals("Smith", user.getFamilyName());
    }

    @Test
    void testGetFractions() {
        assertNotNull(user.getFractions());
        assertEquals(2, user.getFractions().size());
        assertTrue(user.getFractions().contains(fraction1));
        assertTrue(user.getFractions().contains(fraction2));
    }

    @Test
    void testSetFractions() {
        List<Fraction> newFractions = new ArrayList<>();
        newFractions.add(new Fraction());
        user.setFractions(newFractions);
        assertEquals(1, user.getFractions().size());
    }

    @Test
    void testAddFraction() {
        Fraction fraction3 = new Fraction();
        user.addFraction(fraction3);
        assertEquals(3, user.getFractions().size());
        assertEquals(fraction3, user.getFractions().get(2));
    }

    @Test
    void testFullName() {
        assertEquals("John Doe", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("J.", user.initials());
    }
}
