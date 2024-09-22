package Behaviour.Mediator;
import java.util.logging.Logger;

// Concrete Mediator with Logging
public class CommanderImpl implements Commander {
    private ArmedUnit soldierUnit, tankUnit;
    private boolean attackStatus = true;
    private static final Logger logger = Logger.getLogger(CommanderImpl.class.getName());

    @Override
    public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
        this.soldierUnit = soldierUnit;
        this.tankUnit = tankUnit;
        // logger.info("Armed units registered: SoldierUnit and TankUnit");
        System.out.println("Armed units registered: SoldierUnit and TankUnit");
    }

    @Override
    public void setAttackStatus(boolean attackStatus) {
        this.attackStatus = attackStatus;
        // logger.info("Attack status changed: " + attackStatus);
        System.out.println("Attack status changed: " + attackStatus);
    }

    @Override
    public boolean canAttack() {
        return attackStatus;
    }

    @Override
    public void startAttack(ArmedUnit armedUnit) {
        if (armedUnit == null) {
            // logger.warning("Attempted to start attack with null armed unit.");
            System.out.println("Attempted to start attack with null armed unit.");
            throw new IllegalArgumentException("Armed unit cannot be null");
        }
        armedUnit.attack();
    }

    @Override
    public void ceaseAttack(ArmedUnit armedUnit) {
        if (armedUnit == null) {
            // logger.warning("Attempted to cease attack with null armed unit.");
            System.out.println("Attempted to cease attack with null armed unit.");
            throw new IllegalArgumentException("Armed unit cannot be null");
        }
        armedUnit.stopAttack();
    }
}

