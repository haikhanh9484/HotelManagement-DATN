package vn.com.hotelmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vn.com.hotelmanagement.domain.Authority;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
