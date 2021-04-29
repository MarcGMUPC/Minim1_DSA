package edu.upc.dsa;

import edu.upc.dsa.models.User;

import java.util.List;


public interface Covid19Manager {
        public User addUser(String iduser, String vacunes, String fecha, String estat);
        public User addUser(User u);
        public User getUser(String id);
        public List<User> findAll();
        public void deleteUser(String id);
        public User updateUser(User u);

        public int size();

}
