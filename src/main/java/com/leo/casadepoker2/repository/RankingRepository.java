package com.leo.casadepoker2.repository;

import com.leo.casadepoker2.model.Ranking;
import com.leo.casadepoker2.model.TableItem;
import com.leo.casadepoker2.model.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Long> {
    ArrayList<TableItem> findRanking(Ranking ranking);
}
