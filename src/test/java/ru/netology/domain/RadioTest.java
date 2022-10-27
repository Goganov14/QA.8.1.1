package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RadioTest {

    //SetNumberStation
    @Test
    public void shouldSetNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(5);
        int expected = 5;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation0() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationLessZero() {
        Radio rad = new Radio();
        rad.setNumberStation(-2);
        int expected = 10;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldBelowTheMinRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-5);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusOneRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldZeroRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldOneRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEightRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNineRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTenRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        rad.nextRadioStation();
        int expected = 2;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation3() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(3);
        rad.nextRadioStation();
        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation8() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.nextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation4() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(4);
        rad.prevRadioStation();
        int expected = 3;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldAboveTheMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(150);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowTheMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-5);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusOneVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldZeroVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldOneVolum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNineVolum() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        int expected = 99;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldSetNumberStationArgs() {
        Radio rad = new Radio(30);
        rad.setNumberStation(5);
        int expected = 5;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation0Args() {
        Radio rad = new Radio(30);
        rad.setNumberStation(0);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationLessZeroArgs() {
        Radio rad = new Radio(30);
        rad.setNumberStation(-2);
        int expected = 30;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldBelowTheMinRadioStationArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(-5);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusOneRadioStationArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldZeroRadioStationArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldOneRadioStationArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(1);
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEightRadioStationArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(8);
        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNineRadioStationArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(9);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTenRadioStationArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(30);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(1);
        rad.nextRadioStation();
        int expected = 2;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation3Args() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(3);
        rad.nextRadioStation();
        int expected = 4;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation0Args() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(0);
        rad.nextRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation8Args() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(8);
        rad.nextRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation29Args() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(29);
        rad.nextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation4Args() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(4);
        rad.prevRadioStation();
        int expected = 3;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation0Args() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(0);
        rad.prevRadioStation();
        int expected = 29;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldAboveTheMaxVolumeArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(150);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(100);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowTheMinVolumeArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(-5);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusOneVolumeArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldZeroVolumeArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldOneVolumArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(1);
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNineVolumArgs() {
        Radio rad = new Radio(30);
        rad.setCurrentVolume(99);
        int expected = 99; //ожидаемый
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

}