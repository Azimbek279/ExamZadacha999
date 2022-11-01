package peaksoft;

import org.hibernate.SessionFactory;
import peaksoft.dao.CarDao;
import peaksoft.dao.CompanyDao;
import peaksoft.dao.GarageDao;
import peaksoft.dao.PersonDao;
import peaksoft.daoImpl.CarDaoImpl;
import peaksoft.daoImpl.CompanyDaoImpl;
import peaksoft.daoImpl.GarageDaoImpl;
import peaksoft.daoImpl.PersonDaoImpl;
import peaksoft.model.Car;
import peaksoft.model.Company;
import peaksoft.model.Garage;
import peaksoft.model.Person;
import peaksoft.util.Util;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        CompanyDao companyDao = new CompanyDaoImpl();
        Company company = new Company("PeakSoft","Bishkek");
//        companyDao.createTables();
        companyDao.saveCompany(company);
//        companyDao.deleteById(1L);


        PersonDao personDao = new PersonDaoImpl();
        Person person = new Person("Azimbek",17,"azimbek@gmail","male");
        personDao.savePerson(person);
//        personDao.createTables();
//        personDao.deletePersonById(1L);


        CarDao carDao = new CarDaoImpl();
        Car car = new Car("Car","Kg");
        carDao.saveCar(car);
//        carDao.createTables();
//        carDao.deleteById(1L);


        GarageDao garageDao= new GarageDaoImpl();
        Garage garage = new Garage("garage","svobodno");
        garageDao.saveGarage(garage);
//        garageDao.createTables();
//        garageDao.deleteById(1L);











    }

}
