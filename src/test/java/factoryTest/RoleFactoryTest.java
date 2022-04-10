package factoryTest;

import Factory.RoleFactory;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Role;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class RoleFactoryTest
{
    @Test
    public void Test()
    {
        Role Role = RoleFactory.createRole(1,"Jesse","yes","no","no");
        assertNotNull(Role);
    }

    private void assertNotNull(Role role) {
    }

    @Test
    void getRepository() {
    }

    @Test
    void create() {
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }
}