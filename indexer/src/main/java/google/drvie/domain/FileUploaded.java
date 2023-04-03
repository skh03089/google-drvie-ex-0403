package google.drvie.domain;

import google.drvie.domain.*;
import google.drvie.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String path;
    private Integer size;
    private String type;
}
