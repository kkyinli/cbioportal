package org.cbioportal.persistence;

import org.cbioportal.model.CancerStudy;
import org.cbioportal.model.meta.BaseMeta;

import java.util.List;

public interface StudyRepository {

    List<CancerStudy> getAllStudies(String projection, Integer pageSize, Integer pageNumber,
                                    String sortBy, String direction);

    BaseMeta getMetaStudies();

    CancerStudy getStudy(String studyId, String projection);

    List<CancerStudy> fetchStudies(List<String> studyIds, String projection);
    
    BaseMeta fetchMetaStudies(List<String> studyIds);
}
