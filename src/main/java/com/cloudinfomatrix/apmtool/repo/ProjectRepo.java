package com.cloudinfomatrix.apmtool.repo;

import com.cloudinfomatrix.apmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends CrudRepository<Project,Long> {

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
