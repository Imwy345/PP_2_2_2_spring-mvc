package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public Object getUserById(int ID) {
        return userDao.getUserById(ID);
    }

    @Override
    public void addUser(User user) {
    userDao.addUser(user);
    }

    @Override
    public void removeUser(int ID) {
    userDao.removeUser(ID);
    }

    @Override
    public void updateUser(User user) {
    userDao.updateUser(user);
    }
}