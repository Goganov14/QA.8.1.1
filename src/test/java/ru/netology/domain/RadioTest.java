package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioTest {
    Radio rad = new Radio();

    @Test
    public void shouldCurrentRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(15);
        int expected = 0;

        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveTheMaxRadioStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(17);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();

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
    public void shouldCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(30);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveTheMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(30);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);


    }

    @Test
    public void shouldBelowTheMinVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-2);

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

        rad.setCurrentVolume(9);

        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldMaxVolum() {
        Radio rad = new Radio();

        rad.setToMaxVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolum2() {
        Radio rad = new Radio();

        rad.setToMinVolume();


        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
