package csxt.lwm.service.impl;

import csxt.lwm.dao.QualityRegDao;
import csxt.lwm.service.QualityRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QualityRegServiceImpl implements QualityRegService {
    @Autowired
    private QualityRegDao qualityRegDao;
}
