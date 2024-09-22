package Behaviour.Mediator;
import java.util.logging.Logger;

// Concrete Soldier Unit
public class SoldierUnit implements ArmedUnit {
    private final Commander commander;
    private static final Logger logger = Logger.getLogger(SoldierUnit.class.getName());

    public SoldierUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            // logger.info("Soldier Unit is attacking...");
            System.out.println("Soldier Unit is attacking...");
            commander.setAttackStatus(false);
        } else {
            // logger.info("Soldier Unit cannot attack, another unit is attacking.");
            System.out.println("Soldier Unit cannot attack, another unit is attacking.");
        }
    }

    @Override
    public void stopAttack() {
        // logger.info("Soldier Unit stopped attacking.");
        System.out.println("Soldier Unit stopped attacking.");
        commander.setAttackStatus(true);
    }
}

