package Advanced_Software_Design.lab4_factoryPattern;

abstract public class ServiceFactory {
    private AccountDAO accountDao;

    public void setAccountDao(EnvironmentType type) {
        this.accountDao = createAccountDAO(type);
    }

    public AccountDAO getAccountDao(){
        return accountDao;
    }
    public abstract AccountDAO createAccountDAO(EnvironmentType type);
}
