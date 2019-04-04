public class Arena {
    int sizeX;
    int sizeY;
    java.util.ArrayList<Entity[]> arena = new java.util.ArrayList<>();
    Arena(int sizeX, int sizeY){
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Entity[] entities = new Entity[sizeY];
        for (int x = 0; x < sizeX; x++){
            arena.add(entities);
        }

    }
    public java.util.ArrayList<Entity[]> getGrid(){
        return arena;
    }
    public boolean add(Entity entity){
        System.out.println("(" + entity.getPosition().x  + ", " + entity.getPosition().y + ")");
        for(int x = 0; x < sizeX; x++){
            for(int y = 0; y < sizeY; y++) {
                System.out.print(arena.get(x)[y] + "   ");
            }
            System.out.println();
        }
        System.out.println(arena.get(entity.getPosition().x)[entity.getPosition().y]);
        System.out.println(arena.get(entity.getPosition().x + 1)[entity.getPosition().y]);
        if (arena.get(entity.getPosition().x)[entity.getPosition().y] == null){
            arena.get(entity.getPosition().x)[entity.getPosition().y] = entity;
            return true;

        }
        else {
            System.out.println("bad things");
            return false;
        }

    }
}