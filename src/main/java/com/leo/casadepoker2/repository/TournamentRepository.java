package com.leo.casadepoker2.repository;

import com.leo.casadepoker2.model.TableItem;
import com.leo.casadepoker2.model.Tables;
import com.leo.casadepoker2.model.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long>  {
    ArrayList<TableItem> findAllTournament(Tournament tournament);
}
