package google.drvie.domain;

import google.drvie.domain.*;
import google.drvie.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private String field;
    private String keywords;

    public FileIndexed(Index aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
