import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        //middleware : intérmediaire, application peut communiquer avec le ws
        //programmation orientée objet distribuée !!
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(15));
        Compte cp = stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
