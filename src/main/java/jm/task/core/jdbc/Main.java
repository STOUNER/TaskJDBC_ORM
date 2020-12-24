package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl test = new UserDaoHibernateImpl();
        test.removeUserById(16);

    }
}
