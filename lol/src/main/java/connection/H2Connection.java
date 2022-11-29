package connection;

public class H2Connection extends AbstractConnection{

    @Override
    public String getDriver() {
        return "org.h2.Driver";
    }

    @Override
    public String getUser() {
        return "sa";
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUrl() {
        return "jdbc:h2:file:./src/main/resources/testdb;INIT=RUNSCRIPT FROM 'classpath:/scripts/lolh2initdata.sql'";
    }
}
