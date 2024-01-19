package service;

public class BrazilInterestService implements InterestService {
    private double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
        // nao conseguimos colocar o método get dentro da interface, pois,
        // o método Get depende do valor da váriavel que está armazenada no serviço
        // interfaces nao podem armazenar estado.
    }
}
