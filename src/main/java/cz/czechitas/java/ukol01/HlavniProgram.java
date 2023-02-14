package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {

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


        //TODO implementace domácího úkolu
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
