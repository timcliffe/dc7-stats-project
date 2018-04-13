package org.launchcode.dc7statsproject1.Models.Data;

import org.launchcode.dc7statsproject1.Models.Nation;
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
