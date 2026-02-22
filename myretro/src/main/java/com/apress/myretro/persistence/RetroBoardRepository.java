package com.apress.myretro.persistence;

import com.apress.myretro.board.RetroBoard;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;
// Previous users project describes what CrudRepository does
public interface RetroBoardRepository extends CrudRepository<RetroBoard, UUID> {
}
