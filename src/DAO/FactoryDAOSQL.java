package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The type Factory daosql.
 */
public class FactoryDAOSQL extends AbstractFactory {

    /**
     * The constant connection.
     */
    public static Connection connection;

    /**
     * Instantiates a new Factory daosql.
     */
    protected FactoryDAOSQL(){
        initialize();
    }

    @Override
    public void createUserDAO() {
        this.userDAO = new UserDAOSQL();
    }

    @Override
    public void createCompanyDAO() {
        this.companyDAO = new CompanyDAOSQL();
    }

    @Override
    public void createCompanyMemberDAO() {
        this.companyMemberDAO= new CompanyMemberDAOSQL();
    }

    @Override
    public void createGliderDAO() { this.daoGlider = new DAOSqlGlider(); }

    @Override
    public void createBookingDAO() {
        this.bookingDAO = new BookingDAOMySQL();
    }

    public void createEquipmentDAO(){
        this.daoEquipement = new DAOSqlEquipement();
    }

    @Override
    public void createLauncherDAO() {
        this.daoLauncher = new DAOSqlLauncher();
    }

    @Override
    public void createDiplomaDAO() {
        this.daoDiploma = new DAOSqlDiploma();
    }

    @Override
    public void createMonitorDAO() {
        this.monitorDAO = new MonitorDAOSQL();
    }

    @Override
    public void createLicensedDAO() {
        this.licensedDAO = new LicensedDAOSQL();
    }

    @Override
    public void createAdminDAO() {
        this.adminDAO = new AdminDAOSQL();
    }

    @Override
    public void initialize() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://mysql-projetoose.alwaysdata.net:3306/projetoose_oose", ConfigBDD.LOGIN, ConfigBDD.PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        connection =  con;
    }


}
