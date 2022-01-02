package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {
    private final int maxCargoWeight;
    private int cargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        this.cargoWeight = Math.min(cargoWeight, maxCargoWeight);
        return Math.abs(Math.min(maxCargoWeight - cargoWeight, 0));
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}