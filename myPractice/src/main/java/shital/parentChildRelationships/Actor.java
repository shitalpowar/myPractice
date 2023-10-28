package shital.parentChildRelationships;

public class Actor {


    public void act(){
        System.out.println("act");
    }

}

class Hero extends Actor {
    public void fighting(){
        System.out.println("fight");
    }

    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.act();

        Actor actor1 = new Hero();
        actor1.act();
    }
}
