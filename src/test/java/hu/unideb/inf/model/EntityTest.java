package hu.unideb.inf.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EntityTest {

    private Entity entity;

    @Test
    void takeDamage_WhenTheIncomingDamageIs10_ShouldReturn8() {

        // Given
        entity = Entity.builder()
                .armor(Armor.builder()
                        .defense(0.2f)
                        .name("My first armor")
                        .level(1)
                        .build())
                .health(100)
                .build();

        // When
        float actualDamage = entity.takeDamage(10);

        // Then
        Assertions.assertEquals(8, actualDamage);
        Assertions.assertEquals(92, entity.getHealth());
    }

    @Test
    void takeDamage_WhenTheIncomingDamageIs0_ShouldReturn0() {

        // Given
        entity = Entity.builder()
                .armor(Armor.builder()
                        .defense(0.2f)
                        .name("My first armor")
                        .level(1)
                        .build())
                .health(100)
                .build();

        // When
        float actualDamage = entity.takeDamage(0);

        // Then
        Assertions.assertEquals(0, actualDamage);
        Assertions.assertEquals(100, entity.getHealth());
    }

    @Test
    void takeDamage_WhenTheArmorIsNullAndTheIncomingDamageIs100_ShouldReturn100() {

        // Given
        entity = Entity.builder()
                .health(100)
                .build();

        // When
        float actualDamage = entity.takeDamage(100);

        // Then
        Assertions.assertEquals(100, actualDamage);
        Assertions.assertEquals(0, entity.getHealth());
    }


}
