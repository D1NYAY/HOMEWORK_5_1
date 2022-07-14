public class Hero {
    private String heroSuperpower;
    private int heroHealth;
    private int heroDamage;

    public Hero(int heroHealth, int heroDamage, String heroesAttackType) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperpower = heroesAttackType;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getHeroesAttackType() {
        return heroSuperpower;
    }

    public void setHeroesAttackType(String heroesAttackType) {
        this.heroSuperpower = heroesAttackType;
    }

}


