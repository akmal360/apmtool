package com.cloudinfomatrix.apmtool.services;


import com.cloudinfomatrix.apmtool.domain.Project;
import com.cloudinfomatrix.apmtool.exceptions.ProjectIdException;
import com.cloudinfomatrix.apmtool.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;
    public Project saveOrUpdateProject(Project project){
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepo.save(project);
        }catch (Exception e){
            throw new ProjectIdException("Project ID '"+project.getProjectIdentifier().toUpperCase()+"'Already exists ");
        }

    }
}
