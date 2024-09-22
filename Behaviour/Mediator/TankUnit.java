package Behaviour.Mediator;
import java.util.logging.Logger;

// Concrete Tank Unit
public class TankUnit implements ArmedUnit {
    private final Commander commander;
    private static final Logger logger = Logger.getLogger(TankUnit.class.getName());

    public TankUnit(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void attack() {
        if (commander.canAttack()) {
            System.out.println("Tank Unit is attacking...");
            // logger.info("Tank Unit is attacking...");
            commander.setAttackStatus(false);
        } else {
            System.out.println("Tank Unit cannot attack, another unit is attacking.");
            // logger.info("Tank Unit cannot attack, another unit is attacking.");
        }
    }

    @Override
    public void stopAttack() {
        logger.info("Tank Unit stopped attacking.");
        commander.setAttackStatus(true);
    }
}

