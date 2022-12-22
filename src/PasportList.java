import java.util.Objects;
import java.util.Set;

public class PasportList {
    private Set<Passport>passports;

    public PasportList(Set<Passport> passports) {
        this.passports = passports;
    }
    public void add(Passport passport){
        Passport old=get(passport.getNamber());
        if (old!=null){
            passports.remove(old);
            passports.add(passport);
        }
    }
    public Passport get(int namber){
        for (Passport passport:passports){
            if (Objects.equals(passport.getNamber(), namber)){
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return passports.toString();
    }
}
