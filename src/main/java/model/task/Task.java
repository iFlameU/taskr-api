package model.task;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class Task {
    @NotBlank
    private String name;

    @NotBlank
    private String description;
}
