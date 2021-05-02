package hazel.tyrfing.engine;

public class GameEngine {

    private int areaId;

    public GameEngine() {
        areaId = 0;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public void runInput() {
        switch(areaId){
            case 0:
                this.areaId = 1;
                //fall through on purpose
            case 1:
                //update story html- describe room
                break;
            case 2:
                //update story html- display ending
                break;
        }

    }

}
