package google.drvie.domain;

import google.drvie.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String field;
    private String keywords;
}
