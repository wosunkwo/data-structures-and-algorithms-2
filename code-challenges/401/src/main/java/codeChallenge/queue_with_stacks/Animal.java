package codeChallenge.queue_with_stacks;

public class Animal {
    private String type;
    private String name;
    public Animal(String type, String name){
        this.setType(type);
        this.setName(name);
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
