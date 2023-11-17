/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Oct 25, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.ListItem;
@Repository
public interface ContactRepository extends
JpaRepository<ListItem, Long> { }