package com.puiggener.repository;

import java.util.List;

import com.puiggener.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by puiggener on 20/10/16.
 */
public interface TeamRepository  extends JpaRepository<Team, Long> {

    List<Team> findBycity(String ciu);

}
