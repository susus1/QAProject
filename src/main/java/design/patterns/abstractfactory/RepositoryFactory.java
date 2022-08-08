package design.patterns.abstractfactory;

public interface RepositoryFactory {
	ProductRepository getProductRepository();
	AccountRepository getAccountRepository();
}
