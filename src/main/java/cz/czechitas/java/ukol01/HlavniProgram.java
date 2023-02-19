package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {
/*
//posun
zofka.penUp();
zofka.turnLeft(90);
zofka.move(300);
zofka.penDown();

        nakresliPrasatko();

zofka.penUp();
zofka.turnLeft(60);
zofka.move(200);
zofka.penDown();


        nakresliOsmiuhelnik();
//posun
zofka.penUp();
zofka.move(150);
zofka.penDown();

//kruh
        for (int i = 0; i < 18; i++) {
            zofka.move(20);
            zofka.turnLeft(20);
        }

        //posun
        zofka.penUp();
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(45);
        zofka.penDown();


        nakresliSlunicko();
*/

//posun
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();

        nakresliSlunicko();

        //posun
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(200);


        nakresliDomecek();

        //posun
        zofka.move(100);
        zofka.turnRight(90);

        nakresliDomecek();

        //posun
        zofka.move(100);
        zofka.turnRight(90);

        nakresliDomecek();

        //posun
        zofka.move(100);
        zofka.turnRight(90);

        nakresliDomecek();

        //posun
        zofka.move(100);
        zofka.turnRight(90);

        nakresliDomecek();

        //posun
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnLeft(90);

        nakresliDomecek();

        //posun
        zofka.turnRight(180);
        zofka.move(470);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliPrasatko();

        //posun
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(495);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);

        nakresliDomecek();

        //posun
        zofka.turnRight(90);
        zofka.move(140);
        zofka.penDown();

        pismenoJ();

        //posun
        zofka.move(150);

        pismenoA();

        //posun
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();


        pismenoN();

        //posun
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

        pismenoA();


        //TODO implementace domácího úkolu
    }

    private void pismenoJ() {
        zofka.move(100);
        zofka.turnRight(140);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(50);
        zofka.penUp();
    }

    private void pismenoN() {
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(158);
        zofka.move(108);
        zofka.turnLeft(158);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnLeft(90);
    }

    private void pismenoA() {
        zofka.turnLeft(79);
        zofka.penDown();
        zofka.move(102);
        zofka.turnRight(158);
        zofka.move(51);
        zofka.turnRight(101);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(79);
        zofka.move(50);
        zofka.turnLeft(78);
    }

    private void nakresliDomecek() {
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(80);

        zofka.turnRight(120);
        zofka.move(80);
        zofka.turnRight(120);
        zofka.move(80);
        zofka.turnLeft(60);
        zofka.penUp();
    }

    private void nakresliSlunicko() {
        for (int i = 0; i < 9; i++) {

            zofka.move(18);
            zofka.turnLeft(20);

            zofka.move(18);
            zofka.turnLeft(20);


            zofka.turnRight(90);
            zofka.move(20);
            zofka.turnRight(180);
            zofka.move(20);
            zofka.turnRight(90);


        }
    }

    private void nakresliOsmiuhelnik() {
        osmiuhelnik();
    }

    private void osmiuhelnik() {
        for (int i = 0; i <8 ; i++) {
            zofka.move(50);
            zofka.turnLeft(45);
        }
    }

    private void nakresliPrasatko() {
        //obdélník
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(150);
        }
        //hlava
        zofka.turnRight(30);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);

        zofka.turnRight(120);
        zofka.move(100);
        //nozicky
        zofka.turnRight(30);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(120);
        zofka.move(30);

        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(120);
        zofka.move(150);

        //nozicky
        zofka.turnRight(120);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(120);
        zofka.move(30);
    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
