package lt.viko.eif.asinkevic.db;


import lt.viko.eif.asinkevic.model.Autobusas;
import lt.viko.eif.asinkevic.model.Reisas;
import lt.viko.eif.asinkevic.model.Uzsakovas;
import lt.viko.eif.asinkevic.model.Vairuotojas;

import lt.viko.eif.asinkevic.util.GenericList;
import lt.viko.eif.asinkevic.util.HibernateUtil;
import lt.viko.eif.asinkevic.util.JaxbUtil;
import org.h2.tools.Server;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Database loader
 */
public class DBLoader {

    /**
     * Database setup
     * With Example Data that is uploaded to Database
     */
    public static void SetupDB() {

        List<Reisas> reisasList = new ArrayList<>();
        List<String> firstNames = Arrays.asList("Arturas", "Arnas", "Mantas", "Lukas", "Laurynas", "Tomas", "Jonas", "Tadas", "Dovydas", "Rokas");
        List<String> lastNames = Arrays.asList("Sinkevic", "Silaikis", "Trojanovskis", "Kirovskij", "Kavaliauskas", "Zuvoskis", "Kazlauskas", "Gudelis", "Mackonis", "Miliauskas");
        List<String> numbers = Arrays.asList("+37012345678", "+37087654321", "+37098765432", "+37012345679", "+37087654320", "+37098765431", "+37012345680", "+37087654322", "+37098765433", "+37012345681");
        List<String> valstybinisNumeris = Arrays.asList("HJM:864", "NBV:726", "KGN:639", "ATL:839", "OKN:389", "PLH:182", "ASD:000", "ABZ:736", "KPO:736", "TRE:673");
        List<String> spalva = Arrays.asList("Baltas", "Juodas", "Raudonas", "Baltas", "Juodas", "Raudonas", "Baltas", "Juodas", "Raudonas", "Zalias");
        List<String> adresas = Arrays.asList("Skardzio 90", "Lakunu 23", "Kalvariju g 41", "Jasinskio g 30", "Ukmerges g 50", "Kauno g 42", "Kostiuskos g 2", "Rygos g 5", "Ozo g 53", "Kestucio g 9");
        List<Integer> vietuSkaicius = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29);
        int randomLastNames;
        int randomFirstNames;
        int randomNumbers;
        int randomvalstybinisNumeris;
        int randomAdresas;
        int randomSpalva;
        int randomVietuSkaicius;
        for (int i = 0; i < 10; i++) {
            randomLastNames = new Random().nextInt(0, 9);
            randomFirstNames = new Random().nextInt(0, 9);
            randomNumbers = new Random().nextInt(0, 9);
            Uzsakovas uzsakovas = new Uzsakovas(firstNames.get(randomFirstNames), lastNames.get(randomLastNames), numbers.get(randomNumbers));
            randomLastNames = new Random().nextInt(0, 9);
            randomFirstNames = new Random().nextInt(0, 9);
            randomNumbers = new Random().nextInt(0, 9);
            Vairuotojas vairuotojas = new Vairuotojas(firstNames.get(randomFirstNames), lastNames.get(randomLastNames), numbers.get(randomNumbers));
            randomSpalva = new Random().nextInt(0, 9);
            randomvalstybinisNumeris = new Random().nextInt(0, 9);
            randomVietuSkaicius = new Random().nextInt(0, 9);
            Autobusas autobusas = new Autobusas(spalva.get(randomSpalva), valstybinisNumeris.get(randomvalstybinisNumeris), vietuSkaicius.get(randomVietuSkaicius));
            Reisas reisas = new Reisas();
            reisas.setAutobusas(autobusas);
            reisas.setUzsakovas(uzsakovas);
            reisas.setVairuotojas(vairuotojas);
            randomAdresas = new Random().nextInt(0, 9);
            reisas.setAdresas(adresas.get(randomAdresas));
            reisasList.add(reisas);
        }




        org.h2.tools.Server server = null;
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            server = Server.createTcpServer("-tcpPort", "9093").start();
            transaction = session.beginTransaction();
            //session.save(student);
            reisasList.forEach(reisas -> session.save(reisas));

            transaction.commit();
        } catch (SQLException e) {
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {

            if (server != null) {
                server.shutdown();
            }
        }

    }
    /**
     * List Reisas class data from database
     */
    public static List<Reisas> ListReisas() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Reisas> reisas = session.createQuery("from Reisas", Reisas.class).list();
            return reisas;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * List Uzsakovas class data from database
     */
    public static List<Uzsakovas> ListUzsakovas() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Uzsakovas> uzsakovas = session.createQuery("from Uzsakovas", Uzsakovas.class).list();
            return uzsakovas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * List Vairuotojas class data from database
     */
    public static List<Vairuotojas> ListVairuotojas() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Vairuotojas> vairuotojas = session.createQuery("from Vairuotojas", Vairuotojas.class).list();

            return vairuotojas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    /**
     * List Autobusas class data from database
     */
    public static List<Autobusas> ListAutobusas() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Autobusas> autobusas = session.createQuery("from Autobusas ", Autobusas.class).list();
            return autobusas;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    /**
     * Retrieve Reisas class data from database and call generic ListXML
     */
    public static String ListReisasXML() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            List<Reisas> reisas = session.createQuery("from Reisas", Reisas.class).list();
            return ListXML(reisas);
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }
    /**
     * Generic
     * Convert POJO To XML
     *
     * @param data POJO Data
     */
    public static <T> String ListXML(T data) {
        try {


            return JaxbUtil.transformToXML(data, new File("JAXBObject.xml"), new File("JAXBObject.xsd"));


        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }


    }
    /**
     * Function call to convert XML To object
     */
    public static <T> void ListXMLToObject() {
        try {
            GenericList<T> Data = new GenericList<T>();
            Data = (GenericList<T>) JaxbUtil.transformToPOJO(Reisas.class, new File("JAXBObject.xml"), new File("JAXBObject.xsd"));
            Data.getData().forEach(data -> System.out.println(data));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}















