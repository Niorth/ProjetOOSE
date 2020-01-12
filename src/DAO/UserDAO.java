package DAO;

import Model.Glider;
import Model.Monitor;
import Model.User;

import java.sql.Connection;
import java.util.ArrayList;

public interface UserDAO {

    User login(String login, String password,String role);
    boolean addUser(String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth,String role);
    boolean update(int id,String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth);
    ArrayList<User> getAllMonitor();
    boolean delete(int idUser);
}

