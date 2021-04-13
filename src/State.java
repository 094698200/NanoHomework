public enum State {

    ON("On"),
    OFF("Off"),
    ;
    private String name;
    State(String name){
        this.name = name;

    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                '}';
    }
}
