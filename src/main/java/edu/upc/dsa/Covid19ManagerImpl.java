package edu.upc.dsa;

import edu.upc.dsa.models.User;

import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

public class Covid19ManagerImpl implements Covid19Manager{
    private static Covid19Manager instance;
    protected List<User> users;
    final static Logger logger = Logger.getLogger(Covid19ManagerImpl.class);

    private Covid19ManagerImpl() {
        this.users = new LinkedList<>();
    }

    public static Covid19Manager getInstance() {
        if (instance==null) instance = new Covid19ManagerImpl();
        return instance;
    }

    public User addUser(String iduser, String vacunes, String fecha, String estat) {
        return this.addUser(new User(iduser, vacunes, fecha, estat));
    }

    public User getUser(String id) {
        logger.info("getUser("+id+")");

        for (User u: this.users) {
            if (u.getIduser().equals(id)) {
                logger.info("getUser("+id+"): "+u);

                return u;
            }
        }

        logger.warn("not found " + id);
        return null;
    }




    @Override
    public User addUser(String iduser, String vacunes, String fecha, String estat) {
        return null;
    }

    @Override
    public User addUser(User u) {
        return null;
    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteUser(String id) {

    }

    @Override
    public User updateUser(User u) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
