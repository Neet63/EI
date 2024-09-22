package Behaviour.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Commander commander = new CommanderImpl();
        ArmedUnit soldier = new SoldierUnit(commander);
        ArmedUnit tank = new TankUnit(commander);

        commander.registerArmedUnits(soldier, tank);

        commander.startAttack(tank);
        commander.ceaseAttack(tank);

        commander.startAttack(soldier);
        commander.startAttack(tank);
        commander.ceaseAttack(soldier);
    }
}

