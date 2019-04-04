public class Entity {

    Position position;
    Entity (int x, int y){
        this.position = new Position (x, y);
        }

        public Position getPosition(){
            return this.position;
    }

        public void setPosition(int x, int y){
            this.position = new Position (x, y);
        }
}