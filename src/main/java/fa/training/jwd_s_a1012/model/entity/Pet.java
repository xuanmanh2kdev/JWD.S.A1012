package fa.training.jwd_s_a1012.model.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
@Getter
@Setter
public class Pet implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;

    private String type;

    private Integer age;

    public Pet(String name, String type, Integer age) {
        super();
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void makeNoise() {
        System.out.println(name + " " + type + " says meow");
    }

    @Override
    public String toString() {
        return "Pet [type=" + type + ", name=" + name + ", age=" + age + "]";
    }

}
