import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower{
    String whatsYourName(){
        return "Jasmine";
    }
}

class Lotus extends Flower {
    String whatsYourName(){
        return "Lotus";
    }
}

class Region {
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region {
    Flower yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    Flower yourNationalFlower(){
        return new Lotus();
    }

}

