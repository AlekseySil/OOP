public class MotorTransport extends WheeledTransport{
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void servers() {
        super.servers();
        checkEngine();
    }
}

