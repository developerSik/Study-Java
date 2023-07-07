package lamp;

import java.util.StringJoiner;

/**
 * ��� ������ ������ å�� ����
 */
public class SimpleDeskLamp extends DeskLamp {

    private int bright = 0; //��� = [ 0:���� / 1:1�ܰ� ��� / 2:2�ܰ� ��� / 3:3�ܰ� ��� ]

    @Override
    public void turnOn() {
        super.turnOn();
        this.bright = 1;
    }

    @Override
    public void turnOff() {
        super.turnOff();
        this.bright = 0;
    }

    public int getBright() {
        return this.bright;
    }

    public void nextBright() {
        if (!super.getPower()) {
            return;
        }

        if (this.bright == 0) {
            this.turnOn();
        } else if (this.bright < 3) {
            this.bright++;
        } else {
            this.turnOff();
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SimpleDeskLamp.class.getSimpleName() + "[", "]")
            .add("power=" + power)
            .add("bright=" + bright)
            .toString();
    }

}
