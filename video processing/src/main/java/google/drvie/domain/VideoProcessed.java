package google.drvie.domain;

import google.drvie.domain.*;
import google.drvie.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long field;
    private List<String> url;

    public VideoProcessed(Video aggregate) {
        super(aggregate);
    }

    public VideoProcessed() {
        super();
    }
}
