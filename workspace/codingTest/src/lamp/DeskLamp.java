package lamp;

import java.time.LocalDateTime;

/**
 * å�� ���� ����ǰ
 */
public abstract class DeskLamp implements Lamp {

    boolean power = false;

    @Override
    public void turnOn() {
        this.power = true;
        System.out.printf("[%s] ?��?�� %s\n", LocalDateTime.now(), "ON");
    }

    @Override
    public void turnOff() {
        this.power = false;
        System.out.printf("[%s] ?��?�� %s\n", LocalDateTime.now(), "OFF");
    }

    @Override
    public boolean getPower() {
        return this.power;
    }

}
