package ua.lviv.iot.spring.first.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.first.dataaccess.GroupRepository;
import ua.lviv.iot.spring.first.rest.model.Group;

@Service
public class GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public List<Group> findAll() {
        return groupRepository.findAll();
    }
}