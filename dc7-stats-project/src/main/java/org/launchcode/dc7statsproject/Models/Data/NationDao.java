package org.launchcode.dc7statsproject.Models.Data;

import org.launchcode.dc7statsproject.Models.Nation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */
@Repository
@Transactional
public interface NationDao extends CrudRepository<Nation, Integer> {
}
