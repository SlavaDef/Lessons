package Mod5;

class Altimeter {

    @Override
    public String toString() {
        return "Measure height";
    }
}

class AirGauge {
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}

class  ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control() {
        System.out.print(altimeter+"\n");
        System.out.print(airGauge+"\n");
    }
}
    class ControlPanelTest {
        public static void main(String[] args) {
            new ControlPanel().control();
        }
    }

