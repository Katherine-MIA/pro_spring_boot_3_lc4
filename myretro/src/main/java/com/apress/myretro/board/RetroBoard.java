package com.apress.myretro.board;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table//Will use NamingStrategy logic that will name the table using snake case convention -> "retro_board"
public class RetroBoard {
    @Id
    private UUID id;
    @NotBlank(message = "A name must be provided")
    private String name;
    /*
    Spring Data JDBC has support for many datatypes, and even arrays and maps, considering of course that the database
    engine used supports array types as well. JDBC known data types for mapping:
    enum -> map to the respective values, all primitive types, LocalDate, LocalDateTime, LocalTime, Arrays, Collections,
    Set, Map (sometimes used for one-to-many relationships).
     */
    @MappedCollection(idColumn = "retro_board_id", keyColumn = "id")
    private Map<UUID, Card> cards = new HashMap<>();
}
